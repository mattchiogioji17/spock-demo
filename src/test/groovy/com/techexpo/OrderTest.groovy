package com.techexpo

import com.techexpo.menu.entree.ChickenSandwich
import com.techexpo.order.Order
import groovy.util.logging.Slf4j
import spock.lang.Specification

@Slf4j
class OrderTest extends Specification {

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

    def "Should remove items from order"() {
        given: "An order exists with 1 item"
            Order order = new Order()
            ChickenSandwich chickenSandwich = new ChickenSandwich()
            order.addItem(chickenSandwich)

        when: "That item is removed from my order"
            boolean success = order.removeItem(chickenSandwich)

        then: "There should be 0 items in my order"
            success
            order.getMenuItems().size() == 0
            !order.getMenuItems().contains(chickenSandwich)
            notThrown(RuntimeException)
    }

    def "Should throw exception when order has no items and attempt to remove item"() {
        given: "There is an order with 0 items"
            Order order = new Order()
            ChickenSandwich chickenSandwich = new ChickenSandwich()

        when: "An attempt is made to remove an item from the order"
            boolean success = order.removeItem(chickenSandwich)

        then: "An exception will be thrown"
            success == Boolean.FALSE
            thrown(RuntimeException)
    }


}
