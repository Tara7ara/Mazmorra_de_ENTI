class EnemyMove {

    private val mapWidth = 29
    private val mapHeight = 29

    private val enemies = mutableListOf<EnemyStats>()

    fun EnemyCheck(){
        for (x in 0 until mapWidth) {
            for (y in 0 until mapHeight) {
                when (bigMap[x][y]) {
                    'O' -> {
                        val enemy = EnemyStats("orc")
                        enemy.x = x
                        enemy.y = y
                        enemies.add(enemy)
                    }
                    'T' -> {
                        val enemy = EnemyStats("troll")
                        enemy.x = x
                        enemy.y = y
                        enemies.add(enemy)
                    }
                    'G' -> {
                        val enemy = EnemyStats("goblin")
                        enemy.x = x
                        enemy.y = y
                        enemies.add(enemy)
                    }
                }
            }
        }
    }

    fun moveEnemies() {
        for (enemy in enemies) {
            val newX = enemy.x + (Math.random() * 2 - 1).toInt()
            val newY = enemy.y + (Math.random() * 2 - 1).toInt()

            if (isValidMove(newX, newY)) {
                bigMap[enemy.x][enemy.y] = '.'
                enemy.x = newX
                enemy.y = newY
                bigMap[enemy.x][enemy.y] = enemy.type[0]
            }
        }
    }


        fun isValidMove(newX: Int, newY: Int): Boolean {
        //Comprueba si la nueva posición está dentro de los límites del mapa
        if (newX < 0 || newX >= mapWidth || newY < 0 || newY >= mapHeight) {
            return false
        }
        //Comprueba si la nueva posición está ocupada por otro enemigo o un obstáculo
        for (otherEnemy in enemies) {
            if (otherEnemy.x == newX && otherEnemy.y == newY) {
                return false
            }
        }
        val player = PlayerStats("player")
        if (player.posX == newX && player.posY == newY) {
            return false
        }
        if (bigMap[newX][newY] in listOf('P', 'S', 'K', 'D', '#', 'B', 'A','J')) {
            return false
        }
        //Para asegurarme
        if (bigMap[newX][newY] in listOf('O', 'T', 'G')) {
            return false
        }
        return true
    }
}