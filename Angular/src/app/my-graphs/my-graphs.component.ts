import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-my-graphs',
  templateUrl: './my-graphs.component.html',
  styleUrls: ['./my-graphs.component.css']
})
export class MyGraphsComponent implements OnInit {

  constructor() { }


    ngOnInit() {
    }
    chartOptions = {
      responsive: true
    };
  
    chartData = [
      { data: [4, 1, 0, 0,0,2,2], label: 'Fail' },
      { data: [24, 13, 3, 1,12,19,12], label: 'Success' }
    ];
  
    chartLabels = ['Overview', 'Batches', 'Location', 'Curricula','Trainers','Profile','Settings'];
  
    onChartClick(event) {
      console.log(event);
    }
  }
  


