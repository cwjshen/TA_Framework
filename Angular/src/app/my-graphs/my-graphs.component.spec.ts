import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MyGraphsComponent } from './my-graphs.component';

describe('MyGraphsComponent', () => {
  let component: MyGraphsComponent;
  let fixture: ComponentFixture<MyGraphsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MyGraphsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MyGraphsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
