import java.util.*
import kotlin.system.exitProcess

//clase de enemy stats
open class EnemyStats(type: String) {
    private var enemyHp: Int = 0
    private var enemyDmg: Int = 0
    private var maxEnemyHp: Int = 0

    init {
        //Nombre de los enemigos y las estadísticas
        when (type) {
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

            //Para el mapa de cyber (representación de la clase)
            "ian" -> { // i
                maxEnemyHp = 100
                enemyHp = 100
                enemyDmg = 1
            }
            "pablo" -> { // q
                maxEnemyHp = 10
                enemyHp = 10
                enemyDmg = 5
            }
            "jhon" -> { // j
                maxEnemyHp = 20
                enemyHp = 20
                enemyDmg = 10
            }
            "marcel" -> { // r
                maxEnemyHp = 50
                enemyHp = 50
                enemyDmg = 21
            }
            "erik" -> { // e
                maxEnemyHp = 20
                enemyHp = 20
                enemyDmg = 2
            }
            "marc" -> { // y
                maxEnemyHp = 0
                enemyHp = 0
                enemyDmg = 0
            }
            "toni" -> { // t
                maxEnemyHp = 69
                enemyHp = 69
                enemyDmg = 20
            }
            "adria" -> { // a
                maxEnemyHp = 50
                enemyHp = 50
                enemyDmg = 20
            }
            "marti" -> { // m
                maxEnemyHp = 42
                enemyHp = 42
                enemyDmg = 24
            }
            "guillem" -> { // g
                maxEnemyHp = 200
                enemyHp = 200
                enemyDmg = 5
            }
            "ivelian" -> { // b
                maxEnemyHp = 0
                enemyHp = 0
                enemyDmg = 0
            }
            "lluc" -> { // l
                maxEnemyHp = 47
                enemyHp = 47
                enemyDmg = 13
            }
            "pau" -> { // p
                maxEnemyHp = 300
                enemyHp = 300
                enemyDmg = 20
            }
        }
    }

    fun combat(enemy: String, player: PlayerStats, enemyStats: EnemyStats) {

        val random = Random()

        while (enemyStats.enemyHp > 0 && player.hp > 0) {

            println("\n=== Combate ===")
            println("Enemigo: $enemy - HP [${enemyStats.enemyHp} / ${enemyStats.maxEnemyHp}] - DAÑO [${enemyStats.enemyDmg}]")
            println("${player.name}, Coordenadas: [ ${player.posX}, ${player.posY} ]")
            println("VIDA - [ ${player.hp} / ${player.maxHp} ]")
            println("DAÑO- [ ${player.dmg}]")
            println("=== Acciones ===")
            println("- Hit (h)")
            if (player.sword) {
                println("- Use sword (s)")
            }
            if (player.gun) {
                println("- Use gun (g)")
            }
            if (player.potion > 0) {
                println("- Use potion (p)")
            }
            if (player.bomb > 0) {
                println("- Use bomb (b)")
            }

            when (readLine()) {

                "h" -> {
                    enemyStats.enemyHp -= player.dmg
                    player.hp -= enemyStats.enemyDmg
                    println("Has hecho ${player.dmg} dmg")
                    println("Has recibido ${enemyStats.enemyDmg} de daño")
                    println("Tu vida actual queda en ${player.hp}")
                }

                "s" -> {
                    if (player.sword) {
                        enemyStats.enemyHp -= player.dmg + 25
                        player.hp -= enemyStats.enemyDmg
                        println("Has hecho ${player.dmg+25} de daño")
                        println("Has recibido ${enemyStats.enemyDmg} de daño")
                        println("Tu vida actual queda en ${player.hp}")
                    } else {
                        println("No tienes espada")
                        player.hp -= enemyStats.enemyDmg
                        println("Has recibido ${enemyStats.enemyDmg} de daño")
                        println("Tu vida actual queda en ${player.hp}")
                    }
                }

                "g" -> {
                    if (player.gun) {
                        enemyStats.enemyHp -= player.dmg + 50
                        player.hp -= enemyStats.enemyDmg
                        println("Has hecho ${player.dmg+50} de daño")
                        println("Has recibido ${enemyStats.enemyDmg} de daño")
                        println("Tu vida actual queda en ${player.hp}")
                    } else {
                        println("No tienes la pistola")
                        player.hp -= enemyStats.enemyDmg
                        println("Has recibido ${enemyStats.enemyDmg} de v")
                        println("Tu vida actual queda en ${player.hp}")
                    }
                }

                "p"-> {
                    player.usePotion(player)
                    player.hp -= enemyStats.enemyDmg
                    println("Has recibido ${enemyStats.enemyDmg} de daño")
                    println("Tu vida actual queda en ${player.hp}")
                }

                "b" -> {
                    if (player.bomb > 0) {
                        val bombDmg = random.nextInt(6)
                        enemyStats.enemyHp -= 50
                        player.hp -= bombDmg + enemyStats.enemyDmg
                        player.bomb--
                        println("Has hecho 50 de dmg")
                        println("Has recibido $bombDmg de daño, por el daño explosivo")
                        println("Has recibido ${enemyStats.enemyDmg} de daño por el enemigo")
                        println("Tu vida actual queda en ${player.hp}")
                    } else {
                        println("No tienes bombas")
                        player.hp -= enemyStats.enemyDmg
                        println("Has recibido ${enemyStats.enemyDmg} de daño")
                        println("Tu vida actual queda en ${player.hp}")
                    }
                }

                else -> {
                    player.hp -= enemyStats.enemyDmg
                    println("Has recibido ${enemyStats.enemyDmg} de daño")
                    println("Tu vida actual queda en ${player.hp}")
                }
            }

            if ((enemy == "devilBoss" || enemy == "pau") && enemyStats.enemyHp <= 0) {
                MapFunGeneration.clearScreen()
                Visual().asciiWin()
                Thread.sleep(3000)
                MapFunGeneration.clearScreen()
                Visual().asciiGameOver()
                Thread.sleep(3000)
                MapFunGeneration.clearScreen()
                Visual().asciiCredits()
                exitProcess(0)
            }

            if (player.hp <= 0) {
                println("Has perdido el combate")
                MapFunGeneration.clearScreen()
                Visual().asciiLost()
                Thread.sleep(3000)
                MapFunGeneration.clearScreen()
                Visual().asciiGameOver()
                Thread.sleep(3000)
                MapFunGeneration.clearScreen()
                Visual().asciiCredits()
                exitProcess(0)
            } else if (enemyStats.enemyHp <= 0) {
                MapFunGeneration.clearScreen()
                println("Has ganado el combate")
                return
            }
        }
    }
}