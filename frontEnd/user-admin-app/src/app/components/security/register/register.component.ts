import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { SpaceValidator } from 'src/app/model/SpaceValidator';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  formParentGroup : FormGroup;


  constructor(private formChildGroup: FormBuilder) { }

  ngOnInit(): void {
    this.mySignupForm();
  }

  mySignupForm(){
    this.formParentGroup = this.formChildGroup.group({
      user: this.formChildGroup.group({
        email:[],
        password:[]
      })

     })
  }


  signup(){
    alert(this.formParentGroup.controls['user'].value.email);
    alert(this.formParentGroup.controls['user'].value.password);
  }


}
