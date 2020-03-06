import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/model/book';
import { BookService } from 'src/app/services/book.service';
import { BookCategory } from 'src/app/model/bookcategory';
import { CartComponent } from 'src/app/cart/cart/cart.component';
import { Injectable } from '@angular/core';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
@Injectable({
  providedIn: 'root'
})
export class BookComponent implements OnInit {

  books:Book[];
  categorys:BookCategory[];
  searchname:any;
  constructor(private service:BookService) { }

  ngOnInit() {
    this.booklist();
    this.catlist();
  }
booklist()
{
  return this.service.getbooks().subscribe(data=>{this.books=data});
}
getBycategory(id:any)
{
 return this.service.getbooksByCategory(id).subscribe(data=>this.books=data);
}
search(searchname)
{
 return this.service.getbooksByname(searchname).subscribe(data=>this.books=data);
}
catlist()
{
  return this.service.getCatgories().subscribe(data=>{this.categorys = data},error=>{console.log(error)});
}

}
