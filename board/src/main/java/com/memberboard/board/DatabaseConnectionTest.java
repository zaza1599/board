package com.memberboard.board;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnectionTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/root-context.xml");
        DataSource dataSource = context.getBean("realDataSource", DataSource.class); // realDataSource 빈을 가져옵니다.

        try (Connection connection = dataSource.getConnection()) {
            System.out.println("데이터베이스 연결이 성공했습니다.");
        } catch (SQLException e) {
            System.out.println("데이터베이스 연결에 실패했습니다.");
            e.printStackTrace();
        }
    }
}
