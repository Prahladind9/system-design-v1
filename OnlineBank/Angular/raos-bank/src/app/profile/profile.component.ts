import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { UserService } from '../service/data/user.service';
import { Router } from '@angular/router';
import { user } from '../shared/user.model';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  signUpFormGroup: FormGroup;
  user: user;

  constructor(private userService: UserService,
    private route: Router) {

  }

  ngOnInit(): void {

    this.userService.getUserDetails(sessionStorage.getItem('AuthenticatedUser'))
      .subscribe(
        response => {
          console.log(response);
          console.log('1' + response);
          console.log('2' + JSON.stringify(response));
          console.log('3' + JSON.parse(JSON.stringify(response)));

          this.user = JSON.parse(JSON.stringify(response));



          this.signUpFormGroup = new FormGroup(
            {
              userName: new FormControl('', [Validators.required, Validators.minLength(3), Validators.maxLength(10)]),
              password: new FormControl('', Validators.required),
              firstName: new FormControl('', [Validators.required, Validators.minLength(3), Validators.maxLength(10)]),
              lastName: new FormControl('', [Validators.required, Validators.minLength(3), Validators.maxLength(10)]),
              phone: new FormControl('', [Validators.required, Validators.pattern("^((\\+91-?)|0)?[0-9]{10}$")]),
              email: new FormControl('', [Validators.required, Validators.email]),
              primaryAccountNumber: new FormControl(''),
              savingsAccountNumber: new FormControl('')
            }
          );

          this.signUpFormGroup.get('userName').setValue(this.user.userName);
          this.signUpFormGroup.get('password').setValue(this.user.password);
          this.signUpFormGroup.get('firstName').setValue(this.user.firstName);
          this.signUpFormGroup.get('lastName').setValue(this.user.lastName);
          this.signUpFormGroup.get('phone').setValue(this.user.phone);
          this.signUpFormGroup.get('email').setValue(this.user.email);
          this.signUpFormGroup.get('primaryAccountNumber').setValue(this.user.primaryAccount.accountNumber);
          this.signUpFormGroup.get('savingsAccountNumber').setValue(this.user.savingsAccount.accountNumber);

        },
        error => console.log(error)
      );
  }


  saveUser() {
    console.log(this.signUpFormGroup.value);
    this.userService.userSignUp(this.signUpFormGroup.value)
      .subscribe(
        response => {
          console.log(response);
          this.route.navigate(['login'])
        },
        error => {
          console.log(error);
        }
      );
  }

}
