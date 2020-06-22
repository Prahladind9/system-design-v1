import { Injectable } from '@angular/core';
import { user } from 'src/app/shared/user.model';
import { API_URL } from 'src/app/app.constants';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  
  isLoggedIn = false;

  constructor(private http: HttpClient) { }

  userLoginCredentialValidate(loginUser: user){
    console.log(loginUser);
    return this.http.post<user>(`${API_URL}/user/validateUser`, loginUser);
  }

  userSignUp(userSignedUp: user) {
    return this.http.post(`${API_URL}/user/createUser`, userSignedUp);
  }

  setUserSession(username: string){
    // localStorage.setItem('AuthenticatedUserLocalStorage', username);
    sessionStorage.setItem('AuthenticatedUser', username);
  }

  clearUserSession(){
    sessionStorage.removeItem('AuthenticatedUser');
  }


  getUserDetails(userName: string){
    console.log('getUserDetails ');
    return this.http.post<user>(`${API_URL}/user/getUser`, userName);
  }

  getUsersList(){
    return this.http.get(`${API_URL}/user/getUsers`);
  }

  enableUser(userName: string){
    return this.http.post(`${API_URL}/user/createUser`, userName);
  }

  disbleUser(userName: string){
    return this.http.post(`${API_URL}/user/createUser`, userName);
  }
}
