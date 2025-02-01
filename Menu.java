import java.util.Scanner;
public class Menu {

    private static final Scanner scan = new Scanner(System.in);
    private static final Game game = new Game();

    // Метод для отображения меню
    public static void showMenu() {
        System.out.println("Введите цифру:");
        System.out.println("1. Начать");
        System.out.println("2. Выход");

        String choice = scan.nextLine();

        switch (choice) {
            case "1":
                levelMenu();
                Game.clearConsole();
                break;
            case "2":
                Game.clearConsole();
                System.out.println("Игра завершена");
                System.exit(0); // Завершение программы
                break;
            default:
                Game.clearConsole();
                System.out.println("Введите правильный номер!");
                break;
        }
    }

    private static void levelMenu(){//метод выбора уровня
        while (true){
            Game.clearConsole();
            System.out.println("Выберите уровень");
            System.out.println("1. Уровень 1");
            System.out.println("2. Уровень 2");
            System.out.println("3. Уровень 3");
            System.out.println("4. Уровень 4");
            System.out.println("5. Уровень 5");
            System.out.println("6. Назад");
            String level = scan.nextLine();
            switch (level) {
                case "1", "2", "3", "4", "5":
                    game.start(level); // Запускаем игру
                    break;
                case "6":
                    Game.clearConsole();
                    return;
                default:
                    System.out.println("Введите существующий выбор!");
            }
        }
}
}