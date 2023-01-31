fun main() {
    Visual().enti()
    var nameConfirm = 0
    val player = PlayerStats("player")
    while (nameConfirm != 1) {
        Visual().presentation(player)
        nameConfirm = 1
    }
    player.mainLoop(player)
}