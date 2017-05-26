package learnkotlin.week1

/**
 * Created by TuanLQ on 5/23/17.
 */
//class Person constructor(firstName: String){
//
//}

class Customer(name: String) {
    val customerKey = name.toUpperCase()
}

//class Person(val firstName: String, val lastName: String, val age : Int) {
//
//}

//class Person {
//    constructor(parent: Person) {
//        parent.children.add(this)
//    }
//}

class Person(val name: String) {
    constructor(name: String, parent: Person) : this(name) {

    }
}