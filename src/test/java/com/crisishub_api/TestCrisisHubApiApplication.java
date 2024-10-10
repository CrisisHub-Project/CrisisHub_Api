package com.crisishub_api;

import org.springframework.boot.SpringApplication;

public class TestCrisisHubApiApplication {

    public static void main(String[] args) {
        SpringApplication.from(CrisisHubApiApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
