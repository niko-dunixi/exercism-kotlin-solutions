/**
 * Created by paulbaker on 4/25/17.
 */
package WordCount

import java.util.*

fun phrase(words: String): Map<String, Int> {
    val map: MutableMap<String, Int> = HashMap()

    val regex = Regex("\\s+")
    val scrubbedWords = words
            .toLowerCase()
            .filter({
                it in 'a'..'z' || it in '0'..'9' || it == '\'' || it == ' '
            })
            .split(regex)

    for (word in scrubbedWords) {
        val currentCount = map[word]
        if (currentCount == null) {
            map[word] = 1
        } else {
            map[word] = currentCount + 1
        }
    }

    return map
}