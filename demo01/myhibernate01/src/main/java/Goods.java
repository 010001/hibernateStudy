import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @auther fangbin
 * @date 19-2-22
 */
@Data
@Entity
@Table(name="goods")
public class Goods {
    @Id
    @Column(name="name")
    private String name;
    @Column(name="ownerId")
    private String ownerId;


}
