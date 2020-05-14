import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Book } from '../model/book';


@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http:HttpClient) { }


  //find all books in the databases
  getbooks():Observable<Book[]>{

    return this.http.get<Book[]>("http://localhost:8080/book/list");
      
  }
  getbook(id:any):Observable<Book>{

    return this.http.get<Book>("http://localhost:8080/book/"+id);
      
  }

  //finding a list of books by category id
 getbooksByCategory(id:any):Observable<Book[]>
 {
  return this.http.get<Book[]>("http://localhost:8080/book/category/"+id);
 }

 //finding a list of books by name
 getbooksByname(name:any):Observable<Book[]>
 {
  return this.http.get<Book[]>("http://localhost:8080/book/search/"+name);
 }

  //delete book
  deleteBookById(id)
  {
    return this.http.delete("http://localhost:8080/book/delete/"+id);
  }

}