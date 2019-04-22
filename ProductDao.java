package com.dao;
 
import com.entity.ProductEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
/**
 * 即程序怎么做
 * 数据库操作类：增删改查，获取方法
 */
public class ProductDao {
	  static String url="jdbc:mysql://localhost:3306/HIMS";//连接本地sys数据库
	  static String username="root";//数据库登陆名
	  static String password="123";//密码
    /**
     * 查询列表(只查询注册人与登录人的信息)
     * 发现的问题:ProductEntity.getUsers();传过来的是空值!
     * 未解决
     */
    public List<ProductEntity> listProduct() {
    	List<ProductEntity> result = new ArrayList();
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        int users=31;
        Query query = session.createQuery("from ProductEntity where users="+users+""); //从表ProductEntity查询-where id="+id+"//where users=\"+users+\"\"
        result = query.list();
        session.close();
        sessionFactory.close();
        return result;
    }
    /**
     * 删除信息
     */
    public  void deleteProduct(int id){
        List<ProductEntity> result = new ArrayList();
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        //查询是否存在这条数据
        ProductEntity productEntity=(ProductEntity) session.get(ProductEntity.class,id);
        session.delete(productEntity);//delete
        session.beginTransaction().commit();
        session.close();
        sessionFactory.close();
    }
 
    /**
     * 添加信息
     */
    public  void addProduct(ProductEntity productEntity){
        List<ProductEntity> result = new ArrayList();
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.save(productEntity);//save
        session.beginTransaction().commit();
        session.close();
        sessionFactory.close();
    }
    /**
     * 根据id查询明细，用户修改带入参数到修改页面
     */
    public ProductEntity getDetail(int id) {
        ProductEntity result = null;
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        result = (ProductEntity) session.get(ProductEntity.class, id); //get
        session.close();
        sessionFactory.close();
        return result;
    }
    /**
     * 根据id查询明细，查询是否存在(个人账户)
     */
    public static int getYN(int users,int keyes) throws SQLException, ClassNotFoundException {
    	int y=0;
    	   String ser="select * from ProductEntity where users="+users+" and "+keyes+"";
    	   Class.forName("com.mysql.cj.jdbc.Driver");//记载数据库驱动，注册到驱动管理器   
		   Connection conn=DriverManager.getConnection(url,username,password);
		   	Statement stmts = conn.createStatement();
		   	ResultSet rss = stmts.executeQuery(ser);
        if(rss.next()){
        	String id = (String)(rss.getString("users")).trim();//检验用户名
        	int ids=Integer.parseInt(id);
        	if(users==ids) {
        		y=1;
        	}
        }
        return y;
    }
    /**
     * 修改信息
     */
    public  void updateProduct(ProductEntity productEntity){
        List<ProductEntity> result = new ArrayList();
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.update(productEntity);//update.调用封装好的方法
        session.beginTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}