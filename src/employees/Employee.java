package employees;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public abstract class Employee { //Si es final no hereda
    private final int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private double salary;
    private Job job;
    private Date hireDate;
    private Department department;
    private static int counter;
    
    static {
        counter = 0;
    }

    //Constructor inicial
    //public Employee(String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job, Department department) {
    public Employee(String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job, Department department) {
        this(firstName, lastName, email, phoneNumber, hireDate, job);
        this.setDepartment(department);
    }
    
    public Employee(String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.job = job;
        this.hireDate = hireDate;
        this.id = counter++;
    }
    
    public int getId() {
        return id;
    }
    
//    public void setId(int i) {
//        this.id = i;
//    }
    
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
    
    protected void setSalary(double s) {
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
        
        this.department = d;
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
//        Employee [] aux = this.department.getEmployeeList();
//        if (aux == null) {
//            aux = new Employee[1];
//            aux[0] = this;
//            this.department.setEmployeeList(aux);
//        } else {
//            Employee[] temp = new Employee[aux.length + 1];
//            System.arraycopy(aux, 0, temp, 0, aux.length);
//            temp[aux.length] = this;
//            this.department.setEmployeeList(temp);
//        }
    } 
    
        //Evaluar de der-izq
    public String getDetails() { //Object o String
        return "Full name: " + firstName + " " + lastName + ", Department: " 
                + department.getName() + ", Salary: $" + salary + ", Phone Number: " 
                + phoneNumber;
    }
   
    
    //Si los dos fueran private no seria herencia aunque fuera del mismo modificador si no que seria otro metodo implementado
    
//    protected static void method(){
//        
//    }

    @Override
    public String toString() {
        return "ID:"+ id +" " + firstName + " " + lastName + " " + salary + " " + department;
    }
}
