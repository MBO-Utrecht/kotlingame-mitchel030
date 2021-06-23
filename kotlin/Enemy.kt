open class Enemy(name: String, life: Int = 1, level: Int = 3, score: Int = 0, hitpoints: Int = 5) : Character(name, life, level, score, hitpoints) {
    var weapon: Weapon = Weapon("niks", 0, 3)
}