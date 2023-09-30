/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version1;

/**
 *
 * @author rhenz
 */
public class Main {
    public static void main(String[] args) {
        Date empHire1= new Date (2023, 9, 15);
        Date empBirth1= new Date (2003, 8, 28);
        HourlyEmployee emp1 = new HourlyEmployee(0123, "John Johnson", empHire1, empBirth1, 45, 100);
        
        emp1.displayInfo();
    
        Date empHire2= new Date (2021, 11, 8);
        Date empBirth2= new Date (1999, 2, 20);
        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(1980, "Salahuddin Akhmad", empHire2, empBirth2, 340, 10);
        
        emp2.displayInfo();
        
        Date empHire3= new Date (2021, 11, 8);
        Date empBirth3= new Date (1999, 2, 20);
        CommissionEmployee emp3 = new CommissionEmployee(0011, "Jabwari Jango", empHire3, empBirth3, 70000);
        
        emp3.displayInfo();
        
        Date empHire4= new Date (2021, 11, 8);
        Date empBirth4= new Date (1999, 2, 20);
        BasePlusCommisionEmployee emp4 = new BasePlusCommisionEmployee(8249, "Mike Michael", empHire4, empBirth4, 160000, 2000);
        
        emp4.displayInfo();
    }
}
