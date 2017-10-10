package com.techexpo

import spock.lang.Specification
import spock.lang.Unroll

class MyFirstSpecification extends Specification {

    def "Should add two numbers"() {
        given: "Two positive numbers"
            int a = 2
            int b = 3

        when: "I add them together"
            int sum = a + b

        then: "They should sum correctly"
            sum == 5
    }

    @Unroll
    def "Should add two numbers #a + #b"(int a, int b, int sum) {
        expect: "Two numbers sum correctly"
        a + b == sum

        where:
        a  | b   | sum
        1  | 2   | 3
        4  | 6   | 10
        -1 | 30  | 29
        -4 | -10 | -14
    }

    def "Should throw exception when item popped off empty stack"() {
        given: "An empty stack"
            Stack stack = new Stack()

        when: "An item is popped off"
            stack.pop()

        then: "An exception should be thrown"
            thrown(EmptyStackException.class)
//            notThrown(EmptyStackException.class)
    }
}
