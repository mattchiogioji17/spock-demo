package com.techexpo

import com.techexpo.menu.entree.ChickenSandwich
import com.techexpo.order.Order
import groovy.util.logging.Slf4j
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise

@Slf4j
@Stepwise
class OrderTestRefactored extends Specification {

    @Shared
    Order order

    ChickenSandwich chickenSandwich

    def setupSpec() {
        order = new Order()
    }

    def setup() {
        chickenSandwich = new ChickenSandwich()
    }

    def "Step 1: Should add items to order"() {
        when: "An item is added to my order"
            boolean success = order.addItem(chickenSandwich)

        then: "I should have 1 item in my order"
            success
            order.getMenuItems().size() == 1
            order.getMenuItems().contains(chickenSandwich)
            order.getCost() == chickenSandwich.price
            order.printOrder()
    }

    def "Step 2: Should remove items from order"() {
        when: "An item is removed from my order"
            boolean success = order.removeItem(chickenSandwich)

        then: "There should be 0 items in my order"
            success
            order.getMenuItems().size() == 0
            notThrown(RuntimeException)
            order.getCost() == Double.valueOf(0)
            order.printOrder()
    }

    def "Step 3: Should throw exception when order has no items and attempt to remove item"() {
        when: "An attempt is made to remove an item from the order"
            boolean success = order.removeItem(chickenSandwich)

        then: "An exception will be thrown"
            success == Boolean.FALSE
            thrown(RuntimeException)
    }



}
