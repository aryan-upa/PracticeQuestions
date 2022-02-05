package Examples;

public class Person {
    int age;

    Person(int initialAge) {
        if(initialAge < 0) {
            System.err.println("Age is not valid");
            this.age = 0;
        }
        else
            this.age = initialAge;
    }

    void yearPasses(){
        this.age += 1;
    }

    void amIOld(){
        if(age < 13)
            System.out.println("You are young.");
        else if(age<18)
            System.out.println("You are a teenager");
        else
            System.out.println("You are old.");
    }

    public static void main(String[] args) {
        Person p = new Person(10);
        p.yearPasses();
        p.amIOld();
    }
}
