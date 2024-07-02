class Employee{
    private int Salary;
    private String Name;
    Employee(int Salary,String Name){
        this.Salary=Salary;
        this.Name=Name;

    }
    Employee(){
        Salary=10000;
        Name="Charitha";
    }
    public int getSalary(){
        System.out.println(" ");
        System.out.println("Employee : The Name is "+ Name+" and The Salary is "+Salary);
        return Salary;
    }
    public String getName(){
        return Name;
    }
}
class programmer extends Employee{
    private int bonus;
    programmer(int bonus){
        super();
        this.bonus=bonus;
    }
    programmer(){
        super();
        bonus=5000;
    }
    public int getBonus(){
        System.out.println(" ");
        System.out.println("Programmer : The Bonus is "+bonus);
        return bonus;
    }

}

public class Inheritance {
    public static void main(String[] args){
        programmer prog=new programmer();
        System.out.println("salary : "+prog.getSalary()+" , " +"Name : "+prog.getName());
        System.out.println("Bonus : "+prog.getBonus());
        System.out.println(" ");
        // System.out.println(prog.getSalary());
        // System.out.println(prog.getBonus());
        prog.getSalary();
        prog.getBonus();

    }
}
