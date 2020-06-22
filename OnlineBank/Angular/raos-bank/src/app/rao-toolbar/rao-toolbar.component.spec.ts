import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RaoToolbarComponent } from './rao-toolbar.component';

describe('RaoToolbarComponent', () => {
  let component: RaoToolbarComponent;
  let fixture: ComponentFixture<RaoToolbarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RaoToolbarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RaoToolbarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
