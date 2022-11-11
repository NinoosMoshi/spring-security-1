import { map } from 'rxjs/operators';
import { Person } from './../model/person';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PersonService {

   baseUrl = "http://localhost:8080/api/v1/person";


  constructor(private http:HttpClient) { }


  getPersons():Observable<Person[]>{
    let head = new HttpHeaders({
      Authorization: sessionStorage.getItem("token").toString()
    });
   return this.http.get<Person[]>(`${this.baseUrl}/all`, {headers:head}).pipe(
    map(response => {
      return response
    })
   );
  }



}
