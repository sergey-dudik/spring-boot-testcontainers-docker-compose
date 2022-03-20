package com.example.sprintboottestcontainers;

import java.io.File;
import org.testcontainers.containers.DockerComposeContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public abstract class ContainerizedEnv {

  public static final DockerComposeContainer DOCKER_COMPOSE_CONTAINER;

  static {
    DOCKER_COMPOSE_CONTAINER =
        new DockerComposeContainer(new File("src/test/resources/docker-compose.yml"))
            .withExposedService("db", 5432, Wait.forListeningPort())
            .withLocalCompose(true);

    DOCKER_COMPOSE_CONTAINER.start();
  }
}
