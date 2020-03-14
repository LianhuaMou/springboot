package com.example.demo.druid;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 数据源监控属性
 */
@ConfigurationProperties(prefix = "spring.datasource.druid")
public class DruidDataSourcePropertiesConfig {

    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private int initialSize;
    private int minIdle;
    private int maxActive;
    private long maxWait;
    private long timeBetweenEvictionRunsMillis;
    private long minEvictableIdleTimeMillis;
    private String validationQuery;
    private boolean testWhileIdle;
    private boolean testOnBorrow;
    private boolean testOnReturn;
    private boolean poolPreparedStatements;
    private int maxPoolPreparedStatementPerConnectionSize;
    private String filters;
    
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getInitialSize() {
		return initialSize;
	}
	public void setInitialSize(int initialSize) {
		this.initialSize = initialSize;
	}
	public int getMinIdle() {
		return minIdle;
	}
	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}
	public int getMaxActive() {
		return maxActive;
	}
	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}
	public long getMaxWait() {
		return maxWait;
	}
	public void setMaxWait(long maxWait) {
		this.maxWait = maxWait;
	}
	public long getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}
	public void setTimeBetweenEvictionRunsMillis(long timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}
	public long getMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}
	public void setMinEvictableIdleTimeMillis(long minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}
	public String getValidationQuery() {
		return validationQuery;
	}
	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}
	public boolean isTestWhileIdle() {
		return testWhileIdle;
	}
	public void setTestWhileIdle(boolean testWhileIdle) {
		this.testWhileIdle = testWhileIdle;
	}
	public boolean isTestOnBorrow() {
		return testOnBorrow;
	}
	public void setTestOnBorrow(boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}
	public boolean isTestOnReturn() {
		return testOnReturn;
	}
	public void setTestOnReturn(boolean testOnReturn) {
		this.testOnReturn = testOnReturn;
	}
	public boolean isPoolPreparedStatements() {
		return poolPreparedStatements;
	}
	public void setPoolPreparedStatements(boolean poolPreparedStatements) {
		this.poolPreparedStatements = poolPreparedStatements;
	}
	public int getMaxPoolPreparedStatementPerConnectionSize() {
		return maxPoolPreparedStatementPerConnectionSize;
	}
	public void setMaxPoolPreparedStatementPerConnectionSize(int maxPoolPreparedStatementPerConnectionSize) {
		this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
	}
	public String getFilters() {
		return filters;
	}
	public void setFilters(String filters) {
		this.filters = filters;
	}
	
	public DruidDataSourcePropertiesConfig() {

	}
	public DruidDataSourcePropertiesConfig(String driverClassName, String url, String username, String password,
			int initialSize, int minIdle, int maxActive, long maxWait, long timeBetweenEvictionRunsMillis,
			long minEvictableIdleTimeMillis, String validationQuery, boolean testWhileIdle, boolean testOnBorrow,
			boolean testOnReturn, boolean poolPreparedStatements, int maxPoolPreparedStatementPerConnectionSize,
			String filters) {
		this.driverClassName = driverClassName;
		this.url = url;
		this.username = username;
		this.password = password;
		this.initialSize = initialSize;
		this.minIdle = minIdle;
		this.maxActive = maxActive;
		this.maxWait = maxWait;
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
		this.validationQuery = validationQuery;
		this.testWhileIdle = testWhileIdle;
		this.testOnBorrow = testOnBorrow;
		this.testOnReturn = testOnReturn;
		this.poolPreparedStatements = poolPreparedStatements;
		this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
		this.filters = filters;
	}
	@Override
	public String toString() {
		return "DruidDataSourcePropertiesConfig [driverClassName=" + driverClassName + ", url=" + url + ", username="
				+ username + ", password=" + password + ", initialSize=" + initialSize + ", minIdle=" + minIdle
				+ ", maxActive=" + maxActive + ", maxWait=" + maxWait + ", timeBetweenEvictionRunsMillis="
				+ timeBetweenEvictionRunsMillis + ", minEvictableIdleTimeMillis=" + minEvictableIdleTimeMillis
				+ ", validationQuery=" + validationQuery + ", testWhileIdle=" + testWhileIdle + ", testOnBorrow="
				+ testOnBorrow + ", testOnReturn=" + testOnReturn + ", poolPreparedStatements=" + poolPreparedStatements
				+ ", maxPoolPreparedStatementPerConnectionSize=" + maxPoolPreparedStatementPerConnectionSize
				+ ", filters=" + filters + "]";
	}
    
	
	
    
}