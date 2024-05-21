package contract;

public class Permanent implements ContractBuilder {
	
	private int contractID;
	private int rentAmount;
	private int tenantID;
	private int propertyID;
	
	@Override
	public void BuildContractID(int contractID) {
		this.contractID = contractID;
	}

	@Override
	public void BuildPropertyID(int propertyID) {
		this.propertyID = propertyID;
	}

	@Override
	public void BuildTenantID(int tenantID) {
		this.tenantID = tenantID;
	}

	@Override
	public void BuildRentAmount(int rentAmount) {
		this.rentAmount = rentAmount;
	}

	@Override
	public Contract SignContract() {
		return new Contract(contractID, rentAmount, tenantID, propertyID);
	}
}
