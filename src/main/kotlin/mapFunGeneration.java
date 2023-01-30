import java.util.Scanner;

//ARCHIVO EN JAVA
public class mapFunGeneration {

    //Mapa del juego
    static char[][] bigMap = new char[][]{
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '@', '.', '.', '.', '.', '.', 'T', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', 'K', 'P', '.', '#'},
            {'#', '#', '#', '#', '#', '.', '.', '.', 'T', '.', 'P', '#', 'P', '#', 'G', '.', '.', 'P', '.', 'O', '.', 'O', '.', 'G', '.', '.', '.', 'T', '#'},
            {'#', 'K', 'O', '.', '#', '#', '#', '#', '.', '.', '.', '#', 'P', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', 'P', '.', '.', '.', '#'},
            {'#', 'O', 'O', '.', '.', '.', '.', '#', '#', '#', '#', '#', 'B', '#', '#', '#', '#', '#', '#', '#', '#', '#', '.', '.', '.', 'G', '.', 'O', '#'},
            {'#', '#', '#', '#', '#', '.', '.', '.', 'G', '.', '.', '#', 'S', '#', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '#', '.', '.', '.', '#'},
            {'#', '.', 'G', '.', '.', 'O', '.', '.', 'G', '.', '.', '#', '#', '#', '.', 'G', '.', 'O', '.', 'P', '.', '.', '.', '#', '#', '#', '#', 'D', '#'},
            {'#', '.', 'T', '.', '.', '.', '.', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'},
            {'#', '.', '.', '.', '#', '#', '#', '#', '.', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '.', '#'},
            {'#', '#', '#', '#', '#', '.', '.', 'T', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', 'D', '#'},
            {'#', '.', '.', '.', '#', 'G', '.', '.', '.', '.', '.', '.', 'T', '.', '.', '.', 'T', '.', '.', 'G', '.', '.', '.', '.', '#', '.', '#', '.', '#'},
            {'#', '.', 'J', '.', '#', '.', 'P', '.', 'G', '.', 'O', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '.', '#', '.', '#'},
            {'#', '.', '.', '#', '#', '.', '.', '.', '.', '.', '.', 'G', '.', '.', '.', 'P', '.', '.', '.', '.', '#', '#', '#', '.', '.', '.', '.', '.', '#'},
            {'#', 'P', '.', '#', '.', '.', 'O', '.', 'T', '.', '.', '.', '.', 'O', '.', '.', '.', 'G', '.', '.', '#', '.', '.', '.', 'G', '.', '.', '.', '#'},
            {'#', '.', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '.', 'G', '.', '.', '.', '.', 'O', '#'},
            {'#', '.', '#', '#', '.', '.', '.', '.', '.', '.', '.', 'P', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '.', 'G', '.', '#'},
            {'#', 'T', '#', '.', '.', '.', 'T', '.', 'G', '.', 'O', '.', '.', '.', 'T', '.', '.', '.', '#', '.', '.', 'O', '.', '.', 'T', '.', '.', '.', '#'},
            {'#', 'O', '#', 'P', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', 'P', '.', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'},
            {'#', 'G', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '.', '.', 'G', '.', '.', '.', '.', '#'},
            {'#', 'A', '#', '#', '#', '#', '#', '#', '#', '#', '.', '#', '#', '#', '#', '#', '#', '#', '.', 'P', '.', '.', '.', '.', '.', 'O', '.', '.', '#'},
            {'#', '.', '.', '.', '.', '.', '.', '#', '#', '#', '.', '#', '#', '#', 'G', '.', '.', '.', '.', '.', 'T', '.', '.', 'P', '.', '.', '.', '.', '#'},
            {'#', '.', '.', '.', '.', 'T', '.', '#', '#', '#', '.', '#', '#', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'},
            {'#', '.', 'O', 'G', '.', '.', '.', '#', '#', '#', 'B', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '.', '.', '.', '.', '.', '.', '#'},
            {'#', '.', '.', '.', '.', '.', 'O', '.', '#', '#', 'P', '#', '#', '#', '#', '.', '.', '.', '#', '#', '#', '#', '#', '#', '#', '.', '.', 'O', '#'},
            {'#', '.', '.', '.', '.', '.', '.', '.', '#', '#', 'P', '#', '#', '#', '.', '.', '.', '.', '.', 'P', '.', '.', '.', '#', '#', '#', '#', 'D', '#'},
            {'#', '.', '.', 'T', 'P', '.', '.', '.', '#', '#', 'P', 'P', 'K', '#', '#', '.', 'T', '.', '.', '.', '.', '.', 'G', '.', '.', '.', '.', '.', '#'},
            {'#', '.', '.', '.', '.', '.', '.', '.', '#', '#', '#', '#', '#', '#', '.', '.', '.', '.', '.', 'O', '.', '.', '.', '.', '.', '.', '.', '.', '#'},
            {'#', '.', '.', '.', '.', 'O', '.', '.', '.', '#', '#', '#', '#', '.', '.', 'G', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', 'O', '.', '#'},
            {'#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', 'P', '.', '.', '.', '.', '.', '.', '.', '.', 'T', '.', '.', '.', '.', '.', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
    };

    // printMap() es una función que imprime el contenido del arreglo bigMap.
    static void printMap() {
        for (char[] fila : bigMap) {
            for (char character : fila) {
                System.out.print(" " + character + " ");
            }
            System.out.println();
        }
    }

    //Funcion para limpiar la consola
    public static void clearScreen() {
        for (int i = 1; i <= 35; i++) {
            System.out.println();
        }
    }

    //Checkeo de la casilla en la cual estas y actuar de x manera dependiendo de la casilla
    public static void checkbox(PlayerStats player) {
        Visual visual = new Visual();
            if (bigMap[player.getPosX()][player.getPosY()] == 'P') {
                visual.asciiPotion();
                Scanner scanner = new Scanner(System.in);
                String response = scanner.nextLine();
                if (!response.equals("no")) {
                    player.setPotion(player.getPotion() + 1);
                }
            } else if (bigMap[player.getPosX()][player.getPosY()] == 'B') {
                visual.asciiBomb();
                Scanner scanner = new Scanner(System.in);
                String response = scanner.nextLine();
                if (!response.equals("no")) {
                    player.setBomb(player.getBomb() + 1);
                }
            } else if (bigMap[player.getPosX()][player.getPosY()] == 'S') {
                visual.asciiSword();
                Scanner scanner = new Scanner(System.in);
                String response = scanner.nextLine();
                if (!response.equals("no")) {
                    player.setSword(true);
                }
            } else if (bigMap[player.getPosX()][player.getPosY()] == 'A') {
                visual.asciiGun();
                Scanner scanner = new Scanner(System.in);
                String response = scanner.nextLine();
                if (!response.equals("no")) {
                    player.setGun(true);
                }
            } else if (bigMap[player.getPosX()][player.getPosY()] == 'K') {
                visual.asciiKey();
                Scanner scanner = new Scanner(System.in);
                String response = scanner.nextLine();
                if (!response.equals("no")) {
                    player.setKey(true);
                }
            } else if (bigMap[player.getPosX()][player.getPosY()] == 'T') {
                visual.asciiTroll();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                EnemyStats enemyStats = new EnemyStats("troll");
                enemyStats.combat("troll", player, enemyStats);
            } else if (bigMap[player.getPosX()][player.getPosY()] == 'G') {
                visual.asciiGoblin();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                EnemyStats enemyStats = new EnemyStats("goblin");
                enemyStats.combat("goblin", player, enemyStats);
            } else if (bigMap[player.getPosX()][player.getPosY()] == 'O') {
                visual.asciiOrc();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                EnemyStats enemyStats = new EnemyStats("orc");
                enemyStats.combat("orc", player, enemyStats);
            }else if (bigMap[player.getPosX()][player.getPosY()] == 'J') {
                visual.asciiDevilBoss();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                EnemyStats enemyStats = new EnemyStats("devilBoss");
                enemyStats.combat("devilBoss", player, enemyStats);
            }
            else {
                bigMap[player.getPosX()][player.getPosY()] = '@';
            }
        bigMap[player.getPosX()][player.getPosY()] = '@';
        printMap();
    }

}

