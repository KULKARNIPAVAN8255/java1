import java.util.Scanner;
public class Simplecalc{
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the first number:");
        
        double a=sc1.nextDouble();
        System.out.println("Enter the second number:");
        double b=sc1.nextDouble();
        double sum=a+b;
        double diff=a-b;
        double product=a*b;
        double division=a/b;
        double rem=a%b;
        double pow=Math.pow(a,b);
        double sqrt=Math.sqrt(a);
         
        System.out.println("The sum of two number is");
        System.out.println(sum);
        System.out.println("The diff of two number is");
        System.out.println(diff);
        System.out.println("The product of two number is");
        System.out.println(product);
        System.out.println("The division of two number is");
        System.out.println(division);
        System.out.println("The rem of two number is");
        System.out.println(rem);
        System.out.println("The pow of two number is");
        System.out.println(pow);
         

    }
}

