class Note(
    override val name: String, val content: String,
    override val onItemClicked: (MenuItem) -> Unit
) : MenuItem {
}