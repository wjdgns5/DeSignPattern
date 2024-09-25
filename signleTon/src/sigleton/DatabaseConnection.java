package sigleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jam?serverTimeZone=Asia/Seoul";
        String user = "root";
        String password = "1234";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스에 성공적으로 연결되었습니다!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("데이터베이스 연결에 실패했습니다.");
        }
    }

    // 싱글톤 이랑 비슷하게 synchronized : 공유
    public static synchronized DatabaseConnection getInstance() {
        if(instance == null) {
            instance = new DatabaseConnection();
            System.out.println("생성");
        }
        System.out.println("생성 한게 있어서 기존에꺼 가져옴");
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
