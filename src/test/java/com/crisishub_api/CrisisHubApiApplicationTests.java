package com.crisishub_api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class CrisisHubApiApplicationTests {

    @Test
    void contextLoads() {
    }

}
