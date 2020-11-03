package me.circlehotarux.eghibli;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("me.circlehotarux.eghibli.mapper")
@SpringBootApplication
public class EGhibliApplication {

    public static void main(String[] args) {
        SpringApplication.run(EGhibliApplication.class, args);
    }

}
