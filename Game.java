import java.util.Scanner;

public class Game {
    private final Map map = new Map();
    private final Player player = new Player();
    private final Scanner scan= new Scanner(System.in);

    public void start(String levelChoice) {
        char[][] currentMap = map.getMap(levelChoice);
        player.resetPosition(currentMap);

        while (true) {
            clearConsole();
            System.out.println("Введите W,A,S,D для передвижения или Q для выхода");
            System.out.println();
            printMap(levelChoice);
            String input = scan.nextLine().toUpperCase();

            switch(input) {
                case "Q":
                    return; // Возврат в меню уровней
                case "W", "A", "S", "D":
                    if (player.move(input, currentMap)) {
                        clearConsole();
                        System.out.println("Поздравляем! Вы прошли уровень! Нажмите Enter..");
                        scan.nextLine();
                        return; // автоматический выход в меню
                    }
                    break;
            }
        }
    }

    public void printMap(String levelChoice){//вывод карты
        char[][] currentMap = map.getMap(levelChoice);
        for (char[] i:currentMap){
            for (char j:i){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void clearConsole() {//очистка консоли
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
