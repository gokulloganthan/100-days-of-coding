import { Component } from '@angular/core';
import { ProductsService } from '../../services/products.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-products',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './products.component.html',
  styleUrl: './products.component.scss'
})
export class ProductsComponent {

  constructor(private productsService:ProductsService){}

  ngOnInit(): void {
    //Called after the constructor, initializing input properties, and the first call to ngOnChanges.
    //Add 'implements OnInit' to the class.
    
  }

  //two way data binding for searchQuery between html template and ts component
  searchQuery:string='';

  get filteredProducts(){
    return this.productsService.getFilteredProducts();
  }

  onSearchChange(query:string){
    this.productsService.updateSearchQuery(query);
  }
}
