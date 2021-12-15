class Member {
    String Name, Address;
    int Age, Phone_Number, Salary;

    void printSalary(){
        System.out.println(this.Salary);
    }

    Member(String N, String A, int Age, int PN, int Sal){
        this.Name = N;
        this.Address = A;
        this.Age = Age;
        this.Phone_Number = PN;
        this.Salary = Sal;
    }

    public static void main(String[] args){
        Employee11 emp = new Employee11("Ram", "Delhi", 12, 1234, 12345, "Robotics");
        Manager man = new Manager("Shakti", "Delhi", 12, 1234, 78945, "Making things with machines");
        emp.printSalary();
        man.printSalary();
    }
}

class Employee11 extends Member{
    String Specialization;
    Employee11(String N, String A, int Age, int PN, int Sal, String Spe) {
        super(N,A,Age,PN,Sal);
        this.Specialization = Spe;
    }
}

class Manager extends Member {
    String Department;
    Manager(String N, String A, int Age, int PN, int Sal, String Dep){
        super(N, A, Age, PN, Sal);
        this.Department = Dep;
    }
}
