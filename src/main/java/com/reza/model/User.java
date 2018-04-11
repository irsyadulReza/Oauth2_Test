package com.reza.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class User {
	
	String json = "{\r\n" + 
			"	\"User\" :\r\n" + 
			"	[\r\n" + 
			"		{\r\n" + 
			"			\"id\" : \"1\",\r\n" + 
			"			\"username\" : \"reza\",\r\n" + 
			"			\"password\" : \"$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu\",\r\n" + 
			"			\"salary\" : \"3456\",\r\n" + 
			"			\"age\" : \"33\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"id\" : \"2\",\r\n" + 
			"			\"username\" : \"irsyadul\",\r\n" + 
			"			\"password\" : \"$2a$04$PCIX2hYrve38M7eOcqAbCO9UqjYg7gfFNpKsinAxh99nms9e.8HwK\",\r\n" + 
			"			\"salary\" : \"7823\",\r\n" + 
			"			\"age\" : \"23\"\r\n" + 
			"		},\r\n" + 
			"		{\r\n" + 
			"			\"id\" : 3,\r\n" + 
			"			\"username\" : \"anam\",\r\n" + 
			"			\"password\" : \"$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu\",\r\n" + 
			"			\"salary\" : \"4234\",\r\n" + 
			"			\"age\" : \"45\"\r\n" + 
			"		}\r\n" + 
			"	]\r\n" + 
			"}";
	
	
//	JSONObject jsonObj = new JSONObject(json);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String username;

    @Column
    @JsonIgnore
    private String password;

    @Column
    private long salary;

    @Column
    private int age;

    public long getId() {
		return id;
	}

	public void setId(long id) {
//		this.id = Long.valueOf(jsonObj.getJSONArray("User").getJSONObject(0).getLong(String.valueOf(id))) ;
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
//		this.username = jsonObj.getJSONArray("User").getJSONObject(0).getString(username);
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
//		this.password = jsonObj.getJSONArray("User").getJSONObject(0).getString(password);
		this.password = password;
	}

	public long getSalary() {
		return salary;
	}
	
	public void setSalary(long salary) {
//		this.salary = Long.valueOf(jsonObj.getJSONArray("User").getJSONObject(0).getLong(String.valueOf(salary)));
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
//		this.age = jsonObj.getJSONArray("User").getJSONObject(0).getInt(String.valueOf(age));
		this.age = age;
	}

}
