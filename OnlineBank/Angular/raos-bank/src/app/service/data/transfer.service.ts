import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { API_URL } from 'src/app/app.constants';
import { TransferUserModel } from 'src/app/shared/transfer-user-model';

@Injectable({
  providedIn: 'root'
})
export class TransferService {

  constructor(private http: HttpClient) { }

  transferbetweenAccounts(transferUserModel: TransferUserModel) {
    console.log('transferbetweenAccounts Service betweenAccounts '+ transferUserModel);
    return this.http.post(`${API_URL}/transfer/betweenAccounts`, transferUserModel)
    .subscribe(
      success => console.log(success),
      error => console.log(error)
    );
  }
}
