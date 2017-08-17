/*
 * Copyright (c) 2017 Transparent Language. All rights reserved.
 */
package com.transparent.slurpe.api.server

import static org.springframework.amqp.core.Binding.DestinationType.QUEUE
import groovy.util.logging.Slf4j
import org.springframework.amqp.core.Binding
import org.springframework.amqp.core.Declarable
import org.springframework.amqp.core.DirectExchange
import org.springframework.amqp.core.Queue
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean

/**
 * This is the entry point into the system.  If run from the command-line, then the main() is called.
 * If running from a servlet container, then the SpringBootServletInitializer kicks in and configure()
 * is called.
 */
@Slf4j
@SpringBootApplication
@EnableConfigurationProperties( ApplicationProperties )
class Application {

    static void main( String[] args ) {
        SpringApplication.run( Application, args )
    }

    /**
     * Configurable properties used to customize the application.
     */
    @Autowired
    private ApplicationProperties configuration

    @SuppressWarnings( 'UnnecessaryCast' )
    @Bean
    List<Declarable> amqpBindings( ApplicationProperties configuration ) {
        [
                new DirectExchange( configuration.foo ),
                new Queue( configuration.foo ),
                new Binding( configuration.foo, QUEUE, configuration.foo, configuration.foo, [:] ),
        ] as List<Declarable> // need the cast or static compilation fails
    }
}
