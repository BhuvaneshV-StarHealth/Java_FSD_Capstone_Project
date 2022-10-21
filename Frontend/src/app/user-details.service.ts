import { Injectable } from '@angular/core';
import { UserDetails } from './user-details';
import {HttpClient} from '@angular/common/http'
import {Observable} from 'rxjs'
import { NgForm } from '@angular/forms';
import { of } from 'rxjs'
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class UserDetailsService {

  constructor(private http:HttpClient,private route:Router) { }
  url:string = "http://localhost:8080/api/starhealth/digistore"
  login(userInput:NgForm):Observable<any>{
    return this.http.get(this.url+'/user/login/'+userInput.value.userEmail+'/'+userInput.value.userRole)
  }
}
