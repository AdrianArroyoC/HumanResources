public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private double salary;
    private String job;
    private String hireDate;
    private String department;

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email + ", phoneNumber=" + phoneNumber + ", salary=" + salary + ", job=" + job + ", hireDate=" + hireDate + ", department=" + department + '}';
    }

    //Constructor inicial
    public Employee(String firstName, String lastName, String email, String phoneNumber, String job, String hireDate, String department) {
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
    
    public String getJob() {
        return job;
    }
    
    public void setJob(String j) {
        this.job = j;
    }
    
    public String getHireDate() {
        return hireDate;
    }
    
    public void setHireDate(String hd) {
        this.hireDate = hd;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String d) {
        this.department = d;
    } 
}
