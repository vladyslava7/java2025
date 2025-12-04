package GuessTheWord;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class WordProvider {
    private final Map<String, String[]> difficultyMap;
    private final Random random = new Random();

    public WordProvider() {
        difficultyMap = new HashMap<>();

        difficultyMap.put("1", new String[]{"кіт", "дім", "ліс", "море", "сон"}); // Легкий
        difficultyMap.put("2", new String[]{"школа", "робота", "кавун", "собака", "екран"}); // Середній
        difficultyMap.put("3", new String[]{"експедиція", "архітектура", "філософія", "ландшафт", "інженерія"}); // Важкий
    }

    public String getWordByDifficulty(String level) {
       String[] words = difficultyMap.getOrDefault(level, difficultyMap.get("3"));
       return words[random.nextInt(words.length)];
    }
    public boolean isValidLevel(String level) {
        return difficultyMap.containsKey(level);
    }
}