import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ChartsModule } from 'ng2-charts';
import { RouterModule, Routes} from '@angular/router';

import { AppComponent } from './app.component';
import { TestRunnerComponent } from './test-runner/test-runner.component';
import { MyGraphsComponent } from './my-graphs/my-graphs.component';
import { VpgraphComponent } from './vpgraph/vpgraph.component';
import { DonutComponent } from './donut/donut.component';

const appRoutes: Routes = [
{ path:'home', component: TestRunnerComponent },
{ path:'metrics', component: MyGraphsComponent}

];

@NgModule({
  declarations: [
    AppComponent,
    TestRunnerComponent,
    MyGraphsComponent,
    VpgraphComponent,
    DonutComponent
  ],
  imports: [
    BrowserModule,
    ChartsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
