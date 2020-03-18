import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/model/user';
import { UserService } from 'src/app/services/user.service';
import { getMaxListeners } from 'cluster';
import { error } from 'protractor';


@Component({
  selector: 'app-registeration',
  templateUrl: './registeration.component.html',
  styleUrls: ['./registeration.component.css']
})
export class RegisterationComponent implements OnInit {

  users: User[];
  message: any="";
  user: User={
    userName: "",
    firstName: "",
    lastName: "",
    email: "",
    password: "",
    phone: ""
  };

 
  constructor(private userservice: UserService) { }

  ngOnInit() {
    
    
  }

 
  register(user) {
    let res = this.userservice.addUser(user);
    return res.subscribe((data) => this.message = data, error => console.log(error));
  }

}
