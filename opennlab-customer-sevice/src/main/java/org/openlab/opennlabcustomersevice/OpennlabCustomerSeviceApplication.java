package org.openlab.opennlabcustomersevice;

import org.openlab.opennlabcustomersevice.dtos.CustomerRequestDTO;
import org.openlab.opennlabcustomersevice.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OpennlabCustomerSeviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpennlabCustomerSeviceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerService customerService){
        return args -> {
            customerService.save(new CustomerRequestDTO("AB1","Ali","ali@mail.com"));
            customerService.save(new CustomerRequestDTO("C21","Toto","toto@mail.com"));
            customerService.save(new CustomerRequestDTO("MZT","Momo","momo@mail.com"));
        };
    };
}
