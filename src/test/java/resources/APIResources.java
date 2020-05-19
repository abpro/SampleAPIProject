package resources;
//collection of methods or constants
public enum APIResources {



	AddPlaceAPI("/maps/api/place/add/json"),
	getPlaceAPI("/maps/api/place/get/json"),
	deletePlaceAPI("/maps/api/place/delete/json");
	
	private String resource;

	private APIResources(String resource) {
		// TODO Auto-generated constructor stub
		this.resource = resource;
	}
	
	
	public String getResource(){
		return resource;
	}
}
