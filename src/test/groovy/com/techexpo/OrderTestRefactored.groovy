package com.techexpo

import com.techexpo.menu.entree.ChickenSandwich
import com.techexpo.order.Order
import groovy.util.logging.Slf4j
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise
/** After first creating this class, refactor to a Stepwise Test

 */

@Slf4j
@Stepwise
class OrderTestRefactored extends Specification {

    // don't put this annotation at first to show how the method will fail
    @Shared
    Order order
    ChickenSandwich chickenSandwich

    def setupSpec() {
        order = new Order()
    }

    def setup() {
        // do this first to show how it fails because it executes before each test instead of before the spec
        // then refactor to create setupSpec() method
//        order = new Order()
        chickenSandwich = new ChickenSandwich()
    }


    def "Step 1: Should add items to order"() {
        when: "An item is added to my order"
            boolean success = order.addItem(chickenSandwich)

        then: "I should have 1 item in my order"
            success
            order.getMenuItems().size() == 1
            order.getMenuItems().contains(chickenSandwich)
            order.printOrder()
    }

    def "Step 2: Should remove items from order"() {
        when: "An item is removed from my order"
            boolean success = order.removeItem(chickenSandwich)

        then: "There should be 0 items in my order"
            success
            order.getMenuItems().size() == 0
            notThrown(RuntimeException)
            order.printOrder()
    }



}
