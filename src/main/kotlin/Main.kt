fun main() {
    var nameConfirm = 0
    val player = PlayerStats("player")
    while (nameConfirm != 1) {
        presentation(player)
        nameConfirm = 1
    }
    initPlayer()
    mainLoop(player)
}

//Funcion para "limpiar la consola"
fun clearScreen() {
    for (i in 1..35) {
        println()
    }
}