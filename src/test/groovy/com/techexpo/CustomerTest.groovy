package com.techexpo

import com.techexpo.menu.entree.ChickenSandwich
import com.techexpo.order.Customer
import com.techexpo.order.Order
import groovy.util.logging.Slf4j
import spock.lang.Specification


/**
 * Use this test class to demonstrate mocking
 * Don't create setup method at first
 */
@Slf4j
class CustomerTest extends Specification {

    def "Should add item to order"() {
        given: "A Customer"
            Customer customer = new Customer("Jamie Dimon", 60)
            Order order = Mock()
            customer.setOrder(order)
            ChickenSandwich chickenSandwich = new ChickenSandwich()

        when: "A Customer adds and item to his order"
            customer.addItem(chickenSandwich)

        then: "The item was added to the order"
            1 * order.addItem(chickenSandwich) >> Boolean.TRUE
    }

    def "Should remove item from order"() {
        given: "A Customer"
            Customer customer = new Customer("Jamie Dimon", 60)
            Order order = Mock()
            customer.setOrder(order)
            ChickenSandwich chickenSandwich = new ChickenSandwich()

        when: "A Customer adds and item to his order"
            customer.removeItem(chickenSandwich)

        then: "The item was added to the order"
            1 * order.removeItem(chickenSandwich) >> Boolean.TRUE
    }

    // TODO: move to the customer class!!
    // This test displays thrown()
    // Use TDD
//    def "Should throw exception when item removed from order and its not in the order"() {
//        given: "There is an order with 0 items"
//            Order order = new Order()
//            ChickenSandwich chickenSandwich = new ChickenSandwich()
//
//        when: "An attempt is made to remove an item from the order"
//            boolean success = order.removeItem(chickenSandwich)
//
//        then: "An exception will be thrown"
//            success == Boolean.FALSE
//            thrown(RuntimeException)
//    }
//
//    // TODO: move to the customer class!!
//    def "Should throw exception when order has no items and attempt to remove item"() {
//
//    }


}
