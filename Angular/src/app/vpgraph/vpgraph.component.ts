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

}
