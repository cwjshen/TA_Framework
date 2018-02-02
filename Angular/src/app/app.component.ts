import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  runOverview() : void {
  	window.location.href = 'http://localhost:8080/TA_Framework_Maven/webapi/trainer/overview';
  }
  runOverviewVP() : void {
  	window.location.href = 'http://localhost:8080/TA_Framework_Maven/webapi/vp/overview';
  }
}
