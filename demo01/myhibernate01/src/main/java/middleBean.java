import lombok.Data;

/**
 * @auther fangbin
 * @date 19-2-22
 */
@Data
public class middleBean {
    private String ownerId;
    private String ownerName;
    private String goodName;

    public middleBean(){
    }

    public middleBean(String ownerId,String ownerName,String goodName){
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.goodName = goodName;
    }

}
