package com.techexpo

import com.techexpo.menu.entree.ChickenSandwich
import com.techexpo.order.Customer
import com.techexpo.order.Order
import groovy.util.logging.Slf4j
import spock.lang.Specification

@Slf4j
class CustomerTestRefactored extends Specification {

    public static final String CUSTOMER_NAME = "Jamie Dimon"

    Customer customer
    Order order
    ChickenSandwich chickenSandwich

    void setup() {
        customer = new Customer(CUSTOMER_NAME)
        order = Mock()
        customer.setOrder(order)
//        customer.setOrder(Mock(Order.class))
        chickenSandwich = new ChickenSandwich()
    }

    def "Should add item to order"() {
        when: "A Customer adds and item to his order"
            customer.addItem(chickenSandwich)

        then: "The item was added to the order"
            1 * order.addItem(chickenSandwich) >> Boolean.TRUE
    }

    def "Should remove item from order"() {
        when: "A Customer adds and item to his order"
            customer.removeItem(chickenSandwich)

        then: "The item was added to the order"
            1 * order.removeItem(chickenSandwich) >> Boolean.TRUE
    }

    def "Should return cost of order"() {
        when: "A Customer requests the price of his/her order"
            customer.getOrderTotal()

        then: "The item was added to the order"
            1 * order.getCost() >> 0.00
    }




}
