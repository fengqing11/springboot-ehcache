package xyz.fengqing11.sprigbootcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SprigbootCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprigbootCacheApplication.class, args);
    }

}
