import jdk.swing.interop.SwingInterOpUtils
import java.awt.PageAttributes

var options : String = ""
var username: String = ""


var player = Player("$username", 3, 1, 0, 20)


val zaklamp = Loot("zaklamp", LootType.OBJECT)
val schaar = Weapon("schaar", 3, 6 )



fun main(args: Array<String>) {

    println("voer hier je naam in en druk op enter")

    username = readLine().toString()
    player.name = username.toString()
    println(player)
    while (username!!.isBlank()) {
        println(username!!.isBlank())
        println("Dit is geen geldige naam")
        username = readLine().toString()
        intro()
    }
}

    fun intro() {

        println("Je wordt wakker in de nacht om 3 uur")
        println("je hoort herrie in de kamer naast je")
        println("je gaat naar de herrie toe")
        println("de deur staat op een kier open")
        halboven()

    }
    fun halboven() {

        println("je gaat kijken en ziet dat candice een rituel uitvoert")
        println("candice heeft je gezien en slaat de deur dicht")
        println("je ziet nog net dat ze bezeten wordt door dr. doofenschmirtz")
        println("je rent terug je slaapkamer in")
        println("wat doe je nu")

        println("typ slapen om te gaan slapen")
        println("typ om bovenhal om de hal op te lopen")

        var options : String = ""
        options = readLine().toString()

            when (options) {
                "slapen" -> {
                    println("je probeert te slapen. dit lukt niet")
                    player.inventory.add(zaklamp)
                    verder()
                }
                "bovenhal" -> {
                    println("je loopt de bovenhal op. je ziet een zaklamp liggen en pakt deze")
                    player.inventory.add(zaklamp)
                    level2()
                }
            }


        }
    fun verder() {
        Thread.sleep(3000)
        println("je loopt dan toch maar de hal op")
        println("je ziet een zaklamp liggen en pakt deze")

        level2()
    }

    fun level2() {
        println("je bent op de hal")
        println("het is al wat stiller geworden op de kamer van candice")
        println("de badkamerdeur staat open")
        println("je loopt naar binnen")
        println("hier vindt je een schaar")
        println("je loopt terug de hal op")
        player.weapon = schaar
        println()

        level3()
    }

    fun level3() {
        println("je bent terug op de hal")
        println("het is stil geworden op de kamer van candice")
        println("haar deur staat nu open")
        println("uit het niets springt een boze Perry voor je")

        val Perry = Perry("Perry", 1)
        println("Perry is boos op je")
        while(Perry.life > 0) {

            println("mep het licht uit zijn ogen!")
            println("typ slaan om hem te slaan")
            println("typ ontwijken om weg te duiken")


            options = readLine().toString()

            if (Perry.life > 0) {
                println("Perry vecht terug")
            }

            when (options) {
                "slaan" -> {
                    player.attack(Perry, player.weapon.minDamage, player.weapon.maxDamage)
                    Perry.attack(player, 0, 2)
                }

                "ontwijken" -> {
                    var number = (0..1).random()

                    if (number == 0) {
                        println("je duikt weg maar perry raakt je alsnog")
                        Perry.attack(player, 0, 2)
                    }

                    else {
                        println("je duikt succesvol weg")
                        player.attack(Perry)
                    }
                }

                else -> {
                    println("Dit is geen juist getal")
                }
            }
        }
        println("er is niks meer heel van Perry")
        println("je loopt de trap af en komt in de entreehal beneden")

        println("je bent nu in de entreehal")
        println("je kan kiezen: ga je naar de woonkamer of naar de keuken")

        println("typ woonkamer om naar de woonkamer te gaan")
        println("typ keuken om de keuken in te gaan")

        options = readLine().toString()
        when (options) {
            "woonkamer" -> {
                println("je loopt de woonkamer in")
                println("je ziet dat er overal duivelse tekens gemaakt zijn")
                println("candice is hier duidelijk in de buurt")
                println("je kijkt goed om je heen en ziet dat dat maffe kind er niet meer is")
                level4()

            }
            "keuken" -> {
                println("je loopt de keuken in")
                println("het is rustig hier")
                println("je loopt de keuken in")

            }
        }
        level5()
    }


            }


        }
    }
}















//    while (enteredString!!.isBlank()) {
//        println("please enter 'ready'")
//        enteredString = line
//    }
//    do {
//        println("test")
        //    println("")
        //    println("")
        //    println("")
        //    println("")
        //    println("")
        //    println("")
        //    println("")
//    }while (enteredString != null)



//    println("")
//    println("")
//    println("")
//    println("")
//    println("")
//    println("")
//    println("")
//    println("")


