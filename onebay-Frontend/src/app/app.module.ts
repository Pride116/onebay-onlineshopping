import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterationComponent } from './registeration/registeration/registeration.component';
import { UserService } from './service/user.service';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule,ReactiveFormsModule} from '@angular/forms';
import { from } from 'rxjs';
import { BookComponent } from './Book/book/book.component';
import { NavigationComponent } from './menu/navigation/navigation.component';
import { FooterComponent } from './menu/footer/footer.component';
import { CartComponent } from './cart/cart/cart.component';
import { LoginComponent } from './Login/login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    RegisterationComponent,
    BookComponent,
    NavigationComponent,
    FooterComponent,
    CartComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }