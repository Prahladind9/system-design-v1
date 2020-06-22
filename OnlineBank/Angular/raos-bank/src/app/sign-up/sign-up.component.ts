import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { UserService } from '../service/data/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

  signUpFormGroup: FormGroup;
  isLoading: boolean;

  constructor(private userService: UserService,
    private route: Router) { }

  ngOnInit(): void {
    this.signUpFormGroup = new FormGroup(
      {
        userName: new FormControl('', [Validators.required, Validators.minLength(3), Validators.maxLength(10)]),
        password: new FormControl('', Validators.required),
        firstName: new FormControl('',  [Validators.required, Validators.minLength(3), Validators.maxLength(10)]),
        lastName: new FormControl('', [Validators.required, Validators.minLength(3), Validators.maxLength(10)]),
        phone: new FormControl('', [Validators.required, Validators.pattern("^((\\+91-?)|0)?[0-9]{10}$")]),
        email: new FormControl('', [Validators.required, Validators.email]),
      }
    );
  }


  saveUser() {
    console.log(this.signUpFormGroup.value);
    this.isLoading = true;
    this.userService.userSignUp(this.signUpFormGroup.value)
      .subscribe(
        response => {
          console.log(response);
          this.route.navigate(['login'])
        },
        error => {
          console.log(error);
          this.isLoading = false;
        }
      );
      this.isLoading = false;
  }

  clearSignUp() {
    this.signUpFormGroup.reset();
    // this.route.navigate(['signup'])
  }
}
