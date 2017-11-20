package cs.cwnu.bean;
import java.sql.Date;
/**
 * @author iping Deng
 * @date 2017年11月15日下午7:20:32
 * @version v1.0
 */
public class Message {
    //主键
    private int id;
    //作者
    private String name;
    // 发表时间
    private Date time;
    // 标题
    private String title;
    //内容
    private String message;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }
}