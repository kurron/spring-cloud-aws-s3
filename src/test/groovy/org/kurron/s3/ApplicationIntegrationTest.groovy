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

import com.amazonaws.services.s3.AmazonS3
import org.junit.experimental.categories.Category
import org.kurron.categories.InboundIntegrationTest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
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
    private AmazonS3 s3

    void 'we can load the Spring context'() {
        expect:
        sut
    }

    void 'we can contact S3'() {
        expect:
        s3
    }

}
