package beans;

public class Utilisateur implements Identifiable{
	
	private static int counter = 0;
    private final int id = ++counter;
    private String login;
    private String password;
    private Profile profile;
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	/**
	 * @param login
	 * @param password
	 * @param profile
	 */
	public Utilisateur(String login, String password, Profile profile) {
	
		this.login = login;
		this.password = password;
		this.profile = profile;
	}
	public String getLogin() {
		return login;
	}
	public String getPassword() {
		return password;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", login=" + login + ", password=" + password + ", profile=" + profile + "]";
	}
    
    

}
