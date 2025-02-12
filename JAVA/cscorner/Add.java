    // Method to add two numbers (without return type)
public class Add {
    public void x(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        Add obj = new Add();
        obj.x(10, 20);
    }
}
// Output: Sum: 30