package models;

public class Student extends Person {
    private final int id;
    private static int Stud_id_gen = 1;
    private double gpa;
    private double stepend;

    public Student(String name, String surname, double gpa){
        super(name, surname);
        id = Stud_id_gen++;
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setStepend(double stepend) {
        this.stepend = stepend;
    }

    public double getStepend() {
        return stepend;
    }

    @Override
    public String getPosition(){
        return "Student";
    }

    @Override
    public String toString(){
        return getPosition() + " " + super.toString() + " " + gpa + " " + getPaymentAmount() + " tenge";
    }

    @Override
    public double getPaymentAmount(){
        if(gpa >= 2.67){
            stepend = 52450;
        } else {
            stepend = 0;
        }
        return stepend;
    }
}
