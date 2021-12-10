package com.backend.workmotion.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("hibernate")
public class DbConfigurationProperties {

    @Value("${hibernate.formatSql}")
    private String formatSql;
    @Value("${hibernate.showSql}")
    private String showSql;
    @Value("${hibernate.dialect}")
    private String dialect;
    @Value("${hibernate.maxFetchDepth}")
    private String maxFetchDepth;
    @Value("${hibernate.jdbcBatchSize}")
    private String jdbcBatchSize;
    @Value("${hibernate.jdbcUrl}")
    private String jdbcUrl;
    @Value("${hibernate.username}")
    private String username;
    @Value("${hibernate.password}")
    private String password;
    @Value("${hibernate.hibernateDriverClassName}")
    private String hibernateDriverClassName;
    @Value("${hibernate.c3POMinSize}")
    private String c3POMinSize;
    @Value("${hibernate.c3POMaxSize}")
    private String c3POMaxSize;
    @Value("${hibernate.c3POTimeout}")
    private String c3POTimeout;
    @Value("${hibernate.c3POMaxStatement}")
    private String c3POMaxStatement;
    @Value("${hibernate.c3POIdleTestPeriod}")
    private String c3POIdleTestPeriod;

    public String getFormatSql() {
        return formatSql;
    }

    public void setFormatSql(String formatSql) {
        this.formatSql = formatSql;
    }

    public String getShowSql() {
        return showSql;
    }

    public void setShowSql(String showSql) {
        this.showSql = showSql;
    }

    public String getDialect() {
        return dialect;
    }

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    public String getMaxFetchDepth() {
        return maxFetchDepth;
    }

    public void setMaxFetchDepth(String maxFetchDepth) {
        this.maxFetchDepth = maxFetchDepth;
    }

    public String getJdbcBatchSize() {
        return jdbcBatchSize;
    }

    public void setJdbcBatchSize(String jdbcBatchSize) {
        this.jdbcBatchSize = jdbcBatchSize;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
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

    public String getHibernateDriverClassName() {
        return hibernateDriverClassName;
    }

    public void setHibernateDriverClassName(String hibernateDriverClassName) {
        this.hibernateDriverClassName = hibernateDriverClassName;
    }

    public String getC3POMinSize() {
        return c3POMinSize;
    }

    public void setC3POMinSize(String c3POMinSize) {
        this.c3POMinSize = c3POMinSize;
    }

    public String getC3POMaxSize() {
        return c3POMaxSize;
    }

    public void setC3POMaxSize(String c3POMaxSize) {
        this.c3POMaxSize = c3POMaxSize;
    }

    public String getC3POTimeout() {
        return c3POTimeout;
    }

    public void setC3POTimeout(String c3POTimeout) {
        this.c3POTimeout = c3POTimeout;
    }

    public String getC3POMaxStatement() {
        return c3POMaxStatement;
    }

    public void setC3POMaxStatement(String c3POMaxStatement) {
        this.c3POMaxStatement = c3POMaxStatement;
    }

    public String getC3POIdleTestPeriod() {
        return c3POIdleTestPeriod;
    }

    public void setC3POIdleTestPeriod(String c3POIdleTestPeriod) {
        this.c3POIdleTestPeriod = c3POIdleTestPeriod;
    }
}