import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NavigationComponent } from './menu/navigation/navigation.component';
import { BookComponent } from './Book/book/book.component';
import { CartComponent } from './cart/cart/cart.component';
import { LoginComponent } from './Login/login/login.component';
import { RegisterationComponent } from './registeration/registeration/registeration.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';

const routes: Routes = [{ path: "", redirectTo: "login", pathMatch: "full" }
  , { path: "book", component: BookComponent },
{ path: "cart", component: CartComponent },
{ path: "login", component: LoginComponent },
{ path: "signup", component: RegisterationComponent },
{ path: "signup", component: RegisterationComponent },
{ path: "**", component: PageNotFoundComponent }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
