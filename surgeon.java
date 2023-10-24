package project;

public class surgeon extends doctor {
	  public surgeon(String name, String specialty, int yearsOfExperience) {
			super(name, specialty, yearsOfExperience);
			
		}

	private boolean isOperating;
	  
	  public surgeon(String name, int yearsOfExperience) {
	    super(name, "Surgery", yearsOfExperience);
	    this.isOperating = false;
	  }
	  
	  public boolean isOperating() {
	    return isOperating;
	  }
	  
	  public void setOperating(boolean isOperating) {
	    this.isOperating = isOperating;
	  }
	  
	  @Override
	  public void treat() {
	    if (isOperating) {
	      System.out.println("Performing surgery...");
	    } else {
	      super.treat();
	    }
	  }
	}
