/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static employees.Country.*;
import employees.Department;
import employees.Director;
import employees.Employee;
import employees.Secretary;
import employees.Job;
import employees.Location;
import employees.Manager;
import employees.TaxService;
import invoice.Invoice;
import java.util.Date;
import taxrate.ITaxService;

/**
 *
 * @author Humberto
 */
public class TestEmployee {

    public static void main(String[] args) {
        Location lArgentina = new Location("12-98 Victoria street", 2901, "Sidney", "New South Wales", ARGENTINA);
        Location lAustralia = new Location("20 Rue des Corps-Saints", 1730, "Geneva", "Geneve", AUSTRALIA);

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
        Employee s2 = new Secretary("Winston", "Taylor", "WTAYLOR", "650.507.9876", new Date(2006, 1, 6), jShippingClerk, dShipping);
        Employee s3 = new Secretary("Alexander", "Hunold", "AHUNOLD", "590.423.4567", new Date(2006, 1, 3), jProgrammer, dIT);

        Employee m1 = new Manager(s1, "Jennifer", "Whalen", "JWHALEN", "515.123.4444", new Date(2003, 9, 17), jAdministrationManager, dAdministration);
        Employee m2 = new Manager(s2, "Michael", "Hartstein", "MHARTSTE", "515.123.5555", new Date(2004, 2, 17), jMarketingManager, dMarketing);
        Employee m3 = new Manager(s3, "Den", "Raphaely", "DRAPHEAL", "515.127.4561", new Date(2002, 7, 12), jPurchasingManager, dPurchasing);

        Employee e1 = new Secretary("Karen", "Colmenares", "KCOLMENA", "515.127.4566", new Date(2007, 8, 10), jAdministrationAssistant, dAdministration);
        Employee e2 = new Secretary("Pat", "Fay", "PFAY", "603.123.6666", new Date(2005, 8, 17), jMarketingRepresentative, dMarketing);
        Employee e3 = new Secretary("Sigal", "Tobias", "STOBIAS", "515.127.4564", new Date(2005, 7, 24), jPurchasingClerk, dPurchasing);

        Manager m = (Manager) m1;
        System.out.println(m.getSecretary().getFirstName());

        Director director = new Director(s3, "William", "Gietz", "WGIETZ", "515.123.8181", new Date(2002, 6, 7), jDirector, dAdministration);
        director.setSalary(m1, 32000);
        director.setSalary(m2, 45000);
        director.setSalary(m3, 58000);

        director.setSalary(e1, 12000);
        director.setSalary(e2, 16000);
        director.setSalary(e3, 22000);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        TaxService taxSvc = new TaxService();
        System.out.println("Full salary: " + m1.getSalary() + ", Net Salary: " + taxSvc.findnetpay(m1));
        System.out.println("Full salary: " + e1.getSalary() + ", Net Salary: " + taxSvc.findnetpay(e1));

        Invoice invoice = new Invoice(1, "monthly salary", taxSvc.findnetpay(e3), 1);
        System.out.println(invoice);
    }
}

