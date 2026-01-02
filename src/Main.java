import models.Person;
import models.Employee;
import models.Student;

import models.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Person> people = new ArrayList<>();

        //ArrayList<Employee> employees = new ArrayList<>();
        //ArrayList<Student> students = new ArrayList<>();

        File fileE = new File("C:/Users/Mechta/Desktop/2 trim/OOP/asgs/Asg2/src/Persons/Employees.txt" );
        File fileS = new File("C:/Users/Mechta/Desktop/2 trim/OOP/asgs/Asg2/src/Persons/Students.txt" );

        Scanner scE = new Scanner(fileE);
        Scanner scS = new Scanner(fileS);

        while (scE.hasNextLine()) {
            String name = scE.next();
            String surname = scE.next();
            String position = scE.next();
            String salaryString = scE.next();
            double salary = Double.parseDouble(salaryString);
            people.add(new Employee(name, surname, position, salary));
        }

        while (scS.hasNextLine()) {
            String name = scS.next();
            String surname = scS.next();
            String salaryString = scS.next();
            double salary = Double.parseDouble(salaryString);
            people.add(new Student(name, surname, salary));
        }

        Collections.sort(people);

        for (Person person : people){
            System.out.println(person);
        }
    }
}
