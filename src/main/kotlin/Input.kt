import java.util.Scanner

class Input {

    private val scanner = Scanner(System.`in`)

    fun readSelection(): Int? {

        val input = scanner.nextLine().toIntOrNull()
        return if (input != null) {
            input
        } else {

            return null

        }
    }

    fun readString(): String {

        var input = scanner.nextLine()
        while (input.isNullOrBlank()) {
            println("Не может быть пустым, введите снова:")
            input = scanner.nextLine()
        }
        return input

    }
}