import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { WelcomeDataService } from '../service/data/welcome-data.service';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  welcomeMessage = 'Welcome Component';
  welcomeMessageFromService:string = '';

  constructor(private activatedRoute: ActivatedRoute,
    private welcomeDataService:WelcomeDataService) { }

  ngOnInit(): void {
    console.log(this.welcomeMessage);
    console.log(this.activatedRoute.snapshot.params['name']);
    this.welcomeMessage = this.activatedRoute.snapshot.params['name'];
  }

  public getWelcomeMessage() {
    console.log(this.welcomeDataService.executeHelloWorldBeanService());

    //Asyncronos Call
    // when subscribe gets back success response do the following
    // arrow function
    this.welcomeDataService.executeHelloWorldBeanService().subscribe(
      //Success Response
      response => this.handleSuccessfulResponse(response),
      //Error Response
      error => this.handleErrorResponse(error)
    );

    console.log('Last line of getWelcomeMessage');
    //  console.log("get welcome message");
  }

  public getWelcomeMessageWithParam(){

    //Asynch Call
    this.welcomeDataService.executeHelloWorldBeanServiceWithPathVariable(this.welcomeMessage)
        .subscribe(
          //Success Response
          response => this.handleSuccessfulResponse(response),
          //Error Response
          error => this.handleErrorResponse(error)
        );

  }

  handleErrorResponse(error){
    console.log(error);
    console.log(error.error);
    console.log(error.error.message);
    this.welcomeMessageFromService = error.error.message;
  }

  handleSuccessfulResponse(response){
    console.log(response);
    console.log(response.message);
    this.welcomeMessageFromService = response.message;
  }

}
