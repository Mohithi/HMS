package project;

class Admission {
	  private int admissionId;
	  private int patientId;
	  private int wardId;
	  private String admitDate;
	  private String dischargeDate;

	  public Admission(int admissionId, int patientId, int wardId, String admitDate, String dischargeDate) {
	    this.admissionId = admissionId;
	    this.patientId = patientId;
	    this.wardId = wardId;
	    this.admitDate = admitDate;
	    this.dischargeDate = dischargeDate;
	    }}
