package com.yasmani.net.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class VaultConfigChecker {

	@Value("${spring.data.mongodb.username}")
    private String username;

    @Value("${spring.data.mongodb.password}")
    private String password;

    @Value("${spring.data.mongodb.database}")
    private String database;

    @PostConstruct
    public void printVaultValues() {
        System.out.println("MongoDB Username from Vault: " + username);
        System.out.println("MongoDB Password from Vault: " + password);
        System.out.println("MongoDB Database from Vault: " + database);
    }
}
