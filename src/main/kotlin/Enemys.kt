import java.util.*
import kotlin.system.exitProcess

fun combat(enemy: String, player: PlayerStats) {

    val random = Random()
    var enemyHp = 0
    var enemyDmg = 0
    var maxEnemyHp = 0

    when (enemy) {
        "orc" -> {
            maxEnemyHp = 50
            enemyHp = 50
            enemyDmg = 15
        }
        "goblin" -> {
            maxEnemyHp = 30
            enemyHp = 30
            enemyDmg = 5
        }
        "troll" -> {
            maxEnemyHp = 20
            enemyHp = 20
            enemyDmg = 10
        }
        "devilBoss" -> {
            maxEnemyHp = 300
            enemyHp = 300
            enemyDmg = 20
        }
    }

    while (enemyHp > 0 && player.hp > 0) {

        println("\n=== Combat ===")
        println("Enemigo: $enemy - HP [$enemyHp / $maxEnemyHp] - DMG [$enemyDmg]")
        println("${player.name}, Coordenadas: [ ${player.posX}, ${player.posY} ]")
        println("HP - [ ${player.hp} / ${player.maxHp} ]")
        println("DMG - [ ${player.dmg}]")
        println("=== Acciones ===")
        println("- Hit")
        if (player.sword) {
            println("- Use sword")
        }
        if (player.gun) {
            println("- Use gun")
        }
        if (player.potion > 0) {
            println("- Use potion")
        }
        if (player.bomb > 0) {
            println("- Use bomb")
        }

        when (readLine()) {

            "hit" -> {
                enemyHp -= player.dmg
                player.hp -= enemyDmg
                println("Has hecho ${player.dmg} dmg")
                println("Has recibido $enemyDmg de dmg")
                println("Tu vida actual queda en ${player.hp}")
            }

            "use sword" -> {
                if (player.sword) {
                    enemyHp -= player.dmg + 25
                    player.hp -= enemyDmg
                    println("Has hecho ${player.dmg+25} de dmg")
                    println("Has recibido $enemyDmg de dmg")
                    println("Tu vida actual queda en ${player.hp}")
                } else {
                    println("No tienes espada")
                }
            }

            "use gun" -> {
                if (player.gun) {
                    enemyHp -= player.dmg + 50
                    player.hp -= enemyDmg
                    println("Has hecho ${player.dmg+50} de dmg")
                    println("Has recibido $enemyDmg de dmg")
                    println("Tu vida actual queda en ${player.hp}")
                } else {
                    println("No tienes la pistola")
                }
            }

            "use potion"-> {
                usePotion(player)
            }

            "use bomb" -> {
                if (player.bomb > 0) {
                    val bombDmg = random.nextInt(6)
                    enemyHp -= 50
                    player.hp -= bombDmg
                    player.bomb--
                    println("Has hecho 50 de dmg")
                    println("Has recibido $bombDmg de dmg, por el daño explosivo")
                    println("Has recibido $enemyDmg de dmg por el enemigo")
                    println("Tu vida actual queda en ${player.hp}")
                } else {
                    println("No tienes bombas")
                }
            }
        }

        if (enemy == "devilBoss" && enemyHp <= 0) {
            clearScreen()
            asciiWin()
            Thread.sleep(3000)
            clearScreen()
            gameOver()
            Thread.sleep(3000)
            clearScreen()
            asciiCredits()
            exitProcess(0)
        }

        if (player.hp <= 0) {
            println("Has perdido el combate")
            clearScreen()
            asciiLost()
            Thread.sleep(3000)
            clearScreen()
            gameOver()
            Thread.sleep(3000)
            clearScreen()
            asciiCredits()
            exitProcess(0)
        } else if (enemyHp <= 0) {
            clearScreen()
            println("Has ganado el combate")
            return
        }
    }
}