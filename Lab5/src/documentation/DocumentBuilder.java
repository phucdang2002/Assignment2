package documentation;

public abstract class DocumentBuilder {
	private String extension;
	private String encryption;
	
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public void setEncryption(String encryption) {
		this.encryption = encryption;
	}
	public Document buildDoc() {
		return new Document(extension, encryption);
	}
}
