package GuessTheWord;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordProvider wordProvider = new WordProvider();

        System.out.println("Вітаємо у грі 'Вгадай слово'!");
        System.out.println("Оберіть складність: 1 - Легко (3-4 букви), 2 - Середньо (5-6 букв), 3 - Важко (8+ букв)");

        String level;
        while (true) {
            System.out.print("Ваш вибір (1, 2 або 3): ");
            level = scanner.next();
            if (wordProvider.isValidLevel(level)) {
                break;
            }
            System.out.println("Невірний вибір. Спробуйте ще раз.");
        }

        String randomWord = wordProvider.getWordByDifficulty(level);
        SecretWord session = new SecretWord(randomWord);

        System.out.println("\nГра почалась! Для підказки введіть 'hint' або '?'");

        while (!session.isSolved()) {
            System.out.println("\nСлово: " + session.getDisplayString());
            System.out.print("Введіть букву: ");

            String input = scanner.next().toLowerCase();

            if (input.equals("hint") || input.equals("?")) {
                if (session.openHint()) {
                    System.out.println("Підказка використана! Буква відкрита.");
                }
                continue;
            }

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Помилка! Введіть одну букву.");
                continue;
            }

            char letter = input.charAt(0);

            if (session.guess(letter)) {
                System.out.println("Правильно!");
            } else {
                System.out.println("Немає такої букви...");
            }
        }
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("ПЕРЕМОГА! Ви вгадали слово: " + session.getOriginalWord());
        System.out.println("Використано підказок: " + session.getHintsUsed());
    }
}