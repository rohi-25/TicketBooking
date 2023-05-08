package com.EduationalLoanPortal.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EduationalLoanPortal.demo.Model.LoanApplicationModel;
@Repository
public interface LoanApplicationModelRepository extends JpaRepository<LoanApplicationModel, Integer> {

}
