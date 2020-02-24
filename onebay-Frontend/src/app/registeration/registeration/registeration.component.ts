import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/model/user';
import { UserService } from 'src/app/service/user.service';


@Component({
  selector: 'app-registeration',
  templateUrl: './registeration.component.html',
  styleUrls: ['./registeration.component.css']
})
export class RegisterationComponent implements OnInit {

  user = new User("pride","seoke","0781526863","pride@gmail.com");
  
  message:any;
  constructor(private userservice:UserService) { }

  ngOnInit() {
    this.register(this.user);
    this.user=null;
  }

  register(user: User){

    let res= this.userservice.adduser(user);
    return res.subscribe(data=>this.message=data); 
  }

}
