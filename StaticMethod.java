import java.util.Scanner;
class Add{
    static void Sum(int a,int b){
        System.out.println(a+b);
    }
}
public class StaticMethod {
    static int numberA=1000;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the the numbers of a and b");
        System.out.println("Enter the number of a");
        int a=sc.nextInt();
        System.out.println("Enter the number of b");
        int b=sc.nextInt();
        sum(a,b);
        Add.Sum(a,b);
        System.out.println("Enter the numberA :"+numberA);
    }
    static void sum(int a, int b){
        int c=a+b;
        System.out.println("Addition of a and b :"+c);
    }

}
