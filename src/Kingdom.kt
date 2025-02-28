class Kingdom {
    val ruler = Ruler("Arthur")
    val heirs = mutableListOf<Heir>()

    val archers = mutableListOf<Archer>()
    val warriors = mutableListOf<Warrior>()

    private val wheelOfFortune = WheelOfFortune()

    init {
        for (i in 1..4) {
            heirs.add(Heir("Heir $i", wheelOfFortune))
        }

        for (i in 0..19) {
            if (i % 2 == 0) {
                archers.add(Archer("Dagger"))
            } else {
                archers.add(Archer("None"))
            }
        }

        for (i in 0..29) {
            if (i % 2 == 0) {
                warriors.add(Warrior("Sword"))
            } else {
                warriors.add(Warrior("Axe"))
            }
        }


    }
}

open class Ruler(val name: String) {
    var power = 10f
    var intellect = 10f
}