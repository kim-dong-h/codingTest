package conception.enumConception;

public enum Company {

	SK("에스케이"),
	LG("엘지"),
	KT("케이티"),
	SAMSUNG("삼성"),
	APPLE("애플");
	
	private final String value;
	
	Company(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
