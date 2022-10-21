import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../admin-product';
import { AdminProductService } from '../admin-product.service';

@Component({
  selector: 'app-admin-add-product',
  templateUrl: './admin-add-product.component.html',
  styleUrls: ['./admin-add-product.component.css']
})
export class AdminAddProductComponent implements OnInit {

  constructor(private service:AdminProductService,private route:Router) { }

  ngOnInit(): void {
  }
  addProductData(addData:Product){
    console.log("data:",addData)
    this.service.addProduct(addData).subscribe(
      (response)=>{
        console.log(response);
        alert("Product added successfully")
        this.route.navigate(['adminproduct'])
      }
    )
  }
}
