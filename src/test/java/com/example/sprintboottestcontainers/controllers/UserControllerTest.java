package com.example.sprintboottestcontainers.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.sprintboottestcontainers.ContainerizedEnv;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest extends ContainerizedEnv {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void getAllTest() throws Exception {
    this.mockMvc.perform(get("/users"))
        .andExpect(status().isOk())
        .andReturn();
  }
}