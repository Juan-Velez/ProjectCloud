package co.com.poli.talleruno.tallerunocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import javax.xml.crypto.Data;


@SpringBootApplication
public class TallerUnoCloudApplication {

    public static void main(String[] args) {

        SpringApplication.run(TallerUnoCloudApplication.class, args);
    }

}
