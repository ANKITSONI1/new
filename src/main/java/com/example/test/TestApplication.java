package com.example.test;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {

	Desktop desktop = Desktop.getDesktop();
	desktop.browse();

//		SpringApplication.run(TestApplication.class, args);
	}

}
