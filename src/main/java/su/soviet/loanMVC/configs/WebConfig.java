package su.soviet.loanMVC.configs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Setter
@Getter
@Configuration
@ConfigurationProperties("web")
public class WebConfig {
    private String incomeUrl;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
