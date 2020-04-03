package com.am.kotlin

/**
 * source: https://grokonez.com/kotlin/kotlin-transform-list-map-methods-example
 * */

data class Customer(var name: String, var age: Int, var address: Address)

data class Address(var street: String, var secondLine: String)

fun main() {

    val customerList = listOf(Customer("Jack", 25, Address("NANTERRE CT", "77471")),
            Customer("Mary", 37, Address("W NORMA ST", "77009")),
            Customer("Peter", 18, Address("S NUGENT AVE", "77571")),
            Customer("Amos", 23, Address("E NAVAHO TRL", "77449")),
            Customer("Craig", 45, Address("AVE N", "77587")),
            null)

    mapTransform(customerList)
}


/**
 * Transform the given list by applying the given [transform] function
 * to each element in the original collection then return a list.
 * */
fun mapTransform(customerList: List<Customer?>) {
    val strCustList = customerList.map { it -> if (it != null) "${it.name} lives at street ${it.address.street}" else null }
    strCustList.forEach { println(it) }
}

