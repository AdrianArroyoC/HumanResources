package employees;

import java.util.Date;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private double salary;
    private Job job;
    private Date hireDate;
    private Department department;

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email + ", phoneNumber=" + phoneNumber + ", salary=" + salary + ", job=" + job + ", hireDate=" + hireDate + ", department=" + department + '}';
    }

    //Constructor inicial
    public Employee(String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.job = job;
        this.hireDate = hireDate;
        this.department = department;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int i) {
        this.id = i;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String fn) {
        this.firstName = fn;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String ln) {
        this.lastName = ln;
    }
    
    public int getAge() {
        return age;
    }
    
    public boolean setAge(int a) {     
        boolean resultado = false;
        if (a >= 18) {
            resultado = true;
            this.age = a;
        }
        return resultado;          
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String e) {
        this.email = e;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String pn) {
        this.phoneNumber = pn;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double s) {
        this.salary = s;
    }
    
    public Job getJob() {
        return job;
    }
    
    public void setJob(Job j) {
        this.job = j;
    }
    
    public Date getHireDate() {
        return hireDate;
    }
    
    public void setHireDate(Date hd) {
        this.hireDate = hd;
    }
    
    public Department getDepartment() {
        return department;
    }
    
    public void setDepartment(Department d) {
        this.department = d;
    } 
}
