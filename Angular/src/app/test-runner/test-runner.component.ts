import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test-runner',
  templateUrl: './test-runner.component.html',
  styleUrls: ['./test-runner.component.css']
})
export class TestRunnerComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  
  runTest(): void {
  	window.location.href = 'http://localhost:8080/TA_Framework_Maven/index.jsp';
  }

}
