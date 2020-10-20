package com.example.androiddagger/*
package com.example.androiddagger

import javax.inject.Inject

fun main() {
    A(B()).m1()
}

//A is dependent on B
//inject b into

//@Inject - cannot use for class
class A constructor(private val b: B) {
    @Inject
    val i = 10//FIELD or member variable

    @Inject
    //method
    fun m1() {
        print("Hello, ")
        b.m2()
    }
}

//constructor
class B @Inject constructor(){
    fun m2() {
        print("World")
    }
}*/
