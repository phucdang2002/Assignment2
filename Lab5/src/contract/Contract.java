package contract;

public class Contract {
	private int contractID;
	private int rentAmount;
	private int tenantID;
	private int propertyID;
	public Contract(int contractID, int rentAmount, int tenantID, int propertyID) {
		this.contractID = contractID;
		this.rentAmount = rentAmount;
		this.tenantID = tenantID;
		this.propertyID = propertyID;
	}
	@Override
	public String toString() {
		return "Contract [contractID=" + contractID + ", rentAmount=" + rentAmount + ", tenantID=" + tenantID
				+ ", propertyID=" + propertyID + "]";
	}

}
