/*
 * Copyright (c) 2017 Transparent Language. All rights reserved.
 */
package com.transparent.slurpe.api.server

import org.junit.experimental.categories.Category
import org.kurron.categories.InboundIntegrationTest
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.mongodb.core.MongoTemplate
import spock.lang.Specification

/**
 * Just to verify that the application can load properly.
 **/
@Category( InboundIntegrationTest ) // this really isn't an inbound test but it will do
@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.NONE )
class ApplicationIntegrationTest extends Specification {

    @Autowired
    private Application sut

    @Autowired
    private RabbitTemplate rabbit

    @Autowired
    private MongoTemplate mongo

    void 'we can load the Spring context'() {
        expect:
        sut
    }

    void 'we can contact RabbitMQ'() {
        expect:
        rabbit.convertAndSend('exchange', 'routing-key', 'data' )
    }

    void 'we can contact MongoDB'() {
        expect:
        !mongo.collectionExists( 'should-not-exist' )
    }
}
