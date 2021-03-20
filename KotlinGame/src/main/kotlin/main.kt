fun main(args: Array<String>) {
    val taif = Player("Taif", 4, 1, 0)

    taif.show()

    val baksteen = Weapon("Baksteen",15)

//    println(taif.weapon.name)
//    println(taif.weapon.damageInflicted)

    taif.weapon = baksteen

//    println(taif.weapon.name)
//    println(taif.weapon.damageInflicted)

    val rens = Player("Rens",2,1,10)

    val wokpan = Weapon("Wokpan",18)

    rens.weapon = wokpan

    taif.weapon = rens.weapon

//    println(taif.weapon.name)

    taif.show()
}