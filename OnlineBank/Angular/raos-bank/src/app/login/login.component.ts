import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../service/data/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  hide: boolean = true;
  loginFormGroup: FormGroup;
  isLoading: boolean = false;

  // https://angular.io/api/forms/FormGroup

  constructor(private router: Router,
    private userService: UserService) { }

  ngOnInit(): void {

    this.loginFormGroup = new FormGroup(
      {
        userName: new FormControl('', Validators.required),
        password: new FormControl('', Validators.required),
      }
    );
  }

  submitHandler(){
    console.log(this.loginFormGroup.value);
    this.isLoading = true;

    this.userService.userLoginCredentialValidate(this.loginFormGroup.value)
      .subscribe(
        resposne => {
          
          console.log(resposne);
          this.userService.setUserSession(resposne.userName);
          this.loginFormGroup.reset();
          this.isLoading = false;

          this.router.navigate(['accountSummary']);
          
        },
        error => {
          console.log(error);
          this.loginFormGroup.reset();
          this.isLoading = false;
        }
      )

  }

  handleSignUp() {
    this.router.navigate(['signup']);
  }

}
