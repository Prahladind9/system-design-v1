import { Component, OnInit } from '@angular/core';
import { UserService } from '../service/data/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-rao-toolbar',
  templateUrl: './rao-toolbar.component.html',
  styleUrls: ['./rao-toolbar.component.css']
})
export class RaoToolbarComponent implements OnInit {

  constructor(private userService: UserService, 
    private route: Router) { }

  ngOnInit(): void {
  }

  handleLogOut(){
    this.userService.clearUserSession();
    this.route.navigate(['login']);
  }

}
