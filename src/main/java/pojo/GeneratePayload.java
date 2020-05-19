package pojo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratePayload {

	
	Location location = new Location();
	AddPlace addPlace = new AddPlace();
	List<String> list = new ArrayList<String>();
	ObjectMapper mapper = new ObjectMapper();
	
	public String getPayload() throws JsonProcessingException{
		
		location.setLat(-38.383494);
		location.setLng(33.427362);
		
		list.add("shoe park");
		list.add("shop");
		
		
		addPlace.setAccuracy(50);
		addPlace.setLanguage("French-IN");
		addPlace.setName("Frontline house");
		addPlace.setAddress("29, side layout, cohen 09");
		addPlace.setPhone_number("(+91) 983 893 3937");
		addPlace.setTypes(list);
		addPlace.setLocation(location);
		

		String payload = mapper.writeValueAsString(addPlace);
		
		return payload;
	}
	
}
