/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Humberto
 */
public class TestEmployee {

    public static void main(String[] args) {
        /*Employee e1 = new Employee(); //Variable de referencia
        Employee e3 = new Employee();
        Employee e7 = new Employee();*/ 
        //Se comenta porque con el constructor inciial ya no se tienen que instanciar
        
        //e1.age = 24;
        //e3.age = 35;
        //e7.age = 19;
        
        /*if (e1.setAge(25))
            System.out.println("La edad es correcta :" + e1.getAge());
        else
            System.out.println("Es incorrecto");*/
        //sout
        /*System.out.println(e1.getAge());
        System.out.println(e3.getAge());
        System.out.println(e7.getAge());*/

        Employee e1 = new Employee("Jennifer", "Whalen", "JWHALEN", "515.123.4444", "2003/9/17", "Administration Manager", "Administration");
        Employee e2 = new Employee("Karen", "Colmenares", "KCOLMENA", "515.127.4566", "2007/8/10)", "Administration Assistant", "Administration");
        Employee e3 = new Employee("Michael", "Hartstein", "MHARTSTE", "515.123.5555", "2004, 2, 17", "Marketing Manager", "Marketing");
        Employee e4 = new Employee("Pat", "Fay", "PFAY", "603.123.6666", "2005/8/17", "Marketing Representative", "Marketing");
        Employee e5 = new Employee("Den", "Raphaely", "DRAPHEAL", "515.127.4561", "2002/7/12", "Purchasing Manager", "Purchasing");
        Employee e6 = new Employee("Sigal", "Tobias", "STOBIAS", "515.127.4564", "2005/7/24", "Purchasing Clerk", "Purchasing");
        Employee e7 = new Employee("Susan", "Mavris", "SMAVRIS", "515.123.7777", "2002/6/2007", "Human Resources Representative", "HumanResources");
        Employee e8 = new Employee("Winston", "Taylor", "WTAYLOR", "650.507.9876", "2006/1/6", "Shipping Clerk", "Shipping");
        Employee e9 = new Employee("Alexander", "Hunold", "AHUNOLD", "590.423.4567", "2006/1/3", "Programmer", "IT");
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);
        System.out.println(e6);
        System.out.println(e7);
        System.out.println(e8);
        System.out.println(e9);
    }
}
