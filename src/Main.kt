fun main() {
    val kingdom = Kingdom()

    println("name: ${kingdom.ruler.name} intellect: ${kingdom.ruler.intellect} power: ${kingdom.ruler.power}")

    kingdom.heirs.forEach {
        println("name: ${it.name} intellect: ${it.intellect} power: ${it.power}")
    }

    println(kingdom.archers)
    println(kingdom.warriors)
}