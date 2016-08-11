package org.serwizz.gateway;

import org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration;

public class ProcessEngineConfiguration {

	private String jdbcUrl;
	private String jdbcDriver;
	private String jdbcUsername;
	private String jdbcPassword;
	private boolean databaseSchemaUpdate;
	private boolean jobExecutorActivate;
	private boolean asyncExecutorEnabled;
	private boolean asyncExecutorActivate;
	public String getJdbcUrl() {
		return jdbcUrl;
	}
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
	public String getJdbcDriver() {
		return jdbcDriver;
	}
	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}
	public String getJdbcUsername() {
		return jdbcUsername;
	}
	public void setJdbcUsername(String jdbcUsername) {
		this.jdbcUsername = jdbcUsername;
	}
	public String getJdbcPassword() {
		return jdbcPassword;
	}
	public void setJdbcPassword(String jdbcPassword) {
		this.jdbcPassword = jdbcPassword;
	}
	public boolean isDatabaseSchemaUpdate() {
		return databaseSchemaUpdate;
	}
	public void setDatabaseSchemaUpdate(boolean databaseSchemaUpdate) {
		this.databaseSchemaUpdate = databaseSchemaUpdate;
	}
	public boolean isJobExecutorActivate() {
		return jobExecutorActivate;
	}
	public void setJobExecutorActivate(boolean jobExecutorActivate) {
		this.jobExecutorActivate = jobExecutorActivate;
	}
	public boolean isAsyncExecutorEnabled() {
		return asyncExecutorEnabled;
	}
	public void setAsyncExecutorEnabled(boolean asyncExecutorEnabled) {
		this.asyncExecutorEnabled = asyncExecutorEnabled;
	}
	public boolean isAsyncExecutorActivate() {
		return asyncExecutorActivate;
	}
	public void setAsyncExecutorActivate(boolean asyncExecutorActivate) {
		this.asyncExecutorActivate = asyncExecutorActivate;
	}
	
	public org.activiti.engine.ProcessEngineConfiguration getActivitiProcessEngineConfiguration(){
		org.activiti.engine.ProcessEngineConfiguration config = new StandaloneProcessEngineConfiguration();
		config.setJdbcUrl(getJdbcUrl());
		config.setJdbcDriver(getJdbcDriver());
		config.setJdbcUsername(getJdbcUsername());
		config.setJdbcPassword(getJdbcPassword());
		
		
		config.setDatabaseSchemaUpdate(Boolean.toString(isDatabaseSchemaUpdate()));
		config.setJobExecutorActivate(jobExecutorActivate);
		config.setAsyncExecutorEnabled(asyncExecutorEnabled);
		config.setAsyncExecutorActivate(asyncExecutorActivate);
		
		return config;
		
	}
	
	@Override
	public String toString() {
		return "ProcessEngineConfiguration [jdbcUrl=" + jdbcUrl + ", jdbcDriver=" + jdbcDriver + ", jdbcUsername="
				+ jdbcUsername + ", jdbcPassword=" + jdbcPassword + ", databaseSchemaUpdate=" + databaseSchemaUpdate
				+ ", jobExecutorActivate=" + jobExecutorActivate + ", asyncExecutorEnabled=" + asyncExecutorEnabled
				+ ", asyncExecutorActivate=" + asyncExecutorActivate + "]";
	}
	
	
}
