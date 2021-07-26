package edu.prahlad.springjdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PlayerDao dao;

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Inserting Player 4: {}", dao.insertPlayer(new Player(4, "Thiem", "Austria", new Date(System.currentTimeMillis()), 17)));
        logger.info("All Players Data: {}", dao.getAllPlayers());

    }
}
