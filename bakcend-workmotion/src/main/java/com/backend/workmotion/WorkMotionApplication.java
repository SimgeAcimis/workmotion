package com.backend.workmotion;

import com.backend.workmotion.config.DbConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({DbConfiguration.class})
public class WorkMotionApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkMotionApplication.class, args);
	}

}
