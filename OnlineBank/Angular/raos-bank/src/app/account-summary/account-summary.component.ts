import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { user } from '../shared/user.model';
import { UserService } from '../service/data/user.service';

@Component({
  selector: 'app-account-summary',
  templateUrl: './account-summary.component.html',
  styleUrls: ['./account-summary.component.css']
})
export class AccountSummaryComponent implements OnInit {

  isLinear = true;
  user: user;
  primaryAccountBalance: number;
  savingsAccountBalance: number;
  
  constructor(private _formBuilder: FormBuilder,
    private userService: UserService) {}

  ngOnInit() {
    this.userService.getUserDetails(sessionStorage.getItem('AuthenticatedUser'))
    .subscribe(
      response => {
        console.log(response);
        console.log('1' + response);
        console.log('2' + JSON.stringify(response));
        console.log('3' + JSON.parse(JSON.stringify(response)));

        this.user = JSON.parse(JSON.stringify(response));
        this.primaryAccountBalance = this.user.primaryAccount.accountBalance;
        this.savingsAccountBalance = this.user.savingsAccount.accountBalance;
        // console.log( this.user.primaryAccount.accountBalance)
      },
      error => console.log(error)
    );
  }

}
