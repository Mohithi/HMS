package project;

class Prescription {
	  private int prescriptionId;
	  private int patientId;
	  private int doctorId;
	  private String medication;
	  private int dosage;
	  private String frequency;
	  private String startDate;
	  private String endDate;

	  public Prescription(int patientId, int doctorId, String medication, int dosage, String frequency, String startDate, String endDate) throws IllegalArgumentException {
		    if (patientId < 1 || doctorId < 1 || dosage < 1) {
		      throw new IllegalArgumentException("Patient ID, doctor ID, and dosage must be positive integers.");
		    }
		    this.prescriptionId = prescriptionId;
		    this.patientId = patientId;
		    this.doctorId = doctorId;
		    this.medication = medication;
		    this.dosage = dosage;
		    this.frequency = frequency;
		    this.startDate = startDate;
		    this.endDate = endDate;
		  }

	  public int getPrescriptionId() {
	    return prescriptionId;
	  }

	  public int getPatientId() {
	    return patientId;
	  }

	  public int getDoctorId() {
	    return doctorId;
	  }

	  public String getMedication() {
	    return medication;
	  }

	  public int getDosage() {
	    return dosage;
	  }

	  public String getFrequency() {
	    return frequency;
	  }

	  public String getStartDate() {
	    return startDate;
	  }

	  public String getEndDate() {
	    return endDate;
	  }

	  public void setPrescriptionId(int prescriptionId) {
	    this.prescriptionId = prescriptionId;
	  }

	  public void setPatientId(int patientId) {
	    this.patientId = patientId;
	  }

	  public void setDoctorId(int doctorId) {
	    this.doctorId = doctorId;
	  }

	  public void setMedication(String medication) {
	    this.medication = medication;
	  }

	  public void setDosage(int dosage) {
	    this.dosage = dosage;
	  }

	  public void setFrequency(String frequency) {
	    this.frequency = frequency;
	  }

	  public void setStartDate(String startDate) {
	    this.startDate = startDate;
	  }

	  public void setEndDate(String endDate) {
	    this.endDate = endDate;
	  }
	}
