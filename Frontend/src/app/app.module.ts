import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule} from '@angular/forms'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import {HttpClientModule} from '@angular/common/http'
import { UserDetailsService } from './user-details.service';
import { UserRegisterComponent } from './user-register/user-register.component';
import { AdminProductComponent } from './admin-product/admin-product.component';
import { AdminAddProductComponent } from './admin-add-product/admin-add-product.component';
import { UserCartComponent } from './user-cart/user-cart.component';
import { UserRegisterService } from './user-register.service';
import { UserCartService } from './user-cart.service';
import { AdminProductService } from './admin-product.service';
import { AdminUpdateProductComponent } from './admin-update-product/admin-update-product.component';
@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
    UserDetailsComponent,
    UserRegisterComponent,
    AdminProductComponent,
    AdminAddProductComponent,
    UserCartComponent,
    AdminUpdateProductComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [UserDetailsService,UserRegisterService,UserCartService,AdminProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
