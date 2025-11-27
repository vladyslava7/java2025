package GuessTheWord;

import java.util.Random;
import java.util.Scanner;

public class Game {
    //список слів які можна загадати
    private static final String[] WORDS = {
            "кіт", "телефон", "шоколад", "експедиція", "полуниця", "ландшафт", "архітектура", "колір"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Комп'ютер обирає слово
        String secretWord = WORDS[random.nextInt(WORDS.length)];
        char[] guessedWord = new char[secretWord.length()];

        //Приховую його
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        System.out.println("Гра: Вгадай слово");
        System.out.println("Комп'ютер загадав слово із " + secretWord.length() + " букв.");
        System.out.println("Спробуйте вгадати по буквам");

        boolean wordIsGuessed = false;

        //Основний цикл гри
        while (!wordIsGuessed) {
            System.out.println("\nСлово: " + String.valueOf(guessedWord));
            System.out.print("Введіть букву: ");

            String input = scanner.next().toLowerCase();

            //Перевірка ввода (буква чи ні)
            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Введіть одну букву");
                continue;
            }

            char letter = input.charAt(0);
            boolean isCorrect = false;

            //Чи є буква в слові
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == letter) {
                    guessedWord[i] = letter; //відкривається буква
                    isCorrect = true;
                }
            }

            if (isCorrect) {
                System.out.println(">> Правильно!");
            } else {
                System.out.println(">> Не правильно...");
            }

            //Перевірка перемоги
            if (String.valueOf(guessedWord).equals(secretWord)) {
                wordIsGuessed = true;
                System.out.println("\n-----------------------------");
                System.out.println("Ви вгадали слово:)" + secretWord);
                System.out.println("-----------------------------");
            }
        }
    }
}