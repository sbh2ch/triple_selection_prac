
package com.son.selectionTest.vo;

/**
 * <pre>
 * com.son.selectionTest.vo 
 *    |_ PeopleVO.java
 * 
 * </pre>
 * 
 * @date : 2017. 3. 31. 오후 6:57:09
 * @version :
 * @author : kiost
 */
public class PeopleVO {
	private int no;
	private String name;
	private String city;
	private String phone;

	public PeopleVO() {
	}

	public PeopleVO(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
