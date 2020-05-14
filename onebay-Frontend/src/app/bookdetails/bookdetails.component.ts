import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BookService } from 'src/app/services/book.service';
import { Book } from '../model/book';

@Component({
  selector: 'app-bookdetails',
  templateUrl: './bookdetails.component.html',
  styleUrls: ['./bookdetails.component.css']
})
export class BookdetailsComponent implements OnInit {

  book : Book;
  constructor(private activeroute : ActivatedRoute,private service:BookService) { }

  ngOnInit() {

    this.activeroute.paramMap.subscribe(()=>{
      this.getbook();
    })
  }


  getbook()
  {
    const bookId : any = this.activeroute.snapshot.paramMap.get('id');

    this.service.getbook(bookId).subscribe(data=>{this.book = data})

  }
}
