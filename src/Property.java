
public class Property {
	private int PropertyID;
	private String Description;
	private int PropertyOwnerID;
	public Property(int propertyID, String description, int propertyOwnerID) {
		PropertyID = propertyID;
		Description = description;
		PropertyOwnerID = propertyOwnerID;
	}
	public int getPropertyID() {
		return PropertyID;
	}
	public void setPropertyID(int propertyID) {
		PropertyID = propertyID;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getPropertyOwnerID() {
		return PropertyOwnerID;
	}
	public void setPropertyOwnerID(int propertyOwnerID) {
		PropertyOwnerID = propertyOwnerID;
	}	
}
