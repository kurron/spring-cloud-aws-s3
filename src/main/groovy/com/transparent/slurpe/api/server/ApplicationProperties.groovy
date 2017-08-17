/*
 * Copyright (c) 2017 Transparent Language. All rights reserved.
 */
package com.transparent.slurpe.api.server

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Custom configuration properties that are driven by Spring Boot and its application.yml file.
 */
@ConfigurationProperties( value = 'slurp-e', ignoreUnknownFields = false )
class ApplicationProperties {

    String foo
}
