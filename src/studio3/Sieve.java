import java.util.Scanner;

public class Sieve {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What is the value of n?");
        int n = in.nextInt();
        int[] numbers = new int [n];
        int num = 2;
        

        for (int index=0; index <= n-2; index++){
            numbers[index] = num;
            num++;
            
        }
        for(int divisor = 2; divisor <= n-1; divisor++){

        
            for (int index = 0 ; index <= n-2; index ++) {
                if (numbers[index] % divisor == 0 && numbers[index] != divisor) {
                    numbers[index] = 0;}}
           

            
            
            
            

            
            
        }
        System.out.println();
        for(int lastNum : numbers)
        {
            if(lastNum != 0)
            {
                System.out.print(lastNum + " ");
            }
        }



}
}

