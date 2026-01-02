package models;

public class Employee extends Person {
    private final int id;
    private static int Emp_id_gen = 1;
    private String position;
    private double salary;

    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        id = Emp_id_gen++;
        setPosition(position);
        setSalary(salary);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getPosition(){
        return position;
    }

    @Override
    public String toString() {
        return getPosition() + " " + super.toString() + " " + getPaymentAmount() + " tenge";
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
