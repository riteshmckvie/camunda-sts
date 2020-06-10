package com.ritesh.camunda.sts;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class LoanDetailsDelegate implements JavaDelegate {
	
	private final Logger LOGGER = Logger.getLogger(LoanDetailsDelegate.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("\n\n ..Details are"
				+ "\n Activity Instance id is "+execution.getActivityInstanceId()
				+ "\n name is "+execution.getVariable("lo_Name")
				+ "\n salary is"+execution.getVariable("lo_salary"));
	}

}
