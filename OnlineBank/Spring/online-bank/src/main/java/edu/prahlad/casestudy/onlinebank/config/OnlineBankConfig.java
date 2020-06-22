package edu.prahlad.casestudy.onlinebank.config;


import edu.prahlad.casestudy.onlinebank.loader.YamlPropertyLoaderFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.sql.DataSource;

@Configuration
@PropertySource(
        value = "file:${PROPERTY_PATH}",
        factory = YamlPropertyLoaderFactory.class)
@EnableAsync
public class OnlineBankConfig {

    @Value("${onlinebank.datasource.url}")
    public String dataSourceUrl;

    @Value("${onlinebank.datasource.username}")
    public String dataSourceUsername;

    @Value("${onlinebank.datasource.password}")
    public String dataSourcePassword;

    @Value("${onlinebank.datasource.driver}")
    public String dataSourceDriver;

    @Value("${onlinebank.threadPoolTaskExecutor.maxPoolSize}")
    public Integer maxPoolSize;

    @Value("${onlinebank.threadPoolTaskExecutor.corePoolSize}")
    public Integer corePoolSize;

    @Value("${onlinebank.threadPoolTaskExecutor.queueCapacity}")
    public Integer queueCapacity;


    @Value("${onlinebank.applicationName}")
    public String applicationName;


    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dataSourceDriver);
        dataSource.setUrl(dataSourceUrl);
        dataSource.setUsername(dataSourceUsername);
        dataSource.setPassword(dataSourcePassword);
        return dataSource;
    }
}