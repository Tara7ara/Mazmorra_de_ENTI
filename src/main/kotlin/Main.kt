fun main() {
    var nameConfirm = 0
    val player = PlayerStats("player")
    while (nameConfirm != 1) {
        Visual.presentation(player)
        nameConfirm = 1
    }
    player.initPlayer()
    player.mainLoop(player)
}