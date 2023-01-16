import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Practicum {
    private String testChar;
    private Map<Character, Integer> charMap = new HashMap<>();

    public Practicum (String word) {
        this.testChar = word;
        disassembleIntoChar();
    }

    private void disassembleIntoChar() {
        for (int i = 0; i < testChar.length(); i++) {
            char variable = testChar.charAt(i);
            Integer charLenght = charMap.get(variable);
            if (charLenght != null) {
                charMap.put(variable, charLenght + 1);
            } else {
                charMap.put(variable,1);
            }
        }
    }

    public void showChar() {
        for (char charKey: charMap.keySet()) {
            System.out.println("Встречаемость символа " + charKey + " = " + charMap.get(charKey));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввведите слово => ");
        String word = scanner.nextLine();
        Practicum charactersOccurrence = new Practicum(word);
        charactersOccurrence.showChar();
    }
}