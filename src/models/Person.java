package models;

public abstract class Person implements Payable, Comparable<Person>  {
    public final int id;
    public static int id_gen = 1;
    public String name;
    public String surname;

    public Person(String name, String surname){
        id = id_gen++;
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract String getPosition();

    @Override
    public String toString() {
        return id + ": " + name + " " + surname;
    }

    @Override
    public int compareTo(Person anotherPerson) {
        if (getPaymentAmount() > anotherPerson.getPaymentAmount()) {
            return 1;
        }

        if (getPaymentAmount() < anotherPerson.getPaymentAmount()) {
            return -1;
        }

        return 0;
    }
}