import MapFunGeneration.map
//Los stats del Player
open class PlayerStats (var name: String,
                   var posX: Int = 1,
                   var posY: Int = 1,
                   val maxHp: Int = 100,
                   var hp: Int = 100,
                   var dmg: Int = 5,
                   var potion: Int = 0,
                   var bomb: Int = 0,
                   var key: Boolean = false,
                   var sword: Boolean = false,
                   var gun: Boolean = false){

    //funcion para hacer una cosa estetica en la presentacion
    fun printEqual(name: String): String {
        var equal = ""
        for (i in 1..name.length) {
            equal += "="
        }
        return equal
    }

    //funcion para ver el inventario, esta en player stats porque es lo que usa el player
    private fun inventory(player: PlayerStats){
        println("\n=== Estadisticas ===")
        println("Name: ${player.name}, Coordenadas: [ ${player.posX}, ${player.posY} ]")
        println("HP - [ ${player.hp} / ${player.maxHp} ]")
        println("DMG - ${player.dmg}")
        println("=== Inventario ===")
        println("Tienes ${player.potion} pociones")
        println("Tienes ${player.bomb} bombas")
        if (player.sword){
            println("Tienes la Espada, que te suma tu dmg +25")
        }
        if (player.gun){
            println("Tienes la Pistola, que te suma tu dmg +50")
        }
        if (player.key){
            println("Tienes la llave")
        }
        println()
        Thread.sleep(2000)
        MapFunGeneration.printMap()
    }

    //Funcion para beber una pocion, lo mismo que antes, como lo usa el player esta aqui
    fun usePotion(player: PlayerStats){
        if (player.potion > 0){
            if (player.hp == player.maxHp) {
                println("Ya tienes la vida máxima, no necesitas consumir una poción.")
            } else {
                if (player.hp + 50 > player.maxHp) {
                    println("Te has curado hasta el maximo de vida")
                    player.hp = player.maxHp
                    println("Tu vida actual queda en ${player.hp}")
                } else {
                    println("Te has curado 50 de vida")
                    player.hp += 50
                    println("Tu vida actual queda en ${player.hp}")
                }
                player.potion--
            }
        } else {
            println("No tienes pociones")
        }
    }

    //Funcion para abrir la puerta mas cercana, lo mismo que antes, como lo usa el player esta aqui
    private fun openDor(player: PlayerStats){
        if (player.key){
            var doorFound = false
            val minX = if (player.posX-2 < 0) 0 else player.posX-2
            val maxX = if (player.posX+2 > map.size - 1) map.size - 1 else player.posX+2
            val minY = if (player.posY-2 < 0) 0 else player.posY-2
            val maxY = if (player.posY+2 > map[0].size - 1) map[0].size - 1 else player.posY+2
            for (i in minX..maxX) {
                for (j in minY..maxY) {
                    if (map[i][j] == 'D') {
                        map[i][j] = '.'
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
            MapFunGeneration.printMap()
        } else {
            println("No tienes la llave")
        }
    }

    //Bucle principal (movimiento, etc.), esta aqui porque es lo que usa el player
    fun mainLoop(player: PlayerStats){
        while (true) {
            println("Que quieres hacer? (w, a, s, d)")
            when (readLine()) {
                "w" -> {//go north

                    if (player.posX > 0 && map[player.posX - 1][player.posY] != '#' && map[player.posX - 1][player.posY] != 'D') {
                        MapFunGeneration.clearScreen()
                        map[player.posX][player.posY] = '.'
                        player.posX--
                        MapFunGeneration.checkbox(player)
                    }else{
                        println("RECUERDA: #=limite del muro, D=puerta, si quieres abrir escribe 'k' teniendo la key en el inventario")
                    }
                }

                "s" -> {//go south
                    if (player.posX < map.size - 1 && map[player.posX + 1][player.posY] != '#' && map[player.posX + 1][player.posY] != 'D') {
                        MapFunGeneration.clearScreen()
                        map[player.posX][player.posY] = '.'
                        player.posX++
                        MapFunGeneration.checkbox(player)
                    }else{
                        println("RECUERDA: #=limite del muro, D=puerta, si quieres abrir escribe 'k' teniendo la key en el inventario")
                    }
                }

                "d" -> {//go east
                    if (player.posY < map[0].size - 1 && map[player.posX][player.posY + 1] != '#'&& map[player.posX][player.posY + 1] != 'D') {
                        MapFunGeneration.clearScreen()
                        map[player.posX][player.posY] = '.'
                        player.posY++
                        MapFunGeneration.checkbox(player)
                    }else{
                        println("RECUERDA: #=limite del muro, D=puerta, si quieres abrir escribe 'k' teniendo la key en el inventario")
                    }
                }

                "a" -> {//go west
                    if (player.posY > 0 && map[player.posX][player.posY - 1] != '#' && map[player.posX][player.posY - 1] != 'D') {
                        MapFunGeneration.clearScreen()
                        map[player.posX][player.posY] = '.'
                        player.posY--
                        MapFunGeneration.checkbox(player)
                    }else{
                        println("RECUERDA: #=limite del muro, D=puerta, si quieres abrir escribe 'k' teniendo la key en el inventario")
                    }
                }

                "h" -> {
                    MapFunGeneration.clearScreen()
                    usePotion(player)
                    MapFunGeneration.printMap()                }

                "k" -> {
                    openDor(player)
                }

                "help" -> {
                    MapFunGeneration.clearScreen()
                    Visual().showHelp()
                }

                "i" -> {
                    MapFunGeneration.clearScreen()
                    player.inventory(player)
                }
            }
        }
    }
}