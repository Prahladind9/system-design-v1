package edu.prahlad.casestudy.onlinebank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@ComponentScan({"edu.prahlad.casestudy"})
//@EnableJpaRepositories({"edu.prahlad.casestudy"})
//@EntityScan({"edu.prahlad.casestudy"})
public class OnlineBankApplication  extends SpringBootServletInitializer
	implements CommandLineRunner
{

	private static final Logger log = LoggerFactory.getLogger(OnlineBankApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OnlineBankApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(OnlineBankApplication.class, args);
	}


	@Override
	public void run(String... args) {
		log.info("StartApplication...");
	}


}
