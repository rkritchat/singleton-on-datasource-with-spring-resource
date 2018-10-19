package com.example.testbean.service;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class StudentService {

    /**
     * This resource reference from ConfigurationClass
     */
    @Resource
    private MysqlDataSource dataSource;

    public String getLaptopName(String id) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection connection = null;
        try{
            connection = dataSource.getConnection();
            ps = connection.prepareStatement("SELECT name FROM laptop WHERE id = ? ");
            ps.setString(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString("name");
            }
        }catch (Exception exception){
            System.out.println(exception);
        }finally {
            if(connection!=null) connection.close();
            if(ps!=null) ps.close();
            if(rs!=null) rs.close();
        }
        return "Not Found";
    }
}
