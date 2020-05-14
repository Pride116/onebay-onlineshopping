import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/model/book';
import { BookComponent } from 'src/app/Book/book/book.component';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.css']
})
export class NavigationComponent implements OnInit {


  constructor(private _route: Router) { }

  ngOnInit() {
  }

  search(name: string) {

    this._route.navigateByUrl("/search/" + name);
  }

}
