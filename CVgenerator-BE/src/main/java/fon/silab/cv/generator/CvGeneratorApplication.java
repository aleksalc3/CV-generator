package fon.silab.cv.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class CvGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvGeneratorApplication.class, args);
	}

}
