import java.util.Random;
import java.util.Scanner;

public class LosowanieMaxUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj górną granicę do losowania");

        int losMax = scanner.nextInt();

        Random random = new Random();

        int losowana = random.nextInt(losMax);

        System.out.println(losowana);



    }


}
