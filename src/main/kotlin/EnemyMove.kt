class EnemyMove {
/*
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
 */
//    val enemy = EnemyStats('enemy')//, private val bigMap: Array<CharArray>
/*fun move(enemy: EnemyStats) {
    if (bigMap[enemy.posX][enemy.posY] == 'T') {
        val possibleMoves = mutableListOf<Pair<Int, Int>>()
        if (enemy.posX > 0 && bigMap[enemy.posX - 1][enemy.posY] != '#' && bigMap[enemy.posX - 1][enemy.posY] != 'D') {
            possibleMoves.add(Pair(enemy.posX - 1, enemy.posY))
        }
        if (enemy.posX < bigMap.size - 1 && bigMap[enemy.posX + 1][enemy.posY] != '#' && bigMap[enemy.posX + 1][enemy.posY] != 'D') {
            possibleMoves.add(Pair(enemy.posX + 1, enemy.posY))
        }
        if (enemy.posY > 0 && bigMap[enemy.posX][enemy.posY - 1] != '#' && bigMap[enemy.posX][enemy.posY - 1] != 'D') {
            possibleMoves.add(Pair(enemy.posX, enemy.posY - 1))
        }
        if (enemy.posY < bigMap[0].size - 1 && bigMap[enemy.posX][enemy.posY + 1] != '#' && bigMap[enemy.posX][enemy.posY + 1] != 'D') {
            possibleMoves.add(Pair(enemy.posX, enemy.posY + 1))
        }
        if (possibleMoves.isNotEmpty()) {
            val nextPos = possibleMoves[(Math.random() * possibleMoves.size).toInt()]
            bigMap[enemy.posX][enemy.posY] = '.'
            enemy.posX = nextPos.first
            enemy.posY = nextPos.second
            bigMap[enemy.posX][enemy.posY] = 'T'
        }
    }
}
 */

    fun canMove(currentX: Int, currentY: Int, nextX: Int, nextY: Int, bigMap: Array<CharArray>): Boolean {
        val blockedChars = setOf('#', 'D', 'P', 'S', 'A', 'B', 'K', 'J')
        if (nextX < 0 || nextX >= bigMap.size || nextY < 0 || nextY >= bigMap[0].size) {
            return false  // Se sale del mapa
        }
        if (bigMap[nextX][nextY] in blockedChars) {
            return false  // La posición está bloqueada
        }
        return true  // La posición está libre
    }

}