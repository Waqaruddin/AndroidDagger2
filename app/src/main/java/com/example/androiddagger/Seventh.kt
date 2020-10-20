package com.example.androiddagger/*
package com.example.androiddagger

import dagger.Component
import dagger.Module
import dagger.Provides

fun main() {
    val b = DaggerMyComponent.create().getB()
    b.m2()
}

@Module
class MyModule {
    @Provides
    fun getB(): B {
        return B()
    }
}

//removed @Inject constructor
class B {
    fun m2() {
        print("World")
    }
}

@Component(modules = [MyModule::class])
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
