import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../model/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  url:string="localhost:8080/user/register/";
  constructor(private http:HttpClient) { }

  //Post request

  adduser(user:User)
  {
    return this.http.post(this.url,user);
  }
}
