package project;

import java.time.LocalDateTime;

class bill {
	  public patient patient;
	  public LocalDateTime dateTime;
	  public double amount;

	  public bill(patient patient, double amount) {
	    this.patient = patient;
	    this.amount = amount;
	    this.dateTime = LocalDateTime.now();
	  }


	  public void print() {
	    // Print the details of the bill
	    System.out.println("Patient: " + patient.getName());
	    System.out.println("Date and time: " + dateTime);
	    System.out.println("Amount: " + amount);
	  }
	}