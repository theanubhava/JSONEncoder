package controller;

import entity.UserJson;
import service.EncoderService;

public class EncoderController {

	public static void main(String[] args) {
		//take input form scanner
		//send the input to service for processing and 
		//then send to dao to store in db
		EncoderService service = new EncoderService();
		String input="Nokia:Lumia:7:Price=10000";
		
		UserJson u=service.encodeStringToUserJson(input);
		
		service.putinDB(u);
		
		service.displayJSONDB();
	}
}
