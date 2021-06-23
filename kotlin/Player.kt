class Player(name: String, life: Int = 3, level: Int = 3, score: Int = 0, Hitpoints: Int) : Character(name, life, level, score, Hitpoints) {
    var weapon = Weapon("Fists", 0, 3)

    val inventory = ArrayList<Loot>()

    fun show(){
        if (life <= 0){
            println("je bent hartstikke overleden")
        }else {
            println("je doet het nog")
        }
    }
}