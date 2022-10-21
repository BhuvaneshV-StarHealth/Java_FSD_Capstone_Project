import { Component, OnInit } from '@angular/core';
import { UserDetails } from '../user-details';
import {UserDetailsService} from '../user-details.service'
import {Observable} from 'rxjs'
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

  ngOnInit(): void {
    
  }
  constructor(private service:UserDetailsService, private route:Router) {}

  user:any

  userLoginData(data:NgForm){
    this.service.login(data).subscribe(
      (response)=>{
        console.log(response);
        this.user = response;
        if(response!=null){
          console.log("form role:",data.value.userRole)
          if(data.value.userRole == "admin"){
            this.route.navigate(['adminproduct'])
          }
          else{
            this.route.navigate(['displayproduct'])
          }
        }
        else{
          alert("Invalid login credentials")
        }
      })
  }

}
