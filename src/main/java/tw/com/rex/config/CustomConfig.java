package tw.com.rex.config;

import org.apereo.cas.configuration.CasConfigurationProperties;
import org.apereo.cas.support.oauth.web.views.OAuth20UserProfileViewRenderer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tw.com.rex.view.CustomOAuth20UserProfileViewRenderer;

@Configuration
@EnableConfigurationProperties(CasConfigurationProperties.class)
public class CustomConfig {

    @Bean
    @RefreshScope
    public OAuth20UserProfileViewRenderer oauthUserProfileViewRenderer() {
        return new CustomOAuth20UserProfileViewRenderer();
    }

}
