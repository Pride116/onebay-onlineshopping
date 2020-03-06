import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/model/book';
import { BookComponent } from 'src/app/Book/book/book.component';

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.css']
})
export class NavigationComponent implements OnInit {

  name:any;
  constructor() { }

  ngOnInit() {
  }

}
