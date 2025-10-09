import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        ArrayList<String> color = new ArrayList<String>();
        color.add("yellow");
        color.add("white");
        color.add("green");
        int i;
        for(i=0; i<color.size(); i++) {
            System.out.println("Colors:"+ color.get(i));
        }
    }
}