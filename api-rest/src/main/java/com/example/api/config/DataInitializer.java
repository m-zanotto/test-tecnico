package com.example.api.config;

import com.example.api.entity.DataItem;
import com.example.api.repository.DataItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner loadData(DataItemRepository repository) {
        return args -> {

            repository.deleteAll();
            // Aggiungi dati di esempio
            repository.save(new DataItem("Item 1"));
            repository.save(new DataItem("Item 2"));
            repository.save(new DataItem("Item 3"));
            repository.save(new DataItem("Item 4"));
        };
    }
}