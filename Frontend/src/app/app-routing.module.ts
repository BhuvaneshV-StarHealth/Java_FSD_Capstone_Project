import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminAddProductComponent } from './admin-add-product/admin-add-product.component';
import { AdminProductComponent } from './admin-product/admin-product.component';
import { AdminUpdateProductComponent } from './admin-update-product/admin-update-product.component';
import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { UserCartComponent } from './user-cart/user-cart.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { UserRegisterComponent } from './user-register/user-register.component';

const routes: Routes = [
  {path:'',component:UserDetailsComponent},
  {path:'displayproduct',component:ProductComponent},
  {path:'register',component:UserRegisterComponent},
  {path:'adminproduct',component:AdminProductComponent},
  {path:'adminproduct/adminaddproduct',component:AdminAddProductComponent},
  {path:'displayproduct/viewcart',component:UserCartComponent},
  {path:'displayproduct/viewcart/displayproduct',component:ProductComponent},
  {path:'adminaddproduct',component:AdminAddProductComponent},
  {path:'viewcart',component:UserCartComponent},
  {path:'adminupdateproduct/:id',component:AdminUpdateProductComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
