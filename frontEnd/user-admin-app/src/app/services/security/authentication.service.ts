import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators'

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  baseUrl = 'http://localhost:8080';

  constructor(private http:HttpClient) { }



     // http://localhost:8080/login
     executeAuthentication(email:string, password:string):Observable<any>{
      return this.http.post<any>(`${this.baseUrl}/login`,{email,password}).pipe(
        map(response =>{
          sessionStorage.setItem("email", response.email);
          sessionStorage.setItem("token",`Bearer ${response.token}`);
          return response
        })
      );
    }


    // http://localhost:8080/register
    createUser(email:string, password:string):Observable<any>{
      return this.http.post(`${this.baseUrl}/register`,{email,password}).pipe(
        map(response => {
          return response
        })
      );
    }


    getEmail(){
      return sessionStorage.getItem("email");
    }

    getToken(){
        return sessionStorage.getItem("token")
    }

    isLogin(){
      return !(sessionStorage.getItem('email') == null || sessionStorage.getItem('token') == null);
   }

   logout(){
    sessionStorage.removeItem('email');
    sessionStorage.removeItem('token');
   }



}
