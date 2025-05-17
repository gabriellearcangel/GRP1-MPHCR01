package com.mycompany.employee;

import java.time.LocalDate;

// EmpNo Exception
class InvalidEmpNoException extends Exception {
    public InvalidEmpNoException(String message) {
        super(message);
    }
}

// PayCoverage Exception
class InvalidPayCoverageException extends Exception {
    public InvalidPayCoverageException(String message) {
        super(message);
    }
}
public class Employee {
    private int empNo;
    private String empName;
    private LocalDate birthday;
    private double hourlyRate;
    private double basicSalary;
    
    public String getEmpNo() {
    return String.valueOf(empNo);
    }
    
    public String getEmpName() {
    return empName;    
    }
    
    public String getBirthday() {
    return String.valueOf(birthday);
    }
    
    public String getHourlyRate() {
    return String.valueOf(hourlyRate);
    }
    
    public String getBasicSalary() {
    return String.valueOf(basicSalary);
    }
    
    public void setEmpNo(int empNo) throws InvalidEmpNoException {
    if (empNo < 10001 && empNo > 10034) {
        throw new InvalidEmpNoException("Employee Number must be between 10001 and 10034.");
    }
        this.empNo = empNo;
    }
    
    public void setEmpName(String empName) {
    this.empName = empName;
    }
    
    public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
    }
    
    public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
    }
    
    // Methods
    public void payCoverage() throws InvalidPayCoverageException {
        if (basicSalary < 22500 && basicSalary > 90000) {
            throw new InvalidPayCoverageException("Basic salary must not exceed 90,000 and not fall below 22,500");
        }
        basicSalary = hourlyRate * 8;
    }
}
