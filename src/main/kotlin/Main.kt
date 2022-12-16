
fun main(args: Array<String>) {

    //DE MOMENT TOT EL CODI ES FARA EN EL MAIN I DESPRES HO SEPARARE EN CLASES

    val Map1 = arrayOf(
        charArrayOf('#', '#', '#', '#', '#', '#', '#', '#', '#', '#'),
        charArrayOf('#', '@', '.', 'P', '.', '.', '.', '.', '#', '#'),
        charArrayOf('#', '#', '.', 'G', '#', 'B', '#', '.', '.', '#'),
        charArrayOf('#', '.', '.', '.', '.', '#', '#', '#', '.', '#'),
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
        charArrayOf('#', '.', '.', '.', '.', '#', '#', '#', '.', '#'),
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
    //val orco = OrcoStats("orco")
    //val troll = TrollStats("troll")
    //val jefe = JefeStats("jefe")
    val enemy = EnemyTransport()

    fun mapa() {
        for (auxiliar in 0 .. 10) {
            for (i in 0 .. 10) {
                print("${Map1[auxiliar][i]} ")
            }
            println()
        }
        Map1[player.posX][player.posY] = '.'
    }

    fun inventory() {
        //CREAR UNA FUNCION PARA IMPRIMIR MUCHOS /n
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
        //if (player.map) {
       //     println("Map")
       // }
        //if (player.key) {
        //    println("Key")
        //}
       // if (player.sword) {
        //    println("Sword")
        //}
        //println()
    }


}



