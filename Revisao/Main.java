package Revisao;
import java.util.Scanner;


public class Main {
    public static Scanner ler = new Scanner(System.in);
   
    public static double calculateBMI(double height, double weight){
        return weight / (height*height);
    }
   
   
    public static void main(String[] args) {

    char gender = 'f';
    int age = 0;
    double height = 1.60;
    double weight = 70.0;
    boolean canVote = false;
    Scanner keyboard = new Scanner(System.in);
    

    System.out.println("Digite sua idade");
    age = keyboard.nextInt();

    double resultMBI = calculateBMI(height, weight);
    System.out.println("O resultado é " + resultMBI);

        for (int i = 1; i <= age; i++) {
            System.out.println("Feliz aniversário");
        }
    }
}