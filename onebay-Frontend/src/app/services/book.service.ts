import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Book } from '../model/book';
import { BookCategory } from '../model/bookcategory';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private bookUrl:string="http://localhost:8080/api/v1/books/?size=30";
  private categoryUrl:string="http://localhost:8080/api/v1/book-category";
  constructor(private http:HttpClient) { }

  getbooks():Observable<Book[]>{

    return this.http.get<GetBooksResponce>(this.bookUrl).pipe(
      map(response=>response._embedded.books));
  }
  getbook(id:Book):Observable<Book[]>{

    return this.http.get<GetBooksResponce>(this.bookUrl+id).pipe(
      map(response=>response._embedded.books));
  }
  getCatgories():Observable<BookCategory[]>{

    return this.http.get<GetResponce>(this.categoryUrl).pipe(
      map(response=>response._embedded.bookCategories));
  }

}

interface GetBooksResponce{
  _embedded:{books:Book[];}
}
interface GetResponce{
  _embedded:{bookCategories:BookCategory[];}
}