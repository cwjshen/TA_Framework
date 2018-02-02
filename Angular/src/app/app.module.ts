import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ChartsModule } from 'ng2-charts';
import { RouterModule, Routes} from '@angular/router';

import { AppComponent } from './app.component';
import { TestRunnerComponent } from './test-runner/test-runner.component';
import { MyGraphsComponent } from './my-graphs/my-graphs.component';

const appRoutes: Routes = [
{ path:'metrics', component: MyGraphsComponent},

];

@NgModule({
  declarations: [
    AppComponent,
    TestRunnerComponent,
    MyGraphsComponent
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
