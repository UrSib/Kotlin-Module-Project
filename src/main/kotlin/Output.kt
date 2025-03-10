class Output {

    fun printAll(list: List<MenuItem>) {

        list.forEachIndexed { index, item ->
            print(index, item.name)
        }

    }

    private fun print(index: Int, name: String) {

        println("$index. $name")

    }

}