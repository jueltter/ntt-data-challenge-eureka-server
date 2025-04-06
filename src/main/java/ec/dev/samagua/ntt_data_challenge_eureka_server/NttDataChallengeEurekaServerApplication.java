package ec.dev.samagua.ntt_data_challenge_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NttDataChallengeEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NttDataChallengeEurekaServerApplication.class, args);
    }

}
