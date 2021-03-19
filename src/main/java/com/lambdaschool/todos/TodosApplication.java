package com.lambdaschool.todos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Main class to start the application.
 * @EnableJpaAuditing - entity listeners are now going to work
 */
@EnableJpaAuditing
@SpringBootApplication
public class TodosApplication
{

    /**
     * Main method to start the application.
     *
     * @param args Not used in this application.
     */
    public static void main(String[] args)
    {
        SpringApplication.run(TodosApplication.class,
            args);
    }
}
