import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/model/book';
import { BookService } from 'src/app/services/book.service';
import { BookCategory } from 'src/app/model/bookcategory';
import { CartComponent } from 'src/app/cart/cart/cart.component';
import { Injectable } from '@angular/core';
import { CategoryService } from 'src/app/services/category.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
@Injectable({
  providedIn: 'root'
})
export class BookComponent implements OnInit {

  books: Book[];
  categorys: BookCategory[];
  searchname: any;
  pageOfItems: Array<Book>;
  pageSize: number = 6;

  constructor(private service: BookService, private catservice: CategoryService, private _route: ActivatedRoute) {

  }

  ngOnInit() {


    this._route.paramMap.subscribe(() => { this.listbooks() })

  }

  changePage(pageOfItems:Array<Book>)
  {
    this.pageOfItems=pageOfItems;
  }

  listbooks() {

    const search: boolean = this._route.snapshot.paramMap.has("name");

    if (search) {

      this.search();

    } else {

      this.booklist();
    }
    this.catlist();
  }

  booklist() {
    return this.service.getbooks().subscribe(data => { this.books = data });
  }

  getBycategory(id: any) {
    return this.service.getbooksByCategory(id).subscribe(data => { this.books = data }, error => console.log(error));
  }

  search() {
    const name: string = this._route.snapshot.paramMap.get("name");
    return this.service.getbooksByname(name).subscribe(data => this.books = data);
  }
  catlist() {
    return this.catservice.getCatgories().subscribe(data => { this.categorys = data }, error => { console.log(error) });
  }

}
