package subtask2

import kotlin.collections.mapOf

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        //throw NotImplementedError("Not implemented")
        var CustomNumber : Map<Int,String> = mapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five", 6 to "six", 7 to "seven", 8 to "eight", 9 to "nine", 10 to "ten", 11 to "eleven", 12 to "twelve", 13 to "thirteen", 14 to "fourteen", 16 to "sixteen", 17 to "seventeen", 18 to "eighteen", 19 to "nineteen", 20 to "twenty", 21 to "twenty one", 22 to "twenty two", 23 to "twenty three", 24 to "twenty four", 25 to "twenty five", 26 to "twenty six", 27 to "twenty seven", 28 to "twenty eight", 29 to "twenty one")
        var resultString: String

        resultString = when(minute.toInt()){
            0 -> "${CustomNumber.get(hour.toInt())} o' clock"
            1 -> "one minute past ${CustomNumber.get(hour.toInt())}"
            15 -> "quarter past ${CustomNumber.get(hour.toInt())}"
            in 2..29 -> "${CustomNumber.get(minute.toInt())} minutes past ${CustomNumber.get(hour.toInt())}"
            30 -> "half past ${CustomNumber.get(hour.toInt())}"
            45 -> "quarter to ${CustomNumber.get(hour.toInt() + 1)}"
            in 31..59 -> "${CustomNumber.get(60 - minute.toInt())} minutes to ${CustomNumber.get(hour.toInt() + 1)}"
            else ->""
        }

        return resultString
    }
}
