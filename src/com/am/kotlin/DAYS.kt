package com.am.kotlin

enum class DAYS(val isWeekend: Boolean = false) {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    // Default value overridden
    SATURDAY(true);

    companion object {
        fun today(obj: DAYS): Boolean {
            return obj.name.compareTo("SATURDAY") == 0 || obj.name.compareTo("SUNDAY") == 0
        }
    }

}

enum class Cards(val color: String) {
    Diamond("black"),
    Heart("red")

}


fun main() {
    //This method returns a list of all the constants defined within the enum class.
    for (day in DAYS.values()) {
        println("${day.ordinal} = ${day.name} and is weekend ${day.isWeekend}")
    }
    //his methods returns the enum constant defined in enum, matching the input string.
    // If the constant, is not present in the enum, then an IllegalArgumentException is thrown
    println("${DAYS.valueOf(" WEDNESDAY ")}")

    val today = DAYS.MONDAY
    println("Is today a weekend ${DAYS.today(today)}")

}