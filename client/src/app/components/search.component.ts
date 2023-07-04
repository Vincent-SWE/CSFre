import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  form!: FormGroup;
  letter?: string;

  constructor(private fb: FormBuilder, private router: Router){ }


  ngOnInit() {
    this.form = this.createForm();
  }

  search(){
    const letter = this.form?.value['letter'];
    this.router.navigate(['/list', letter]);
  }


  createForm(): FormGroup {
    return this.fb.group({
      letter: this.fb.control(''),
    });
  }



}
