import java.util.Scanner;

public class Parenthesis {

    public static void main(String[] args){

        InputValidator validator = new InputValidator();
        Scanner scanner = new Scanner(System.in);
        String input = new String();

        while(true) {
            System.out.println("Input girin (q cikis): ");
            input = scanner.nextLine();
            if ("q".equals(input))
                break;
            boolean returnValue = validator.parenthesisValidator(input);
            System.out.println(returnValue);
        }

    }

}
