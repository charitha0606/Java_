public class Exercise1 {
    public static void main(String[] args){
        //EXERCISE1 - QUESTIONS
        // 1.even  number
        // 2. odd number
        // 3. divisible by 5
        // 4. factorial
        // 5. prime number

        // 6. print star pattern
        //*
        // **
        // ***
        // ****
        // *****

        // 6. print star pattern 
        // *****
        // ****
        // ***
        // **
        // *
        
        // 7. multiplication of 7

        // 8. print
        // ###
        // ###
        // ###
        // ###

        // print
        // CK06
        // CK06
        // CK06
        // CK06

        //print pyramid pattern
        //     * 
        //    * * 
        //   * * * 
        //  * * * * 
        // * * * * *

        // * * * * *
        //  * * * *
        //   * * *
        //    * *
        //     *

        //9. print all vowels
        //10. print without vowels of string
        //11. check palindrome
        //12.print RevString
        //13. Vowel Count
        //14. print length of array
        //15. print Odd Numbers in array
        //16. print all numbers which is divisible by 5 in an array
        //17.print array
        //18.print all the words which is starting with the vowel
        //19.Calculate percentage
        //20.Calculate power of 5^3=125
        //21.print reverse number for 79896
        //22.print palindrome number
        //23.Swap Numbers
        //24.Find largest number
        //25.Find Largest Even number and odd number
        //26.Find Smallest number
        //27. Find Smallest Even number and odd number
        //28.Find Simple Interest

        //29.print pattern 
        // *****
        // *   *
        // *   *
        // *   *
        // *****

        //pattern
        // ****
        //  ** 
        // ****
        //  **  

        //pattern
        //  * * 
        //   *  
        // *   *
        //  ***

        //30.Count the given letter : 'r', in the sentence : " hey babe, how are you? ".

        // 1.even  number
        int a = 22;
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        System.out.println(" ");
        // 2. odd number
        int b = 23;
        if(b%2!=0){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
        System.out.println(" ");
        // 3. divisible by 5
        int c = 100;
        if(c%5==0){
            System.out.println("divisible by 5");
        }
        else{
            System.out.println("not divisible by 5");
        }
        System.out.println(" ");
        // 4. factorial
        int d = 5;
        for (int i = d-1;i>0;i--){
            d=d*i;
            // System.out.println(d);
        }
        System.out.println(d);
        System.out.println(" ");
        // 5. prime number
        int prime = 5;
        int count=0;
        for(int i=2;i<7;i++){
            if(prime%i==0){
                System.out.println(prime+" "+"is not prime number");
                break;
            }
            else{
                System.out.println(prime+" "+"is prime number");
                break;
            }
        }
        System.out.println(" ");
        // 6. print star pattern 
        //*
        // **
        // ***
        // ****
        // *****
        for(int i =1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("C");
            }
            System.out.println();
        }
        System.out.println(" ");
        //  print star pattern 
        // *****
        // ****
        // ***
        // **
        // *
        for(int i =1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(" ");
        // 7. multiplication of 7
        int mul=7;
        for(int i=1;i<=10;i++){
            // mul=mul*i;
        System.out.println(mul+"*"+i+"="+mul*i);
        }
        System.out.println(" ");
        // 8. print
        // ###
        // ###
        // ###
        // ###
        int rows=4;
        int columns=3;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println(" ");
        // print
        // CK06
        // CK06
        // CK06
        // CK06
        for(int i=1;i<=4;i++){
            System.out.println("CK06");
        }
        System.out.println(" ");
        //print pyramid pattern
        //     * 
        //    * * 
        //   * * * 
        //  * * * * 
        // * * * * *
        // explanation :
        // Outer Loop (i): Iterates over each row from 1 to 5.
        // First Inner Loop (j): Prints spaces before the stars. It calculates the number of spaces based on the row number (5 - i).
        // Second Inner Loop (k): Prints the stars for the current row (* ). It prints i stars for each row.
        // System.out.println();: Moves to the next line after each row is printed to start the next row on a new line.
        
        for(int i =1;i<=5;i++){
            //System.out.println("");
            for(int j=5-i;j>0;j--){
                System.out.print(" ");
            }
                for(int k=1;k<=i;k++){
                    System.out.print("* ");
                }
            System.out.println();
        }
        for(int i =1;i<=5;i++){
            //System.out.println("");
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
                for(int k=1;k<=i;k++){
                    System.out.print("* ");
                }
            System.out.println();
        }
        System.out.println(" ");
        // * * * * *
        //  * * * *
        //   * * *
        //    * *
        //     *
        for(int i =1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
                for(int k=5;k>=i;k--){
                    System.out.print(" *");
                }
            System.out.println();
        }
        System.out.println(" ");
        //9. print all vowels
        //case 1: print all vowels in String
        String name="Charitha";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                System.out.println("For String Charitha:"+name.charAt(i));
            }
        }
        System.out.println(" ");
        //case 2:print all vowels in array - method 1
         String[] Vowel={"Kammari"};
        for(int i=0;i<Vowel[0].length();i++){
            if(Vowel[0].charAt(i)=='a'||Vowel[0].charAt(i)=='e'||Vowel[0].charAt(i)=='i'||Vowel[0].charAt(i)=='o'||Vowel[0].charAt(i)=='u'){
                System.out.println("For Array Kammari:"+Vowel[0].charAt(i));
            }
        }
        System.out.println(" ");
        //case2: print all vowels using for each loop using one for loop - method 3
        String[] Name={"ele"};
        String Word=Name[0];
        for(char Ele:Word.toCharArray()){
            if(Ele =='a'||Ele=='e'||Ele=='i'||Ele=='o'||Ele=='u'){
                System.out.println("For Array ele using for each loop using one for loop:"+Ele);
            }
        }
        System.out.println(" ");
        //case 2:print all vowels in array - method 2
        String[] Vowels={"Reddy"};
        for(int i=0;i<Vowels[0].length();i++){
            char sh=Vowels[0].charAt(i);
            if(sh =='a'||sh=='e'||sh=='i'||sh=='o'||sh=='u'){
                System.out.println("For Array Reddy:"+sh);
            }
        }
        System.out.println(" ");
        //case 3: print all vowels in array using ele
        String[] vowel={"Rohith"};
        for(String ele:vowel){
            for(int i=0;i<ele.length();i++){
                char ch=ele.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    System.out.println("For Array Rohith using for each loop using two for loops:"+ch);
                }
            }
        }
        System.out.println(" ");
        //10. print without vowels of string
        //case 1: print without vowels in String
        String NoVowel="Love";
        for(int i=0;i<NoVowel.length();i++){
            if(NoVowel.charAt(i)!='a'&&NoVowel.charAt(i)!='e'&&NoVowel.charAt(i)!='i'&&NoVowel.charAt(i)!='o'&&NoVowel.charAt(i)!='u'){
                 System.out.println("For String Love without vowel:"+NoVowel.charAt(i));
            }
        }
        System.out.println(" ");
        //case 2: print without vowels in Array
        String[] noVowel={"happy"};
        for(int i=0;i<noVowel[0].length();i++){
            if(noVowel[0].charAt(i)!='a'&&noVowel[0].charAt(i)!='e'&&noVowel[0].charAt(i)!='i'&&noVowel[0].charAt(i)!='o'&&noVowel[0].charAt(i)!='u'){
                System.out.println("For Array happy without vowel:"+noVowel[0].charAt(i));
            }
        }
        System.out.println(" ");
        //11. check palindrome
        String palindrome="POP";
        String Pal="";
        for(int i=palindrome.length()-1;i>=0;i--){
            Pal=Pal+palindrome.charAt(i);
            // System.out.println(Pal);
        }
        System.out.println(Pal);
        if(Pal.equals(palindrome)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        System.out.println(" ");
        //12.print RevString
        String RevString="CK";
        String revStr="";
        for(int i=RevString.length()-1;i>=0;i--){
            revStr=revStr+RevString.charAt(i);
            // System.out.println();
        }
        System.out.println(revStr);
        System.out.println(" ");
        //13. Vowel Count
        String Cha="Charitha";
        int Count=0;
        for(int i=0;i<Cha.length();i++){
            if(Cha.charAt(i)=='a'||Cha.charAt(i)=='e'||Cha.charAt(i)=='i'||Cha.charAt(i)=='o'||Cha.charAt(i)=='u'){
                Count++;
                 System.out.println("For String Charitha count:" + Cha.charAt(i));
            }
        }
        System.out.println("count:"+Count);
        System.out.println(" ");
        //14. print length of array
        String[] len={"apple","banana"};
        for(int i=0;i<len.length;i++){
            System.out.println("length of an array"+len[i].length());
        }
        System.out.println(" ");
        //15. print Odd Numbers in array
        int[] oddNum={2,3,5,7,8,10};
        for(int i=0; i<oddNum.length;i++){
            if(oddNum[i]%2!=0){
                System.out.println("Odd numbers in an array"+oddNum[i]);
            }
        }
        System.out.println(" ");
        //16. print all numbers which is divisible by 5 in an array
        int[] div={10,14,20,23,25,27,30};
        for(int i=0;i<div.length;i++){
            if(div[i]%5==0){
                System.out.println("divisible by 5 in an array"+div[i]);
            }
        }
        System.out.println(" ");
        //17.print array
        String[] array={"I","Love","U"};
        for(int i=0;i<array.length;i++){
            System.out.println("array : "+array[i]);
        }
        System.out.println(" ");
        //18.print all the words which is starting with the vowel
        //case 1 : with string
        String Startingwithvowel="owl";
        for(int i=0;i<Startingwithvowel.length();i++){
            if(Startingwithvowel.charAt(0)=='a'||Startingwithvowel.charAt(0)=='e'||Startingwithvowel.charAt(0)=='i'||Startingwithvowel.charAt(0)=='o'||Startingwithvowel.charAt(0)=='u'){
                System.out.println("For String Starting with vowel:"+Startingwithvowel.charAt(i));
            }
        }
        System.out.println(" ");
        //case 2 : with array
        String[] startingwithvowel={"elephant","panda","insert"};
        for(int i=0;i<startingwithvowel.length;i++){
            if(startingwithvowel[i].charAt(0)=='a'||startingwithvowel[i].charAt(0)=='e'||startingwithvowel[i].charAt(0)=='i'||startingwithvowel[i].charAt(0)=='o'||startingwithvowel[i].charAt(0)=='u'){
                System.out.println("For array Starting with vowel:"+startingwithvowel[i]);
            }
        }
        System.out.println(" ");
        //19.Calculate percentage
        double R=4;
        double Java=3.5;
        double Bigdata=3.5;
        double Cloud=4;
        double total_marks=16;
        System.out.println("percentage"+((R+Java+Bigdata+Cloud)/total_marks)*4);
        System.out.println(" ");
        //20.Calculate power of 5^3=125
        int num=6;
        int power=2;
        int cal=num;
        for(int i=1;i<power;i++){
            cal=cal*num;
            // System.out.println(cal);
        }
        System.out.println("power :"+cal);
        System.out.println(" ");
        //21.print reverse number for 79896
        int RevNumber=14369;
        String Revnum=Integer.toString(RevNumber);
        for(int i=1;i<=Revnum.length();i++){
            System.out.println("Reverse number:"+RevNumber%10);
            RevNumber=RevNumber/10;
        }
        System.out.println(" ");
        //22.print palindrome number
        int palnum=143;
        int Palnum=palnum;
        String Newpal="";
        //using for loop
       // int numDigits = (int)Math.log10(palnum) + 1;
        for(int i=0;palnum>0;i--){
            Newpal=Newpal+palnum%10;
            palnum=palnum/10;
        }
        System.out.println("Original Number:"+Palnum);
        System.out.println("Reversed Number:"+Newpal);
        //using while loop
        // while(palnum>0){
        //     Newpal=Newpal+palnum%10;
        //     palnum=palnum/10;
        // }
        // System.out.println("Original Number:"+Palnum);
        // System.out.println("Reversed Number:"+Newpal);
        if(Integer.toString(Palnum).equals(Newpal)){
            System.out.println("palindrome");
        }
        else{
            System.out.println(" not palindrome");
        }
        System.out.println(" ");
        //23.Swap Numbers
        //case 1 : using temp variable
        int swapa=6;
        int swapb=9;
        int temp=swapa;
        temp=swapa;
        swapa=swapb;
        swapb=temp;
        System.out.println("swapa : "+swapa);
        System.out.println("swapb : "+swapb);
        System.out.println(" ");
        //case 2 :without using third variable
        int Swapa=4;
        int Swapb=5;
        Swapa=Swapa+Swapb; //Swapa=9
        Swapb=Swapa-Swapb; //Swapb=9-5=4
        Swapa=Swapa-Swapb; //Swapa=9-4=5
        System.out.println("Swapa : "+Swapa);
        System.out.println("Swapb : "+Swapb);
        System.out.println(" ");
        //24.Find largest number
        int[] Num={4,6,9,11,51,3,24};
        int LN=Num[0];
        for(int i=0;i<Num.length;i++){
            if(Num[i]>LN){
                LN=Num[i];
            }
            // System.out.println(N);
        }
        System.out.println("For Question 24:"+"Largest Number : "+LN);
        System.out.println(" ");
        //25. Largest Even and odd
        int[] Num1={6,9,12,15,18,21,22};
        int LEN=2;
        boolean foundlargesteven=false;
        for(int i=0;i<Num1.length;i++){
            if(Num1[i]>LEN && Num1[i]%2==0){
                LEN=Num1[i];
                // System.out.println("Question 25:"+"Largest Even");
                foundlargesteven=true;
            }
        }
        if(foundlargesteven){
                System.out.println("Question 25:Largest Even");
        }
        System.out.println("Largets Even Number : "+LEN);
        System.out.println(" ");
        //25. Largest Odd number
        int[] Num2={6,9,12,15,18,21,22};
        int LON=3;
        boolean foundLargestodd=false;
        for(int i=0;i<Num2.length;i++){
            if(Num2[i]>LON && Num2[i]%2!=0){
                LON=Num2[i];
                // System.out.println("Question 25:"+"Largest Even");
                foundLargestodd=true;
            }
        }
        if(foundLargestodd){
                System.out.println("Question 25:Largest Odd");
        }
        System.out.println("Largets Odd Number : "+LON);
        System.out.println(" ");
        //26.Smallest Number
        int[] Snum={6,9,12,15,4,18,21,22};
        int SM=Snum[0];
        for(int i=0;i<Snum.length;i++){
            if(Snum[i]<SM){
                SM=Snum[i];
            }
        }
        System.out.println("Question 26 : Smallest Number : "+SM);
        System.out.println(" ");
        //27.Find Smallest EVen and odd
        //Smallest Even
        int[] Snum1={6,9,12,4,2,15,18,21,22};
        int SEN=Integer.MAX_VALUE;
        boolean foundSmallestEven=false;
        for(int i=0;i<Snum1.length;i++){
            if(Snum1[i]<SEN && Snum1[i]%2==0){
                SEN=Snum1[i];
                // System.out.println("Question 25:"+"Largest Even");
                foundSmallestEven=true;
            }
        }
        if(foundSmallestEven){
                System.out.println("Question 27:Smallest Even");
        }
        System.out.println("Smallest Even Number : "+SEN);
        System.out.println(" ");
        //Smallest Odd Number
        int[] Snum2={6,9,12,4,2,15,1,18,21,22};
        int SON=Integer.MAX_VALUE;
        boolean foundSmallestOdd=false;
        for(int i=0;i<Snum2.length;i++){
            if(Snum2[i]<SON && Snum2[i]%2!=0){
                SON=Snum2[i];
                // System.out.println("Question 25:"+"Largest Even");
                foundSmallestOdd=true;
            }
        }
        if(foundSmallestOdd){
                System.out.println("Question 27:Smallest Odd");
        }
        System.out.println("Smallest Odd Number : "+SON);
        System.out.println(" ");
        //28.Simple interest
        int p=700;
        int t=100;
        int r=100;
        int PTR=0;
        PTR=((p*t*r)/100);
        System.out.println("Simple Interest : "+PTR);
        //29.print pattern 
        // *****
        // *   *
        // *   *
        // *   *
        // *****
        System.out.println(" ");
        for(int i=0;i<5;i++){
            if(i==0||i==4){
                System.out.println("*****");
            }
            else{
                System.out.println("*   *");
            }
        }
        // ****
        //  ** 
        // ****
        //  **  
        System.out.println(" ");
        for(int i=0;i<4;i++){
            if(i==0||i==2){
                System.out.println("****");
            }
            else{    
            System.out.println(" ** ");
            }
        }
        //  * * 
        //   *  
        // *   *
        //  ***
        //using switch case 
        System.out.println(" ");
        for(int i=0;i<4;i++){
            switch(i){
                case 0 :{
                    System.out.println(" * * ");
                    break;
                }
                case 1 :{
                    System.out.println("  *  ");
                    break;
                }
                case 2 :{
                    System.out.println("*   *");
                    break;
                }
                case 3 :{
                    System.out.println(" *** ");
                    break;
                }
                default:
                    break;

            }
        }
        //using elseif
        System.out.println(" ");
        for(int i=0;i<4;i++){
            //System.out.println(" ");
            if(i==0){
                System.out.println(" * * ");
            }
            else if(i==1){
                System.out.println("  *  ");
            }
            else if(i==2){
                System.out.println("*   *");
            }
            else if(i==3){
                System.out.println(" *** ");
            }
        }    
        System.out.println(" ");
        //30. count the given letter "r" in the sentence "hey babe how are you?"
        //using array
        String[] Sentence={" hey babe, how are you? "};
        char letter='r';
        int CCount=0;
        for(int i=0;i<Sentence[0].length();i++){
            if(Sentence[0].charAt(i)==letter){
                CCount++;
            }
        }
        System.out.println("Count of letter in a sentence : "+CCount);
        System.out.println(" ");
        //using string
        String sentence=" hey babe, how are you? ";
        char Letter='o';
        int Ccount=0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==Letter){
                Ccount++;
            }
        }
        System.out.println("Count of letter : "+Ccount);
    }
}
