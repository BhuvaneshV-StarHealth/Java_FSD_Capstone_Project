import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import {Observable} from 'rxjs'
import { NgForm } from '@angular/forms';
import { of } from 'rxjs'
import { Router } from '@angular/router';
import { userRegister } from './user-register';
import { FormatWidth } from '@angular/common';

@Injectable({
  providedIn: 'root'
})
export class UserRegisterService {

  constructor(private http:HttpClient,private route:Router) { }
  url:string = "http://localhost:8080/api/starhealth/digistore"
  register(userInput:userRegister):Observable<any>{
    console.log("in register:",userInput)
    return this.http.post<userRegister>(this.url+'/user/register',userInput)
  }
}
