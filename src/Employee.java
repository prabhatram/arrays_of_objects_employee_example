import java.util.Scanner;
import java.util.Arrays;

public class Employee {


    Scanner reader = new Scanner(System.in);
    private String empID;
    private String empName;
    private String [] empHobbies;

    public Employee(String empID, String empName, int num) {
        this.empID = empID;
        this.empName = empName;
        empHobbies = new String[num];
    }

    public Employee(){}

    public String getEmpID() {
        return empID;
    }
    
    public String getEmpName() {
        return empName;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }
    
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpHobbies(String [] empHobbies) {
        this.empHobbies = empHobbies;
    }

    public String [] getEmpHobbies() {
        return empHobbies;
    }

    public void addHobbies(int num){
        for(int i=0; i<num ; i++){
            System.out.println("Enter hobby "+(i+1));
            empHobbies[i] = reader.nextLine();
        }  
    }

    @Override
    public String toString() {
        
        return "Employee ID: " + empID + "\n" + 
        "Employee Name: " + empName + "\n" + 
        "Employee Hobbies=" + Arrays.toString(empHobbies) + "\n";
    }
}

