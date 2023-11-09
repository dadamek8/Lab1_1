import java.util.Scanner;

public class Hello {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź imię studenta");
        String name = scanner.nextLine();
        System.out.println("Wprowadź nazwisko studenta");
        String surname = scanner.nextLine();
        System.out.println("Student nazywa się " + name + " " + surname);
    }
}