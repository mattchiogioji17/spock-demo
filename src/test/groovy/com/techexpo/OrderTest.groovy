package com.techexpo

import com.techexpo.menu.entree.ChickenSandwich
import com.techexpo.order.Order
import groovy.util.logging.Slf4j
import spock.lang.Specification

/** After first creating this class, refactor to a Stepwise Test

 */

@Slf4j
class OrderTest extends Specification {

    // Make this test first through TDD/BDD
    // Explain how the method name is a sentence which makes it much easier to understand what the test is doing
    // as opposed to jUnit

    // Explain the Intellij Alt + Insert shortcut to create tests
    // Write out given,when, then
    // Next fill out test
    // explain what it means to just write 'success'
    def "Should add items to order"() {
        given: "A chicken sandwich"
            Order order = new Order()
            ChickenSandwich chickenSandwich = new ChickenSandwich()

        when: "It is added to my order"
            boolean success = order.addItem(chickenSandwich)

        then: "I should have 1 item in my order"
            success
            order.getMenuItems().size() == 1
            order.getMenuItems().contains(chickenSandwich)
            order.printOrder()
    }


    // Make this test after the first one
    // Write out given, when, then
    // explain that including order.addItem() actually makes this test depend on the first test
    // Good opportunity to leverage a Stepwise test
    // Refactor accordingly
    def "Should remove items from order"() {
        given: "An order exists with 1 item"
            Order order = new Order()
            ChickenSandwich chickenSandwich = new ChickenSandwich()
            order.addItem(chickenSandwich)

        when: "That item is removed from my order"
            boolean success = order.removeItem(chickenSandwich)
        // put notThrown() in then
        then: "There should be 0 items in my order"
            success
            order.getMenuItems().size() == 0
            notThrown(RuntimeException)
    }



}
