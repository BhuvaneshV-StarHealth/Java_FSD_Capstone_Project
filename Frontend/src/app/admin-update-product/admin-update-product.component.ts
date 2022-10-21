import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Product } from '../admin-product';
import { AdminProductService } from '../admin-product.service';

@Component({
  selector: 'app-admin-update-product',
  templateUrl: './admin-update-product.component.html',
  styleUrls: ['./admin-update-product.component.css']
})
export class AdminUpdateProductComponent implements OnInit {

  id:number=0
  productData:any
  constructor(private service:AdminProductService,private route:ActivatedRoute) { 
  }

  ngOnInit(): void {
    this.route.params.subscribe( (param:any) => {this.id = param['id']; console.log("id:",this.id)});
    this.service.getProductById(this.id).subscribe(
      (response)=>{
        this.productData = response
        console.log("Product details:",this.productData)
      }
    )
  }

  updateProductData(productData:Product){
    this.service.updateProduct(productData.productName,productData.productPrice,productData.productQuantity,productData.productImage,productData.productID).subscribe(
      (response)=>{
        console.log("product update response:",response)
        window.location.reload()
      }
    )
  }

}
