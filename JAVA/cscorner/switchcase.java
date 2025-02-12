import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int day=x.nextInt();
        switch(day){
            case 1,7->System.out.println("Weekend");
            case 2,3,4,5,6->System.out.println("Weekday");
            default->System.out.println("Invalid input");
        }
        
    }
    
}
