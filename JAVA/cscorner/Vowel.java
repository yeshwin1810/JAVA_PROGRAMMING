public class Vowel{
    protected static boolean isVowel(char ch){
        return "aeiouAEIOU".contains(""+ch);
    }

    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Enter a character: ");
        char ch = (char) System.in.read();
        if(isVowel(ch)){
            System.out.println(ch+" is a vowel");
        }else{
            System.out.println(ch+" is a consonant");
        }
        
    }
    
}
