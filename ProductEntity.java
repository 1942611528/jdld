package com.entity;

public class ProductEntity {
	//信息实体
	int keyes=0;
	int id=0;
	int users=0;
	String name=null;
	String age=null;
	String sex="man",sex2="women";

	public int getUsers() {
		return users;
	}
	public void setUsers(int users) {
		this.users = users;
	}

	float price;
//密码
	public int getKeyes() {
        return keyes;
    }
	public void setKeyes(int keyes) {
		this.keyes = keyes;
	}

//用户名
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

	//用户名2
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
//年龄    
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
//性别    
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex2() {
        return sex2;
    }
    public void setSex2(String sex2) {
        this.sex = sex2;
    }
 
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
