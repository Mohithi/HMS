package project;

public class inpatient extends patient {

	 private int roomNumber;
	  
	  public inpatient(String name, String illness, int roomNumber) {
	    super(name, illness, getDoctor());
	    this.roomNumber = roomNumber;
	  }
	  
	  public int getRoomNumber() {
	    return roomNumber;
	  }
	  
	  public void setRoomNumber(int roomNumber) {
	    this.roomNumber = roomNumber;
	  }
	  
	  @Override
	  public void seekTreatment() {
	    System.out.println("Seeking treatment in room " + roomNumber + "...");
	    super.seekTreatment();
	  }

}
