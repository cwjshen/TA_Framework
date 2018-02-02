import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VpgraphComponent } from './vpgraph.component';

describe('VpgraphComponent', () => {
  let component: VpgraphComponent;
  let fixture: ComponentFixture<VpgraphComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VpgraphComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VpgraphComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
