package dao;

import java.util.HashMap;

public class JSONDB {

	String data;
	HashMap<String, JSONDB> children;
	
	public JSONDB() {
		this.data=null;
		this.children=new HashMap<>();
	}
	
	public String getUj() {
		return data;
	}
	public void setUj(String uj) {
		this.data = uj;
	}
	public HashMap<String, JSONDB> getChildren() {
		return this.children;
	}
	public void setChildren(HashMap<String, JSONDB> children) {
		this.children = children;
	}
	
	
}
