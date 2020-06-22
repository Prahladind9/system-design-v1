import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { user } from '../shared/user.model';
import { AccountUserModel } from '../shared/account-user-model';
import { TransferUserModel } from '../shared/transfer-user-model';
import { TransferService } from '../service/data/transfer.service';

@Component({
  selector: 'app-transfer',
  templateUrl: './transfer.component.html',
  styleUrls: ['./transfer.component.css']
})
export class TransferComponent implements OnInit {

  isPrimary = true;
  firstFormGroup: FormGroup;
  user: user;
  accountUserModel: TransferUserModel;

  constructor(private _formBuilder: FormBuilder, private transferService: TransferService) { }

  ngOnInit() {

    // sessionStorage.setItem('AuthenticatedUser', 'Rao');

    this.firstFormGroup = this._formBuilder.group({
      transferFrom: [''],
      transferTo: [''],
      transactionAmount: [''],
      userName: [sessionStorage.getItem('AuthenticatedUser')]
    });
  }


  betweenAccounts() {
    console.log('betweenAccounts');
    console.log(this.firstFormGroup.value);
    this.transferService.transferbetweenAccounts(this.firstFormGroup.value);
    
    console.log(this.firstFormGroup.get('transferFrom').value);
    
  }

  transferToSet() {
    if (this.firstFormGroup.get('transferFrom').value === 'Primary') {
      this.firstFormGroup.controls['transferTo'].setValue('Savings');
    } else {
      this.firstFormGroup.controls['transferTo'].setValue('Primary');
    }
  }

}
