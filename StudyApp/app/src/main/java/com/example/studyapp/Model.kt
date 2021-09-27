package com.example.studyapp

data class Lessons(var title: String , var description: String)
data class LessonsAndroid(var title: String , var description: String)

object Supplier{



    val lessons = listOf<Lessons>(
        Lessons("val an var" , "Declaring variables"),
        Lessons("user input" , "Getting user input"),
        Lessons("Strings" , "String concatenations, interpolation, and methods"),
        Lessons("Data types" , "Understanding data types"),
        Lessons("basic operation" , "performing math operation in kotlin"),
        Lessons("if statement" , "performing math operation in kotlin"),
        Lessons("Try/catch" , "performing math operation in kotlin"),
        Lessons("For Loops" , "performing math operation in kotlin"),)


    val lessonsAndroid = listOf<LessonsAndroid>(
        LessonsAndroid("project setup" , "setting up an Android Stdio Project"),
        LessonsAndroid("console " , "Printing to the console"),
        LessonsAndroid("Resource files" , "know what the resource folder contain"),
        LessonsAndroid("UI elements" , "Understanding data types"),
        LessonsAndroid("onClickListener" , "performing math operation in kotlin"),
        LessonsAndroid("logic in android" , "performing math operation in kotlin"),
        LessonsAndroid("Intents" , "performing math operation in kotlin"),
        LessonsAndroid("Menus" , "performing math operation in kotlin"),)
}