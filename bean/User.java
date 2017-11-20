package cs.cwnu.bean;
/**
 * @author iing Deng
 * @date 2817年11月15日下午7:15:25
 * @version v1.8
 */
public class User {
//角色定义
public final static int ADMIN= 0;
public final static int MEMEBER= 1;
//状态定义
public final static int ASKING =0;
public final static int ACTIVATED= 1;
public final static int BAN= 2;
//主键
private Integer id;
//户名
private String name;
//密码
private String password;
//角色{用户、管理员}
private int role;
//状态{申请、激活、禁言}
private int status;
public Integer getId() {
    return id;
}
public void setId( Integer id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}