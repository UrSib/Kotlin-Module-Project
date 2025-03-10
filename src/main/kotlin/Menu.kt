class Menu<T : MenuItem>(
    private val items: MutableList<T>,
    private val menuItemFactory: () -> T
) {

    private var menuState = MenuState.ACTIVE

    private val menuItems
        get() = listOf(CreateItem { items.add(menuItemFactory()) }) + items + listOf(ExitItem {
            menuState = MenuState.CLOSED
        })
    private val input = Input()
    private val output = Output()

    fun startMenu(title: String) {

        while (menuState != MenuState.CLOSED) {
            println(title)
            var exit = 1
            while (exit == 1) {
                output.printAll(menuItems)
                val selectedIndex: Int? = input.readSelection()
                if (selectedIndex == null) {
                    println("Вы должны ввести цифру:")

                } else {
                    if (selectedIndex > (menuItems.size - 1)) {
                        println("Такой цифры нет в меню, попробуйте снова:")
                    } else {
                        exit = 0
                        menuItems[selectedIndex].click()
                    }
                }
            }

        }


    }

}

