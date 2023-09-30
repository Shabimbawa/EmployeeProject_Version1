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
public class PieceWorkerEmployee {
    private int empId;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private float totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int empId, String empName, Date empDateHired, Date empBirthDate, float totalPiecesFinished, float ratePerPiece) {
        this.empId = empId;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empId, String empName, Date empDateHired, Date empBirthDate) {
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

    public void setTotalPiecesFinished(float totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
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

    public float getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public double computeSalary(){
        float remainingPieces;
        float totalSalary;
        remainingPieces=totalPiecesFinished;
        while(remainingPieces>=100){
            totalPiecesFinished +=10;
            remainingPieces-=100;
        }
        totalSalary=(totalPiecesFinished*ratePerPiece);
        return totalSalary;
    }



    public void displayInfo(){
       System.out.println("Employee ID= " + empId);
       System.out.println("Employee Name= " + empName);
       System.out.println("Employee Date Hired= " + empDateHired);
       System.out.println("Employee Birth Date= " + empBirthDate);
       System.out.println("Employee Total Pieces Finished= " + totalPiecesFinished);
       System.out.println("Employee rate per Piece= " + ratePerPiece );
       System.out.println("Employee Total Salary= " + computeSalary());
}    
}
