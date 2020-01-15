package org.example.localconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class LocalConfigServerApp {
    public static void main(String args[]) {
        SpringApplication.run(LocalConfigServerApp.class, args);
    }
}
