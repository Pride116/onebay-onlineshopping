import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/model/user';
import { UserService } from 'src/app/service/user.service';


@Component({
  selector: 'app-registeration',
  templateUrl: './registeration.component.html',
  styleUrls: ['./registeration.component.css']
})
export class RegisterationComponent implements OnInit {

  user = new User("","","","");
  
  message:any;
  
  constructor(private userservice:UserService) { }

  ngOnInit() {

  }
  register(user){
    let res= this.userservice.adduser(user);
    return res.subscribe((data)=>this.message=data, error=>console.log(error)); 
  }

}
