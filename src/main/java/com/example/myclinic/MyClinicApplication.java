package com.example.myclinic;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.apache.log4j.*;

@SpringBootApplication
public class MyClinicApplication {


	public static void main(String[] args) {
		/*@Bean
		public ModelMapper modelMapper(){
			return new ModelMapper();
		}
		*/

		// PropertyConfigurator.configure("log4j.properties");
		SpringApplication.run(MyClinicApplication.class, args);
	}

}
