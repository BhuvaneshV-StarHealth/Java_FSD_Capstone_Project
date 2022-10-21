import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../admin-product';
import { AdminProductService } from '../admin-product.service';
import { userCart } from '../user-cart';
import { UserCartService } from '../user-cart.service';

@Component({
  selector: 'app-user-cart',
  templateUrl: './user-cart.component.html',
  styleUrls: ['./user-cart.component.css']
})
export class UserCartComponent implements OnInit {

  constructor(private service:UserCartService, private route:Router) { }
  products:userCart[] = []

  ngOnInit(): void {
    this.service.getProductDetails().subscribe(
      (response)=>{
        this.products = response;
        console.log(this.products)
      }
    )
  }

  deleteCartItem(productObj:userCart){
    console.log(productObj)
    this.service.deleteCartProduct(productObj.cartID).subscribe(
      (response)=>{
        alert("Product deleted successfully")
        this.route.navigate(['displayproduct'])
      }
    )
  }

}
