package com.techexpo

import spock.lang.Specification
import spock.lang.Unroll

class MyFirstSpecification extends Specification {


    // First Test
    // show test failing so they can see power assert
    def "Should add two numbers"() {
        given: "Two numbers"
            int a = 1
            int b = 2

        when: "They are added together"
            int sum = a + b

        then: "They should sum correctly"
            sum == 3
    }

    // Data Table (don't add unroll and # in comments at first)
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

    // Exception
    // show thrown() first then show notThrown() (test failing)
    def "Should throw exception when popping off empty stack"() {
        given: "An empty stack"
            Stack stack = new Stack()

        when: "An item is popped off"
            stack.pop()

        then: "An exception should be thrown"
//            notThrown(EmptyStackException)
            thrown(EmptyStackException)
            stack.empty()
    }

}
