package edu.prahlad.patterns2.command.useCase1;

import edu.prahlad.patterns2.command.useCase1.app.AddCustomerCommand;
import edu.prahlad.patterns2.command.useCase1.app.CustomerService;
import edu.prahlad.patterns2.command.useCase1.app2.BlackAndWhiteCommand;
import edu.prahlad.patterns2.command.useCase1.app2.CompositeCommand;
import edu.prahlad.patterns2.command.useCase1.app2.ResizeCommand;
import edu.prahlad.patterns2.command.useCase1.framework.Button;

public class Main {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();

        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
    }
}
