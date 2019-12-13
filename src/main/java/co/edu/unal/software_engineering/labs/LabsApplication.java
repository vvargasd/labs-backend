package co.edu.unal.software_engineering.labs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabsApplication{

    public static void main( String[] args ){

        int a = 9/(4-4);
        SpringApplication.run( LabsApplication.class, args );
    }

}
