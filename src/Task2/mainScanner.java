package Task2;
import java.util.Scanner;
public class mainScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type your name");
        String name = scanner.nextLine();
        System.out.println("hello "+name);

        System.out.println("Please type in your age, "+name);
        int age = scanner.nextInt();
        //scanner.nextLine();
        System.out.println("you are "+ age+" years old");

        int retirement = 67-age;
        System.out.println("You retire in: "+retirement+" years"+". "+"Your name is: "+name+ ". Your age is: "+age+".");

    }

}
