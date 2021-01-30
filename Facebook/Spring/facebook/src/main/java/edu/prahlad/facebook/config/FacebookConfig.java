package edu.prahlad.facebook.config;

import edu.prahlad.facebook.loader.YamlPropertyLoaderFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@PropertySource(
        value = "file:{PROPERTY_PATH}",
        factory = YamlPropertyLoaderFactory.class
)
@EnableAsync
public class FacebookConfig {
}
