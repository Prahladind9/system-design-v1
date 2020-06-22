import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RaoFooterComponent } from './rao-footer.component';

describe('RaoFooterComponent', () => {
  let component: RaoFooterComponent;
  let fixture: ComponentFixture<RaoFooterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RaoFooterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RaoFooterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
