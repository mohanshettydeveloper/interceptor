package com.example.interceptor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "feature-flags")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class FeatureFlags {
    private String brand;
}
