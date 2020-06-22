import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { AccountService } from '../service/data/account.service';
import { PrimaryTransaction } from '../shared/primary-transaction';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {

  displayedColumns: string[] = ['id', 'amount', 'availableBalance', 'date', 'description'];
  dataSource: MatTableDataSource<PrimaryTransaction>;
  primaryTransaction: PrimaryTransaction[];

  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;
  @ViewChild(MatSort, {static: true}) sort: MatSort;

  constructor(private accountService: AccountService) {
       
  }

  ngOnInit() {
    // this.dataSource.paginator = this.paginator;
    // this.dataSource.sort = this.sort;


    this.accountService.getPrimaryTransactionDetails(sessionStorage.getItem('AuthenticatedUser'))
    .subscribe(
      response => {
        console.log(response);
        console.log('1' + response);
        console.log('2' + JSON.stringify(response));
        console.log('3' + JSON.parse(JSON.stringify(response)));

        // this.primaryTransaction = response as PrimaryTransaction[];
        this.primaryTransaction = JSON.parse(JSON.stringify(response));
       
      },
      error => console.log(error)
    );

    this.dataSource = new MatTableDataSource(this.primaryTransaction);

  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  }
}