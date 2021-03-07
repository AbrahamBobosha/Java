package Format;

public class StringFormatExample {

    public static void main(String[] args) {

        double input = 3.14159265359;
        System.out.println("double : " + input);
        System.out.println("double : " + String.format("%.2f", input));
        System.out.format("double : %.2f", input);

    }

}