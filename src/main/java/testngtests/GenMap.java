package testngtests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenMap {

	Map<String, String> map = new HashMap<String, String>();
	List<String> arrayList = new ArrayList<String>();

	public Object[] getAListOfPayloads(){
		

		arrayList.add("Payload1");
		arrayList.add("Payload2");
	    Object[] objArray = arrayList.toArray();

		//System.out.println(objArray);
		return objArray;
	}
	
	
	
}
