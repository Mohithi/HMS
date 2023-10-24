package project;


public class doctor extends Thread {
	  private String name;
	  private String specialty;
	  private int yearsOfExperience;
	  
	  public doctor(String doctorUsername, String specialty, int yearsOfExperience) {
	    this.name = name;
	    this.specialty = specialty;
	    this.yearsOfExperience = yearsOfExperience;
	  }
	  public void displayd() {
		  System.out.println("NAME OF THE DOCTOR IS : " +name);
		  System.out.println("SPECIALTY OF THE DOCOTOR IS: "+specialty);
		  System.out.println("YEAR OF EXPERIENCE OF THE DOCTOR : "+yearsOfExperience);
	  }
	  public void diagnose1() throws Exception {
		    System.out.println("Diagnosing the patient...");
		    // some code that might throw an exception
		  }
		  
		  public void treat1() throws Exception {
		    System.out.println("Treating the patient...");
		    // some code that might throw an exception
		  }
	  public void diagnose() {
	    System.out.println("Diagnosing the patient...");
	  }
	  
	  public void treat() {
	    System.out.println("Treating the patient...");
	  }
	  
	  @Override
	  public void run() {
	    try {
			diagnose1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			treat1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	}