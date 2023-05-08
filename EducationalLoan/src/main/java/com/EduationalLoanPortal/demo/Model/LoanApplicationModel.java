package com.EduationalLoanPortal.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoanApplicationModel {
	@Id
	
	private int LoanId;
	private String LoanType;
	private String ApplicationName;
	private String ApplicationAddress;
	private String ApplicationMobile;
	private String ApplicationEmail;
	private String ApplicationAadhar;
	private String ApplicationPan;
	private String ApplicationSalary;
	private String LoanAmountRequired;
	private String LoanRepaymentMonths;
	public int getLoanId() {
		return LoanId;
	}
	public void setLoanId(int loanId) {
		LoanId = loanId;
	}
	public String getLoanType() {
		return LoanType;
	}
	public void setLoanType(String loanType) {
		LoanType = loanType;
	}
	public String getApplicationName() {
		return ApplicationName;
	}
	public void setApplicationName(String applicationName) {
		ApplicationName = applicationName;
	}
	public String getApplicationAddress() {
		return ApplicationAddress;
	}
	public void setApplicationAddress(String applicationAddress) {
		ApplicationAddress = applicationAddress;
	}
	public String getApplicationMobile() {
		return ApplicationMobile;
	}
	public void setApplicationMobile(String applicationMobile) {
		ApplicationMobile = applicationMobile;
	}
	public String getApplicationEmail() {
		return ApplicationEmail;
	}
	public void setApplicationEmail(String applicationEmail) {
		ApplicationEmail = applicationEmail;
	}
	public String getApplicationAadhar() {
		return ApplicationAadhar;
	}
	public void setApplicationAadhar(String applicationAadhar) {
		ApplicationAadhar = applicationAadhar;
	}
	public String getApplicationPan() {
		return ApplicationPan;
	}
	public void setApplicationPan(String applicationPan) {
		ApplicationPan = applicationPan;
	}
	public String getApplicationSalary() {
		return ApplicationSalary;
	}
	public void setApplicationSalary(String applicationSalary) {
		ApplicationSalary = applicationSalary;
	}
	public String getLoanAmountRequired() {
		return LoanAmountRequired;
	}
	public void setLoanAmountRequired(String loanAmountRequired) {
		LoanAmountRequired = loanAmountRequired;
	}
	public String getLoanRepaymentMonths() {
		return LoanRepaymentMonths;
	}
	public void setLoanRepaymentMonths(String loanRepaymentMonths) {
		LoanRepaymentMonths = loanRepaymentMonths;
	}
	


}
