class Employee{
    int empid;
    String name;
    static String CompanyName="Amazon";
    Employee(int eid,String ename){
        empid=eid;
        name=ename;
    }
    public void display(){
        System.out.println("\n" + "Employee id : "+empid+"\nEmployee Name : "+name+"\nCompanyName : "+CompanyName);
    }
    
}

class Count{
    static int i =0;
    Count(){
        i++;
        System.out.println("Count Number :"+i);
    }

}
public class StaticVariable {
    public static void main(String[] args){
        Employee E1=new Employee(1, "Charitha");

        Employee E2=new Employee(2, "Jyoshitha");

        E1.display();
        E2.display();

        System.out.println(" ");

        Count C1=new Count();
        Count C2=new Count();
        Count C3=new Count();
    }
    
}
