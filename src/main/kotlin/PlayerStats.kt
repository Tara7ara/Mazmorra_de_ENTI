//Los stats del Player
class PlayerStats (var name: String,
                   var posX: Int = 1,
                   var posY: Int = 1,
                   val maxHp: Int = 100,
                   var hp: Int = 100,
                   var dmg: Int = 999,
                   var potion: Int = 0,
                   var bomb: Int = 0,
                   var key: Boolean = false,
                   var sword: Boolean = false,
                   var gun: Boolean = false)