package com.action;
 
import com.dao.ProductDao;
import com.entity.ProductEntity;

import java.sql.SQLException;
import java.util.List;
/**
 * 即程序要去做什么
 * 分别为增加，删除，修改，查询，获取准备对应的方法.
 * Created by lvjun on 2018-03-28.
 */
public class ProductAction {
 
    //声明实例化对象以便于在每一个方法中调用
    ProductDao productDao = new ProductDao();
    ProductEntity productEntity=null;
    List<ProductEntity> productEntityList;
 
    public ProductDao getProductDao() {
        return productDao;
    }
 
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }
 
    public ProductEntity getProductEntity() {
        return productEntity;
    }
 
    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }
 
    public List<ProductEntity> getProductEntityList() {
        return productEntityList;
    }
 
    public void setProductEntityList(List<ProductEntity> productEntityList) {
       
    	
    	this.productEntityList = productEntityList;
    }
 
    /**
     * 查询列表 方法调用
     **/
    public String GetList() {
//    	try {
    		//String m=null;
    		productEntityList = productDao.listProduct();
    		if(productEntityList!=null) return "showList";
//    	}catch(NullPointerException e) {
//    		System.out.println("发生异常的原因为 :"+e.getMessage());
//    	}
        return null;
    }
    /**
     * ------查询列表是否存在(跳转到ProductDao)
     * @throws SQLException 
     * @throws ClassNotFoundException 
     **/
    public String GetUser() throws SQLException, ClassNotFoundException {
    	int y=0;
    	 y=productDao.getYN(productEntity.getUsers(),productEntity.getKeyes());
            if(y==0) {
            	return "No";
            }
           
    	 return "Yes";
    }
 
    /**
     * 删除
     **/
    public String GetDelete() {
        productDao.deleteProduct(productEntity.getId());
        return "GetList";
    }
 
    /**
     * ID明细
     * */
    public  String GetDetail(){
        productDao.getDetail(productEntity.getId());
        return "showDetail";
    }
 
    /**
     * 修改
     * */
    public  String GetUpdate(){
        productDao.updateProduct(productEntity);
        return "GetList";
    }
 
    /**
     * 添加
     * */
    public  String GetInsert(){
        productDao.addProduct(productEntity);
        return "GetList";
    }
 
 
 
}