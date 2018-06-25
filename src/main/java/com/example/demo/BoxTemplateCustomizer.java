package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer;

@Component
public class BoxTemplateCustomizer implements UserInfoRestTemplateCustomizer  {

    @Override
    public void customize(OAuth2RestTemplate template) {
        template.setAuthenticator(new BoxRequestAuthenticator());
    }
}