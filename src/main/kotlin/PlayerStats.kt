class PlayerStats(
        val name: String,
        val playerIcon: Char = '@',
        val maxHp: Int = 100,
        var hp: Int = 100,
        var dmg: Int = 5,
        var posX: Int = 1,
        var posY: Int = 1,
        var potions: Int = 0,
        var bombs: Int = 0,
        var key: Boolean = false,
        var map: Boolean = true,
        var sword: Boolean = false
)