package models;

public class Employee extends Person {
    private String position;
    private double salary;

    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getPosition(){
        return position;
    }

    @Override
    public String toString() {
        return "Employee (" + getPosition() + ") " + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
