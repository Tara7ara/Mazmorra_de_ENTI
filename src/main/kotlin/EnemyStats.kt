//clase de enemy stats
class EnemyStats(type: String) {
    var enemyHp: Int = 0
    var enemyDmg: Int = 0
    var maxEnemyHp: Int = 0

    init {
        when (type) {
            "orc" -> {
                maxEnemyHp = 50
                enemyHp = 50
                enemyDmg = 15
            }
            "goblin" -> {
                maxEnemyHp = 30
                enemyHp = 30
                enemyDmg = 5
            }
            "troll" -> {
                maxEnemyHp = 20
                enemyHp = 20
                enemyDmg = 10
            }
            "devilBoss" -> {
                maxEnemyHp = 300
                enemyHp = 300
                enemyDmg = 20
            }
        }
    }
}