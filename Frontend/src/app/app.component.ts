import { Component } from '@angular/core';
import {NgForm} from '@angular/forms'
import { Observable } from 'rxjs';
import { UserDetails } from './user-details';
import { UserDetailsService } from './user-details.service';
import {of} from 'rxjs'
import { Router } from '@angular/router';
import { ProductComponent } from './product/product.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'DigiStore';

  constructor(private service:UserDetailsService, private route:Router) {}

  user:any

  userLoginData(data:NgForm){
    this.service.login(data).subscribe(
      (response)=>{
        console.log(response);
        data.reset();
        this.user = response;
        if(response!=null){
          this.route.navigate(['displayproduct'])
        }
      })
  }
}
