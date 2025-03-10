fun main() {
    val input = Input()
    val menu = Menu(
        items = mutableListOf(),
        menuItemFactory = {
            println("Введите имя архива")
            val name = input.readString()
            Archive(name, mutableListOf()) {
                it as Archive
                val noteMenu = Menu(it.notes, menuItemFactory = {
                    println("Введите имя заметки")
                    val noteName = input.readString()
                    println("Введите контент заметки")
                    val content = input.readString()
                    Note(noteName, content) {
                        it as Note

                        println("Заметка ${it.name}:\n\n${it.content}\n")
                    }

                })
                noteMenu.startMenu("Список заметок:")
            }
        }
    )
    menu.startMenu("Список архивов:")


}

