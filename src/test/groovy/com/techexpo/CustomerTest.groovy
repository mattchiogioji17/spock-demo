package com.techexpo

import com.techexpo.menu.entree.ChickenSandwich
import com.techexpo.order.Customer
import com.techexpo.order.Order
import com.techexpo.util.Integration
import groovy.util.logging.Slf4j
import spock.lang.Specification

@Integration
@Slf4j
class CustomerTest extends Specification {


    def "Should add item to order"() {
        given: "A Customer"
            Customer customer = new Customer("Jamie Dimon")
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
            Customer customer = new Customer("Jamie Dimon")
            Order order = Mock()
            customer.setOrder(order)
            ChickenSandwich chickenSandwich = new ChickenSandwich()

        when: "A Customer adds and item to his order"
            customer.removeItem(chickenSandwich)

        then: "The item was added to the order"
            1 * order.removeItem(chickenSandwich) >> Boolean.TRUE
    }

    def "Should return cost of order"() {
        given: "A Customer has an order with 0 items"
            Customer customer = new Customer("Jamie Dimon")
            Order order = Mock()
            customer.setOrder(order)

        when: "A Customer requests the price of his/her order"
            customer.getOrderTotal()

        then: "The item was added to the order"
            1 * order.getCost() >> 0.00
    }




}
