package id.co.ukabima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile({"heroku", "default"})
public class BankOfUkabima {

    public static void main(String[] args) {
        SpringApplication.run(BankOfUkabima.class, args);
    }
}
