package beans;

public class Profile implements Identifiable{
	private static int counter = 0;
    private final int id = ++counter;
    private String code;
    private String description;
	/**
	 * @param code
	 * @param description
	 */
	public Profile(String code, String description) {
		this.code = code;
		this.description = description;
	}
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getCode() {
		return code;
	}
	public String getDescription() {
		return description;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Profile [id=" + id + ", code=" + code + ", description=" + description + "]";
	}
    
    

}
