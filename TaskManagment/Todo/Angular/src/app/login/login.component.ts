import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HardcodedAuthenticationService } from '../service/hardcoded-authentication.service';
import { BasicAuthenticationService } from '../service/basic-authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username = 'Rao';
  password = '';
  errorMessage = 'Invalid Credentials';
  invalidLogin = false;

  //Dependency Injection of Router
  constructor(private router: Router,
    private hardcodedAuthenticationSerice: HardcodedAuthenticationService,
    private basicAuthenticationService: BasicAuthenticationService) { }

  ngOnInit(): void {
  }

  handleLogin() {
    console.log(this.username);
    // if(this.username === 'Rao' && this.password ==='dummy'){
    if (this.hardcodedAuthenticationSerice.authenticate(this.username, this.password)) {
      //On Successful login route to Welcome Component/Page
      this.router.navigate(['welcome', this.username]);
      this.invalidLogin = false;

    } else {
      this.invalidLogin = true;
    }
  }


  handleBasicAuthLogin() {

    this.basicAuthenticationService.executeAuthenticationService(this.username, this.password)
      .subscribe(
        data => {
          console.log(data);
          //On Successful login route to Welcome Component/Page
          this.router.navigate(['welcome', this.username]);
          this.invalidLogin = false;

        },
        error => {
          console.log(error);
          this.invalidLogin = true;
        }
      )

  }

}
