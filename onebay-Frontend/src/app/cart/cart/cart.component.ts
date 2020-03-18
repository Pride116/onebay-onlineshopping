import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/model/book';
import { BookComponent } from 'src/app/Book/book/book.component';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

cartbooks:Book[];
message:any;
  constructor(private service:BookService) {
   }
  
  ngOnInit() {

    this.getbooks();
  }

  getbooks(){
    return this.service.getbooks().subscribe(data=>this.cartbooks=data);
  }

  delete(book){
    return this.service.deleteBookById(book.id).subscribe(data=>this.cartbooks.splice(this.cartbooks.indexOf(book),1));
  }

}
