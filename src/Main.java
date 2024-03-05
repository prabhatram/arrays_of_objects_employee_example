import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner reader = new Scanner(System.in);

        System.out.println("How many Employee details you want to add?");
        int count = reader.nextInt();
        reader.nextLine(); 

        Employee [] empArr = new Employee[count];// Initializing my object array

        for(int i=0; i<count; i++){
            System.out.println("Enter the employee ID:");
            String id = reader.nextLine();

            System.out.println("Enter the employee name:");
            String name = reader.nextLine();

            System.out.println("Enter the number of hobbies this employee has:");
            int num = reader.nextInt();
            reader.nextLine();

            empArr[i] = new Employee(id, name, num);
            empArr[i].addHobbies(num);
        }

        /* System.out.println("Enter the number of hobbies this employee has:");
        int num = reader.nextInt();
        reader.nextLine(); */

        //Employee emp = new Employee("001", "John", num);

        //emp.addHobbies(num);
        
        for(int i =0; i<count; i++){
            System.out.println(empArr[i]);
        }

        reader.close();




    }
}
