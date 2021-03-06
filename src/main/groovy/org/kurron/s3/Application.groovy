/*
 * Copyright (c) 2017 Ronald D. Kurr kurr@jvmguy.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kurron.s3

import groovy.util.logging.Slf4j
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * This is the entry point into the system.  If run from the command-line, then the main() is called.
 * If running from a servlet container, then the SpringBootServletInitializer kicks in and configure()
 * is called.
 */
@Slf4j
@SpringBootApplication
class Application {

    static void main( String[] args ) {
        SpringApplication.run( Application, args )
    }

}
