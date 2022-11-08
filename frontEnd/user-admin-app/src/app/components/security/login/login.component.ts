import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { SpaceValidator } from 'src/app/model/SpaceValidator';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  formParentGroup: FormGroup

  constructor(private formChildGroup: FormBuilder) { }

  ngOnInit(): void {
    this.myLoginForm();
  }

  myLoginForm(){
     this.formParentGroup = this.formChildGroup.group({
      user: this.formChildGroup.group({
        email:[],
        password:[]
      })

     })
  }


  login(){
    alert(this.formParentGroup.controls['user'].value.email);
    alert(this.formParentGroup.controls['user'].value.password);

  }





}
