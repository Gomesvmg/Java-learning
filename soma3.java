import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class logicaJava {
    

    public static List<Integer> collectNumbers(int amountNumbers) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumbers = new ArrayList<>();

        for (int i = 0; i < amountNumbers; i++) {

            int number = scanner.nextInt();

            listNumbers.add(number);
        }

        return listNumbers; 
    }

    public static void str (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String option = scanner.nextLine();

        List<Integer> numbers = collectNumbers(3);

        System.out
    }
}
