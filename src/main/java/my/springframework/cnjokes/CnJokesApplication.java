package my.springframework.cnjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class CnJokesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CnJokesApplication.class, args);
    }

}
