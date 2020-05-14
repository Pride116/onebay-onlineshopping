import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaderResponse, HttpHeaders } from '@angular/common/http';
import { User } from '../model/user';
import { Observable } from 'rxjs';
import { tick } from '@angular/core/testing';
import { map } from 'rxjs/operators';

//const headers ={headers: new HttpHeaders({'content-type':'application/json'})};

@Injectable({
  providedIn: 'root'
})
export class UserService {

  baseUrl:string="http://localhost:8080/user/register";
  constructor(private http:HttpClient) { }
 
  addUser(user:User)
  {
    return this.http.post<User>(this.baseUrl,user,{responseType:'text' as'json'});
  }
}