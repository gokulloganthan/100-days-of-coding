import { Component } from '@angular/core';
import { CartService } from '../../services/cart.service';

@Component({
  selector: 'app-cart',
  standalone: true,
  imports: [],
  templateUrl: './cart.component.html',
  styleUrl: './cart.component.scss'
})
export class CartComponent {
  constructor(public cartService: CartService){}

  addProduct(){
    const product = { 
      id: Date.now(),
      name: 'product',
      price: Math.floor(Math.random() * 10000)
    }
    this.cartService.addToCart(product);
  }

  removeProduct(productId:number){
    this.cartService.removeFromCart(productId);
  }

  get cart(){
    return this.cartService.getCart();
  }

  get totalPrice(){
    return this.cartService.getTotalPrice();
  }
}
