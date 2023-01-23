import java.util.*
import kotlin.system.exitProcess

//Funcion del combate
fun combat(enemy: String, player: PlayerStats, enemyStats: EnemyStats) {

    val random = Random()

    while (enemyStats.enemyHp > 0 && player.hp > 0) {

        println("\n=== Combat ===")
        println("Enemigo: $enemy - HP [${enemyStats.enemyHp} / ${enemyStats.maxEnemyHp}] - DMG [${enemyStats.enemyDmg}]")
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
                enemyStats.enemyHp -= player.dmg
                player.hp -= enemyStats.enemyDmg
                println("Has hecho ${player.dmg} dmg")
                println("Has recibido ${enemyStats.enemyDmg} de dmg")
                println("Tu vida actual queda en ${player.hp}")
            }

            "use sword" -> {
                if (player.sword) {
                    enemyStats.enemyHp -= player.dmg + 25
                    player.hp -= enemyStats.enemyDmg
                    println("Has hecho ${player.dmg+25} de dmg")
                    println("Has recibido ${enemyStats.enemyDmg} de dmg")
                    println("Tu vida actual queda en ${player.hp}")
                } else {
                    println("No tienes espada")
                    player.hp -= enemyStats.enemyDmg
                    println("Has recibido ${enemyStats.enemyDmg} de dmg")
                    println("Tu vida actual queda en ${player.hp}")
                }
            }

            "use gun" -> {
                if (player.gun) {
                    enemyStats.enemyHp -= player.dmg + 50
                    player.hp -= enemyStats.enemyDmg
                    println("Has hecho ${player.dmg+50} de dmg")
                    println("Has recibido ${enemyStats.enemyDmg} de dmg")
                    println("Tu vida actual queda en ${player.hp}")
                } else {
                    println("No tienes la pistola")
                    player.hp -= enemyStats.enemyDmg
                    println("Has recibido ${enemyStats.enemyDmg} de dmg")
                    println("Tu vida actual queda en ${player.hp}")
                }
            }

            "use potion"-> {
                usePotion(player)
            }

            "use bomb" -> {
                if (player.bomb > 0) {
                    val bombDmg = random.nextInt(6)
                    enemyStats.enemyHp -= 50
                    player.hp -= bombDmg + enemyStats.enemyDmg
                    player.bomb--
                    println("Has hecho 50 de dmg")
                    println("Has recibido $bombDmg de dmg, por el daño explosivo")
                    println("Has recibido ${enemyStats.enemyDmg} de dmg por el enemigo")
                    println("Tu vida actual queda en ${player.hp}")
                } else {
                    println("No tienes bombas")
                    player.hp -= enemyStats.enemyDmg
                    println("Has recibido ${enemyStats.enemyDmg} de dmg")
                    println("Tu vida actual queda en ${player.hp}")
                }
            }
        }

        if (enemy == "devilBoss" && enemyStats.enemyHp <= 0) {
            clearScreen()
            asciiWin()
            Thread.sleep(3000)
            clearScreen()
            asciiGameOver()
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
            asciiGameOver()
            Thread.sleep(3000)
            clearScreen()
            asciiCredits()
            exitProcess(0)
        } else if (enemyStats.enemyHp <= 0) {
            clearScreen()
            println("Has ganado el combate")
            return
        }
    }
}