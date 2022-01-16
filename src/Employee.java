import java.util.Scanner;

/**
 * Employee Class : Helps to create the objects of employee type
 */
public class Employee {
    /**
     * name : String : The name of the Employee.
     * */
    String name;
    /**
     * DOJ : Integer : The date of joining of the Employee.
     * */
    Integer DOJ;
     /**
      * Address : String : The Address of the Employee.
      * */
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

    /*
    Static: Name if the class : Class Owned
    Non-Static: Name if the class' object : Object Owned
        But, if we are accessing it inside the class then we need not write the object's name.

    We can call a static method inside a non-static method, but we can not call a non-static method inside a static
        method.
     */

    //static method
    private static byte countNumberofEmployeesInTeam(String teamName) {
        return (byte) 0;
    }

    private static short countNumberOfPeopleForOfficeParty() {
        return (short) (countNumberofEmployeesInTeam("Sales") +
                        countNumberofEmployeesInTeam("Engineering") +
                        countNumberofEmployeesInTeam("HR") +
                        countNumberofEmployeesInTeam("Accounts") +
                        countNumberofEmployeesInTeam("Legal"));
    }


    //non-static method
    private void performTask(String task){

    }

    private void showPresentation(String presentationTopic){
        performTask("Show Presentation on" + presentationTopic);
    }

    /*
    Input : Parameters List :
        We can declare variables inside the parentheses of a method.
        1. Java primitive type -> byte, short, int, long ...
        2. Java referenced type -> String, BigInteger, BigDecimal, Java Arrays

        1. When we want to input multiple values...
            if the data type of the values are different...
                We declare different variable of different data types.
            if the data type of the variable is same...
                We declare an array of that data type
     */

    private void doNothing(char a, byte b) {
    }

    private void doNothing(int[] a) {
    }

    /*
    Output : Return type :
    We write the return type of the value(s) to be returned by the method.
        1. Java primitive type -> byte, short, int, long ... + void
        2. Java referenced type -> String, BigInteger, BigDecimal, Java Arrays
     */

    private int returnSome(){
        return 0;
    }

    private int[] returnANumberOfSome(){
        return new int[10];
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
