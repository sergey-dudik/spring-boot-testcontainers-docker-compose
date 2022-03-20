package com.example.sprintboottestcontainers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
class SprintBootTestcontainersApplicationTests extends ContainerizedEnv {

	@Test
	void contextLoads() {
	}
}
