package variab;

import java.util.Random;

public class Numeric {
    private static final Random random = new Random();
    private static final String numbers = "123456789";

    public static String randomNumber(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num; i++)
            stringBuilder.append(numbers.charAt(random.nextInt(numbers.length())));
        return stringBuilder.toString();
    }
}
