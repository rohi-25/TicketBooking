package com.EduationalLoanPortal.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EduationalLoanPortal.demo.Model.LoanApplicationModel;
import com.EduationalLoanPortal.demo.Repository.LoanApplicationModelRepository;

@Service
	public class AdminService {
		@Autowired
		LoanApplicationModelRepository lorep;
		public List<LoanApplicationModel> getAdmin()
		{
			return lorep.findAll();
		}
	 
		public LoanApplicationModel saveDetails(LoanApplicationModel lobj)
		{
			return lorep.save(lobj);
		}
	}


