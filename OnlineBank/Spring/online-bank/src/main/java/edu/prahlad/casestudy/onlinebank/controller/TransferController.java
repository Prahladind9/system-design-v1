package edu.prahlad.casestudy.onlinebank.controller;

import edu.prahlad.casestudy.onlinebank.entity.Users;
import edu.prahlad.casestudy.onlinebank.model.CaseStudyException;
import edu.prahlad.casestudy.onlinebank.model.TransferUserModel;
import edu.prahlad.casestudy.onlinebank.service.TransactionService;
import edu.prahlad.casestudy.onlinebank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("transfer")
public class TransferController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("betweenAccounts")
    public void betweenAccounts(@RequestBody TransferUserModel transferUserModel) throws CaseStudyException {
        this.transactionService.betweenAccountsTransfer(
                transferUserModel.getTransferFrom(), transferUserModel.getTransferTo(),
                transferUserModel.getTransactionAmount(), transferUserModel.getUserName()

        );
    }


}
