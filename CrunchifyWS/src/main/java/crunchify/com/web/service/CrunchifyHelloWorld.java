//this service is going to demonstrate CRUD operations, as we did with the example from last Friday.

package crunchify.com.web.service;

public class CrunchifyHelloWorld {
	
	//one operation is going to be addition, and the other, subtraction
	
	//not that this service has bracketed values, because it is going to ingest a value of type float from the UI
	
	public float addValue(float value) {
		return (value + 10);
	}
	
	public float subtractValue(float value) {
		return (value - 10);
	}
	
	

}
