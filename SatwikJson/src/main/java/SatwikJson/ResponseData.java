package venkatesh;

import org.json.simple.JSONObject;

public class ResponseData {
	
	protected static String metadata(JSONObject car, String s) 
	{
		JSONObject carObject = (JSONObject) car.get("metadata");
		if(s.equals("make")) {
		String make = (String) carObject.get("make");	
		
		return make;
		}
		else if(s.equals("vin")){
		String vin = (String) carObject.get("vin");	
		
		return vin;
		}
		else if(s.equals("colour")){
		String colour = (String) carObject.get("colour");	
		return colour;
		}
		else if(s.equals("model")){
		String model = (String) carObject.get("model");	
		return model;
		}
		else if(s.equals("Notes")){
		String Notes = (String) carObject.get("Notes");	
		return Notes;
		}
		return null;
		}
	protected static Long perdayrent(JSONObject car,String s) 
	{
		JSONObject carObject = (JSONObject) car.get("perdayrent");
		if(s.equals("Price")) {
		Long Price = (Long) carObject.get("Price");	
		return Price;
		}
		else if(s.equals("Discount")){
		Long Discount = (Long) carObject.get("Discount");	
		return Discount;
		}
		return null;
	}
	
	private static Long metrics(JSONObject car,String s) 
	{
		JSONObject carObject = (JSONObject) car.get("metrics");
		JSONObject rentalcount = (JSONObject) carObject.get("rentalcount");
		if(s.equals("yoymaintenancecost")) {
		Long yoymaintenancecost = (Long) carObject.get("yoymaintenancecost");	
		return yoymaintenancecost;
		}
		else if(s.equals("depreciation")){
		Long depreciation = (Long) carObject.get("depreciation");	
		return depreciation;
		}
		
		else if(s.equals("lastweek")){
		Long lastweek = (Long) rentalcount.get("lastweek");	
		return lastweek;
		}
		else if(s.equals("yeartodate")){
		Long yeartodate = (Long) rentalcount.get("yeartodate");	
		return yeartodate;
		}
		return null;
	}
}
