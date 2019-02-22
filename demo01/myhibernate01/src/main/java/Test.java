import java.sql.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 * @auther fangbin
 * @date 19-2-21
 */

public class Test {
  public static void main(String[] args) {
    Session session = HibernateUtils.getSessionFactory().openSession();

    session.beginTransaction();
    /*Owner owner = new Owner();
    owner.setName("fangbin");
    owner.setId("fb01");
    session.save(owner);*/
    /*Goods goods = new Goods();
    goods.setName("pingguo1111");
    goods.setOwnerId("fb01");
    session.save(goods);*/
      /*Query query=session.createQuery("from User ");
      List<User> userList = query.list();
    userList.forEach(
        user -> {
          System.out.println(user.getName());
        });*/
      Query query=session.createQuery("select new middleBean(u.id , u.name, g.name) from Owner u , Goods g where g.ownerId = u.id");
      List beanList = query.list();
      beanList.forEach(
              bean -> {
                  System.out.println(bean.toString());
              });
    session.getTransaction().commit();

  }
}
