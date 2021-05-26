package edu.prahlad.patterns.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IocApplicationTests {

    @Autowired
    Customer customer;

    @Test
    public void testPayments() {
        customer.pay();
    }

}
