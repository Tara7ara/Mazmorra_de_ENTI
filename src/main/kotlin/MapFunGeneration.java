import java.util.Scanner;

//ARCHIVO EN JAVA
public class MapFunGeneration {

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

    static char[][] smallMap = new char[][]{
            {'#','#','#','#','#','#','#','#','#','#'},
            {'#','@','.','.','.','P','.','.','.','#'},
            {'#','#','#','G','#','S','#','#','#','#'},
            {'#','.','.','.','#','#','#','P','P','#'},
            {'#','.','T','.','#','J','#','.','B','#'},
            {'#','.','.','.','#','.','#','.','.','#'},
            {'#','#','.','#','#','L','#','T','T','#'},
            {'#','P','G','.','.','O','#','.','.','#'},
            {'#','.','.','.','.','K','.','.','B','#'},
            {'#','#','#','#','#','#','#','#','#','#'}
    };

    static char[][] cyberMap = new char[][]{
            {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'},
            {'#','@','i','q','j','r','e','y','t','a','m','g','b','l','p','#'},
            {'#','A','P','P','P','P','P','P','P','P','P','P','P','P','P','#'},
            {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'}
    };

    public static char[][] map = new char[0][0];

    public static void dificult(){
        Scanner scan = new Scanner(System.in);
        String dificultGame;
        label:
        while (true) {
            dificultGame = scan.nextLine();
            switch (dificultGame) {
                case "ez":
                    map = MapFunGeneration.smallMap;
                    break label;
                case "hard":
                    map = MapFunGeneration.bigMap;
                    break label;
                case "cyber":
                    map = MapFunGeneration.cyberMap;
                    break label;
                default:
                    System.out.println("Por favor, seleccione una dificultad válida (ez/hard)");
                    break;
            }
        }
    }

    // printMap() es una función que imprime el contenido del arreglo bigMap.
    static void printMap() {
        for (char[] fila : map) {
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
            if (map[player.getPosX()][player.getPosY()] == 'P') {
                visual.asciiPotion();
                Scanner scanner = new Scanner(System.in);
                String response = scanner.nextLine();
                if (!response.equals("no")) {
                    player.setPotion(player.getPotion() + 1);
                }
            } else if (map[player.getPosX()][player.getPosY()] == 'B') {
                visual.asciiBomb();
                Scanner scanner = new Scanner(System.in);
                String response = scanner.nextLine();
                if (!response.equals("no")) {
                    player.setBomb(player.getBomb() + 1);
                }
            } else if (map[player.getPosX()][player.getPosY()] == 'S') {
                visual.asciiSword();
                Scanner scanner = new Scanner(System.in);
                String response = scanner.nextLine();
                if (!response.equals("no")) {
                    player.setSword(true);
                }
            } else if (map[player.getPosX()][player.getPosY()] == 'A') {
                visual.asciiGun();
                Scanner scanner = new Scanner(System.in);
                String response = scanner.nextLine();
                if (!response.equals("no")) {
                    player.setGun(true);
                }
            } else if (map[player.getPosX()][player.getPosY()] == 'K') {
                visual.asciiKey();
                Scanner scanner = new Scanner(System.in);
                String response = scanner.nextLine();
                if (!response.equals("no")) {
                    player.setKey(true);
                }
            } else if (map[player.getPosX()][player.getPosY()] == 'T') {
                visual.asciiTroll();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                EnemyStats enemyStats = new EnemyStats("troll");
                enemyStats.combat("troll", player, enemyStats);
            } else if (map[player.getPosX()][player.getPosY()] == 'G') {
                visual.asciiGoblin();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                EnemyStats enemyStats = new EnemyStats("goblin");
                enemyStats.combat("goblin", player, enemyStats);
            } else if (map[player.getPosX()][player.getPosY()] == 'O') {
                visual.asciiOrc();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                EnemyStats enemyStats = new EnemyStats("orc");
                enemyStats.combat("orc", player, enemyStats);
            }else if (map[player.getPosX()][player.getPosY()] == 'J') {
                visual.asciiDevilBoss();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                EnemyStats enemyStats = new EnemyStats("devilBoss");
                enemyStats.combat("devilBoss", player, enemyStats);
            }else if (map[player.getPosX()][player.getPosY()] == 'i') {
                System.out.println("Hola soy Ian, NO EM DETECTA LA TECLAAAAAAAAAAAAAAAAA");
                EnemyStats enemyStats = new EnemyStats("ian");
                enemyStats.combat("ian", player, enemyStats);
            }else if (map[player.getPosX()][player.getPosY()] == 'q') {
                System.out.println("Hola soy Pablo, Hasta los huevos de la ia");
                EnemyStats enemyStats = new EnemyStats("pablo");
                enemyStats.combat("pablo", player, enemyStats);
            }else if (map[player.getPosX()][player.getPosY()] == 'j') {
                System.out.println("Hola soy Jhon, Vamo' a pelear");
                EnemyStats enemyStats = new EnemyStats("jhon");
                enemyStats.combat("jhon", player, enemyStats);
            }else if (map[player.getPosX()][player.getPosY()] == 'r') {
                System.out.println("Hola soy Marcel, HASTA LA PUNTA DEL RABO CON EL PARCHIS");
                EnemyStats enemyStats = new EnemyStats("marcel");
                enemyStats.combat("marcel", player, enemyStats);
            }else if (map[player.getPosX()][player.getPosY()] == 'e') {
                System.out.println("Hola soy ERIK, tengo l amano jodida pero vamo a darle");
                EnemyStats enemyStats = new EnemyStats("erik");
                enemyStats.combat("erik", player, enemyStats);
            }else if (map[player.getPosX()][player.getPosY()] == 'y') {
                System.out.println("Hola soy Marc, me he saltado esta clase, asi que no podras combatir contra mi");
                EnemyStats enemyStats = new EnemyStats("marc");
                enemyStats.combat("marc", player, enemyStats);
            }else if (map[player.getPosX()][player.getPosY()] == 't') {
                System.out.println("Hola soy Toni, TONI NO TONY");
                EnemyStats enemyStats = new EnemyStats("toni");
                enemyStats.combat("toni", player, enemyStats);
            }else if (map[player.getPosX()][player.getPosY()] == 'a') {
                System.out.println("Hola soy ATY, vamo a robar tu informacion");
                EnemyStats enemyStats = new EnemyStats("adria");
                enemyStats.combat("adria", player, enemyStats);
            }else if (map[player.getPosX()][player.getPosY()] == 'm') {
                visual.asciiTaratara();
                System.out.println("Hola soy Marti, NO TE ESCUCHOOOOOOOO");
                EnemyStats enemyStats = new EnemyStats("marti");
                enemyStats.combat("marti", player, enemyStats);
            }else if (map[player.getPosX()][player.getPosY()] == 'g') {
                System.out.println("Hola soy Guillem, 'pone cara de SIGMA'");
                EnemyStats enemyStats = new EnemyStats("guillem");
                enemyStats.combat("guillem", player, enemyStats);
            }else if (map[player.getPosX()][player.getPosY()] == 'b') {
                visual.asciiIvelian();
                System.out.println("Hola soy Ivelian, no existo :D");
                EnemyStats enemyStats = new EnemyStats("ivelian");
                enemyStats.combat("ivelian", player, enemyStats);
            }else if (map[player.getPosX()][player.getPosY()] == 'l') {
                System.out.println("Hola soy Lluc, SOY MALISIMO EN EL LOL PERO EN PELEAS NO");
                EnemyStats enemyStats = new EnemyStats("lluc");
                enemyStats.combat("lluc", player, enemyStats);
            }else if (map[player.getPosX()][player.getPosY()] == 'p') {
                System.out.println("Hola soy Pau, VAMO A USAR LA FISICA PARA EXPLOTARTE TU CABEZA JAJAJAJAJA");
                EnemyStats enemyStats = new EnemyStats("pau");
                enemyStats.combat("pau", player, enemyStats);
            }
            else {
                map[player.getPosX()][player.getPosY()] = '@';
            }
        map[player.getPosX()][player.getPosY()] = '@';
        printMap();
    }
}