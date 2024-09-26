import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double RUBLES_PER_YUAN = 11.91;
        Scanner input = new Scanner(System.in);

        System.out.print("Сумма в юанях: ");
        int yuan = input.nextInt();
        String ending = gen_end(yuan);
        System.out.println("Сумма в рублях: " + RUBLES_PER_YUAN * yuan + " (сумма в " + yuan + " " + ending + ")");
    }

    private static String gen_end(int yuan) {
        int digit = yuan % 10;
        int delim = yuan % 100;

        if (delim >= 11 && delim <= 16) {
            return "юаней";
        }
        if (digit == 1) {
            return "юань";
        }
        if (digit >= 2 && digit <= 4) {
            return "юаня";
        }
        return "юаней";
    }
}