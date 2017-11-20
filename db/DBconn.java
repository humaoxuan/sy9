package cs.cwnu.db;
import java.sql.*;
public class DBconn {
    //Connection对象
    public static Connection conn ;
    //连接数据库
    public static Connection getConn(){
        try{
//加载注册SQLSever的JDBC驱动
            Class.forName("com.mysq1.jdbc.Driver");
//编写链接字符串，创建并且获取链接
            conn=DriverManager.getConnection("jdbc :mysql ://localhost: 3386/msgdb","root","1234");
            return conn;
        }catch(Exception e) {
            System.out.println("数据库链接失败...");
            e.printStackTrace();
        }
            return null;
    }
        public static void CloseConn () {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }