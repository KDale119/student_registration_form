import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Student Registration Form\n");

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter year of birth: ");
        String yearOfBirth = input.nextLine();


    }
}
