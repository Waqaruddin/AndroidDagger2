code without DI
Dependency Injection
Dependency Injection Types(constructor,field,method)
manual DI
DI libraries//Dagger and Koin

https://github.com/google/dagger
2.29.1

Square build Dagger V1
Google build Dagger V2

Hilt is a part of Dagger

DO NOT USE Hilt //still in alpha
DO NOT USE dagger.android //going to be deprecated

//kapt error -
A problem occurred evaluating project ':app'.
> Could not find method kapt() for arguments [com.google.dagger:dagger-compiler:2.29.1] on object of type org.gradle.api.internal.artifacts.dsl.dependencies.DefaultDependencyHandler.
//can be solved by adding kotlin-kapt plugin
plugins {
    ..
    id 'kotlin-kapt'
}


adding dagger dependency
    api 'com.google.dagger:dagger:2.29.1'
    kapt 'com.google.dagger:dagger-compiler:2.29.1'



Basic annotations used in/for Dagger
@Inject
@Component
@Module
@Provides

@Inject
============
package javax.inject;
@Target({ METHOD, CONSTRUCTOR, FIELD })
@Retention(RUNTIME)
@Documented
public @interface Inject {}


RetentionPolicy
=====
package java.lang.annotation;
public enum RetentionPolicy {
    SOURCE,
    CLASS,
    RUNTIME;
}

ElementType
====


@Component
====
package dagger;


@Module
=====
package dagger;

@Provides
=====
package dagger;



ADVANCED
=====
scopes (@Singleton)
custom scopes

@Named(Qualifier by Dagger)
custom Qualifier

mvvm
viewmodel injection
how to repository injection in viewmodel


activity:Activity{
@Inject
lateinit var viewmodel:Viewmodel
}

class mainviewmodel:viewmodel{
//same as activity
@Inject
lateinit var repo:Reposity
}
















