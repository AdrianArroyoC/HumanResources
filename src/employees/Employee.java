/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import exceptions.IllegalAgeException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.io.Serializable;

/**
 *
 * @author Humberto
 */
public class Employee implements Comparable, Serializable{

    private final int ID;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private Date hireDate;
    private Job job;
    private double salary;
    private Department department;
    private static int counter;

    static {
        counter = 0;
    }

    public Employee(String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job, Department department) {
        this(firstName, lastName, email, phoneNumber, hireDate, job);
        this.department = department;
    }

    public Employee(String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.job = job;
        this.ID = counter++;
    }

    public int getId() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        if (salary > this.getJob().getMaxSalary()) {
            salary = this.getJob().getMaxSalary();
        } else if (salary < this.getJob().getMinSalary()) {
            salary = this.getJob().getMinSalary();
        }
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
//        Employee[] employeeList = department.getEmloyeeList();
//        if (employeeList != null) {
//            Employee[] aux = new Employee[employeeList.length + 1];
//            System.arraycopy(employeeList, 0, aux, 0, employeeList.length);
//            aux[aux.length - 1] = this;
//            this.getDepartment().setEmloyeeList(aux);
//        } else {
//            employeeList = new Employee[1];
//            employeeList[0] = this;
//            this.getDepartment().setEmloyeeList(employeeList);
//        }
        if (this.department.getEmloyeeList() == null) {
            this.department.setEmloyeeList(new ArrayList());
        } 
        this.department.getEmloyeeList().add(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age >= 18) {
            this.age = age;
        } else {
            throw new IllegalAgeException(age,this);
        }
        
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", Full name: " + lastName + " " + firstName
                + ", Department: " + department.getName() + ", Salary: $"
                + salary + ", PhoneNumber: " + phoneNumber;
    }

    @Override
    public int compareTo(Object t) {
        int result = -1;
        if(t != null && t instanceof Employee) {
            Employee other = (Employee) t;
            if(this.ID < other.ID) {
                result = -1;
            } else if (this.ID > other.ID){
                result = 1;
            } else {
                result = 0;
            }
        } else {
            throw new IllegalArgumentException("Objeto Nulo o No compatible");
        }
        return result;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.ID;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        final Employee other = (Employee) o;
        if (this.hashCode() != other.hashCode()) {
            return false;
        }
        return true;
    }
}
