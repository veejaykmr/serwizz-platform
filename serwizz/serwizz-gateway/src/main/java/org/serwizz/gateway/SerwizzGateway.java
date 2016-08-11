package org.serwizz.gateway;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.ProcessEngine;

import org.activiti.engine.ProcessEngines;
import org.serwizz.core.api.Context;
import org.serwizz.core.api.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SerwizzGateway implements Service{ 
	
	private static final Logger LOG = LoggerFactory.getLogger(SerwizzGateway.class);
	
	private ProcessEngine processEngine = null;
	private ProcessEngineConfiguration processEngineConfiguration = null;

	public Map handle(Context context) {
		LOG.debug("SerwizzGateway handle...");
		// TODO Auto-generated method stub
		return new HashMap();
	}
	
	
	
	public ProcessEngineConfiguration getProcessEngineConfiguration() {
		return processEngineConfiguration;
	}



	public void setProcessEngineConfiguration(ProcessEngineConfiguration processEngineConfiguration) {
		LOG.debug("setting processEngineConfiguration {}",processEngineConfiguration);
		this.processEngineConfiguration = processEngineConfiguration;
	}



	public void init(){
		LOG.debug("Initializing SerwizzGateway...{}",this);
		//here initialize the workflow repository
		//processEngine = ProcessEngines.getDefaultProcessEngine();
		processEngine = processEngineConfiguration.getActivitiProcessEngineConfiguration().buildProcessEngine();
		
		LOG.debug("Initialization of process engine completed...with config {}",processEngineConfiguration);
	}
	
	public void destroy(){
		LOG.debug("Destroying SerwizzGateway...{}",this);
		
		LOG.debug("Shutting down the process engine..{}",this);
		ProcessEngines.getDefaultProcessEngine().close();
		processEngineConfiguration = null;
		
		LOG.debug("Shutdown complete ... {}",this);

	}

}
