package com.streetturtle.FalsePositiveTest

import spock.lang.Specification


class FalsePositiveTest extends Specification {
    def "test"() {
        expect:
        1 == number

        where:
        number << [2, 3]
    }
}
