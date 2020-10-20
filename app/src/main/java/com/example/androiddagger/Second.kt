package com.example.androiddagger/*
package com.example.androiddagger

//Hello, World
fun main(){
    val b = B()
    A(b).m1()//dependency injection
    //injecting B
    //A is called client
    //passed object or injected object or service is B, in this case
}

//class A is dependent on class B

//we can move class B object creation outside
//B() is called object creation
//val myVariable = B()
//myVariable.m2()

//MainActivity
class A constructor(private val b:B) {
    //onCreate or onResume
    fun m1() {
        print("Hello, ")
        b.m2()
    }
}

//MainViewModel or MainPresenter
class B {
    fun m2() {
        print("World")
    }
}


//single responsibility principle
//class or function should be responsible for doing a specific thing/job
*/
