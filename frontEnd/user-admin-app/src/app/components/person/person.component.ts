import { Person } from './../../model/person';
import { PersonService } from './../../services/person.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css']
})
export class PersonComponent implements OnInit {

  persons :Person[];

  constructor(private personService: PersonService) { }

  ngOnInit(): void {
    this.getAllPersons();
  }

  getAllPersons(){
    return this.personService.getPersons().subscribe(
      data =>{
        this.persons = data
      }
    )
  }



}
