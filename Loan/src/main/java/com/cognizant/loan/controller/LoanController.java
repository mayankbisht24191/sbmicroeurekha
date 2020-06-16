package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.Loan;

@RestController
@RequestMapping("/loans")
public class LoanController {
	
	@GetMapping("/{number}")
	public Loan getLoanDetails(@PathVariable String number)
	{
		Loan l=new Loan();
		l.setNumber(number);
		l.setLoan(2000);
		l.setType("Education");
		l.setEmi(1245);
		l.setTenure(24);
		return l;
	}
}
