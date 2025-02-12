class file{
    public static void main(String[] args){
        long principalAmount = 1000;
        double rateOfInterest= 5.0;
        double timeInYears = 2;
        double interest = principalAmount* Math.pow(1 + rateOfInterest / 100, timeInYears);
        System.out.println("The compound Interest is : "+interest);
    }
}