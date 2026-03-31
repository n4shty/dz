data class Computer(val name: String, val price: Int)

fun main() {
    val n = readLine()?.toIntOrNull() ?: 0
    val computers = mutableListOf<Computer>()

    val dellCount = n / 2
    val irbisCount = n - dellCount

    repeat(dellCount) {
        computers.add(Computer("Dell", 64256))
    }
    repeat(irbisCount) {
        computers.add(Computer("Irbis", 24652))
    }

    computers.forEach { println("${it.name} ${it.price}") }
}
