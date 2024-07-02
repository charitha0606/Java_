import java.beans.IndexedPropertyChangeEvent;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args){

        //1. copying of an array

        int[] Marks={1,2,3};
        //int[] numbers=marks;
        int[] numbers=Arrays.copyOf(Marks,Marks.length);
        //int[] numbers=new int[100];
        for(int i=0; i<Marks.length;i++){
           // numbers[i]=marks[i];
            System.out.println(numbers[i]);
        }

        System.out.println(" ");

        //2.Multidimensional Array -2D array
        //approach 1

        int[][] marks= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        } 

        System.out.println(" ");
        
        //approach2

        int rows=4;
        int columns=4;
        //int array=100;// Variable to control the maximum value to assign
        int value=1; // Assign values from 1 to 16 to the matrix
        int[][] mark= new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                mark[i][j]=value;
                value=value+1;
                System.out.print(mark[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(" ");

        //3.Rain Water problem - interview question

        //Question: Consider height of n buildings, find out how many units of water can be stored in between the buildings. consider the width of each building to be 1 unit.
        int[] arr={0,1,2,0,0,3,1,0,3}; // arr represents the heights of the buildings.
        int n=arr.length;
        //left and right arrays store the maximum heights encountered from the left and right directions respectively for each building.
        int[] left=new int[n];
        int[] right=new int[n];
       
        // Step 1: Calculate max heights from the left

        //Left Array Calculation (left[]):
        // left[] array is used to store the maximum height encountered from the left for each building.
        // left[0] = arr[0];: Initialize the first element of left[] with the height of the first building.
        left[0]=arr[0];
        // Filling left Array: left[i] is filled by taking the maximum of the current building height and the previous maximum height encountered from the left (left[i-1]).
        for(int i=1;i<n;i++){
            // if(arr[i]>left[i-1]){
            //     left[i]=arr[i];
            // }
            // else{
            //     left[i]=left[i-1];
            // }
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        // Step 2: Calculate max heights from the right
        //Right Array Calculation (right[]):
        // right[] array is used to store the maximum height encountered from the right for each building.
        // right[n - 1] = arr[n - 1];: Initialize the last element of right[] with the height of the last building.
        right[n - 1] = arr[n - 1];
        //Filling right Array: right[i] is filled by taking the maximum of the current building height and the next maximum height encountered from the right (right[i+1]).
        //Calculating Water Trapped: Iterate through each building (from index 1 to n-2).
        for(int i=n-2;i>=0;i--){
            // if(arr[i]>right[i+1]){
            //     right[i]=arr[i];
            // }
            // else{
            //     right[i]=right[i-1];
            // }
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        // Calculate the water trapped above each building as Math.min(left[i], right[i]) - arr[i].
        int water=0;  //Initialize water variable to store the total units of water trapped.
        for(int i=1;i<n-1;i++){
            water=water+Math.min(left[i],right[i])-arr[i];
        }
        System.out.println("units of water trapped : "+water);

        System.out.println(" ");

        //4.Array Rotation
        // int[] N={1,2,3,4,5,6};
        // int d=2;
        // for(int i=0;i<N.length-d;i++){
        //     System.out.println(i);

        // }
        // for(int i=N.length-d;i>N.length-1;i--){
        //     System.out.println(i);
        // }
        // for(int i=0;i<N.length-1;i++){
        //     System.out.println(i);
        // }
        int[] N = {1, 2, 3, 4, 5, 6};
        int d = 2;

        // Create a temporary array to store elements to be rotated
        int[] temp = new int[d];

        // Store the first d elements in temp
        for (int i = 0; i < d; i++) {
            temp[i] = N[i];
            System.out.println("First :"+temp[i]);
        }

        // Shift the remaining elements of N to the left by d positions
        for (int i = d; i < N.length; i++) {
            N[i - d] = N[i];
            System.out.println("Second : "+N[i-d]);
        }

        // Copy the elements from temp back to the end of N
        for (int i = 0; i < d; i++) {
            N[N.length - d + i] = temp[i];
            System.out.println("Third : "+N[N.length-d+i]);
        }

        // Print the rotated array
        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i] + " ");
        }

        System.out.println(" ");

        //5. Majority element - Moore's Voting Algorithm.
        int[] elements={7,2,7,3,7,2,7,7};
        int Major=elements[0];
       int count=1;
        for(int i=1;i<elements.length;i++){
            if(elements[i]==Major){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                Major=elements[i];
                count=1;
            }
        }
        count=0;
        for(int i=0;i<elements.length;i++){
            if(elements[i]==Major){
                count++;
            }
        }
        System.out.println("count : "+count);
        if(count>elements.length/2){
            System.out.println("Majority element is : "+Major);
        }
        else{
            System.out.println("No Majority element found");
        }

        System.out.println(" ");

        //6. Find Missing Number
        int[] number={1,2,3,5};
        int num=number.length+1; // Since one number is missing
        // Calculate the expected sum of the first n natural numbers
        int expectednum=num*(num+1)/2;
        // Calculate the actual sum of the elements in the array
        int Actualsum=0;
        for(int i=0;i<number.length;i++){
                Actualsum=Actualsum+number[i];
        }
        int missingnum=expectednum-Actualsum;
        System.out.println("Missing number is : "+missingnum);

        System.out.println(" ");
        //7. Find the missing number
        

        int[] A = {4,1,3,5,8,9,2,6};
        int k=3;//Size of subarrays for which we want to find the maximum sum.
        int max=-1;//Variable to store the maximum sum of subarrays.
        int sum=0;//Temporary variable to calculate the sum of subarrays.
        for(int i=0;i+k-1<A.length;i++){
            sum=0;
            for(int j=i;j<i+k;j++){
                sum=sum+A[j];
            }
            if(sum>max){
                max=sum;
            }
            System.out.println("Maximum sum of subarrays of size : "+max);
        }
        System.out.println("Maximum : "+max);

        System.out.println(" ");
        
        //8. Multiplication of Array elements
       int[] Arr={9,8,4,3,1,2,3};
       int mul=1;
       for(int i=0;i<Arr.length;i++){
        mul=mul*Arr[i];
       }
       System.out.println("Multiplication of Array elements : "+mul);
       
       System.out.println(" ");

       //9.Find Even and Odd elements
       int[] Numbers={5,2,4,3,1,7,6,9,8,10};
       for(int i=0;i<Numbers.length;i++){
            if(Numbers[i]%2==0){
                System.out.print(Numbers[i]+ " ");
            }
        }
        System.out.println(" ");

        for(int j=0;j<Numbers.length;j++){
            if(Numbers[j]%2!=0){
                System.out.print(Numbers[j]+ " ");
            }
       }

       System.out.println(" ");

       //10. Minimum house number
       int[] House={4,3,1,5,2};
       int HN=House[0];
       for(int i=0;i<House.length;i++){
        if(House[i]<HN){
            HN=House[i];
        }
       }
       System.out.println("Mininum House Number : "+HN);

       System.out.println(" ");

       //11. MIN AND MAX
       int[] MinandMax={3,1,4,6,2,7};
       int Mmin=MinandMax[0];
       int Mmax=MinandMax[0];

       for(int i=0;i<MinandMax.length;i++){
        if(MinandMax[i]<Mmin){
            Mmin=MinandMax[i];
        }
       }
       for(int i=0;i<MinandMax.length;i++){
        if(MinandMax[i]>Mmax){
            Mmax=MinandMax[i];
        }
       }
       System.out.println(Mmin+" "+Mmax);

       System.out.println(" ");

       //12. Scalar Multiplication
       int[][]Matrix={{1,2},{3,4}};
       int K=5;
       for(int i=0;i<Matrix.length;i++){
        for(int j=0;j<Matrix[i].length;j++){
            //NewMatrix[i][j]=Matrix[i][j]*K;
            System.out.print(Matrix[i][j]*K+" ");
        }
        System.out.println();

       }

       System.out.println(" ");

       //13.lastone
       int[] findindexof1={0,0,0,0,0,0};
       int Lastone=-1;
       for(int i=0;i<findindexof1.length;i++){
        if(findindexof1[i]==1){
            Lastone=i;
        }
       }
       System.out.println("Last Index of 1 : "+Lastone);

       System.out.println(" ");

       //14. Greater than neighbor
      int rent[]={4,3,5,2,1};
       int check=0;
       int Check1=0;
       for(int i=1;i<rent.length-1;i++){
            if(rent[i]>rent[i-1]&&rent[i]>rent[i+1]){
                check=rent[i];
            }
       }

        if(rent[0]>rent[1]&&rent.length-1>rent.length-2){
            Check1=rent.length-1;
        }
    System.out.println("Greater than neighbor : "+Check1+" "+check);

    System.out.println(" ");

    }
    
    
}