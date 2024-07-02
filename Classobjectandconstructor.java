class Mobile{
    String BrandName;
    String Color;
    Mobile(){
        BrandName="Iphone";
        Color="Product Red";
    }
    Mobile(String bn,String col){
        BrandName=bn;
        Color=col;
    }
    public void call(){
        System.out.println("Calling");
    }
    public void Message(){
        System.out.println("Messaging");
    }
    public void pic(){
        System.out.println("Clicking picture");
    }
    public void Switch(){
        System.out.println("Switch on/off");
    }

}


public class Classobjectandconstructor {
    public static void main(String[] args){

        System.out.println(" ");

        Mobile m1=new Mobile();
        System.out.println("Brandname of Mobile m1 : "+m1.BrandName);
        System.out.println("Color of Mobile m1 : "+m1.Color);
        System.out.println("Functions of Mobile m1 : ");
        m1.call();
        m1.Message();

        System.out.println(" ");

        Mobile m2=new Mobile("OnePlus","Blue");
        System.out.println("Brandname of Mobile m2 : "+m2.BrandName);
        System.out.println("Color of Mobile m2 : "+m2.Color);
        System.out.println("Functions of Mobile m2 : ");
        m2.pic();
        m2.Switch();

        System.out.println(" ");
    }
    
}
