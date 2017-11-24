package service;

import java.util.HashMap;

import dao.JSONDB;
import entity.UserJson;

public class EncoderService {

	JSONDB db=new JSONDB();
	
	public void encodeAndStore(String string) {
		
	}

	public UserJson encodeStringToUserJson(String input) {
		
		String[] arr=input.split(":");
		UserJson ret=null;
		UserJson u = new UserJson();
		if(arr.length>0){
			u = new UserJson(arr[0]);
			ret=u;
			for (int i = 1; i < arr.length; i++) {
				u.setNext(new UserJson(arr[i]));
				u=u.next();
			}
		}
		return ret;
	}

	public void putinDB(UserJson u) {
		JSONDB tempdb=this.db;
		while(u!=null){
			 tempdb=tempdb.getChildren().get(u.getData());
			if(tempdb!=null){
				db=tempdb;
			}else{
				HashMap<String,JSONDB> hm=tempdb.getChildren();
				hm.put(u.getData(),new JSONDB());
				tempdb=hm.get(u.getData());
			}
			u=u.next();
		}
	}

	public void displayJSONDB() {
	}

}
