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
public class HourlyEmployee {
    private int empId;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(int empId, String empName, Date empDateHired, Date empBirthDaye, float totalHoursWorked, float ratePerHour) {
        this.empId = empId;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDaye;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empId, String empName, Date empDateHired, Date empBirthDaye) {
        this.empId = empId;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDaye;
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

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
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

    public Date getEmpBirthDaye() {
        return empBirthDate;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }
    
    public double computeSalary(){
        double excessHours;
        double excessSalary;
        double totalSalary;
        if(totalHoursWorked>40){
            excessHours=totalHoursWorked-40;
            excessSalary= (excessHours*ratePerHour)*1.5;
            totalSalary= excessSalary + ((totalHoursWorked-excessHours)* ratePerHour);           
        }
        else{
            totalSalary= totalHoursWorked * ratePerHour;
        }
        return totalSalary;
    }
    
    public void displayInfo(){
       System.out.println("Employee ID= " + empId);
       System.out.println("Employee Name= " + empName);
       System.out.println("Employee Date Hired= " + empDateHired);
       System.out.println("Employee Birth Date= " + empBirthDate);
       System.out.println("Employee Total Hours Worked= " + totalHoursWorked);
       System.out.println("Employee rate per hour= " + ratePerHour );
       System.out.println("Employee Total Salary= " + computeSalary());
}










}
    
