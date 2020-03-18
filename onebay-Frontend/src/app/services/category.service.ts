import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { BookCategory } from '../model/bookcategory';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  constructor(private http:HttpClient) { }

//find all categorys
getCatgories():Observable<BookCategory[]>{

  return this.http.get<BookCategory[]>("http://localhost:8080/category/list");
}

}
