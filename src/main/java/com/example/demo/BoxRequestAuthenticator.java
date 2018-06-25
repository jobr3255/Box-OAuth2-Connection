package com.example.demo;

import org.springframework.security.oauth2.client.DefaultOAuth2RequestAuthenticator;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.security.oauth2.common.OAuth2AccessToken;

public class BoxRequestAuthenticator extends DefaultOAuth2RequestAuthenticator  {

    @Override
    public void authenticate(OAuth2ProtectedResourceDetails resource, OAuth2ClientContext clientContext, ClientHttpRequest request) {
        OAuth2AccessToken accessToken = clientContext.getAccessToken();
        request.getHeaders().set("Authorization", String.format("%s %s", "Bearer", accessToken.getValue()));
    }

}