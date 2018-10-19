package com.example.testbean.service;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestService {
    @Resource
    private MysqlDataSource dataSource;
    /**
     *
     * If we set bean scope to prototype, Spring Boot will away create
     * instant fot each Service, so that is wrong way to work with api.
     * The datasource should be create only one and reuse on whole server
     *
     * To avoid create duplicate datasource
     * 1.skip set scope (scope bean's default is singleton)
     * 2.set scope to singleton {   @Scope("singleton")   }
     *
     * ** In case needed to create multiply datasource for each service,
     * just set bean scope to prototype { @Scope("prototype") }
     *
     */

}
