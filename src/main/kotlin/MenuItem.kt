interface MenuItem {

    val name: String
    val onItemClicked: (MenuItem) -> Unit

    fun click() {

        onItemClicked(this)

    }
}