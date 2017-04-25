package Accumulate

fun <T, R> accumulate(input: List<T>, transform: (T) -> R): List<R> {
    return input.map(transform).toList()
}