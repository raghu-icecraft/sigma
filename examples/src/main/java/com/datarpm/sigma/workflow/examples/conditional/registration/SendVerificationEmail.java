/*
 * Licensed to DataRPM. This source code is proprietary to DataRPM.
 */
package com.datarpm.sigma.workflow.examples.conditional.registration;

import com.datarpm.sigma.workflow.WorkflowState;
import com.datarpm.sigma.workflow.WorkflowStateException;

/**
 * @author gautam
 *
 */
public class SendVerificationEmail implements WorkflowState<UserRegistrationRequest, UserRegistrationContext>{

  @Override
  public void execute(UserRegistrationContext context) throws WorkflowStateException {
    System.out.println("-Executing---" + this.getClass().getName());
    
  }

}