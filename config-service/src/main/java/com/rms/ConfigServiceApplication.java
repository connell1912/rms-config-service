package com.rms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
*@author 1912dec16 Fullstack Java
*<br>
*<br>
*The Config server pulls down the configuration files from one of our personal 
*git repository and distributes them to all of the services that ask for them.
*/
@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceApplication.class, args);
	}

}
