import java.util.Scanner;

public class celciustofarenheit {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        double celsius = x.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
        x.close();
    }
}
