package project;

class patient {
	  private String name;
	  private String illness;
	  private static doctor doctor;
	  
	  public patient(String name, String illness, doctor doctor) {
	    this.name = name;
	    this.illness = illness;
	    this.setDoctor(doctor);
	  }
	  public void displayp() {
		  System.out.println("NAME OF THE PATIENT IS : " +name);
		  System.out.println("ILLNESS OF THE IS: "+illness);
		  System.out.println("THE DOCTOR : "+getDoctor());
	  }
	  
	  public void seekTreatment() {
	    getDoctor().treat();
	  }
	public static doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(doctor doctor) {
		this.doctor = doctor;
	}
	public String getName() {
		
		return name;
	}
	}