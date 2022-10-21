import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import {Observable} from 'rxjs'
import { NgForm } from '@angular/forms';
import { of } from 'rxjs'
import { Router } from '@angular/router';
import { Product } from './admin-product';

@Injectable({
  providedIn: 'root'
})
export class AdminProductService {

  constructor(private http:HttpClient,private route:Router) { }

  url:string = "http://localhost:8080/api/starhealth/digistore"
  getProductDetails():Observable<any>{
    return this.http.get(this.url+'/product/displayproduct')
  }

  deleteProduct(id:number):Observable<string>{
    console.log("Product id:",id)
    return this.http.delete<string>(this.url+'/product/deleteproduct/'+id)
  }

  addProduct(addData:Product){
    console.log("addproduct:",addData)
    return this.http.post<Product>(this.url+'/product/addproduct',addData)
  }

  addToCart(productObj:Product){
    console.log("product cart:",productObj)
    return this.http.post<Product>(this.url+'/productcart/addproductcart',productObj)
  }

  updateProduct(pname:string,price:number,quantity:number,image:string,id:number){
    console.log("product update details:",pname,price,quantity,image,id)
    return this.http.put<Product(this.url+'/product/updateproduct/'+pname+'/'+price+'/'+quantity+'/'+image+'/'+id)
  }

  getProductById(id:number){
    console.log("Product id:",id)
    return this.http.get(this.url+'/product/getproductid/'+id)
  }
}
