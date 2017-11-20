package cs.cwnu.dao;
import java.sql.Connection ;
import java.sql.PreparedStatement ;
import java.sql.ResultSet ;
import java.util.ArrayList;
import cs.cwnu.bean.Message;
import cs.cwnu.bean.User;
import cs.cwnu.db.DBconn;
public class UserDao {
    Connection conn = DBconn.getConn();// 数据库追接对象
    PreparedStatement pstmt ;
    public User checkLogin(String name,String password)
    {//验证用户名密码
        try{
            pstmt = conn.prepareStatement("select * from users where name= ?"+",and password= ?");
            pstmt.setString(1,name);//设置SQL语句参数
            pstmt.setString(2,password);//设置SQL语句参数
            ResultSet rs = pstmt.executeQuery();//执行查询，返回结果集
            if (rs.next()) {//通过JavaBean保存值
                User user=new User( );
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setPassword( rs.getString(3)) ;
                user.setRole(rs.getInt(4));
            }
            return null; //验正失败返回null
        }catch (Exception e) {
            e.printStackTrace();
            return null;}
    }
    public ArrayList<Message> findMbInfo() {//查询所有留言
        try{
            ArrayList<Message> al = new ArrayList<Message> ();
            pstmt= conn.prepareStatement("select * from messages") ;
            ResultSet rs = pstmt.executeQuery() ;
            while (rs.next()) {
                Message message = new Message();
                message.setId(rs.getInt(1));
                message.setName(rs.getString(2));
                message.setTime(rs.getDate(3));
                message.setTitle(rs.getString(4));
                message.setMessage(rs.getString(5));
                al.add(message);
                return al;
            }
            }catch (Exception e) {
                e.printStackTrace( );
            }
        return null;
        }
    public String getName(int id) {//获取用户名{ 通过id}
        String name = null;
        try{
            pstmt = conn.prepareStatement("select name from users where id= ?");
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery() ;
            while (rs.next()) {
                name = rs.getString(1);}
            return name;
        }catch (Exception e) {
            e.printStackTrace();
            return null;}
    }
    public boolean addInfo(Message message) {//添加一条留言
        try {
            pstmt = conn.prepareStatement("insert into messages values(?,?,?,?,?)");
            pstmt.setInt(1, message.getId());
            pstmt.setString(2, message.getName());
            pstmt.setDate(3, message.getTime());
            pstmt.setString(4, message.getTitle());
            pstmt.setString(5, message.getMessage());
            pstmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean insertUser( String name,String
            password) {//添加一个 用户
        try{
            pstmt = conn.prepareStatement("insert into users(name,password) values( ?,?)");
            pstmt.setString(1,name);
            pstmt.setString(2,password);
            pstmt.executeUpdate();
            return true;
        }catch (Exception e) {
            e.printStackTrace( );
            return false;}
    }
}