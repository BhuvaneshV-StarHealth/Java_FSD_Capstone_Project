import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from './admin-product';
import {HttpClient} from '@angular/common/http'
import {Observable} from 'rxjs'
import { userCart } from './user-cart';
@Injectable({
  providedIn: 'root'
})
export class UserCartService {

  constructor(private http:HttpClient,private route:Router) { }

  url:string = "http://localhost:8080/api/starhealth/digistore"


  deleteCartProduct(id:number):Observable<any>{
    console.log("cart id:",id)
    return this.http.delete(this.url+'/productcart/deleteproductcart/'+id)
  }

  getProductDetails():Observable<any>{
    return this.http.get(this.url+'/productcart/displayproductcart')
  }
}
