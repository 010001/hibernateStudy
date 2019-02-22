import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @auther fangbin
 * @date 19-2-21
 */
@Data
@Entity
@Table(name="user")
public class User {
    @Id
    @Column(name="id")
    private String id;
    @Column(name="name")
    private String name;
    @Column(name="created_by")
    private String created_by;
    @Column(name="create_date")
    private Date create_date;

}
