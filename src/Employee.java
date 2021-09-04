import java.util.Scanner;

public class Employee {
    String name;
    Integer DOJ;
    String Address;
    public void add_Info(Employee obj){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee name : ");
        obj.name = sc.nextLine();
        System.out.print("Enter the Employee joining year : ");
        obj.DOJ = sc.nextInt();
        String clr = sc.nextLine();
        System.out.print("Enter the Employee address : ");
        obj.Address = sc.nextLine();
    }

    public void show_Info(Employee obj){
        System.out.println("Employee name : " + obj.name);
        System.out.println("Employee joining year : " + obj.DOJ);
        System.out.println("Employee address : " + obj.Address);
    }

    public static void main(String[] args) {
        Employee n1 = new Employee();
        System.out.println("Enter Employee 1 Details : ");
        n1.add_Info(n1);
        Employee n2 = new Employee();
        System.out.println("Enter Employee 2 Details : ");
        n2.add_Info(n2);
        Employee n3 = new Employee();
        System.out.println("Enter Employee 3 Details : ");
        n3.add_Info(n3);
        n1.show_Info(n1);
        n2.show_Info(n2);
        n3.show_Info(n3);
    }
}
