import models.Person;
import models.Employee;
import models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Person> people = new ArrayList<>();

        File fileE = new File("C:/Users/Mechta/Desktop/2 trim/OOP/asgs/Asg2/src/Persons/Employees.txt" );
        File fileS = new File("C:/Users/Mechta/Desktop/2 trim/OOP/asgs/Asg2/src/Persons/Students.txt" );

        Scanner scE = new Scanner(fileE);
        Scanner scS = new Scanner(fileS);

        while (scE.hasNext()) {
            people.add(new Employee(scE.next(), scE.next(), scE.next(), scE.nextDouble()));
        }

        while (scS.hasNextLine()) {
            people.add(new Student(scS.next(), scS.next(), scS.nextDouble()));
        }

        scS.close();
        scE.close();

        Collections.sort(people);

        for (Person person : people){
            System.out.println(person);
        }
    }
}
