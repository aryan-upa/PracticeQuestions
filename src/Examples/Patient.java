package Examples;

public class Patient {
    static String PatientName;
    static Double height;
    static Double weight;

    public static double computeBMI(){
        return weight/(height*height);
    }

    public static void main(String[] args) {
        PatientName = args[0];
        height = Double.parseDouble(args[1]);
        weight = Double.parseDouble(args[2]);
        double var = computeBMI();
        System.out.println("BMI of "+PatientName+ " is : " + var);
    }
}
