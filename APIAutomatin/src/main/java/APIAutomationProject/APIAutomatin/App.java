package APIAutomationProject.APIAutomatin;

import org.json.JSONObject;


public class App 
{
	
    public void deta() {
    	JSONObject obj = new JSONObject();
		obj.put("firstName", "Pavan");
		obj.put("lastName", "Pande");
		obj.put("age", "25");
		obj.put("address", "Aurangabad");
		obj.put("phone-Number", "8555489632");
		
    }
    public String stringdata(){
    	String data ="\r\n"
    			+ "        \"firstName\": \"Ajay\",\r\n"
    			+ "        \"lastName\": \"Pande\",\r\n"
    			+ "        \"age\": 20,\r\n"
    			+ "        \"address\": \"Aurangabad\",\r\n"
    			+ "        \"phone-Number\": \"7354455845\"\r\n"
    			+ "    }";
  	  return data;
    }
}
