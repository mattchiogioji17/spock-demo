import com.techexpo.util.Integration


/**
 -- Integration vs Unit --
 Another cool feature about Spock is that you can configure its runner
 For example if you wanted to only run unit tests and exclude integration tests because they take a long time
 One way to do this could be to set up a run configuration in your IDE but that would need to be repeated for each individual

 Instead you could make two annotations, 'Unit' and 'Integration', to be used to mark these tests respectively
 Then you can go in and create a SpockConfig.groovy file to choose which ones you want to run

 Also because we are using groovy we can write scripts so we don't have to declare this as a class
 */


runner {

    println "\n------ Running Unit Tests Only ------\n"

    exclude {
        annotation Integration
    }
}

// Example of excluding a class

//runner {
//    exclude {
//        baseClass CustomerTest
//    }
//}