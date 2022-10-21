import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../admin-product';
import { AdminProductService } from '../admin-product.service';
import { userCart } from '../user-cart';
import { UserCartService } from '../user-cart.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  constructor(private service:AdminProductService, private route:Router, private serviceCart: UserCartService) { }
  products:Product[] = []
  ngOnInit(): void {
    this.service.getProductDetails().subscribe(
      (response)=>{
        this.products = response;
        console.log(this.products)
      }
    )
  }
  addCart(addData:Product){
    console.log("data:",addData)
    this.service.addToCart(addData).subscribe(
      (response)=>{
        console.log(response);
        alert("Product added to cart successfully")
        this.route.navigate(['displayproduct'])
      }
    )
  }

}
