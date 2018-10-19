
import java.util.Scanner;

public class Main {

    public static Scanner sc;
    public static int worldTime, hour, min, day, year, t, f;


    public static void main(String[] args) {
        times();
        System.out.println(" ");
        times();
        System.out.println(" ");
        times();
        System.out.println(" ");
    }

    public static void times(){
        original();
        System.out.println();
        hour = hour1(hour);
        min = minute1(min);
        day = day1(day);
        year = year1(year);
        t = tram1(t);
        f = felu1(f);
        print();
    }

    public static void original() {
        System.out.print("Enter World Time: ");
        sc = new Scanner(System.in);
        worldTime = sc.nextInt();
    }

    public static int hour1(int hour) {
        hour = ((worldTime / 60) % 24);
        return (hour);
    }

    public static int minute1(int min) {
        min = worldTime % 60;
        return (min);
    }

    public static int day1(int day) {
        day = ((worldTime / 1440) % 365) + 1;
        return (day);
    }

    public static int year1(int year) {
        year = (worldTime / 1440 / 365) + 1;
        return (year);
    }

    public static int tram1(int tDay) {
        tDay = ((worldTime / 1440) + 1) % 9;
        return (tDay);
    }

    public static int felu1(int fDay) {
        fDay = ((worldTime / 1440) + 1) % 14;
        return (fDay);
    }

    public static void print() {
        System.out.println("worldTime: " + worldTime);
        System.out.print("It is " + hour + ":");
        System.out.printf("%02d ", min);
        System.out.println("on day " + day + " of the year " + year + ".");
        System.out.println("Trammel is in day " + t + " of its 9 day cycle.");
        System.out.println("Felucca is in day " + f + " of its 14 day cycle.");
    }
}
