    object MapFun {
        // printMap() es una función que imprime el contenido del arreglo bigMap.
        fun printMap() {
            for (fila in bigMap) {
                for (character in fila) {
                    print(" $character ")
                }
                println(" ")
            }
        }

        //Checkeo de la casilla en la cual estas y actuar de x manera dependiendo de la casilla
        fun checkbox(player: PlayerStats) {
            if (bigMap[player.posX][player.posY] == 'P') {
                Visual.asciiPotion()
                val response = readLine()
                if (response != "no") {
                    player.potion++
                }
            } else if (bigMap[player.posX][player.posY] == 'B') {
                Visual.asciiBomb()
                val response = readLine()
                if (response != "no") {
                    player.bomb++
                }
            } else if (bigMap[player.posX][player.posY] == 'S') {
                Visual.asciiSword()
                val response = readLine()
                if (response != "no") {
                    player.sword = true
                }
            } else if (bigMap[player.posX][player.posY] == 'A') {
                Visual.asciiGun()
                val response = readLine()
                if (response != "no") {
                    player.gun = true
                }
            } else if (bigMap[player.posX][player.posY] == 'K') {
                Visual.asciiKey()
                val response = readLine()
                if (response != "no") {
                    player.key = true
                }
            } else if (bigMap[player.posX][player.posY] == 'T') {
                Visual.asciiTroll()
                Thread.sleep(1000)
                val enemyStats = EnemyStats("troll")
                enemyStats.combat("troll", player, enemyStats)
            } else if (bigMap[player.posX][player.posY] == 'G') {
                Visual.asciiGoblin()
                Thread.sleep(1000)
                val enemyStats = EnemyStats("goblin")
                enemyStats.combat("goblin", player, enemyStats)
            } else if (bigMap[player.posX][player.posY] == 'O') {
                Visual.asciiOrc()
                Thread.sleep(1000)
                val enemyStats = EnemyStats("orc")
                enemyStats.combat("orc", player, enemyStats)
            } else if (bigMap[player.posX][player.posY] == 'J') {
                Visual.asciiDevilBoss()
                Thread.sleep(3000)
                val enemyStats = EnemyStats("devilBoss")
                enemyStats.combat("devilBoss", player, enemyStats)
            } else {
                bigMap[player.posX][player.posY] = '@'
            }
            bigMap[player.posX][player.posY] = '@'
            printMap()
        }

        //Funcion para "limpiar la consola"
        fun clearScreen() {
            for (i in 1..35) {
                println()
            }
        }
    }

    //Molaria que estuviera en un .txt para poder modificarlo ez
    //Mapa del juego
    val bigMap = arrayOf(
        charArrayOf('#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'),
        charArrayOf('#', '@', '.', '.', '.', '.', '.', 'T', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', 'K', 'P', '.', '#'),
        charArrayOf('#', '#', '#', '#', '#', '.', '.', '.', 'T', '.', 'P', '#', 'P', '#', 'G', '.', '.', 'P', '.', 'O', '.', 'O', '.', 'G', '.', '.', '.', 'T', '#'),
        charArrayOf('#', 'K', 'O', '.', '#', '#', '#', '#', '.', '.', '.', '#', 'P', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', 'P', '.', '.', '.', '#'),
        charArrayOf('#', 'O', 'O', '.', '.', '.', '.', '#', '#', '#', '#', '#', 'B', '#', '#', '#', '#', '#', '#', '#', '#', '#', '.', '.', '.', 'G', '.', 'O', '#'),
        charArrayOf('#', '#', '#', '#', '#', '.', '.', '.', 'G', '.', '.', '#', 'S', '#', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '#', '.', '.', '.', '#'),
        charArrayOf('#', '.', 'G', '.', '.', 'O', '.', '.', 'G', '.', '.', '#', '#', '#', '.', 'G', '.', 'O', '.', 'P', '.', '.', '.', '#', '#', '#', '#', 'D', '#'),
        charArrayOf('#', '.', 'T', '.', '.', '.', '.', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
        charArrayOf('#', '.', '.', '.', '#', '#', '#', '#', '.', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '.', '#'),
        charArrayOf('#', '#', '#', '#', '#', '.', '.', 'T', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', 'D', '#'),
        charArrayOf('#', '.', '.', '.', '#', 'G', '.', '.', '.', '.', '.', '.', 'T', '.', '.', '.', 'T', '.', '.', 'G', '.', '.', '.', '.', '#', '.', '#', '.', '#'),
        charArrayOf('#', '.', 'J', '.', '#', '.', 'P', '.', 'G', '.', 'O', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '.', '#', '.', '#'),
        charArrayOf('#', '.', '.', '#', '#', '.', '.', '.', '.', '.', '.', 'G', '.', '.', '.', 'P', '.', '.', '.', '.', '#', '#', '#', '.', '.', '.', '.', '.', '#'),
        charArrayOf('#', 'P', '.', '#', '.', '.', 'O', '.', 'T', '.', '.', '.', '.', 'O', '.', '.', '.', 'G', '.', '.', '#', '.', '.', '.', 'G', '.', '.', '.', '#'),
        charArrayOf('#', '.', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '.', 'G', '.', '.', '.', '.', 'O', '#'),
        charArrayOf('#', '.', '#', '#', '.', '.', '.', '.', '.', '.', '.', 'P', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '.', 'G', '.', '#'),
        charArrayOf('#', 'T', '#', '.', '.', '.', 'T', '.', 'G', '.', 'O', '.', '.', '.', 'T', '.', '.', '.', '#', '.', '.', 'O', '.', '.', 'T', '.', '.', '.', '#'),
        charArrayOf('#', 'O', '#', 'P', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', 'P', '.', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
        charArrayOf('#', 'G', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '.', '.', 'G', '.', '.', '.', '.', '#'),
        charArrayOf('#', 'A', '#', '#', '#', '#', '#', '#', '#', '#', '.', '#', '#', '#', '#', '#', '#', '#', '.', 'P', '.', '.', '.', '.', '.', 'O', '.', '.', '#'),
        charArrayOf('#', '.', '.', '.', '.', '.', '.', '#', '#', '#', '.', '#', '#', '#', 'G', '.', '.', '.', '.', '.', 'T', '.', '.', 'P', '.', '.', '.', '.', '#'),
        charArrayOf('#', '.', '.', '.', '.', 'T', '.', '#', '#', '#', '.', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
        charArrayOf('#', '.', 'O', 'G', '.', '.', '.', '#', '#', '#', 'B', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '.', '.', '.', '.', '.', '.', '#'),
        charArrayOf('#', '.', '.', '.', '.', '.', 'O', '.', '#', '#', 'P', '#', '#', '#', '#', '.', '.', '.', '#', '#', '#', '#', '#', '#', '#', '.', '.', 'O', '#'),
        charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '#', '#', 'P', '#', '#', '#', '.', '.', '.', '.', '.', 'P', '.', '.', '.', '#', '#', '#', '#', 'D', '#'),
        charArrayOf('#', '.', '.', 'T', 'P', '.', '.', '.', '#', '#', 'P', 'P', 'K', '#', '#', '.', 'T', '.', '.', '.', '.', '.', 'G', '.', '.', '.', '.', '.', '#'),
        charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '#', '#', '#', '.', '.', '.', '.', '.', 'O', '.', '.', '.', '.', '.', '.', '.', '.', '#'),
        charArrayOf('#', '.', '.', '.', '.', 'O', '.', '.', '.', '#', '#', '#', '#', '.', '.', 'G', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', 'O', '.', '#'),
        charArrayOf('#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', 'P', '.', '.', '.', '.', '.', '.', '.', '.', 'T', '.', '.', '.', '.', '.', '#'),
        charArrayOf('#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#')
    )