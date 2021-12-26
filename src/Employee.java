import java.util.Scanner;

/**
 * Employee Class : Helps to create the objects of employee type
 */
public class Employee {
    /**
    name : String : The name of the Employee.
     */
    String name;
     /**
     DOJ : Integer : The date of joining of the Employee.
      */
    Integer DOJ;
     /**
     Address : String : The Address of the Employee.
      */
    String Address;

    /**
     * This method adds creates an employee type object in the file.
     * */
    public void add_Info(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee name : ");
        name = sc.nextLine();
        System.out.print("Enter the Employee joining year : ");
        DOJ = sc.nextInt();
        String clr = sc.nextLine();
        System.out.print("Enter the Employee address : ");
        Address = sc.nextLine();
    }

    /**
     * This method shows the info of the employee accessing the function.
     */
    public void show_Info(){
        System.out.println("Employee name : " + name);
        System.out.println("Employee joining year : " + DOJ);
        System.out.println("Employee address : " + Address);
    }

    /**
    Main Method...
     */
    public static void main(String[] args) {
        Employee n1 = new Employee();
        System.out.println("Enter Employee 1 Details : ");
        n1.add_Info();
        Employee n2 = new Employee();
        System.out.println("Enter Employee 2 Details : ");
        n2.add_Info();
        Employee n3 = new Employee();
        System.out.println("Enter Employee 3 Details : ");
        n3.add_Info();
        n1.show_Info();
        n2.show_Info();
        n3.show_Info();
    }
}
