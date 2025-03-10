class Archive(
    override val name: String, val notes: MutableList<Note>,
    override val onItemClicked: (MenuItem) -> Unit
) : MenuItem {
}