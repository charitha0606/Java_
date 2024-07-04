public class StringConcept {
    public static void main(String[] args){

        System.out.println(" ");

        //String
        String Name="Charitha";
        System.out.println("String : "+Name);

        //String Constructor
        StringConcept string=new StringConcept();

        System.out.println(" ");

        //Concatenation
        String a="C";
        String b="K";
        String  Concatenation=a+b;
        System.out.println("Concatenation of two Strings : "+Concatenation);

        System.out.println(" ");

        //String length
        String lengthofwordString="Happy";
        int length=lengthofwordString.length();
        System.out.println("Length of the word : "+length);

        System.out.println(" ");

        //String Equality
        //case1:For an method object 
        String s1= new String("HeyBabe");
        String s2=new String("HeyBabe");
        System.out.println("String Equality : "+s1.equals(s2));

        System.out.println(" ");

        //String pool
        String a1="Hello";
        String a2="Hello";
        if(a1==a2){
            System.out.println("String pool : "+"Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        System.out.println(" ");

        //String Join
        String join=String.join("-","06","06","2002");
        System.out.println("String join : "+join);

        System.out.println(" ");

        //String Methods

        String S1="Charitha";
        String S2=S1.substring(0,3);
        System.out.println("Substring of String word : " +S2);

        System.out.println(" ");

        String S3=S1.replace('C', 'H');
        System.out.println("Replace of String from Charitha to : "+S3);

        System.out.println(" ");

        String S4=S1.toUpperCase();
        System.out.println("String to UpperCase : "+S4);

        System.out.println(" ");

        String S5=S1.toLowerCase();
        System.out.println("String to LowerCase : "+S5);

        System.out.println(" ");

        //Character Extraction

        char ch;
        ch="Harrison".charAt(1);
        System.out.println("Character Extraction : "+ch);

        System.out.println(" ");

        //Searching Array
        String s="How Hi are you?";
        int indexofH = s.indexOf('H');
        int lastIndexofH = s.lastIndexOf('H');
        int indexOfHi=s.indexOf("Hi");
        int indexOfHiAfter5=s.indexOf("Hi",5);
        int lastIndexOfHiAfter5=s.lastIndexOf("Hi",5);
        System.out.println("Searching Array : ");
        System.out.println("indexOf 'H' : " +indexofH);
        System.out.println("lastIndexOf 'H' : "+lastIndexofH);
        System.out.println("indexOf \"Hi\" :"+indexOfHi);
        System.out.println("indexOf \"Hi\" after index 5 : "+indexOfHiAfter5);
        System.out.println("lastIndexOf \"Hi\" before index 5 : "+lastIndexOfHiAfter5);

    }
}
