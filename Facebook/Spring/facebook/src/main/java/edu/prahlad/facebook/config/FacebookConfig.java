package edu.prahlad.facebook.config;

import edu.prahlad.facebook.loader.YamlPropertyLoaderFactory;
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
        factory = YamlPropertyLoaderFactory.class
)
@EnableAsync
public class FacebookConfig {


    @Value("${facebook.datasource.url}")
    public String dataSourceUrl;

    @Value("${facebook.datasource.username}")
    public String dataSourceUsername;

    @Value("${facebook.datasource.password}")
    public String dataSourcePassword;

    @Value("${facebook.datasource.driver}")
    public String dataSourceDriver;

    @Value("${facebook.threadPoolTaskExecutor.maxPoolSize}")
    public Integer maxPoolSize;

    @Value("${facebook.threadPoolTaskExecutor.corePoolSize}")
    public Integer corePoolSize;

    @Value("${facebook.threadPoolTaskExecutor.queueCapacity}")
    public Integer queueCapacity;


    @Value("${facebook.applicationName}")
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
