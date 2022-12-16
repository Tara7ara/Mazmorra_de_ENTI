class PlayerStats(
    val name: String,
    val playerIcon: Char = '@',
    val maxHp: Int = 100,
    var hp: Int = 100,
    val dmg: Int = 5,
    var posX: Int = 1,
    var posY: Int = 1,
    var potions: Int = 0,
    var bombs: Int = 0,
    var hasKey: Boolean = false,
    var hasMap: Boolean = true,
    var hasSword: Boolean = false
){
    fun heal(amount: Int) {
        hp += amount
        if (hp > maxHp) {
            hp = maxHp
        }
    }
    //para usarlo --> player.heal(10)
}