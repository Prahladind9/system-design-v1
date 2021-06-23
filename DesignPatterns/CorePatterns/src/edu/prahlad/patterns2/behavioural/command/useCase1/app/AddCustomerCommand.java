package edu.prahlad.patterns2.behavioural.command.useCase1.app;

import edu.prahlad.patterns2.behavioural.command.useCase1.framework.Command;

public class AddCustomerCommand implements Command {
    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
