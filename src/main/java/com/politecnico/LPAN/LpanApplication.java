package com.politecnico.LPAN;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootConfiguration

public class LpanApplication {
	
	public float sumar (float nu1, float nu2) {
		
		return nu1+nu2;
	}
	
	public float resta (float nu1, float nu2) {
		return nu1-nu2;
	}
	
	public float multiplicacion (float nu1, float nu2) {
		return nu1*nu2;
	}
	
	public float division (float nu1, float nu2) {
		return nu1/nu2;
	}
	
	
	public static void main(String[] args) {	
		
		System.out.println("Funcionando...This Docker running  from eclipse");
		
		
		
		SpringApplication.run(LpanApplication.class, args);
	}

}


