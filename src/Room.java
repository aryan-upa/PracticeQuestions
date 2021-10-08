import java.util.Scanner;

public class Room {
    boolean AC_ON;
    boolean FAN_ON;
    boolean HOME_THEATRE_ON;
    boolean LIGHT_ON;

    {
        AC_ON = false;
        FAN_ON = false;
        HOME_THEATRE_ON = false;
        LIGHT_ON = false;
    }

    public Room(String ac, String fan, String home, String light){
        if(ac.equalsIgnoreCase("ON"))
            this.AC_ON = true;
        if(fan.equalsIgnoreCase("ON"))
            this.FAN_ON = true;
        if(home.equalsIgnoreCase("ON"))
            this.HOME_THEATRE_ON = true;
        if(light.equalsIgnoreCase("ON"))
            this.LIGHT_ON = true;
    }

    public boolean isAC_ON() {
        return AC_ON;
    }

    public boolean isFAN_ON() {
        return FAN_ON;
    }

    public boolean isHOME_THEATRE_ON() {
        return HOME_THEATRE_ON;
    }

    public boolean isLIGHT_ON() {
        return LIGHT_ON;
    }

    boolean overLoad() {
        var over = 0;
        if (this.AC_ON)
            over += 1200;
        if (HOME_THEATRE_ON)
            over += 600;
        if (FAN_ON)
            over += 400;
        if (LIGHT_ON)
            over += 100;
        return over > 2000;
    }
}

class Exe_Room{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Want to turn AC On? ");
        String ac = sc.nextLine();
        System.out.println("Want to turn Home Theatre On? ");
        String home = sc.nextLine();
        System.out.println("Want to turn Fan On? ");
        String fan = sc.nextLine();
        System.out.println("Want to turn Light On? ");
        String light = sc.nextLine();
        Room r1 = new Room(ac,fan,home,light);
        if(r1.overLoad())
            System.out.println("Overload...");
        else
            System.out.println("Not Overload...");
    }
}
