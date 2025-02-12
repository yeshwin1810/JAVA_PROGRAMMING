public class Overload {
    public void x(int a, int b) {
        int i = 88;
        demo obj = new demo();
        obj.test();
        obj.test(i);        // Calls the test(int a)
        obj.test(10, 20);    // Calls the test(int a, int b) - Added this method
        obj.test(123, 45);   // Calls the test(int a, int b) - Added this method
    }

    public static void main(String[] args) {
        Overload overloadObj = new Overload();
        overloadObj.x(5, 10); // Calling the x method with sample integers
    }
}

class demo {
    // Method with no parameters
    void test() {
        System.out.println("No parameters");
    }

    // Method with one integer parameter
    void test(int a) {
        System.out.println("One parameter: " + a);
    }

    // Method with one double parameter
    void test(double a) {
        System.out.println("One double parameter: " + a);
    }

    // Method with two integer parameters (added this method)
    void test(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
    }
}
