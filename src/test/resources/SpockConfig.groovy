import com.techexpo.util.Integration


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