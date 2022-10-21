import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { userRegister } from '../user-register';
import { UserRegisterService } from '../user-register.service';

@Component({
  selector: 'app-user-register',
  templateUrl: './user-register.component.html',
  styleUrls: ['./user-register.component.css']
})
export class UserRegisterComponent implements OnInit {

  constructor(private service:UserRegisterService,private route:Router) { }

  data:userRegister = new userRegister()
  ngOnInit(): void {
  }
  userRegisterData(registerData:userRegister){
    console.log("data:",registerData)
    this.service.register(registerData).subscribe(
      (response)=>{
        console.log(response);
        if(response!=null){
          alert("Registered successfully")
          this.route.navigate([''])
        }
        else{
          alert("User details already present")
          this.route.navigate([''])
        }
      }
    )
  }

}
