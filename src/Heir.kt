class Heir(name: String, wheelOfFortune: WheelOfFortune) : Ruler(name) {
    init {
        power *= wheelOfFortune.coefficient()
        intellect *= wheelOfFortune.coefficient()
    }
}

data class Archer(var bow: String = "Longbow", val Dagger: String) {

    constructor(dagger: String) : this("Longbow", dagger)

}

data class Warrior(val weapon: String)

class WheelOfFortune {
    fun coefficient(): Float = (0..200).random() / 100f
}