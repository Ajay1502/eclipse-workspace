package file;

public class Data {

	public static String payloadData() {
		return "{\r\n"
	  			+ "        \"firstName\": \"Akash\",\r\n"
	  			+ "        \"lastName\": \"Pande\",\r\n"
	  			+ "        \"age\": 20,\r\n"
	  			+ "        \"address\": \"Aurangabad\",\r\n"
	  			+ "        \"phone-Number\": \"7354455845\"\r\n"
	  			+ "    }";
	}
	
	public static String payloadDataWithParameters(String firstName,String lastName) {
		return "{\r\n"
	  			+ "        \"firstName\": \""+firstName+"\",\r\n"
	  			+ "        \"lastName\": \""+lastName+"\",\r\n"
	  			+ "        \"age\": 20,\r\n"
	  			+ "        \"address\": \"Aurangabad\",\r\n"
	  			+ "        \"phone-Number\": \"7354455845\"\r\n"
	  			+ "    }";
	}
	
	public static String payloadDataEnd() {
		return "{\r\n"
	  			+ "        \"firstName\": \"Sambhaji\",\r\n"
	  			+ "        \"lastName\": \"Bhorgir\",\r\n"
	  			+ "        \"age\": 20,\r\n"
	  			+ "        \"address\": \"Aurangabad\",\r\n"
	  			+ "        \"phone-Number\": \"7354455845\"\r\n"
	  			+ "    }";
	}
}
