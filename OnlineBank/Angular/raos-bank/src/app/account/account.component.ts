import { Component, OnInit } from '@angular/core';
import { user } from '../shared/user.model';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { AccountUserModel } from '../shared/account-user-model';
import { AccountService } from '../service/data/account.service';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {

  accountFormGroup: FormGroup;

  constructor(private _formBuilder: FormBuilder, private accountService: AccountService) {}

  ngOnInit() {

    // sessionStorage.setItem('AuthenticatedUser', 'Rao');

    this.accountFormGroup = this._formBuilder.group({
      accountType: [''],
      transactionAmount: [''],
      userName: [sessionStorage.getItem('AuthenticatedUser')]
    });
  }

  reset(){
    console.log(this.accountFormGroup.value);
    this.accountFormGroup.reset();
    this.accountFormGroup = this._formBuilder.group({
      accountType: [''],
      transactionAmount: [''],
      userName: [sessionStorage.getItem('AuthenticatedUser')]
    });
  }

  deposit(){
    console.log('deposit '+this.accountFormGroup.value);
    console.log(this.accountFormGroup.value);
    this.accountService.accountDeposit(this.accountFormGroup.value)
    .subscribe(
      response => console.log('response ' + response),
      error => console.log('Error ' + error)
    );
  }

  withdraw(){
    console.log('withdraw '+ this.accountFormGroup.value);
    console.log(this.accountFormGroup.value);
    this.accountService.accountWithdraw(this.accountFormGroup.value)
    .subscribe(
      response => console.log('response ' + response),
      error => console.log('Error ' + error)
    );
  }
}