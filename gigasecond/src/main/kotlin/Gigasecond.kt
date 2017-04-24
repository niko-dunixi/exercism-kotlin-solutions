import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class Gigasecond {

    val date: LocalDateTime

    constructor(localDate: LocalDate) : this(LocalDateTime.of(localDate, LocalTime.now()))

    constructor(localDateTime: LocalDateTime) {
        this.date = localDateTime
    }

}
