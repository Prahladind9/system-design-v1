import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AccountUserModel } from 'src/app/shared/account-user-model';
import { API_URL } from 'src/app/app.constants';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  constructor(private http: HttpClient) { }

  getPrimaryTransactionDetails(userName: string) {
    return this.http.post(`${API_URL}/account/primaryTransaction`, userName);
  }

  getSavingsTransactionDetails(userName: string) {
    return this.http.post(`${API_URL}/account/savingsTransaction`, userName);
  }

  accountDeposit(accountUserModel: AccountUserModel) {
    console.log('accountUserModel');
    console.log(accountUserModel);
    return this.http.post(`${API_URL}/account/deposit`, accountUserModel);
  }

  accountWithdraw(accountUserModel: AccountUserModel) {
    return this.http.post(`${API_URL}/account/withdraw`, accountUserModel);
  }
}
