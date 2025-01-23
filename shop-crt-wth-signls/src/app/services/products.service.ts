import { computed, Injectable, signal } from '@angular/core';
import { Product } from '../models/product';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {
  constructor() { }

  private products = signal<Product[]>([
    { id: 1, name: 'Laptop', price: 10000 },
    { id: 2, name: 'Phone', price: 6000 },
    { id: 3, name: 'Headphones', price: 2000 },
    { id: 4, name: 'Keyboard', price: 800 },
    { id: 5, name: 'Mouse', price: 400 },
  ]);

  private searchQuery = signal<string>('');

  filteredProducts = computed(() => {
    const query = this.searchQuery().toLowerCase();
    return this.products().filter(
      (product) => product.name.toLowerCase().includes(query)
    )
  })

  updateSearchQuery(query: string) {
    this.searchQuery.set(query)
  }

  getFilteredProducts() {
    return this.filteredProducts;
  }

  getSearchQuery() {
    return this.searchQuery;
  }
}
