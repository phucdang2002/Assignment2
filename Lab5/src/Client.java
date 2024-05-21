import contract.Contract;
import contract.ContractBuilder;
import contract.LongTerm;
import contract.Permanent;
import contract.ShortTerm;
import documentation.ConfidentialDoc;
import documentation.Document;
import documentation.DocumentBuilder;
import documentation.NormalDoc;

public class Client {

	public void requestCreateRentalContract() {
		ContractBuilder builder = new LongTerm();
		ContractBuilder builder2 = new ShortTerm();
		ContractBuilder builder3 = new Permanent();
		builder.BuildContractID(1);
		builder.BuildPropertyID(1);
		builder.BuildTenantID(1);
		builder.BuildRentAmount(100);
		Contract contract = builder.SignContract();
		System.out.println(contract);
		builder2.BuildContractID(2);
		builder2.BuildPropertyID(2);
		builder2.BuildTenantID(2);
		builder2.BuildRentAmount(50);
		contract = builder2.SignContract();
		System.out.println(contract);
		builder3.BuildContractID(3);
		builder3.BuildPropertyID(3);
		builder3.BuildTenantID(3);
		builder3.BuildRentAmount(70);
		contract = builder3.SignContract();
		System.out.println(contract);
	}
	public void newDocument() {
		DocumentBuilder builder = new NormalDoc();
		DocumentBuilder builder2 = new ConfidentialDoc();
		builder.setExtension(".txt");
		builder.setEncryption("None");
		Document doc = builder.buildDoc();
		System.out.println(doc);
		builder2.setExtension(".zip");
		builder2.setEncryption("AES");
		doc = builder2.buildDoc();
		System.out.println(doc);
	}

}
