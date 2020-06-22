import { Component, OnInit } from '@angular/core';
import { TodoDataService } from '../service/data/todo-data.service';
import { Router } from '@angular/router';

export class Todo {
  constructor(
    public id: number,
    public description: string,
    public done: boolean,
    public targetDate: Date
  ){

  }
}

@Component({
  selector: 'app-list-todos',
  templateUrl: './list-todos.component.html',
  styleUrls: ['./list-todos.component.css']
})
export class ListTodosComponent implements OnInit {

  username: string = 'Rao';
  message: string;
  todos: Todo[];
  // [
  //   new Todo(1, 'Learn to Dance', false, new Date()),
  //   new Todo(2, 'Angular Expert', false, new Date()),
  //   new Todo(1, 'Buy Medicines', false, new Date())
  //   // {id: 1,
  //   //   description: 'Learn to Dance'},
  //   //   {id: 2,
  //   //     description: 'Vist India'}
  // ];
  // todo = {
  //     id: 1,
  //     description: 'Learn to Dance'
  // };


  constructor(private todoDataService:TodoDataService,
    private router: Router) { }

  ngOnInit(): void {
    this.refreshTodos();

  }

  refreshTodos(){
    this.todoDataService.retriveAllTodos(this.username).subscribe(
      response => {
        console.log(response);
        this.todos = response;
      }
    );
  }


  deleteTodo(todo:Todo){
    console.log(`Delete Todo ${todo} `);
    this.todoDataService.deleteTodo(this.username, todo.id).subscribe(
      response => {
        console.log(response);
        this.message = `Delete of Todo ${todo.id} Successful!`;
        this.refreshTodos();
      }
    );
  }

  updateTodo(todo: Todo){
    console.log(`update ${todo.id}`);
    this.router.navigate(['/todos', todo.id]);
  }

  addTodo() {
    this.router.navigate(['todos', -1])
  }

}
