package entity;

public class UserJson {

	String data;
	UserJson next;
	
	public UserJson(String d) {
		this.data=d;
		this.next=null;
	}
	public UserJson() {
		this.data="";
		this.next=null;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public UserJson getNext() {
		return next;
	}
	public void setNext(UserJson next) {
		this.next = next;
	}
	public UserJson next() {
		return this.next;
	}
	
	
}
