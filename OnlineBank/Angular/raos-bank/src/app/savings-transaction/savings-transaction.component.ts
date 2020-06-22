import { Component, OnInit, ViewChild } from '@angular/core';
import {MatPaginator} from '@angular/material/paginator';
import {MatSort} from '@angular/material/sort';
import {MatTableDataSource} from '@angular/material/table';
import { AccountService } from '../service/data/account.service';
import { PrimaryTransaction } from '../shared/primary-transaction';

@Component({
  selector: 'app-savings-transaction',
  templateUrl: './savings-transaction.component.html',
  styleUrls: ['./savings-transaction.component.css']
})
export class SavingsTransactionComponent implements OnInit {

  
  
  displayedColumns: string[] = ['id', 'date', 'description', 'type', 'status', 'amount', 'availableBalance'];
  dataSource: MatTableDataSource<PrimaryTransaction>;


  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;
  @ViewChild(MatSort, {static: true}) sort: MatSort;

  constructor(private accountService: AccountService) { 
    this.accountService.getSavingsTransactionDetails(sessionStorage.getItem('AuthenticatedUser'))
    .subscribe(
      response => {
        console.log(response);
        console.log('1' + response);
        console.log('2' + JSON.stringify(response));
        console.log('3' + JSON.parse(JSON.stringify(response)));

        this.dataSource =  new MatTableDataSource(JSON.parse(JSON.stringify(response)));

        // this.primaryTransaction = response as PrimaryTransaction[];
        // this.primaryTransaction = JSON.parse(JSON.stringify(response));
       
      },
      error => console.log(error)
    );
  }

  ngOnInit(): void {

    // this.dataSource.paginator = this.paginator;
    // this.dataSource.sort = this.sort;

  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  }
}
