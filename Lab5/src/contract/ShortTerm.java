package contract;

public class ShortTerm implements ContractBuilder {
	private int contractID;
	private int propertyID;
	private int tenantID;
	private int rentAmount;
	
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
