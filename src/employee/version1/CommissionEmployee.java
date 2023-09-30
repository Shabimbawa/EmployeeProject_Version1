/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

/**
 *
 * @author User
 */
public class CommissionEmployee {
    private int empId;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;

    public CommissionEmployee() {
    }

    public CommissionEmployee(int empId, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        this.empId = empId;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
    }

    public CommissionEmployee(int empId, String empName, Date empDateHired, Date empBirthDate) {
        this.empId = empId;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public double getTotalSales() {
        return totalSales;
    }
    
    
    public double computeSalary(){
        double totalSalary;
        totalSalary=0;
        if(totalSales < 50000){
            totalSalary= (totalSales*0.05);
        }
        else if(totalSales >= 50000 && totalSales <100000){
            totalSalary= (totalSales*0.2);
        }
        else if(totalSales >= 100000 && totalSales <500000){
            totalSalary= (totalSales*0.3);
        }
        else if(totalSales >= 500000){
            totalSalary= (totalSales*0.5);
        }
        
        return totalSalary;
    }

    
    public void displayInfo(){
       System.out.println("Employee ID= " + empId);
       System.out.println("Employee Name= " + empName);
       System.out.println("Employee Date Hired= " + empDateHired);
       System.out.println("Employee Birth Date= " + empBirthDate);
       System.out.println("Employee Total Sales= " + totalSales);
       System.out.println("Employee Total Salary= " + computeSalary());
} 
}