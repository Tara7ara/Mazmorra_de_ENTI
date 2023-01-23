/*import java.util.*
import kotlin.system.exitProcess

//La pongo al principio para recordar de que lo tengo que usar
fun clearScreen() {
    for (i in 1..25) {
        println()
    }
}

//Un array del mapa para poder ir moificando a tiempo real
val map1 = arrayOf(
    charArrayOf('#', '#', '#', '#', '#', '#', '#', '#', '#', '#'),
    charArrayOf('#', '@', '.', 'P', '.', '.', '.', '.', '#', '#'),
    charArrayOf('#', '#', '.', 'G', '#', 'B', '#', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '#', '#', '#', '#', '.', '#'),
    charArrayOf('#', 'P', '.', '.', '#', 'J', '#', '.', 'S', '#'),
    charArrayOf('#', '.', '.', '.', '#', 'D', '#', '.', '#', '#'),
    charArrayOf('#', '#', '.', '#', '#', '.', '#', '.', '#', '#'),
    charArrayOf('#', 'P', 'G', '.', '.', 'O', '#', '.', '.', '#'),
    charArrayOf('#', '.', 'T', '.', '.', 'K', '.', 'P', '.', '#'),
    charArrayOf('#', '#', '#', '#', '#', '#', '#', '#', '#', '#')
)
//TENGO QUE HACER EL MAPA MAS GRANDE XD
val bigMap = arrayOf(
    charArrayOf('#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'),
    charArrayOf('#', '@', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '#', '#', '#', '#', '.', '.', '.', '.', '.', '.', '#', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', 'P', 'P', '.', '#', '#', '#', '#', '.', '.', '.', '#', 'T', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', 'P', 'P', 'B', '.', '.', '.', '#', '#', '.', '#', '#', 'T', '#', '#', '#', '#', '#', '#', '#', '#', '#', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '#', '#', '#', '#', '.', '.', 'O', '.', '.', '.', '#', 'S', '#', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '#', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '#', 'D', '#'),
    charArrayOf('#', '.', '.', 'T', '.', '.', '.', '#', '#', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', 'K', '.', '.', '#', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '#', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#')
)

//Los stats del Player
class PlayerStats(
    var name: String,
    var posX: Int = 1,
    var posY: Int = 1,
    val maxHp: Int = 100,
    var hp: Int = 100,
    var dmg: Int = 5,
    var potion: Int = 0,
    var bomb: Int = 0,
    var key: Boolean = false,
    var sword: Boolean = false
)

// printMap() es una función que imprime el contenido del arreglo map1.
fun printMap(){
    for (fila in map1) {
        for (character in fila) {
            print(" $character ")
        }
        println(" ")
    }
}

//initPlayer() es una función que recorre el arreglo map1 buscando la primera ocurrencia del caracter
// @, y asigna las coordenadas de esa posición en las propiedades posX y posY de un objeto player.
fun initPlayer() {
    for (i in 0 until 10) {
        for (j in 0 until 10) {
            if (map1[i][j] == '@') {
                val player = PlayerStats("player")
                player.posX = i
                player.posY = j
            }
        }
    }
}

//Por si el jugador no tiene ni idea de lo que tiene que hacer
fun showHelp() {
    println("Los controles son:")
    println("\n- go north-->arriba")
    println("- go east-->derecha")
    println("- go south-->abajo")
    println("- go west-->izquierda")
    println("- use sword/potion/boomb")
    println("- inventory/help")
    println("\nDatos general:")
    println("\nPara usar las pociones, has de estar en un combate")
    println("Las letras significan algo, si quieres saber lo que significa, descubrelo por tu parte.")
    println("El '@' significa donde estas tu, si escribes un comando erroneo, en el mapa no se te marcara")
    println("Si te encuentras en un obejto pero no lo pillas, desaparecera, porque tienes una maladiccion")
}

//ASCII DEL CODIGO
fun asciiPotion(){
    println("hay una pocion en el suelo, quieres pillarlo? (yes/no)")
    println()
    println(" |    |")
    println("C|====|")
    println(" |  º |")
    println(" '----'")
    println()
}
fun asciiBomb(){
    println("hay una bomba en el suelo, quieres pillarlo? (yes/no)")
    println()
    println("        ,--.!,")
    println("     __/   -*-")
    println("   ,d08b.  '|`")
    println("   0088MM")
    println("   `9MMP'")
    println()
}
fun asciiSword(){
    println("hay una espada en el suelo, quieres pillarlo? (yes/no)")
    println()
    println("      . ________________")
    println("O|===| |________________>")
    println("      · ")
    println()
}
fun asciiKey(){
    println("hay una llave en el suelo, quieres pillarlo? (yes/no)")
    println()
    println("  8 8          ,o.   ")
    println(" d8o8azzzzzzzzd   b")
    println("               `o'")
    println()
}
fun asciiDevilBoss(){
    println("          (                      )")
    println("          |'    _,--------._    / |")
    println("          | `.,'            `. /  |")
    println("          `  '              ,-'   '")
    println("           '/_         _   (     /")
    println("          (,-.`.    ,',-.`. `__,'")
    println("           |'#' ),-','#'`= ,'.` |")
    println("           `._')  -'.'_,'   ) ))|")
    println("           /  (_.)'     .   -'//")
    println("          (  ________    ) )`'' ")
    println("           ' |V----V||  ' ,    ' ")
    println("            |`- -- -'   ,'   '  '      _____")
    println("     ___    |         .'    ' '  `._,-'     `-")
    println("        `.__,`---^---'       ' ` -'")
    println("           -.______  ' . /  ______,-")
    println("                   `.     ,'           ")
}
fun asciiCredits() {
    println("  ,ad8888ba,                                 88 88                               ")
    println(" d8''    `'8b                                88 ''   ,d                          ")
    println("d8'                                          88      88                          ")
    println("88            8b,dPPYba,  ,adPPYba,  ,adPPYb,88 88 MM88MMM ,adPPYba,  ,adPPYba,")
    println("88            88P'   'Y8 a8P_____88 a8'    `Y88 88   88   a8'     '8a I8[    ''  ")
    println("Y8,           88         8PP''''''' 8b       88 88   88   8b       d8  `'Y8ba,")
    println(" Y8a.    .a8P 88         '8b, , aa '8a,   ,d88  88   88,  '8a, , a8'  aa    ]8I ")
    println("  `'Y8888Y''  88          `'Ybbd8''  `''8bbdP'  88   ''Y8   'YbbdP'   ''YbbdP''")
    println("\n- Diseño del juego: Taratara")
    println("- Codigo del juego: Taratara")
    println("- Arte asciiart.eu y ascii.co.uk/art")
    println("- Beta testers: Guillem, Jan, Taratara")
}
fun asciiWin(){
    println("8b        d8 ,ad8888ba,   88        88 8b           d8 88888888888    I8,        8        ,8I  ,ad8888ba,   888b      88  ")
    println(" Y8,    ,8P d8''    `'8b  88        88 `8b         d8' 88             `8b       d8b       d8' d8''    `'8b  8888b     88  ")
    println("  Y8,  ,8P d8'        `8b 88        88  `8b       d8'  88              '8,     ,8'8,     ,8' d8'        `8b 88 `8b    88  ")
    println("   '8aa8'  88          88 88        88   `8b     d8'   88aaaaa          Y8     8P Y8     8P  88          88 88  `8b   88  ")
    println("    `88'   88          88 88        88    `8b   d8'    88'''''          `8b   d8' `8b   d8'  88          88 88   `8b  88  ")
    println("     88    Y8,        ,8P 88        88     `8b d8'     88                `8a a8'   `8a a8'   Y8,        ,8P 88    `8b 88  ")
    println("     88     Y8a.    .a8P  Y8a.    .a8P      `888'      88                 `8a8'     `8a8'     Y8a.    .a8P  88     `8888  ")
    println("     88      `'Y8888Y''    `'Y8888Y''        `8'       88888888888         `8'       `8'       `'Y8888Y''   88      `888  ")
}
fun asciigameOver(){
    println("\nHas completado el juego!")
    println("                           ,--.")
    println("                          {    }")
    println("                          K,   }")
    println("                         /  `Y`")
    println("                    _   /   /")
    println("                   {_'-K.__/")
    println("                     `/-.__L._")
    println("                     /  ' /`\\_}")
    println("                    /  ' /     ")
    println("            ____   /  ' /")
    println("     ,-'~~~~    ~~/  ' /_")
    println("   ,'             ``~~~%%',")
    println("  (                     %  Y")
    println(" {                      %% I")
    println("{      -                 %  `.")
    println("|       ',                %  )")
    println("|        |   ,..__      __. Y")
    println("|    .,_./  Y ' / ^Y   J   )|")
    println("'           |' /   |   |   ||")
    println(" '          L_/    . _ (_,.'(")
    println("  ',   ,      ^^''' / |      )")
    println("    '_  '          /,L]     /")
    println("      '-_`-,       ` `   ./`")
    println("         `-(_            )")
    println("             ^^'..___,.--`")
    println("\n  ,ad8888ba, ")
    println(" d8'      `'''8b")
    println("d8'     ")
    println("88            ,adPPYYba, 88,dPYba,,adPYba,   ,adPPYba,     ,adPPYba,  8b       d8  ,adPPYba, 8b,dPPYba,")
    println("88      88888 ``     `Y8 88P'   '88'    '8a a8P_____88    a8'     '8a `8b     d8' a8P_____88 88P'   'Y8 ")
    println("Y8,        88 ,adPPPPP88 88      88      88 8PP```````    8b       d8  `8b   d8'  8PP``````` 88 ")
    println(" Y8a.    .a88 88,    ,88 88      88      88 '8b, , aa     '8a,   ,a8'   `8b,d8'   '8b,   ,aa 88")
    println("  `'Y88888P'  `'8bbdP'Y8 88      88      88  `'Ybbd8''     `'YbbdP''      '8'      `'Ybbd8'' 88")
}
fun asciipresentation(){
    println("    ////////  ========================")
    println(" .  =======   =Como quieres llamarte?=")
    println("( )| O   O |  /=======================")
    println(" # | ____  | / ")
    println(" #   _| |_")
    println(" #  (     )")
    println("(#)==|   |")
    println(" #   |   |  ")
    println(" #   =====  ")
    println(" #   (   ) ")
    println(" #   || ||")
    println(".#---'| |`----.")
    println("`#----' `-----'")
}

//Falta dar mas feedback al player que si no, no se entera que le estan pegando
fun combat(enemy: String) {

    val player = PlayerStats("player")
    val random = Random()
    var enemyHp = 0
    var enemyDmg = 0
    var maxEnemyHp = 0

    //Pasaro a class
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
            maxEnemyHp = 150
            enemyHp = 150
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
            println("- Use Sword")
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
            }

            "use sword" -> {
                if (player.sword) {
                    enemyHp -= player.dmg + 25
                    player.hp -= enemyDmg
                } else {
                    println("No tienes espada")
                }
            }

            "use potion"-> {
                if (player.potion > 0) {
                    if (player.hp + 30 > player.maxHp) {
                        player.hp = player.maxHp
                    } else {
                        player.hp += 30
                    }
                    player.potion--
                } else {
                    println("No tienes pociones")
                }
            }

            "use bomb" -> {
                if (player.bomb > 0) {
                    val bombDmg = random.nextInt(6)
                    enemyHp -= 50
                    player.hp -= bombDmg
                    player.bomb--
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
            asciigameOver()
            Thread.sleep(3000)
            clearScreen()
            asciiCredits()
            //intenta posaro en el main
            exitProcess(0)
        }

        if (player.hp <= 0) {
            println("Has perdido el combate")
            clearScreen()
            asciigameOver()
            Thread.sleep(3000)
            clearScreen()
            asciiCredits()
            //intenta posaro en el main
            exitProcess(0)
        } else if (enemyHp <= 0) {
            println("Has ganado el combate")
            return
        }
    }
}

fun main() {

    var nameConfirm = 0
    val player = PlayerStats("player")
    while (nameConfirm != 1) {
        asciipresentation()
        val name1 = readLine()
        if (name1 != null) {
            player.name = name1
        }
        nameConfirm = 1
    }
    clearScreen()

    println("Tu nombre es: ${player.name} \n\n")
    println("Este es el mapa, si no entiendes nada o lo que tienes que hacer, escribe help")
    printMap()

    initPlayer()
    while (true) {
        //println("Ingresa la dirección en la que quieres moverte (north, south, east, west)")
        println("Que quieres hacer? [go (north, south, east, west)]")
        val playerPosition = map1[player.posX][player.posY]

        when (readLine()) {
            "go north" -> {
                if (player.posX > 0 && map1[player.posX - 1][player.posY] != '#' && map1[player.posX - 1][player.posY] != 'D') {
                    clearScreen()
                    executeAction(map1, player, playerPosition)
                    map1[player.posX][player.posY] = '.'
                    player.posX--
                }else {
                    map1[player.posX][player.posY] = '@'
                }
                map1[player.posX][player.posY] = '@'
                printMap()
            }
            "go south" -> {
                if (player.posX < map1.size - 1 && map1[player.posX + 1][player.posY] != '#' && map1[player.posX + 1][player.posY] != 'D') {
                    clearScreen()
                    executeAction(map1, player, playerPosition)
                    map1[player.posX][player.posY] = '.'
                    player.posX++
                }else {
                    map1[player.posX][player.posY] = '@'
                }
                map1[player.posX][player.posY] = '@'
                printMap()
            }
            "go east" -> {
                if (player.posY < map1[0].size - 1 && map1[player.posX][player.posY + 1] != '#' && map1[player.posX][player.posY + 1] != 'D') {
                    clearScreen()
                    executeAction(map1, player, playerPosition)
                    map1[player.posX][player.posY] = '.'
                    player.posY++
                }else {
                    map1[player.posX][player.posY] = '@'
                }
                map1[player.posX][player.posY] = '@'
                printMap()
            }
            "go west" -> {
                if (player.posY > 0 && map1[player.posX][player.posY - 1] != '#' && map1[player.posX][player.posY - 1] != 'D') {
                    clearScreen()
                    executeAction(map1, player, playerPosition)
                    map1[player.posX][player.posY] = '.'
                    player.posY--
                }else {
                    map1[player.posX][player.posY] = '@'
                }
                map1[player.posX][player.posY] = '@'
                printMap()
            }

            "use potion" -> {
                if (player.potion > 0) {
                    if (player.hp == player.maxHp) {
                        println("Ya tienes la vida máxima, no necesitas consumir una poción.")
                    } else {
                        clearScreen()
                        if (player.hp + 30 > player.maxHp) {
                            println("Te has curado hasta el maximo de vida")
                            player.hp = player.maxHp
                        } else {
                            println("Te has curado 30 de vida")
                            player.hp += 30
                        }
                        player.potion--
                        printMap()
                    }
                } else {
                    println("No tienes pociones")
                }
            }

            "use key" -> {
                if (player.key) {
                    player.key = false
                    for (i in map1.indices) {
                        for (j in 0 until map1[i].size) {
                            if (map1[i][j] == 'D') {
                                map1[i][j] = '.'
                            }
                        }
                    }
                    println("La llave se ha usado, LA PUERTA HA DESAPARECIDO, AHORA EN EL MAPA NO HAY NINGUNA D (door)")
                    printMap()
                } else {
                    println("No tienes la llave")
                }
            }

            "help" -> {
                clearScreen()

                showHelp()
            }

            "inventory" -> {
                clearScreen()

                println("\n=== Estadisticas ===")
                println("Name: ${player.name}, Coordenadas: [ ${player.posX}, ${player.posY} ]")
                println("HP - [ ${player.hp} / ${player.maxHp} ]")
                val damage = if (player.sword) {
                    player.dmg + 25
                } else {
                    player.dmg
                }
                println("DMG - $damage")
                println("=== Inventario ===")
                println("Tienes ${player.potion} pociones")
                println("Tienes ${player.bomb} bombas")
                if (player.sword) {
                    println("Tienes la Espada, que te suma tu dmg +25")
                }
                if (player.key) {
                    println("Tienes la llave")
                }
                println()
                printMap()
            }

            "hack" -> {
                //Comando para hacer pruebas
                player.hp--

                //COSAS QUE ARREGLAR, TOpO ESTA EN LA RUBICA --> sobretodo ahora mismo separar en diferentes archivos
            }

            else -> println("Este comando no existe")
        }
    }
}

fun executeAction(map1: Array<CharArray>, player: PlayerStats, playerPosition: Char) {
    if (playerPosition == 'P') {
        asciiPotion()
        val response = readLine()
        if (response == "yes") {
            player.potion++
        }
    }else if (map1[player.posX][player.posY] == 'B') {
        asciiBomb()
        val response = readLine()
        if (response == "yes") {
            player.bomb++
        }
    }else if (map1[player.posX][player.posY] == 'S') {
        asciiSword()
        val response = readLine()
        if (response == "yes") {
            player.sword = true
        }
    }else if (map1[player.posX][player.posY] == 'K') {
        asciiKey()
        val response = readLine()
        if (response == "yes") {
            player.key = true
        }
    }else if (map1[player.posX][player.posY] == 'T') {
        combat("troll")
    }else if (map1[player.posX][player.posY] == 'G'){
        combat("goblin")
    }else if (map1[player.posX][player.posY] == 'O'){
        combat("Orco")
    }else if (map1[player.posX][player.posY] == 'J'){
        asciiDevilBoss()
        Thread.sleep(3000)
        combat("devilBoss")
    }
}

 */

import java.util.*
import kotlin.system.exitProcess

//La pongo al principio para recordar de que lo tengo que usar
fun clearScreen() {
    for (i in 1..25) {
        println()
    }
}

//Un array del mapa para poder ir moificando a tiempo real
val Map1 = arrayOf(
    charArrayOf('#', '#', '#', '#', '#', '#', '#', '#', '#', '#'),
    charArrayOf('#', '@', 'S', 'P', '.', '.', '.', '.', '#', '#'),
    charArrayOf('#', '#', '.', 'G', '#', 'B', '#', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '#', '#', '#', '#', '.', '#'),
    charArrayOf('#', 'P', '.', '.', '#', 'J', '#', '.', 'S', '#'),
    charArrayOf('#', '.', '.', '.', '#', 'D', '#', '.', '#', '#'),
    charArrayOf('#', '#', '.', '#', '#', '.', '#', '.', '#', '#'),
    charArrayOf('#', 'P', 'G', '.', '.', 'O', '#', '.', '.', '#'),
    charArrayOf('#', '.', 'T', '.', '.', 'K', '.', 'P', '.', '#'),
    charArrayOf('#', '#', '#', '#', '#', '#', '#', '#', '#', '#')
)
//RELLENAR EL MAPA CON OBJETOS Y ENEMIGOS
val bigMap = arrayOf(
    charArrayOf('#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'),
    charArrayOf('#', '@', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '#', '#', '#', '#', '.', '.', '.', '.', '.', '.', '#', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '#', '#', '#', '#', '.', '.', '.', '#', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '#', '#', '.', '#', '#', '.', '#', '#', '#', '#', '#', '#', '#', '#', '#', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '#', '#', '#', '#', '.', '.', '.', '.', '.', '.', '#', '.', '#', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '#', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '#', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '#', '#', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '#', '#', '#', '#', '.', '.', '.', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '.', '#'),
    charArrayOf('#', '#', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '.', '#'),
    charArrayOf('#', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '#', '#', '#', '#', '#', '#', '#', '#', '.', '#', '#', '#', '#', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '#', '#', '#', '.', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '#', '#', '#', '.', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '#', '#', '#', '.', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '#', '#', '.', '#', '#', '#', '#', '.', '.', '.', '#', '#', '#', '#', '#', '#', '#', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '#', '#', '.', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '#', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '#', '#', '.', '.', '.', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
    charArrayOf('#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#')
)

//Los stats del Player
class PlayerStats(
    var name: String,
    var posX: Int = 1,
    var posY: Int = 1,
    val maxHp: Int = 100,
    var hp: Int = 999,
    var dmg: Int = 999,
    var potion: Int = 0,
    var bomb: Int = 0,
    var key: Boolean = false,
    var sword: Boolean = false
)

// printMap() es una función que imprime el contenido del arreglo Map1.
fun printMap(){
    for (fila in Map1) {
        for (character in fila) {
            print(" $character ")
        }
        println(" ")
    }
}

//initPlayer() es una función que recorre el arreglo Map1 buscando la primera ocurrencia del caracter
// @, y asigna las coordenadas de esa posición en las propiedades posX y posY de un objeto player.
fun initPlayer() {
    for (i in 0 until 10) {
        for (j in 0 until 10) {
            if (Map1[i][j] == '@') {
                val player = PlayerStats("player")
                player.posX = i
                player.posY = j
            }
        }
    }
}

//Por si el jugador no tiene ni idea de lo que tiene que hacer
fun showHelp() {
    println("Los controles son:")
    println("\n- go north-->arriba")
    println("- go east-->derecha")
    println("- go south-->abajo")
    println("- go west-->izquierda")
    println("- use sword/potion/boomb")
    println("- inventory/help")
    println("\nDatos general:")
    println("\nPara usar las pociones, has de estar en un combate")
    println("Las letras significan algo, si quieres saber lo que significa, descubrelo por tu parte.")
    println("El '@' significa donde estas tu, si escribes un comando erroneo, en el mapa no se te marcara")
    println("Si te encuentras en un obejto pero no lo pillas, desaparecera, porque tienes una maladiccion")
}

//ASCII DEL CODIGO
fun asciiPotion(){
    println("hay una pocion en el suelo, quieres pillarlo? (yes/no)")
    println()
    println("\u001b[31m  |    | \u001b[0m")
    println("\u001b[31m C|====| \u001b[0m")
    println("\u001b[31m  |  º | \u001b[0m")
    println("\u001b[31m  '----' \u001b[0m")
    println()
}
fun asciiBomb(){
    println("hay una bomba en el suelo, quieres pillarlo? (yes/no)")
    println()
    println("\u001B[30m        ,--.!,")
    println("     __/   -*-")
    println("   ,d08b.  '|`")
    println("   0088MM")
    println("   `9MMP'\u001B[0m")
    println()
}
fun asciiSword(){
    println("hay una espada en el suelo, quieres pillarlo? (yes/no)")
    println()
    //+=={:::::::::::::::::> otra espada si no gusta
    println("\u001B[33;1m      .\u001B[0m \u001B[37;1m ________________\u001B[0m")
    println("\u001B[33;1mO|===| |\u001B[0m \u001B[37;1m________________>\u001B[0m")
    println("\u001B[33;1m      ·\u001B[0m")
    println()
}
fun asciiKey(){
    println("hay una llave en el suelo, quieres pillarlo? (yes/no)")
    println()
    println("\u001B[33;1m  8 8          ,o.   \u001B[0m")
    println("\u001B[33;1m d8o8azzzzzzzzd   b\u001B[0m")
    println("\u001B[33;1m               `o'\u001B[0m")
    println()
}
fun asciiGoblin(){
    println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀")
    println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⣿⣿⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀")
    println("  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀")
    println("  ⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢧⡀⠀⠀⠀⠀⠀⠀⠀⠀")
    println("  ⠀⠢⣤⣀⡀⠀⠀⠀⢿⣧⣄⡉⠻⢿⣿⣿⡿⠟⢉⣠⣼⡿⠀⠀⠀⠀⣀⣤⠔⠀")
    println("  ⠀⠀⠈⢻⣿⣶⠀⣷⠀⠉⠛⠿⠶⡴⢿⡿⢦⠶⠿⠛⠉⠀⣾⠀⣶⣿⡟⠁⠀⠀")
    println("  ⠀⠀⠀⠀⠻⣿⡆⠘⡇⠘⠷⠠⠦⠀⣾⣷⠀⠴⠄⠾⠃⢸⠃⢰⣿⠟⠀⠀⠀⠀")
    println("   ⠀⠀⠀⠀⠀⠋⢠⣾⣥⣴⣶⣶⣆⠘⣿⣿⠃⣰⣶⣶⣦⣬⣷⡄⠙⠀⠀⠀⠀⠀")
    println("  ⠀⠀⠀⠀⠀⠀⢋⠛⠻⠿⣿⠟⢹⣆⠸⠇⣰⡏⠻⣿⠿⠟⠛⡙⠀⠀⠀⠀⠀⠀")
    println("  ⠀⠀⠀⠀⠀⠀⠈⢧⡀⠠⠄⠀⠈⠛⠀⠀⠛⠁⠀⠠⠄⢀⡼⠁⠀⠀⠀⠀⠀⠀")
    println("  ⠀⠀⠀⠀⠀⠀⠀⠈⢻⣦⡀⠃⠀⣿⡆⢰⣿⠀⠘⢀⣴⡟⠁⠀⠀⠀⠀⠀⠀⠀")
    println("  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣦⡀⠘⠇⠸⠃⢀⣴⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀")
    println("  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣷⣄⣠⣾⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀")
    println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⣿⣿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀")
    println("  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀")
}
fun asciiTroll(){

    println("   ⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀")
    println("   ⠀⠀⠀ ⠀⠀⠀⢀⣠⣤⣶⡾⠛⠉⠁⠀⠀⠈⠉⠻⢿⣶⣶⣤⣀⠀⠀⠀⠀⠀⠀")
    println("   ⠀⠀⠀⠀⠀ ⠀⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣿⣿⣿⠀⠀⣀⠀⠀⠀")
    println("   ⠀⢀⣴⣇⠀⠀⣿⡟⢁⠀⣠⠀⠀⣀⠀⠀⡀⠀⢠⣀⠀⠈⢿⡟⠀⠀⣿⣷⣄⠀")
    println("   ⠀⣿⣏⠙⠀⠀⠿⠃⣼⣾⣿⣤⣾⣿⣆⣼⣿⣦⣸⣿⣷⣇⠸⡇⠀⠀⠛⢻⣿⠀")
    println("   ⠀⣿⣿⣦⠙⣶⣶⣤⣿⣿⡛⣉⣉⡙⠻⣿⡿⠋⣉⣉⠻⣿⣠⣤⣶⠖⣰⣿⣿⠀")
    println("   ⠀⣿⣿⣿⡀⠈⠻⣿⣿⣿⣿⣭⣽⡏⢰⣿⠀⣿⣭⣽⣿⣿⣿⡿⠃⢸⣿⣿⣿⠀")
    println("   ⠀⣿⣿⣿⡇⠀⢠⣬⡉⢿⣿⣿⡿⢀⣿⣿⣆⠸⣿⣿⡿⢋⣩⠀⠀⢸⣿⣿⣿⠀")
    println("   ⠀⣿⣿⣿⡇⠀⠀⣿⣿⣄⠻⢿⠃⣼⣿⣿⣿⡄⠻⠋⣠⣿⣿⠀⠀⣿⣿⣿⣿⠀")
    println("   ⠀⣿⣿⣿⣇⠀⠀⣿⣿⣿⣷⡆⢠⣿⣿⣿⣿⣿⠀⣿⣿⣿⡏⠀⠀⣿⣿⣿⣿⠀")
    println("   ⠀⣿⣿⣿⣿⠀⠀⣿⣿⣿⣿⣷⣌⠛⠛⠛⠛⣁⣴⣿⣿⣿⡇⠀⠀⣿⣿⣿⣿⠀")
    println("   ⠀⣿⣿⣿⣿⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢸⣿⣿⣿⣿⠀")
    println("   ⠀⠛⠛⠛⠛⠀⠀⠘⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠁⠀⠘⠛⠛⠛⠛⠀")
}
fun asciiOrc(){
    println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀")
    println("   ⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀")
    println("  ⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀⠀⢠⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀")
    println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⣧⣄⣉⣉⣠⣼⣶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀")
    println("    ⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⡿⣿⣿⣿⣿⢿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀")
    println("   ⠀⠀⠀⠀⠀⠀⠀⣼⣤⣤⣈⠙⠳⢄⣉⣋⡡⠞⠋⣁⣤⣤⣧⠀⠀⠀⠀⠀⠀⠀")
    println("   ⠀⢲⣶⣤⣄⡀⢀⣿⣄⠙⠿⣿⣦⣤⡿⢿⣤⣴⣿⠿⠋⣠⣿⠀⢀⣠⣤⣶⡖⠀")
    println("   ⠀⠀⠙⣿⠛⠇⢸⣿⣿⡟⠀⡄⢉⠉⢀⡀⠉⡉⢠⠀⢻⣿⣿⡇⠸⠛⣿⠋⠀⠀")
    println("   ⠀⠀⠀⠘⣷⠀⢸⡏⠻⣿⣤⣤⠂⣠⣿⣿⣄⠑⣤⣤⣿⠟⢹⡇⠀⣾⠃⠀⠀⠀")
    println("  ⠀⠀⠀⠀⠘⠀⢸⣿⡀⢀⠙⠻⢦⣌⣉⣉⣡⡴⠟⠋⡀⢀⣿⡇⠀⠃⠀⠀⠀⠀")
    println("   ⠀⠀⠀⠀⠀⠀⢸⣿⣧⠈⠛⠂⠀⠉⠛⠛⠉⠀⠐⠛⠁⣼⣿⡇⠀⠀⠀⠀⠀⠀")
    println("   ⠀⠀⠀⠀⠀⠀⠸⣏⠀⣤⡶⠖⠛⠋⠉⠉⠙⠛⠲⢶⣤⠀⣹⠇⠀⠀⠀⠀⠀⠀")
    println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣶⣿⣿⣿⣿⣿⣿⣶⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀")
    println("   ⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠈⠉⠉⠉⠛⠛⠛⠛⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀")

}
fun asciiDevilBoss(){
    println("          (                      )")
    println("          |'    _,--------._    / |")
    println("          | `.,'            `. /  |")
    println("          `  '              ,-'   '")
    println("           '/_         _   (     /")
    println("          (,-.`.    ,',-.`. `__,'")
    println("           |'#' ),-','#'`= ,'.` |")
    println("           `._')  -'.'_,'   ) ))|")
    println("           /  (_.)'     .   -'//")
    println("          (  ________    ) )`'' ")
    println("           ' |V----V||  ' ,    ' ")
    println("            |`- -- -'   ,'   '  '      _____")
    println("     ___    |         .'    ' '  `._,-'     `-")
    println("        `.__,`---^---'       ' ` -'")
    println("           -.______  ' . /  ______,-")
    println("                   `.     ,'           ")
}
fun asciiCredits() {
    println("  ,ad8888ba,                                 88 88                               ")
    println(" d8''    `'8b                                88 ''   ,d                          ")
    println("d8'                                          88      88                          ")
    println("88            8b,dPPYba,  ,adPPYba,  ,adPPYb,88 88 MM88MMM ,adPPYba,  ,adPPYba,")
    println("88            88P'   'Y8 a8P_____88 a8'    `Y88 88   88   a8'     '8a I8[    ''  ")
    println("Y8,           88         8PP''''''' 8b       88 88   88   8b       d8  `'Y8ba,")
    println(" Y8a.    .a8P 88         '8b, , aa '8a,   ,d88  88   88,  '8a, , a8'  aa    ]8I ")
    println("  `'Y8888Y''  88          `'Ybbd8''  `''8bbdP'  88   ''Y8   'YbbdP'   ''YbbdP''")
    println("\n- Diseño del juego: Taratara")
    println("- Codigo del juego: Taratara")
    println("- Arte asciiart.eu y ascii.co.uk/art")
    println("- Beta testers: Guillem, Jan, Taratara")
}
fun asciiWin(){
    println("8b        d8 ,ad8888ba,   88        88 8b           d8 88888888888    I8,        8        ,8I  ,ad8888ba,   888b      88  ")
    println(" Y8,    ,8P d8''    `'8b  88        88 `8b         d8' 88             `8b       d8b       d8' d8''    `'8b  8888b     88  ")
    println("  Y8,  ,8P d8'        `8b 88        88  `8b       d8'  88              '8,     ,8'8,     ,8' d8'        `8b 88 `8b    88  ")
    println("   '8aa8'  88          88 88        88   `8b     d8'   88aaaaa          Y8     8P Y8     8P  88          88 88  `8b   88  ")
    println("    `88'   88          88 88        88    `8b   d8'    88'''''          `8b   d8' `8b   d8'  88          88 88   `8b  88  ")
    println("     88    Y8,        ,8P 88        88     `8b d8'     88                `8a a8'   `8a a8'   Y8,        ,8P 88    `8b 88  ")
    println("     88     Y8a.    .a8P  Y8a.    .a8P      `888'      88                 `8a8'     `8a8'     Y8a.    .a8P  88     `8888  ")
    println("     88      `'Y8888Y''    `'Y8888Y''        `8'       88888888888         `8'       `8'       `'Y8888Y''   88      `888  ")
}

fun gameOver(){
    println("\nHas completado el juego!")
    println("                           ,--.")
    println("                          {    }")
    println("                          K,   }")
    println("                         /  `Y`")
    println("                    _   /   /")
    println("                   {_'-K.__/")
    println("                     `/-.__L._")
    println("                     /  ' /`\\_}")
    println("                    /  ' /     ")
    println("            ____   /  ' /")
    println("     ,-'~~~~    ~~/  ' /_")
    println("   ,'             ``~~~%%',")
    println("  (                     %  Y")
    println(" {                      %% I")
    println("{      -                 %  `.")
    println("|       ',                %  )")
    println("|        |   ,..__      __. Y")
    println("|    .,_./  Y ' / ^Y   J   )|")
    println("'           |' /   |   |   ||")
    println(" '          L_/    . _ (_,.'(")
    println("  ',   ,      ^^''' / |      )")
    println("    '_  '          /,L]     /")
    println("      '-_`-,       ` `   ./`")
    println("         `-(_            )")
    println("             ^^'..___,.--`")
    println("\n  ,ad8888ba, ")
    println(" d8'      `'''8b")
    println("d8'     ")
    println("88            ,adPPYYba, 88,dPYba,,adPYba,   ,adPPYba,     ,adPPYba,  8b       d8  ,adPPYba, 8b,dPPYba,")
    println("88      88888 ``     `Y8 88P'   '88'    '8a a8P_____88    a8'     '8a `8b     d8' a8P_____88 88P'   'Y8 ")
    println("Y8,        88 ,adPPPPP88 88      88      88 8PP```````    8b       d8  `8b   d8'  8PP``````` 88 ")
    println(" Y8a.    .a88 88,    ,88 88      88      88 '8b, , aa     '8a,   ,a8'   `8b,d8'   '8b,   ,aa 88")
    println("  `'Y88888P'  `'8bbdP'Y8 88      88      88  `'Ybbd8''     `'YbbdP''      '8'      `'Ybbd8'' 88")
}

fun presentation(){
    println("    ////////  ========================")
    println(" .  =======   =Como quieres llamarte?=")
    println("( )| O   O |  /=======================")
    println(" # | ____  | / ")
    println(" #   _| |_")
    println(" #  (     )")
    println("(#)==|   |")
    println(" #   |   |  ")
    println(" #   =====  ")
    println(" #   (   ) ")
    println(" #   || ||")
    println(".#---'| |`----.")
    println("`#----' `-----'")
}

//Crear la clase de enemy

//Falta dar mas feedback al player que si no, no se entera que le estan pegando
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
            maxEnemyHp = 150
            enemyHp = 150
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
            println("- Use Sword")
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

            "use potion"-> {
                if (player.potion > 0) {
                    if (player.hp + 30 > player.maxHp) {
                        player.hp = player.maxHp
                        println("Te has curado hasta el maximo")
                    } else {
                        player.hp += 30
                        println("Te has curado 30 de vida")
                    }
                    player.potion--
                } else {
                    println("No tienes pociones")
                }
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
            gameOver()
            Thread.sleep(3000)
            clearScreen()
            asciiCredits()
            exitProcess(0)
        } else if (enemyHp <= 0) {
            println("Has ganado el combate")
            return
        }
    }
}

fun main() {

    var nameConfirm = 0
    val player = PlayerStats("player")
    while (nameConfirm != 1) {
        presentation()
        val name1 = readLine()
        if (name1 != null) {
            player.name = name1
        }
        nameConfirm = 1
    }
    clearScreen()

    println("Tu nombre es: ${player.name} \n\n")
    println("Este es el mapa, si no entiendes nada o lo que tienes que hacer, escribe help")
    printMap()

    initPlayer()
    while (true) {
        println("Que quieres hacer? [go (north, south, east, west)]")
        when (readLine()) {
            "w" -> {//go north
                if (player.posX > 0 && Map1[player.posX - 1][player.posY] != '#' && Map1[player.posX - 1][player.posY] != 'D') {
                    clearScreen()
                    Map1[player.posX][player.posY] = '.'
                    player.posX--

                    if (Map1[player.posX][player.posY] == 'P') {
                        asciiPotion()
                        val response = readLine()
                        if (response == "yes") {
                            player.potion++
                        }
                    }else if (Map1[player.posX][player.posY] == 'B') {
                        asciiBomb()
                        val response = readLine()
                        if (response == "yes") {
                            player.bomb++
                        }
                    }else if (Map1[player.posX][player.posY] == 'S') {
                        asciiSword()
                        val response = readLine()
                        if (response == "yes") {
                            player.sword = true
                        }
                    }else if (Map1[player.posX][player.posY] == 'K') {
                        asciiKey()
                        val response = readLine()
                        if (response == "yes") {
                            player.key = true
                        }
                    }else if (Map1[player.posX][player.posY] == 'T') {
                        asciiTroll()
                        Thread.sleep(3000)
                        combat("troll", player)
                    }else if (Map1[player.posX][player.posY] == 'G'){
                        asciiGoblin()
                        Thread.sleep(3000)
                        combat("goblin", player)
                    }else if (Map1[player.posX][player.posY] == 'O'){
                        asciiOrc()
                        Thread.sleep(3000)
                        combat("orc", player)
                    }else if (Map1[player.posX][player.posY] == 'J'){
                        asciiDevilBoss()
                        Thread.sleep(3000)
                        combat("devilBoss", player)
                    }else {
                        Map1[player.posX][player.posY] = '@'
                    }
                    Map1[player.posX][player.posY] = '@'
                    printMap()
                }
            }

            "s" -> {//go south
                if (player.posX < Map1.size - 1 && Map1[player.posX + 1][player.posY] != '#' && Map1[player.posX + 1][player.posY] != 'D') {
                    clearScreen()
                    Map1[player.posX][player.posY] = '.'
                    player.posX++

                    if (Map1[player.posX][player.posY] == 'P') {
                        asciiPotion()
                        val response = readLine()
                        if (response == "yes") {
                            player.potion++
                        }
                    }else if (Map1[player.posX][player.posY] == 'B') {
                        asciiBomb()
                        val response = readLine()
                        if (response == "yes") {
                            player.bomb++
                        }
                    }else if (Map1[player.posX][player.posY] == 'S') {
                        asciiSword()
                        val response = readLine()
                        if (response == "yes") {
                            player.sword = true
                        }
                    }else if (Map1[player.posX][player.posY] == 'K') {
                        asciiKey()
                        val response = readLine()
                        if (response == "yes") {
                            player.key = true
                        }
                    }else if (Map1[player.posX][player.posY] == 'T') {
                        asciiTroll()
                        Thread.sleep(3000)
                        combat("troll", player)
                    }else if (Map1[player.posX][player.posY] == 'G'){
                        asciiGoblin()
                        Thread.sleep(3000)
                        combat("goblin", player)
                    }else if (Map1[player.posX][player.posY] == 'O'){
                        asciiOrc()
                        Thread.sleep(3000)
                        combat("orc", player)
                    }else if (Map1[player.posX][player.posY] == 'J'){
                        asciiDevilBoss()
                        Thread.sleep(3000)
                        combat("devilBoss", player)
                    }else {
                        Map1[player.posX][player.posY] = '@'
                    }
                    Map1[player.posX][player.posY] = '@'
                    printMap()
                }
            }

            "d" -> {//go east
                if (player.posY < Map1[0].size - 1 && Map1[player.posX][player.posY + 1] != '#'&& Map1[player.posX][player.posY + 1] != 'D') {
                    clearScreen()
                    Map1[player.posX][player.posY] = '.'
                    player.posY++

                    if (Map1[player.posX][player.posY] == 'P') {
                        asciiPotion()
                        val response = readLine()
                        if (response == "yes") {
                            player.potion++
                        }
                    }else if (Map1[player.posX][player.posY] == 'B') {
                        asciiBomb()
                        val response = readLine()
                        if (response == "yes") {
                            player.bomb++
                        }
                    }else if (Map1[player.posX][player.posY] == 'S') {
                        asciiSword()
                        val response = readLine()
                        if (response == "yes") {
                            player.sword = true
                        }
                    }else if (Map1[player.posX][player.posY] == 'K') {
                        asciiKey()
                        val response = readLine()
                        if (response == "yes") {
                            player.key = true
                        }
                    }else if (Map1[player.posX][player.posY] == 'T') {
                        asciiTroll()
                        Thread.sleep(3000)
                        combat("troll", player)
                    }else if (Map1[player.posX][player.posY] == 'G'){
                        asciiGoblin()
                        Thread.sleep(3000)
                        combat("goblin", player)
                    }else if (Map1[player.posX][player.posY] == 'O'){
                        asciiOrc()
                        Thread.sleep(3000)
                        combat("orc", player)
                    }else if (Map1[player.posX][player.posY] == 'J'){
                        asciiDevilBoss()
                        Thread.sleep(3000)
                        combat("devilBoss", player)
                    }else {
                        Map1[player.posX][player.posY] = '@'
                    }
                    Map1[player.posX][player.posY] = '@'
                    printMap()
                }
            }

            "a" -> {//go west
                if (player.posY > 0 && Map1[player.posX][player.posY - 1] != '#' && Map1[player.posX][player.posY - 1] != 'D') {
                    clearScreen()
                    Map1[player.posX][player.posY] = '.'
                    player.posY--

                    if (Map1[player.posX][player.posY] == 'P') {
                        asciiPotion()
                        val response = readLine()
                        if (response == "yes") {
                            player.potion++
                        }
                    }else if (Map1[player.posX][player.posY] == 'B') {
                        asciiBomb()
                        val response = readLine()
                        if (response == "yes") {
                            player.bomb++
                        }
                    }else if (Map1[player.posX][player.posY] == 'S') {
                        asciiSword()
                        val response = readLine()
                        if (response == "yes") {
                            player.sword = true
                        }
                    }else if (Map1[player.posX][player.posY] == 'K') {
                        asciiKey()
                        val response = readLine()
                        if (response == "yes") {
                            player.key = true
                        }
                    }else if (Map1[player.posX][player.posY] == 'T') {
                        asciiTroll()
                        Thread.sleep(3000)
                        combat("troll", player)
                    }else if (Map1[player.posX][player.posY] == 'G'){
                        asciiGoblin()
                        Thread.sleep(3000)
                        combat("goblin", player)
                    }else if (Map1[player.posX][player.posY] == 'O'){
                        asciiOrc()
                        Thread.sleep(3000)
                        combat("orc", player)
                    }else if (Map1[player.posX][player.posY] == 'J'){
                        asciiDevilBoss()
                        Thread.sleep(3000)
                        combat("devilBoss", player)
                    }
                    else {
                        Map1[player.posX][player.posY] = '@'
                    }
                    Map1[player.posX][player.posY] = '@'
                    printMap()
                }
            }

            "use potion" -> {
                if (player.potion > 0){
                    if (player.hp == player.maxHp) {
                        println("Ya tienes la vida máxima, no necesitas consumir una poción.")
                    } else {
                        clearScreen()
                        if (player.hp + 30 > player.maxHp) {
                            println("Te has curado hasta el maximo de vida")
                            player.hp = player.maxHp
                        } else {
                            println("Te has curado 30 de vida")
                            player.hp += 30
                        }
                        player.potion--
                        printMap()
                    }
                } else {
                    println("No tienes pociones")
                }
            }

            //abre la puerta mas cercana
            "use key" -> {
                if (player.key){
                    var doorFound = false
                    val minX = if (player.posX-2 < 0) 0 else player.posX-2
                    val maxX = if (player.posX+2 > Map1.size - 1) Map1.size - 1 else player.posX+2
                    val minY = if (player.posY-2 < 0) 0 else player.posY-2
                    val maxY = if (player.posY+2 > Map1[0].size - 1) Map1[0].size - 1 else player.posY+2
                    for (i in minX..maxX) {
                        for (j in minY..maxY) {
                            if (Map1[i][j] == 'D') {
                                Map1[i][j] = '.'
                                doorFound = true
                                break
                            }
                        }
                        if (doorFound) break
                    }
                    if (doorFound) {
                        player.key = false
                        println("La llave se ha usado, LA PUERTA MAS CERCA HA DESAPARECIDO, ESTA EN EL RANGO DE TU POSICION")
                    } else {
                        println("No hay ninguna puerta cerca, tienes que estar en un rango 2x2 aprox")
                    }
                    printMap()
                } else {
                    println("No tienes la llave")
                }
            }




            "help" -> {
                clearScreen()

                showHelp()
            }

            "inventory" -> {
                clearScreen()

                println("\n=== Estadisticas ===")
                println("Name: ${player.name}, Coordenadas: [ ${player.posX}, ${player.posY} ]")
                println("HP - [ ${player.hp} / ${player.maxHp} ]")
                val damage = if(player.sword){
                    player.dmg + 25
                }else{
                    player.dmg
                }
                println("DMG - $damage")
                println("=== Inventario ===")
                println("Tienes ${player.potion} pociones")
                println("Tienes ${player.bomb} bombas")
                if (player.sword){
                    println("Tienes la Espada, que te suma tu dmg +25")
                }
                if (player.key){
                    println("Tienes la llave")
                }
                println()
                printMap()
            }

            "hack" -> {
                //Comando para hacer pruebas
                player.hp --
            }
        }
    }
}