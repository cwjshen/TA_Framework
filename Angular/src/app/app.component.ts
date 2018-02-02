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

  runBatches() : void {
  	window.location.href = 'http://localhost:8080/TA_Framework_Maven/webapi/trainer/batches';
  }
  runBatchesVP() : void {
  	window.location.href = 'http://localhost:8080/TA_Framework_Maven/webapi/vp/batches';
  }

  runLocations() : void {
  	window.location.href = 'http://localhost:8080/TA_Framework_Maven/webapi/trainer/locations';
  }
  runLocationsVP() : void {
  	window.location.href = 'http://localhost:8080/TA_Framework_Maven/webapi/vp/locations';
  }

  runCurricula() : void {
  	window.location.href = 'http://localhost:8080/TA_Framework_Maven/webapi/trainer/curricula';
  }
  runCurriculaVP() : void {
  	window.location.href = 'http://localhost:8080/TA_Framework_Maven/webapi/vp/curricula';
  }

  runTrainers() : void {
  	window.location.href = 'http://localhost:8080/TA_Framework_Maven/webapi/trainer/trainers';
  }
  runTrainersVP() : void {
  	window.location.href = 'http://localhost:8080/TA_Framework_Maven/webapi/vp/trainers';
  }

  runProfile() : void {
  	window.location.href = 'http://localhost:8080/TA_Framework_Maven/webapi/trainer/profile';
  }

  runSettings() : void {
  	window.location.href = 'http://localhost:8080/TA_Framework_Maven/webapi/trainer/settings';
  }
  runSettingsVP() : void {
  	window.location.href = 'http://localhost:8080/TA_Framework_Maven/webapi/vp/settings';
  }

}


