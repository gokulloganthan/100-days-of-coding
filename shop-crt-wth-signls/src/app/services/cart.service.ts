import { computed, Injectable, signal } from '@angular/core';
import { Product } from '../models/product';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  constructor() { }

  private cart = signal<Product[]>([]);

  addToCart(product: Product): void {
    this.cart.update((currentCart) => [...currentCart, product])
  }

  removeFromCart(productId: number): void {
    this.cart.update((currentCart) => 
      currentCart.filter(product => product.id !== productId)
    )
  }

  totalPrice = computed(()=>{
    /* (acc,curr) => acc + curr.price */
    /* acc - sum of prices of previous cart items  */
    /* curr.product - price of current product */
    return this.cart().reduce((acc,curr) => acc + curr.price,0);
  })

  getCart(){
    return this.cart;
  }

  getTotalPrice(){
    return this.totalPrice;
  }
}


