/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static employees.Country.*;
import employees.Country;
import employees.Department;
import employees.Director;
import employees.Employee;
import employees.Job;
import employees.Location;
import employees.Manager;
import employees.TaxService;
import java.util.Date;
import employees.Secretary;

/**
 *
 * @author Humberto
 */
public class TestEmployee2 {

    public static void main(String[] args) {
        //Country cArgentina = new Country("Argentina");
        //Country cAustralia = new Country("Australia");

        Location lArgentina = new Location("12-98 Victoria street", 2901, "Sidney", "New South Wales", Country.AUSTRALIA);
        Location lAustralia = new Location("20 Rue des Corps-Saints", 1730, "Geneva", "Geneve", Country.ARGENTINA);

        Department dAdministration = new Department("Administration", lAustralia);
        Department dMarketing = new Department("Marketing", lArgentina);
        Department dPurchasing = new Department("Purchasing", lAustralia);
        Department dHumanResources = new Department("Human Resources", lArgentina);
        Department dShipping = new Department("Shipping", lAustralia);
        Department dIT = new Department("IT", lArgentina);

        Job jAdministrationManager = new Job("Administration Manager", 15000, 30000);
        Job jAdministrationAssistant = new Job("Administration Assistant", 3000, 6000);
        Job jMarketingManager = new Job("Marketing Manager", 9000, 15000);
        Job jMarketingRepresentative = new Job("Marketing Representative", 4000, 9000);
        Job jPurchasingManager = new Job("Purchasing Manager", 8000, 15000);
        Job jPurchasingClerk = new Job("Purchasing Clerk", 2500, 5500);
        Job jHumanResourcesRepresentative = new Job("Human Resources Representative", 4000, 9000);
        Job jShippingClerk = new Job("Shipping Clerk", 2500, 5500);
        Job jProgrammer = new Job("Programmer", 4000, 10000);
        Job jDirector = new Job("Director", 55000, 105000);
        Job jSecretary = new Job("Secretary", 2500, 4500);
        
        Employee s1 = new Secretary("Susan", "Mavris", "SMAVRIS", "515.123.7777", new Date(2002, 6, 2007), jHumanResourcesRepresentative, dHumanResources);
        //Employee s2 = new Employee("Winston", "Taylor", "WTAYLOR", "650.507.9876", new Date(2006, 1, 6), jShippingClerk, dShipping);
        //Employee s3 = new Employee("Alexander", "Hunold", "AHUNOLD", "590.423.4567", new Date(2006, 1, 3), jProgrammer, dIT);

        //Padre apunte al hijo
        
        Employee m1 = new Manager(s1, "Jennifer", "Whalen", "JWHALEN", "515.123.4444", new Date(2003, 9, 17), jAdministrationManager, dAdministration);
        
        
        Employee m2 = new Manager(s1, "Michael", "Hartstein", "MHARTSTE", "515.123.5555", new Date(2004, 2, 17), jMarketingManager, dMarketing);
        Employee m3 = new Manager(s1, "Den", "Raphaely", "DRAPHEAL", "515.127.4561", new Date(2002, 7, 12), jPurchasingManager, dPurchasing);

        //Se comenta porque la clase Employee es abstracta
        //Employee e1 = new Employee("Karen", "Colmenares", "KCOLMENA", "515.127.4566", new Date(2007, 8, 10), jAdministrationAssistant, dAdministration);
        //Employee e2 = new Employee("Pat", "Fay", "PFAY", "603.123.6666", new Date(2005, 8, 17), jMarketingRepresentative, dMarketing);
        //Employee e3 = new Employee("Sigal", "Tobias", "STOBIAS", "515.127.4564", new Date(2005, 7, 24), jPurchasingClerk, dPurchasing);

        
        Manager m=(Manager)m1;//CASTING REGRESARLO A SU FORMA ORIGINAL
        System.out.println(m.getSecretary().getFirstName());//Ahora si se puede conocer su atributo
        
        //m1.setSalary(32000);
        //m2.setSalary(45000);
        //m3.setSalary(58000);

        //e1.setSalary(12000);
        //e2.setSalary(16000);
        //e3.setSalary(22000);
        
        Director director = new Director(s1, "William", "Gietz", "WGIETZ", "515.123.8181", new Date(2002, 6, 7), jDirector, dAdministration);
        director.setSalary(m1, 32000);
        //director.setSalary(m2, 45000);
        //director.setSalary(m3, 58000);
        //director.setSalary(e1, 12000);
        //director.setSalary(e1, 16000);
        //director.setSalary(e1, 22000);
        
        System.out.println(m1);//INVOCACION DE METODOS VIRTUALES
        System.out.println(m2);
        System.out.println(m3);
        //System.out.println(e1);//INVOCACION DE METODOS VIRTUALES
        //System.out.println(e2);
        //System.out.println(e3);
        
        //Agregar la referencia a la clase TaxRate
        TaxService tax = new TaxService();
        //Mostrar el sueldo actual con impuesto Michael m2
        //Y muestre el sueldo final sin impuestos
        System.out.println("El sueldo actual con impuestos es: " + m2.getSalary()); 
        System.out.println("El sueldo sin impuestos es: " + tax.findnetpay(m2));

    }
}

