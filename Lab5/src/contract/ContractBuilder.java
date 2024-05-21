package contract;

public interface ContractBuilder {
	void BuildContractID(int contractID);
	void BuildPropertyID(int propertyID);
	void BuildTenantID(int tenantID);
	void BuildRentAmount(int rentAmount);
	Contract SignContract();
}
