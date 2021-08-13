package myCap.one;

import jdk.swing.interop.SwingInterOpUtils;

class Employee {
    String name, address;
    int year_of_joining, salary;

    public Employee(String name, String address, int year_of_joining, int salary) {
        this.name = name;
        this.address = address;
        this.year_of_joining = year_of_joining;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getSalary() {
        return salary;
    }
    public int getYear_of_joining() {
        return year_of_joining;
    }
    public String toString() {
        return("Name: " + this.getName() +
                "\nAddress: " + this.getAddress() +
                "\nSalary: " + this.getSalary() +
                "\nYear of joining: " + this.getYear_of_joining());
    }
}
public class arrays {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", "64C - WallsStreet", 1994, 10000);
        System.out.println(employee1.toString());
        System.out.println();
        Employee employee2 = new Employee("Sam", "68D - WallsStreet", 2000, 20000);
        System.out.println(employee2.toString());
        System.out.println();
        Employee employee3 = new Employee("John", "26B - WallsStreet", 1999, 30000);
        System.out.println(employee3.toString());
    }
}
