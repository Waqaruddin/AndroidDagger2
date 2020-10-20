package com.example.androiddagger/*
package com.example.androiddagger

//Hello, World
fun main(){
    A().m1()
}


//class A is dependent on class B


//MainActivity
class A {
    //onCreate or onResume
    fun m1() {
        print("Hello, ")

        //B() is called object creation
        //val myVariable = B()
        //myVariable.m2()

        //presenter.getData()
        B().m2()
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
