package ada;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ConsumidorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumidorApplication.class, args);
    }

}