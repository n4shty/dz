fun main() {
    val sum = (20..40).sumOf { it.toLong() * it * it }
    println(sum)
}
