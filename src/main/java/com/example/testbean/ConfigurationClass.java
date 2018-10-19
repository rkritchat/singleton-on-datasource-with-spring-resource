package com.example.testbean;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationClass {

    /**
     * Create object for MysqlDataSource and tell Spring to hold the object
     * for use in the future
     * @return MysqlDataSource
     */
    @Bean
    @Scope("singleton")
    public MysqlDataSource getDataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("055090323");
        dataSource.setDatabaseName("javaee");
        dataSource.setServerName("localhost");
        return dataSource;
    }
}
