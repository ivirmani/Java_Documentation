import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MyTwoWheeler myScooter = new MyTwoWheeler();

        System.out.print("Enter the year of manufacture of Scooter: ");
        myScooter.putData(sc.nextInt());

        System.out.print("\nThe data stored in myScooter instance is: " + myScooter.getData());

        FourWheeler myCar = new FourWheeler();
        System.out.print("Enter the year of manufacture of car: ");
        myCar.putData(sc.nextInt());

        System.out.print("\nThe data stored in myCar instance is: " + myCar.getData());
    }
}