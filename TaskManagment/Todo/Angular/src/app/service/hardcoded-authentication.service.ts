import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HardcodedAuthenticationService {

  constructor() { }

  authenticate(username, password){

    // console.log('Before Login: '+ this.isUserLoggedIn());

    if(username === 'Rao' && password ==='dummy'){
      sessionStorage.setItem('authenticatedUser',username);
      // console.log('After Successful Login: '+ this.isUserLoggedIn());
      return true;
    }else{
      return false;
    }


  }

  isUserLoggedIn() {
    let user = sessionStorage.getItem('authenticatedUser');
    return !(user === null)
  }

  logout() {
    sessionStorage.removeItem('authenticatedUser');
  }
}
