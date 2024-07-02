import java.util.Scanner;

public class Methods {
    public static void main(String[] args){
        int operationNumber;
        System.out.println("Please enter a valid operation number from the below menu : "+"\n1.Calculate Area of circle"+"\n2.Calculate Area of Square"+"\n3. calculate the area of rectangle");
        Scanner sc=new Scanner(System.in);
        double circleArea;
        int square;
        int length,width;
        operationNumber=sc.nextInt();
        switch (operationNumber){
            case 1:
            circleArea=calculateAreaofcircle();
            System.out.println("Area of circle : "+circleArea);
            break;

            case 2:
            // Area of Square = s * s
            System.out.println("enter the size of Square : ");
            square=sc.nextInt();
            calculateAreaofsquare(square);
            break;

            case 3:
            System.out.println("enter the length and width of rectangle : ");
            //area of rectangle : length * width
            length=sc.nextInt();
            width=sc.nextInt();
            int areaofrectangle=calculateAreaofrectangle(length,width);
            System.out.println("enter the length and width of a rectangle : "+areaofrectangle);
            break;

            default:
            System.out.println("Invalid operation number entered");
        }

    }
    public static double calculateAreaofcircle(){
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int radius=sc1.nextInt();
        return 3.14*radius*radius;

    }
    public static void calculateAreaofsquare(int square){
        System.out.println("Area of Square : "+square*square);
    }
    public static int calculateAreaofrectangle(int length,int width){
        return(length*width);
    }
}

