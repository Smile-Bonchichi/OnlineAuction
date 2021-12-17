package kg.it.academy.OnlineAuction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class OnlineAuctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineAuctionApplication.class, args);
    }

}
