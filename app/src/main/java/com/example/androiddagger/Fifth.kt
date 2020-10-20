package com.example.androiddagger/*
package com.example.androiddagger

import dagger.Component
import javax.inject.Inject

fun main() {
    val b = DaggerMyComponent.create().getB()
    b.m2()
}

class B @Inject constructor() {
    fun m2() {
        print("World")
    }
}

@Component
interface MyComponent {
    //@Component - cannot be used for method
    fun getB(): B
}

class A constructor(private val b: B) {
    //@Component - cannot be used for field
    val i = 10

    fun m1() {
        print("Hello, ")
        b.m2()
    }
}*/
