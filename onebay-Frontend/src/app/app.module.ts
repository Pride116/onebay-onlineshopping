import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterationComponent } from './registeration/registeration/registeration.component';
import { UserService } from './services/user.service';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { from } from 'rxjs';
import { BookComponent } from './Book/book/book.component';
import { NavigationComponent } from './menu/navigation/navigation.component';
import { FooterComponent } from './menu/footer/footer.component';
import { CartComponent } from './cart/cart/cart.component';
import { LoginComponent } from './Login/login/login.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import { BookdetailsComponent } from './bookdetails/bookdetails.component';
import { JwPaginationComponent } from 'jw-angular-pagination';

@NgModule({
  declarations: [
    AppComponent,
    RegisterationComponent,
    BookComponent,
    NavigationComponent,
    FooterComponent,
    CartComponent,
    LoginComponent,
    PageNotFoundComponent,
    BookdetailsComponent, JwPaginationComponent
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
