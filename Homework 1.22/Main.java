import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num1 = null, num2 = null;

        try {
            System.out.print("primul numar: ");
            String input1 = scanner.nextLine();
            num1 = (input1.isEmpty()) ? null : Integer.parseInt(input1);

            System.out.print("al doilea numar: ");
            String input2 = scanner.nextLine();
            num2 = (input2.isEmpty()) ? null : Integer.parseInt(input2);

            if (num1 == null || num2 == null) {
                throw new NullPointerException("Unul dintre numere este NULL.");
            }

            int suma = num1 + num2;
            System.out.println("Suma numerelor este: " + suma);
        } catch (NumberFormatException e) {
            System.out.println("Eroare: Introduceți doar numere întregi valide.");
        } catch (NullPointerException e) {
            System.out.println("Eroare: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
