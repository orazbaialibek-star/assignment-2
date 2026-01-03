package models;

public class Student extends Person {
    private double gpa;

    public Student(String name, String surname, double gpa){
        super(name, surname);
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getPosition(){
        return "Student";
    }

    @Override
    public String toString(){
        return getPosition() + " " + super.toString() + " " + getGpa() + " " + getPaymentAmount() + " tenge";
    }

    @Override
    public double getPaymentAmount(){
        if(gpa >= 3.67){
            return  62450;
        } else if (gpa >= 2.67) {
            return 52450;
        } else {
            return  0;
        }
    }
}
