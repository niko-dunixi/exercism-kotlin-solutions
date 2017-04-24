import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class Gigasecond {

    val date: LocalDateTime

    constructor(birthDate: LocalDate) :
            this(LocalDateTime.of(birthDate, LocalTime.MIDNIGHT))

    constructor(birthDateTime: LocalDateTime) {
        this.date = birthDateTime.plusSeconds(1_000_000_000)
    }

}
