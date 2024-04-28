package com.loan_management.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.loan_management.entity.BorrowerInfo;
import com.loan_management.repository.BorrowerInfoRepository;

@Service
public class CommercialService {

    @Autowired
    private BorrowerInfoRepository borrowerInfoRepository;

    public double processLoanApplication(double requestedAmount, String clientId) {
        // Retrieve borrower info from database based on client id
        BorrowerInfo borrowerInfo = borrowerInfoRepository.findByClientId(clientId);

        if (borrowerInfo == null) {
            throw new IllegalArgumentException("Borrower info not found for client ID: " + clientId);
        }

        // Use borrower's income and financial situation to evaluate eligibility
        boolean eligible = evaluateEligibility(borrowerInfo.getIncome(), borrowerInfo.getFinancialSituation(), requestedAmount);
        // For simplicity, let's assume score is directly based on eligibility
        double score = eligible ? 100.0 : 0.0;


        return score;
    }

    private boolean evaluateEligibility(double income, boolean financialSituation, double requestedAmount) {
        // Add your logic here to evaluate eligibility based on income, financial situation, and requested amount
        // For example, you could use income-to-debt ratio, credit score, etc.
        // For simplicity, let's assume eligibility if income is sufficient for requested amount

        if(!financialSituation){
            return false;
        }
        return income >= requestedAmount;
    }
}
