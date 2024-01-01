import { TestBed } from '@angular/core/testing';

import { eshopFormService } from './eshop-form.service';

describe('eshopFormService', () => {
  let service: eshopFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(eshopFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
