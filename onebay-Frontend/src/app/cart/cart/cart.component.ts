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

  constructor(private service:BookService) {
   }
  
  ngOnInit() {




  }

}
