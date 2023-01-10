
fun main(args: Array<String>) {

    fun clearScreen() {
        for (i in 1..25) {
            println()
        }
    }

    val Map1 = arrayOf(
            charArrayOf('#', '#', '#', '#', '#', '#', '#', '#', '#', '#'),
            charArrayOf('#', '@', '.', 'P', '.', '.', '.', '.', '#', '#'),
            charArrayOf('#', '#', '.', 'G', '#', 'B', '#', '.', '.', '#'),
            charArrayOf('#', '.', '.', '.', '#', '#', '#', '#', '.', '#'),
            charArrayOf('#', 'P', '.', '.', '#', 'J', '#', '.', 'S', '#'),
            charArrayOf('#', '.', '.', '.', '#', 'L', '#', '.', '#', '#'),
            charArrayOf('#', '#', '.', '#', '#', '.', '#', '.', '#', '#'),
            charArrayOf('#', 'P', 'G', '.', '.', 'O', '#', '.', '.', '#'),
            charArrayOf('#', '.', 'T', '.', '.', 'K', '.', 'P', '.', '#'),
            charArrayOf('#', '#', '#', '#', '#', '#', '#', '#', '#', '#')
    )

    val Map2 = arrayOf(
            charArrayOf('#', '#', '#', '#', '#', '#', '#', '#', '#', '#'),
            charArrayOf('#', '@', '.', 'P', '.', '.', '.', '.', '#', '#'),
            charArrayOf('#', '#', '.', 'G', '#', 'B', '#', '.', '.', '#'),
            charArrayOf('#', '.', '.', '.', '3', '#', '#', '#', '.', '#'),
            charArrayOf('#', 'P', '.', '.', '#', 'J', '#', '.', 'S', '#'),
            charArrayOf('#', '.', '.', '.', '#', 'L', '#', '.', '#', '#'),
            charArrayOf('#', '#', '.', '#', '#', '.', '#', '.', '#', '#'),
            charArrayOf('#', 'P', 'G', '.', '.', 'O', '#', '.', '.', '#'),
            charArrayOf('#', '.', 'T', '.', '.', 'K', '.', 'P', '.', '#'),
            charArrayOf('#', '#', '#', '#', '#', '#', '#', '#', '#', '#')
    )
    
    for (fila in Map1) {
        for (character in fila) {
            print(" $character ")
        }
        println(" ")
    }

    val player = PlayerStats("player")
    val orco = OrcoStats
    val goblin = GoblinStats
    val troll = TrollStats
    val jefe = JefeStats
    val enemy = EnemyTransport()

    fun mapa() {
        for (auxiliar in 0..10) {
            for (i in 0..10) {
                print("${Map1[auxiliar][i]} ")
            }
            println()
        }
        Map1[player.posX][player.posY] = '.'
    }

    /*fun initPlayer(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (Map1[i][j] == '@') {
                    player.posX = i;
                    player.posY = j;
                }
            }
        }
    }*/

    fun inventory() {
        println("\n=== Estadisticas ===")
        println("${player.name}, Coordenadas: [ ${player.posX}, ${player.posY} ]")
        println("HP - [ ${player.maxHp} / ${player.hp} ]")
        println("DMG - ${player.dmg}")
        println("=== Inventario ===")
        if (player.potions > 1) {
            println("${player.potions} potions")
        } else if (player.potions == 1) {
            println("${player.potions} potion")
        }
        if (player.bombs > 1) {
            println("${player.bombs} bombs")
        } else if (player.bombs == 1) {
            println("${player.bombs} bomb")
        }
        if (player.map) {
            println("Map")
        }
        if (player.key) {
            println("Key")
        }
        if (player.sword) {
            println("Sword")
        }
        println()
    }

    fun enemySelection() {
        when (Map2[player.posX][player.posY]) {
            'G' -> {
                enemy.name = GoblinStats.name
                enemy.dmg = GoblinStats.dmg
                enemy.max_hp = GoblinStats.max_hp
                enemy.hp = GoblinStats.hp
            }

            'O' -> {
                enemy.name = OrcoStats.name
                enemy.dmg = OrcoStats.dmg
                enemy.max_hp = OrcoStats.max_hp
                enemy.hp = OrcoStats.hp
            }

            'T' -> {
                enemy.name = TrollStats.name
                enemy.dmg = TrollStats.dmg
                enemy.max_hp = TrollStats.max_hp
                enemy.hp = TrollStats.hp
            }

            'J' -> {
                enemy.name = JefeStats.name
                enemy.dmg = JefeStats.dmg
                enemy.max_hp = JefeStats.max_hp
                enemy.hp = JefeStats.hp
            }
        }
    }

    fun objetos() {
        when (Map2[player.posX][player.posY]) {
            'P' -> {
                println("\nhay una pocion en el suelo")
                println(" |    |")
                println("C|====| ")
                println(" |  º |")
                println(" '----'")
            }

            'B' -> {
                println("\nhay una bomba en el suelo")
                println("        ,--.!,")
                println("     __/   -*-")
                println("   ,d08b.  '|`")
                println("   0088MM")
                println("   `9MMP'")
            }

            'K' -> {
                println("\nhay una llave en el suelo")
                println("  8 8          ,o.   ")
                println(" d8o8azzzzzzzzd   b")
                println("               `o'")
            }

            'S' -> {
                println("\nhay una espada en el suelo")
                println("      . ________________")
                println("O|===| |________________>")
                println("      · ")
            }

            'E' -> {
                println("\nAcabas de encontrar un eggstereg")
                println("No hace nada, pero es divertido que me encuentres :D")
                println("~Si quieres ser el mas fuerte, deberas elegir un buen nombre~")
                println("                                                   ~Taratara~")
            }
        }
    }

    fun creditos() {
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
        println("===============================================================")
        println("=Si quieres volver a jugar, hay nombres reservados, que cambia=")
        println("=la experiencia, como (Ciego) y (SpeedRuner).                 =")
        println("===============================================================")
    }

    fun perdiste() {
        println("     .... NO! ...                  ... MNO! ...")
        println("   ..... MNO!! ...................... MNNOO! ...")
        println(" ..... MMNO! ......................... MNNOO!! .")
        println(".... MNOONNOO!   MMMMMMMMMMPPPOII!   MNNO!!!! .")
        println(" ... !O! NNO! MMMMMMMMMMMMMPPPOOOII!! NO! ....")
        println("    ...... ! MMMMMMMMMMMMMPPPPOOOOIII! ! ...")
        println("   ........ MMMMMMMMMMMMPPPPPOOOOOOII!! .....")
        println("   ........ MMMMMOOOOOOPPPPPPPPOOOOMII! ...  ")
        println("    ....... MMMMM..    OPPMMP    .,OMI! ....")
        println("     ...... MMMM::   o.,OPMP,.o   ::I!! ...")
        println("         .... NNM:::.,,OOPM!P,.::::!! ....")
        println("          .. MMNNNNNOOOOPMO!!IIPPO!!O! .....")
        println("         ... MMMMMNNNNOO:!!:!!IPPPPOO! ....")
        println("           .. MMMMMNNOOMMNNIIIPPPOO!! ......")
        println("          ...... MMMONNMMNNNIIIOO!..........")
        println("       ....... MN MOMMMNNNIIIIIO! OO ..........")
        println("    ......... MNO! IiiiiiiiiiiiI OOOO ...........")
        println("  ...... NNN.MNO! . O!!!!!!!!!O . OONO NO! ........")
        println("   .... MNNNNNO! ...OOOOOOOOOOO .  MMNNON!........")
        println("   ...... MNNNNO! .. PPPPPPPPP .. MMNON!........")
        println("      ...... OO! ................. ON! .......")
        println("         ................................")
        println()
        println("88888888ba                                88 88                               ")
        println("88      '8b                               88 ''                               ")
        println("88      ,8P                               88                88                ")
        println("88aaaaaa8P' ,adPPYba, 8b,dPPYba,  ,adPPYb,88 88 ,adPPYba, MM88MMM ,adPPYba,   ")
        println("88'''''''  a8P_____88 88P'   'Y8 a8''    `Y88 88 I8[    ''  88   a8P_____88   ")
        println("88         8PP''''''' 88         8b       88 88  `'Y8ba,    88   8PP'''''''   ")
        println("88         '8b, , aa  88         '8a,   ,d88 88 aa    ]8I   88,  '8b, , aa    ")
        println("88          `'Ybbd8'' 88          `'8bbdP'Y8 88 `'YbbdP''   'Y888 `'Ybbd8''   ")
        println("\n\n\n")
        creditos()
    }

    fun help() {
        println("Los controles son:")
        println("\n- go north-->arriba")
        println("- go east-->derecha")
        println("- go south-->abajo")
        println("- go west-->izquierda")
        println("- pick sword/potion/boomb")
        println("- use sword/potion/boomb")
        println("- hit")
        println("- inventory/help")
        println("\nDatos general:")
        println("\nPara usar las pociones, has de estar en un combate")
        println("Las letras significan algo, si quieres saber lo que significa, descubrelo por tu parte.")
        println("El '@' significa donde estas tu, si escribes un comando erroneo, en el mapa no se te marcara")
        println("En esta versión hay un error, cuando estés en la puerta, ve con calma con los enter, para que no se te cierre el programa")
    }

    fun battle() {
        println("${enemy.name} ha atacado a ${player.name}, ${player.name} ha perdido ${enemy.dmg}HP")
        player.hp -= enemy.dmg
        println("\n[${player.name}] tiene [${player.hp}/${player.maxHp}]HP")
        println("\n[${enemy.name}] tiene [${enemy.hp}/${enemy.max_hp}]HP")
        println("\nque quieres hacer? Si no sabes que hacer, escribe help")
        val input = readLine()
        val splitInput = input?.split(" ")
        if (splitInput != null && splitInput.size > 0) {
            if (splitInput.size > 1) {
                if (splitInput[0] == "use" && splitInput.size == 2) {
                    when (splitInput[1]) {
                        "potion" -> {
                            if (player.potions > 0) {
                                player.potions--
                                println("\n has usado una pocion, recuperas 30 de hp")
                                player.hp += 30
                                if (player.hp > player.maxHp) {
                                    player.hp = player.maxHp
                                }
                                readLine()
                            } else {
                                println("\nNo tienes pociones")
                                readLine()
                            }
                        }

                        "bomb" -> {
                            if (player.bombs > 0) {
                                player.bombs--
                                println("\n has usado una bomba, ${enemy.name} ha perdido un 50 de hp")
                                enemy.hp -= 50
                                readLine()
                            } else {
                                println("\nNo tienes bombas")
                                readLine()
                            }
                        }

                        "sword" -> {
                            if (player.sword == true) {
                                println("\n has usado una espada, ${enemy.name} ha perdido ${player.dmg} de hp")
                                enemy.hp -= player.dmg
                                readLine()
                            } else {
                                println("\nNo tienes espada")
                                readLine()
                            }
                        }
                    }
                }
            }
        } else if (splitInput != null && splitInput.size == 1 && splitInput[0] == "hit") {
            println("Has atacado sin arma a ${enemy.name}, y ha perdido ${player.dmg} de hp")
            enemy.hp -= player.dmg
            readLine()
        } else if (splitInput != null && splitInput.size == 1 && splitInput[0] == "inventory") {
            inventory()
            readLine()
        } else {
            println("esto no es un comando")
            readLine()
        }
    }

    fun mapCollision(posX: Int, posY: Int): Boolean {
        var returnCollision = false
        val input: MutableList<String> = mutableListOf()
        var playerInput = ""
        if (posX < 0 || posX >= 10 || posY < 0 || posY >= 10) {
            returnCollision = true
        } else if (Map1[posX][posY] == '#') {
            returnCollision = true
        } else if (Map1[posX][posY] == 'L') {
            println("\nLa puerta esta cerrada, que quieres hacer?\n")
            readLine()
            //input.addAll(playerInput?.split(" "))
            if (input[0] == "use" && input[1] == "key" && player.key == true) {
                player.key == true
                println("\n== Usaste 1 llave para abrir la puerta. ==\nLLaves disponibles en el inventario: 0.\n")
            } else {
                println("\nUsa la llave para abrir la puerta.\n\n")
                returnCollision = true
            }
        }
        return returnCollision
    }

    fun main() {
        initPlayer()
        var nameConfirm = 0;
        var gameOver : Boolean = false;

        while (nameConfirm != 1) {
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
            readLine()
            player.name
            nameConfirm = 1
        }
        println("\n")

        when (player.name) {
            "Saitama" -> {
                player.hp = 1000
                player.map = true
                player.dmg = 1000
            }
            "SpeedRuner" -> {
                player.hp = 55
                player.map = true
                player.key = true
                player.potions = 2
                player.bombs = 1
                player.dmg = 10
            }
            "Ciego" -> {
                player.hp = 100
                player.map = false
                player.dmg = 20
            }
        }
        while (!gameOver) {
            while (Map2[player.posX][player.posY] != 'G' && Map2[player.posX][player.posY] != 'T' && Map2[player.posX][player.posY] != 'O'
                    && Map2[player.posX][player.posY] != 'J') {
                if (player.map) {
                    mapa()
                }
                objetos()
                print("\nque quieres hacer??")
                readLine()
                val split_input = input.split(" ")
                if (split_input.size > 0) {
                    if (split_input.size > 1) {
                        if (split_input[0] == "go" && split_input.size == 2) {
                            if (split_input[1] == "north") {
                                if (Map1[player.posX - 1][player.posY] != '#' && player.posX - 1 >= 0 && !mapCollision(player.posX - 1, player.posY)) {
                                    Map2[player.posX][player.posY] = Map2[player.posX][player.posY]
                                    player.posX--
                                    println("${player.name} has ido al norte")
                                    Map1[player.posX][player.posY] = '@'

                                } else {
                                    println("\nNo puedes acceder a esta zona")
                                    readLine()
                                }
                            } else if (split_input[1] == "south") {
                                if (Map1[player.posX + 1][player.posY] != '#' && player.posX + 1 <= 9 && !mapCollision(player.posX + 1, player.posY)) {
                                    Map1[player.posX][player.posY] = Map2[player.posX][player.posY]
                                    player.posX++
                                    println("${player.name} has ido al sur")
                                    Map2[player.posX][player.posY] = '@'
                                    readLine()
                                } else {
                                    println("\nNo puedes acceder a esta zona")
                                    readLine()
                                }
                            } else if (split_input[1] == "east") {
                                if (Map2[player.posX][player.posY + 1] != '#' && player.posY + 1 <= 9 && !mapCollision(player.posX, player.posY + 1)) {
                                    Map2[player.posX][player.posY] = Map2[player.posX][player.posY]
                                    player.posY++
                                    println("${player.name} has ido al este")
                                    Map2[player.posX][player.posY] = '@'
                                    readLine()
                                } else {
                                    println("\nNo puedes acceder a esta zona")
                                    readLine()
                                }
                            } else if (split_input[1] == "west") {
                                if (Map1[player.posX][player.posY - 1] != '#' && !mapCollision(player.posX, player.posY - 1)) {
                                    Map1[player.posX][player.posY] = Map2[player.posX][player.posY]
                                    player.posY--
                                    println("${player.name} ha ido al oeste")
                                    Map1[player.posX][player.posY] = '@'
                                    readLine()
                                } else {
                                    println("\nNo puedes acceder a esta zona")
                                    readLine()
                                }
                            } else {
                                println("¿A dónde quieres ir?")
                                readLine()
                            }
                        } else if (split_input[0] == "pick" && split_input.size == 2) {
                            if (split_input[1] == "potion" && Map2[player.posX][player.posY] == 'P') {
                                player.potions++
                                Map2[player.posX][player.posY] = '.'
                                println("${player.name} ha recogido una poción")
                                readLine()
                            } else if (split_input[1] == "potion" && Map2[player.posX][player.posY] != 'P') {
                                println("No hay ninguna poción en este cuadrante")
                                readLine()
                            }
                            if (split_input[1] == "bomb" && Map2[player.posX][player.posY] == 'B') {
                                player.bombs++
                                Map2[player.posX][player.posY] = '.'
                                println("${player.name} ha recogido una bomba")
                                readLine()
                            } else if (split_input[1] == "bomb" && Map2[player.posX][player.posY] != 'B') {
                                println("No hay ninguna bomba en este cuadrante")
                                readLine()
                            }
                            if (split_input[1] == "sword" && Map2[player.posX][player.posY] == 'S') {
                                Map2[player.posX][player.posY] = '.'
                                println("${player.name} ha recogido una espada, tu daño base ha sumado 15 dmg")
                                player.dmg = player.dmg + 15
                                player.sword = true
                                readLine()
                            } else if (split_input[1] == "sword" && Map2[player.posX][player.posY] != 'S') {
                                println("La espada no está en este cuadrante")
                                readLine()
                            }
                            if (split_input[1] == "key" && Map2[player.posX][player.posY] == 'K') {
                                Map2[player.posX][player.posY] = '.'
                                println("${player.name} ha recogido una llave")
                                player.key = true
                                readLine()
                            } else if (split_input[1] == "key" && Map2[player.posX][player.posY] != 'K') {
                                println("En este cuadrante no hay ninguna llave")
                                readLine()
                            }
                        } else if (split_input[0] == "use" && split_input.size == 2) {
                            if (split_input[1] == "potion" && player.potions > 0) {
                                player.potions--
                                player.hp += 30
                                if (player.hp > player.maxHp) {
                                    player.hp = player.maxHp
                                }
                                println("${player.name} ha tomado una pocion, que te cura un 30 de hp")
                            } else if (split_input[1] == "potion" && player.potions <= 0) {
                                println("No puedes tomar aire")
                            } else if (split_input[1] == "bomb" && player.bombs > 0) {
                                println("No hay nadie aqui, te quieres matarte? Si es asi, no puedes")
                            } else if (split_input[1] == "bomb" && player.bombs <= 0) {
                                println("F, no tienes ni una")
                            } else if (split_input[1] == "sword" && player.sword == true) {
                                println("No hay nadie para matar")
                            } else if (split_input[1] == "sword" && player.sword == false) {
                                println("no hiciste nada, porque no tienes espada")
                            }
                        } else if (split_input[1] == "key" && player.key == true) {
                            if (Map1[player.posX - 1][player.posY] == 'L') {
                                println("Has abierto una puerta magica")
                                Map1[player.posX - 1][player.posY] = '.'
                                Map2[player.posX - 1][player.posY] = '.'
                                player.key = false
                            } else if (Map1[player.posX + 1][player.posY] == 'L') {
                                println("Has abierto una puerta magica")
                                Map1[player.posX + 1][player.posY] = '.'
                                Map2[player.posX + 1][player.posY] = '.'
                                player.key = false
                            } else if (Map1[player.posX][player.posY + 1] == 'L') {
                                println("Has abierto una puerta magica")
                                Map1[player.posX][player.posY + 1] = '.'
                                Map2[player.posX][player.posY + 1] = '.'
                                player.key = false
                            } else if (Map1[player.posX][player.posY - 1] == 'L') {
                                println("Has abierto una puerta magica")
                                Map1[player.posX][player.posY - 1] = '.'
                                Map2[player.posX][player.posY - 1] = '.'
                                player.key = false
                            } else {
                                println("No hay nada en lo que usar una llave...")
                            }
                        } else if (split_input[1] == "key" && player.key == false) {
                            println("No tienes ninguna llave...")
                        } else {
                            println("Que quieres usar?")
                        }

                    } else {
                        println("esto no es un comando")
                        readLine()
                    }
                } else if (split_input.size == 1 && split_input[0] == "help") {
                    help()
                    readLine()
                } else if (split_input.size == 1 && split_input[0] == "inventory") {
                    inventory()
                    readLine()
                } else {
                    println("esto no es un comando")
                    readLine()
                }
            } //aqui deberia de haver un else
                println("escribe un comando")
                readLine()
            }
        if (Map2[player.posX][player.posY] == 'G' || Map2[player.posX][player.posY] == 'T'
                || Map2[player.posX][player.posY] == 'O' || Map2[player.posX][player.posY] == 'J') {
            enemySelection()
            if (Map2[player.posX][player.posY] == 'J') {
                println("=== ${enemy.name} te desafia! ===")
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
            } else {
                println("=== ${enemy.name} te desafia! ===")
            }
            readLine()

            while (enemy.hp > 0 && player.hp > 0) {
                battle()
            }
            if (player.hp <= 0) {
                gameOver = true
                perdiste()
                readLine()
            } else if (enemy.name == "BOSS" && enemy.hp <= 0) {
                Map2[player.posX][player.posY] = '.'
                println("\nhas derrotado al ${enemy.name}")
                readLine()
                clearScreen()
                gameOver = true
            } else if (enemy.name != "BOSS" && enemy.hp <= 0) {
                Map2[player.posX][player.posY] = '.'
                println("\nhas derrotado a ${enemy.name}")
                readLine()
                clearScreen()
            }
        }
        if (player.hp > 0) {
            println("\nHas completado el juego! ${player.name}")
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
            println("\n...")
        }
    }
}
