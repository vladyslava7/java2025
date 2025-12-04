package GuessTheWord;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SecretWord {
    private final String originalWord;
    private final char[] maskedWord;
    private int hintsUsed = 0;

    public SecretWord(String word) {
        this.originalWord = word;
        this.maskedWord = new char[word.length()];
        for (int i = 0; i < maskedWord.length; i++) {
            maskedWord[i] = '_';
        }
    }

    public boolean guess(char letter) {
        boolean isFound = false;
        for (int i = 0; i < originalWord.length(); i++) {
            if (originalWord.charAt(i) == letter) {
                maskedWord[i] = letter;
                isFound = true;
            }
        }
        return isFound;
    }

    public boolean openHint() {
        List<Integer> closedIndices = new ArrayList<>();
        for (int i = 0; i < maskedWord.length; i++) {
            if (maskedWord[i] == '_') {
                closedIndices.add(i);
            }
        }

        int randomIndex = closedIndices.get(new Random().nextInt(closedIndices.size()));
        char letterToOpen = originalWord.charAt(randomIndex);

        guess(letterToOpen);
        hintsUsed++;
        return true;
    }

    public boolean isSolved() {
        return String.valueOf(maskedWord).equals(originalWord);
    }
    public String getDisplayString() {
        StringBuilder sb = new StringBuilder();
        for (char c : maskedWord) {
           sb.append(c).append(" ");
       }
        return sb.toString();
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public int getHintsUsed() {
        return hintsUsed;
    }
}