
package ISE;
import java.util.Scanner;
import main.Department;
import main.Faculty;

public class ISE_Department implements Department {
    Scanner sc;
    @Override
    public void read_data(Faculty f) {
        //n faculty details
        sc = new Scanner(System.in);
        System.out.println("Enter name of employee "+ (i+1));
        f.name = sc.nextLine();
        try {
            System.out.println("Enter age of employee " + (i + 1));
            f.age = sc.nextInt();
        }catch (AgeExeption e){
            System.out.println(e);
        }
        System.out.println("Enter designation of employee "+ (i+1))
        f.designation = sc.nextLine();
        System.out.println("Enter  of employee "+ (i+1))
        f.joining_data = sc.nextLine();
        System.out.println("Enter subjects_handled of employee "+ (i+1))
        f.subjects_handled = sc.nextInt();
        System.out.println("Enter years_of_experience of employee "+ (i+1))
        f.years_of_experience = sc.nextInt();


    }

    @Override
    public void print_data(Faculty f) {
        System.out.println("\n1)Name :" +f.name +"\n2)Age :" +f.age +"\n3)Designation :" +f.designation +"\n4)years_of_experience :" +f.years_of_experience +"\n5)subjects_handled :" +f.subjects_handled +"\n6)joining_data :" +f.joining_data);

    }

//    @Override
//    public void print_no_designations() {
//
//    }
//
//    @Override
//    public void number_research_consultancy_projs() {
//
//    }
}
