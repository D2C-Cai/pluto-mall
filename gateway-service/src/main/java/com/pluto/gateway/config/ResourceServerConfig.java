package com.pluto.gateway.config;

import com.pluto.gateway.authorization.GatewayReactiveAuthorizationManager;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@AllArgsConstructor
@Configuration
@EnableWebFluxSecurity
public class ResourceServerConfig {

    private final GatewayReactiveAuthorizationManager gatewayReactiveAuthorizationManager;

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http.authorizeExchange()
                .pathMatchers("/actuator/**").permitAll()
                .anyExchange().access(gatewayReactiveAuthorizationManager);
        http.oauth2ResourceServer().jwt();
        return http.build();
    }

}
