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
    //public Employee(String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job, Department department) {
    public Employee(String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.job = job;
        this.hireDate = hireDate;
        //this.department = department;
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
        if (s < this.job.getMinSalary()) {
            this.salary = this.job.getMinSalary();
        } else if (s > this.job.getMaxSalary()){
            this.salary = this.job.getMaxSalary();
        } else {
            this.salary = s;
        } 
    }
    
    public String getJob() {
        return job.getTitle(); //Corrección
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
        //piensa para uno despues para dos y para n
        //agregar este empelado al departamento 
        //redimensionarlo
        //arraycopy
        //lista de empleados null
        //debe tener la capacidad de implementar esa lista
        if (d.employeeList[0] == null) {
            System.out.println(this);
            d.employeeList[0] = this;
        } else {
            Employee [] auxList = new Employee[d.employeeList.length+1];
            System.arraycopy(d.employeeList, 0, auxList, 0, d.employeeList.length);
            auxList[auxList.length-1] = this;
            d.employeeList = new Employee[auxList.length];
            d.employeeList = auxList;
        }
        this.department = d;
    } 
}
