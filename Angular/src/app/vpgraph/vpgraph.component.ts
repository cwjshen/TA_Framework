import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-vpgraph',
  templateUrl: './vpgraph.component.html',
  styleUrls: ['./vpgraph.component.css']
})
export class VpgraphComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
      chartOptions = {
      responsive: true
    };
  
    chartData = [
      { data: [0, 2, 4, 0, 0,], label: 'Fail' },
      { data: [24, 5, 18, 8, 18,], label: 'Success' }      
    ];
  
    chartLabels = ['Overview VP', 'Batches VP', 'Location VP', 'Curricula VP','Trainers VP'];
  
    onChartClick(event) {
      console.log(event);
    }

  public colors:Array<any> = [
    { // grey
      backgroundColor: 'rgba(255,0,0,0.3)',
      borderColor: 'rgba(148,159,177,1)',
      pointBackgroundColor: 'rgba(148,159,177,1)',
      pointBorderColor: '#fff',
      pointHoverBackgroundColor: '#fff',
      pointHoverBorderColor: 'rgba(148,159,177,0.8)'
    },
    { // dark grey
      backgroundColor: 'rgba(30,144,255,0.3)',
      borderColor: 'rgba(77,83,96,1)',
      pointBackgroundColor: 'rgba(77,83,96,1)',
      pointBorderColor: '#fff',
      pointHoverBackgroundColor: '#fff',
      pointHoverBorderColor: 'rgba(77,83,96,1)'
    }
    
  ];
}
