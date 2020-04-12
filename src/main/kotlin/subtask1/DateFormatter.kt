package subtask1

import java.util.*
import java.util.Calendar.*


class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        //throw NotImplementedError("Not implemented")
        var CustomDate = GregorianCalendar()
        var returnString: String

        var DayOfWeek: Array<String> = arrayOf("воскресенье", "понедельник", "вторник", "среда", "четверг", "пятница", "суббота")
        var MonthOfYear: Array<String> = arrayOf("января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря")


        CustomDate.set(year.toInt(),month.toInt() - 1,day.toInt())

        var day123 = CustomDate.get(MONTH)

        if ((CustomDate.get(DAY_OF_MONTH) != day.toInt()) || (CustomDate.get(MONTH) + 1 != month.toInt()) || (CustomDate.get(YEAR) != year.toInt()))
        {
            returnString = "Такого дня не существует"
        }
        else
        {
            returnString = "${CustomDate.get(DAY_OF_MONTH)} ${MonthOfYear[CustomDate.get(MONTH)]}, ${DayOfWeek[CustomDate.get(DAY_OF_WEEK) - 1]}"
        }

        return returnString
    }
}
