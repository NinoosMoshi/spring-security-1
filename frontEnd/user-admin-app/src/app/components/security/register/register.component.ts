import { AuthenticationService } from './../../../services/security/authentication.service';
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


  constructor(private formChildGroup: FormBuilder,
              private authenticationService: AuthenticationService,
              private router: Router) { }

  ngOnInit(): void {
    this.mySignupForm();
  }

  mySignupForm(){
    this.formParentGroup = this.formChildGroup.group({
      user: this.formChildGroup.group({
        email: new FormControl('',[Validators.required,
                                   SpaceValidator.onlyContainSpace,
                                   Validators.pattern('^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$') ]),
        password: new FormControl('', [Validators.required])
      })

     })
  }

  get email(){
    return this.formParentGroup.get('user.email')
  }

  get password(){
    return this.formParentGroup.get('user.password')
  }


  signup(){
    if(this.formParentGroup.invalid){
      this.formParentGroup.markAllAsTouched()
      return;
   }

    this.authenticationService.createUser(
      this.formParentGroup.controls['user'].value.email,
      this.formParentGroup.controls['user'].value.password
    ).subscribe({
      next:response =>{
        if(response.result == 1){
          this.router.navigateByUrl("/login")
        }else{
          alert("This Email is Exists")
        };
      },
      error:err =>{
        alert('there is something wrong');
      }
    })


  }


}
