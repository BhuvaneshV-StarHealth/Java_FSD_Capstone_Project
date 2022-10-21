import { Component, OnInit } from '@angular/core';
import { AdminProductService } from '../admin-product.service';
import { Router } from '@angular/router';
import { Product } from '../admin-product';

@Component({
  selector: 'app-admin-product',
  templateUrl: './admin-product.component.html',
  styleUrls: ['./admin-product.component.css']
})
export class AdminProductComponent implements OnInit {

  constructor(private service:AdminProductService,private route:Router) { }
  products:Product[] = []
  message:any
  ngOnInit(): void {
    this.service.getProductDetails().subscribe(
      (response)=>{
        this.products = response;
        console.log(this.products)
      }
    )
  }

  deleteProduct(productObj:Product){
    console.log("details:",productObj)
    this.service.deleteProduct(productObj.productID).subscribe(
    )
    alert("Product deleted successfully")
    window.location.reload()
  }

  updateProduct(productObj:Product){
    console.log("details:",productObj)
  }
}
