package day03.practice;

public class User {

	
	
	    private String name;
	    private String emailid;
	    private String password;
		
	    
	 
	    public User(String password, String name, String emailid) {
	        this.password =password;
	        this.name = name;
	        this.emailid = emailid;
	
	    
	    }

		public String getpassword() {
			return password;
		}
		
		public String getName() {
			return name;
		}
		public String getemailid() {
			return emailid;
		}
	
		
		public void setpassword(String password) {
			this.password = password;
	}
		public void setemailid(String emailid) {
		this.emailid = emailid;
	}
	
	
	public void setName(String name) {
		this.name = name;
		}
	
}
