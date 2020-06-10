package com.ritesh.camunda.sts;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckEligibilityDelegate implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		//Object name = execution.getVariable("lo_Name");
		Object salary = execution.getVariable("lo_salary");
		if(salary != null && (Long)salary > 9999) {
			execution.setVariable("isEligible", true);
		} else {
			execution.setVariable("isEligible", false);
		}
		
	}

}
