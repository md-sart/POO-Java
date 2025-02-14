import java.util.Scanner;

public class App {
    public staic void main (String [] args) throws Exeption {

    char gender = 'f';
    int age = 3;
    double height = 1.60;
    boolean canVote = false;
    Scanner keyboard = new Scanner(System.in);

    System.err.println("Digite sua idade");
    age = keyboard.nextInt();

    for (int i = 0; i <= age; i++) {
        System.out.println("Feliz aniversário");
    }

    }
}