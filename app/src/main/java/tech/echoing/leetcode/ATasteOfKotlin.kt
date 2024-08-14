package tech.echoing.leetcode

import java.text.SimpleDateFormat
import java.util.*

//data class Person(
//  val name: String,
//  val age: Int? = null
//)

fun main(args: Array<String>) {
  val t = readLine()!!.toInt()
    repeat(t) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        print(a + b)
    }
//  val persons = listOf(
//      Person("Alice"),
//      Person("Bob", age = 29)
//  )

//  val oldest = persons.maxBy { it.age ?: 0 }
//  println("The oldest is: $oldest")
//  var number = 1
//  println(++number)
//  println(kotlin.math.ceil(25.0 / 10))

//  EnvironmentHelper.environment = EnvironmentText()
//  println(EnvironmentHelper.environment.BASE_URL)
//  println(EnvironmentHelper.environment.TIM_APP_ID)

//  val now = Date()
//  val strDateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSZ"
//  val sdf = SimpleDateFormat(strDateFormat)
//  println(sdf.format(now))
//
//  var version = "123"
//  var versionInfo = "final version$version"
//  println(versionInfo)
//  version = "345"
//  versionInfo = "final version$version"
//  println(versionInfo)
}
