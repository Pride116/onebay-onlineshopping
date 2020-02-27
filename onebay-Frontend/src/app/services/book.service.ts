import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Book } from '../model/book';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseUrl:string="http://localhost:8080/api/v1/books";
  constructor(private http:HttpClient) { }

  getbooks():Observable<Book[]>{

    return this.http.get<GetBooksReposnce>(this.baseUrl).pipe(
      map(response=>response._embedded.books));
  }
}

interface GetBooksReposnce{
  _embedded:{books:Book[];}
}