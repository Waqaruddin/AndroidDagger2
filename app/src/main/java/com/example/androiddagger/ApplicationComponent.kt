package com.example.androiddagger

import dagger.Component

@Component
interface ApplicationComponent {
//
//    //val messageProvider =
//    // (application as MyApplication)
//    // .applicationComponent.getMessageProvider()
//    fun getMessageProvider(): MessageProvider

    //fun dgashjdgasjh(): MessageProvider

    //fun dgashjdgasjh(): String  //hello
    //fun dgashjdgasjh(): String  //hi



    //(application as MyApplication).applicationComponent.inject(this)
    fun inject(activity: MainActivity)
}