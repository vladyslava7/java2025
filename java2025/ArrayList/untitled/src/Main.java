import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        ArrayList<String> colors = new ArrayList<String>();
        //1
        colors.add("yellow");
        colors.add("white");
        colors.add("green");
        System.out.println("1. Початковий список: " + colors);
        //2
        System.out.println("\n2. Ітерація по всіх елементах:");
        for(int i = 0; i < colors.size(); i++) {
            System.out.println("   - " + colors.get(i)); // Отримуємо елемент за індексом
        }
        //3
        colors.add(0, "range");
        System.out.println("\n3. Після вставки 'range' на першу позицію: " + colors);
        //4
        String firstElement = colors.get(0);
        System.out.println("\n4. Елемент за індексом 0 (перший): " + firstElement);
        // 5
        colors.set(1, "Red");
        System.out.println("\n5. Після оновлення індексу 1 на 'Red': " + colors);
        //6
        colors.remove(2);
        System.out.println("\n6. Після видалення третього елемента (індекс 2): " + colors);
        //7
        System.out.println("\n7. Пошук елемента 'green':");
        if (colors.contains("green")) {
            System.out.println("   Список містить 'green' на індексі: " + colors.indexOf("green"));
        } else {
            System.out.println("   Список НЕ містить 'green'");
        }
        //8
        Collections.sort(colors);
        System.out.println("\n8. Відсортований список: " + colors);
        //9
        ArrayList<String> colorsCopy = new ArrayList<>(colors);
        System.out.println("\n9. Створено копію списку: " + colorsCopy);
        //10
        Collections.reverse(colors);
        System.out.println("\n10. Реверсований (оригінальний) список: " + colors);
        //11
        boolean areEqual = colors.equals(colorsCopy);
        System.out.println("\n11. Чи 'colors' дорівнює 'colorsCopy'? " + areEqual);
        //12
        colorsCopy.clear();
        System.out.println("\n12. 'colorsCopy' після очищення: " + colorsCopy);
        //13
        System.out.println("\n13. Перевірка на порожнечу:");
        System.out.println("    Чи 'colors' порожній? " + colors.isEmpty());
        System.out.println("    Чи 'colorsCopy' порожній? " + colorsCopy.isEmpty());
        //14
        colors.ensureCapacity(20);
        System.out.println("\n14. Збільшено місткість 'colors' (розмір не змінився): " + colors.size());
        //15
        colors.trimToSize();
        System.out.println("\n15. Обрізано місткість 'colors' (розмір не змінився): " + colors.size());

    }
}