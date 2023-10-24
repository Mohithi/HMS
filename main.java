package project;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;
//mohithi
//user

class User {
  private String username;
  private String password;
  private String email;

  public User(String username, String password, String email) {
    this.username = username;
    this.setPassword(password);
    this.setEmail(email);
  }
  //constructor overloading
  public User(String username,String password) {
	  this.username = username;
	    this.setPassword(password);
	  
  }
  //checking login details
  public boolean login(String username, String password) {
	   
	    if (username.equals("mohithi") && password.equals("1234") || username.equals("nila") && password.equals("1234")|| username.equals("meenakshi") && password.equals("1234")||username.equals("dhiya") && password.equals("1234")) {
	        return true;
	    } else {
	        return false;
	    }
	}
// checking signup details
	public boolean signup(String username, String password, String email) {
	    
	    List<String> existingUsernames = Arrays.asList("mohithi", "nila", "meenakshi","dhiya");

	    if (existingUsernames.contains(username)) {
	        return false;
	    } else {
	        
	        return true;
	    }
	}

  
  public String getUsername() {
    return username;
  }
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
//appointment

class Appointment {
	  private String doctorUsername;
	  private String appointmentDate;
	  private String appointmentTime;
	  private String appointmentType;
	  private String patientUsername;

	  public Appointment(String doctorUsername, String appointmentDate, String appointmentTime, String appointmentType, String patientUsername) {
	    this.setDoctorUsername(doctorUsername);
	    this.setAppointmentDate(appointmentDate);
	    this.setAppointmentTime(appointmentTime);
	    this.setAppointmentType(appointmentType);
	    this.setPatientUsername(patientUsername);
	  }
	


  public boolean bookAppointment() {
	  if (appointmentTime.compareTo("17:00") > 0) { 
	        return false;
	    }

	    
	    List<String> availableDoctors = Arrays.asList("XYZ","ABC");
	    if (!availableDoctors.contains(doctorUsername)) {
	        return false;
	    }

	    return true;
  }



public String getDoctorUsername() {
	return doctorUsername;
}



public void setDoctorUsername(String doctorUsername) {
	this.doctorUsername = doctorUsername;
}



public String getAppointmentDate() {
	return appointmentDate;
}



public void setAppointmentDate(String appointmentDate) {
	this.appointmentDate = appointmentDate;
}



public String getAppointmentTime() {
	return appointmentTime;
}



public void setAppointmentTime(String appointmentTime) {
	this.appointmentTime = appointmentTime;
}



public String getPatientUsername() {
	return patientUsername;
}



public void setPatientUsername(String patientUsername) {
	this.patientUsername = patientUsername;
}



public String getAppointmentType() {
	return appointmentType;
}



public void setAppointmentType(String appointmentType) {
	this.appointmentType = appointmentType;
}
}
//hospital
 class Hospital {
	 
      
    private String address;
    private String phone;
    private List<HospitalStaff> staff;
    private List<patient> patients;
    private List<Appointment> appointments;

    public Hospital( String address, String phone) {
    	
    	
        
        this.address = address;
        this.phone = phone;
        this.staff = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public Hospital() {
		
	}

	public void addStaff(HospitalStaff staffMember) {
        this.staff.add(staffMember);
    }

    public void removeStaff(HospitalStaff staffMember) {
        this.staff.remove(staffMember);
    }

    public void addPatient(patient Patient) {
        this.patients.add(Patient);
    }

    public void removePatient(patient Patient) {
        this.patients.remove(Patient);
    }

    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }

    public void removeAppointment(Appointment appointment) {
        this.appointments.remove(appointment);
    }

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String toString() {
        return  "Welcome to XYZ HOPITAL" +  "\nAddress: " + this.address + "\nPhone: " + this.phone ;
    }
}


 
//main
public class main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //mohithi
    int choice;

    do {
        System.out.println("Welcome to the Hospital Management System");
        System.out.println("1. Login");
        System.out.println("2. Signup");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        sc.nextLine(); 

        switch(choice) {
          case 1:
        	  //login
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            User user = new User(username, password); 
            if (user.login(username,password)) {
              System.out.println("Login successful!");
              // Appointment booking
              System.out.print("Enter appointment date (YYYY-MM-DD): ");
              String appointmentDate = sc.nextLine();
              System.out.print("Enter appointment time (HH:MM): ");
              String appointmentTime = sc.nextLine();
              System.out.print("Enter the doctor name you want to consult: ");
              String doctorUsername = sc.nextLine();
              System.out.print("Enter appointment type: ");
              String appointmentType = sc.nextLine();
              Appointment appointment = new Appointment(doctorUsername,appointmentDate, appointmentTime, appointmentType, user.getUsername());
              if (appointment.bookAppointment()) {
            	    System.out.println("Appointment booked successfully!");
            	    System.out.println("You have an appointment on " + appointmentDate + " at " + appointmentTime + " with Dr." + doctorUsername);
            	} else {
            	    if (appointmentTime.compareTo("17:00") > 0) {
            	        System.out.println("Sorry, that appointment slot is not available.");
            	    } else {
            	        System.out.println("Sorry, that doctor is not available.");
            	    }
            	}

              }
            else {
              System.out.println("Invalid login credentials.");
            }
            break;
          case 2:
        	  //sign up
            System.out.print("Enter desired username: ");
            String newUsername = sc.nextLine();
            System.out.print("Enter password: ");
            String newPassword = sc.nextLine();
            System.out.print("Enter email: ");
            String email = sc.nextLine();
            User newUser = new User(newUsername, newPassword, email);
            if (newUser.signup(newUsername, newPassword, email)) {
              System.out.println("Signup successful! You can now login.");
            } else {
              System.out.println("Sorry, that username is already taken.");
            }
            break;
          case 3:
            break; 
          default:
            System.out.println("Invalid choice. Please try again.");
            break;
        }
      } while (choice != 3);
    
    Hospital hospital = new Hospital( "1123 streer", "123-123-123");
    System.out.println(hospital.toString());
    
    
    //dhiya
    
    Scanner in = new Scanner(System.in);
	System.out.println("NAME OF THE DOCTOR : ");
	String dn = in.next();
	System.out.println("ENTER THE SPECILAISATION OF THE DOCTOR : ");
	String sp = in.next();
	System.out.println("ENTER THE YEAR OF EXPERIANCE  OF THE DOCTOR : ");
	int yoe = in.nextInt();
	System.out.println("ENTER THE NAME OF THE PATIENT : ");
	String pn = in.next();
	System.out.println("ENTER THE NAME OF THE SURGEON : ");
	String sn = in.next();
	System.out.println("ENTER THE YEAR OF EXPERIANCE  OF THE SURGEON : ");
	int yoes = in.nextInt();
	System.out.println("ENTER THE ILLNESS OF THE PATIENT : ");
	String iln = in.next();
	System.out.println("ENTER THE ROOM NO  OF THE INPATIENT : ");
	int rn = in.nextInt();
	
	         
	doctor d = new doctor(dn,sp, yoe);
	
	d.displayd();
	d.start();
	d.diagnose();
	d.treat();
	
	surgeon s = new surgeon(sn, yoes);
	s.setOperating(true);
	s.start();

	patient p = new patient(pn,iln, d);
	p.displayp();
	p.setDoctor(d);
	p.seekTreatment();

	inpatient i = new inpatient(pn, iln, rn);
	i.setDoctor(d);
	i.seekTreatment();
	//meenakshi
	Scanner sc1=new Scanner(System.in);
	  System.out.println("Enter Admission ID:");
	  int admissionId= sc1.nextInt();
	  System.out.println("Enter Pateint ID:");
	  int patientId= sc1.nextInt();
	  System.out.println("Enter Ward ID:");
	  int wardId= sc1.nextInt();
	  System.out.println("Enter Admit Date:");
	  String admitDate= sc1.nextLine();
	  System.out.println("Enter Discharge ID:");
	  String dischargeDate= sc1.nextLine();
	  System.out.println("Enter Prescription ID:");
	  int prescriptionId= sc1.nextInt();
	  System.out.println("Enter Doctor ID:");
	  int doctorId= sc1.nextInt();
	  System.out.println("Enter Medication:");
	  String medication= sc1.nextLine();
	  System.out.println("Enter Dosage :");
	  int dosage= sc1.nextInt();
	  System.out.println("Enter frequency:");
	  String frequency= sc1.nextLine();
	  System.out.println("Enter Start Date:");
	  String startDate= sc1.nextLine();
	  System.out.println("Enter endDate:");
	  String endDate= sc1.nextLine();
	  
	  
	 
	  Admission a = new Admission(admissionId, patientId, wardId, admitDate, dischargeDate );
	  System.out.println("The admission details of the patient are :");
	  System.out.println("Admission ID: " +admissionId+ "\nPatient ID: " +patientId+ "\nWard ID: " +wardId+ 
			  "\nAdmit Date: " +admitDate+ "\nDischarge Date: " +dischargeDate);
			   
	  
	  
	  Prescription p1 = new Prescription(patientId, doctorId, medication, dosage, frequency, startDate, endDate );
	  System.out.println("\nPrescription ID: " +prescriptionId+ 
			  "\nDoctor ID: " +doctorId+ "\nMedication: " +medication+ "\nDosage: " +dosage+ "\nFrequency: " +frequency+ "\nStart Date" +startDate+ "\nEnd Dtae: " +endDate);
	  List<Prescription> prescriptions = new ArrayList<>();
	  prescriptions.add(p1);
	  
	  //nila
	  
	  doctor d1 = new doctor(dn,sp, yoe);
		
		d1.displayd();
		d1.start();
		d1.diagnose();
		d1.treat();
		
		surgeon s1 = new surgeon(sn, yoes);
		s1.setOperating(true);
		s1.start();

		patient p11 = new patient(pn,iln, d1);
		p11.displayp();
		p11.setDoctor(d1);
		p11.seekTreatment();

		inpatient i1 = new inpatient(pn, iln, rn);
		i1.setDoctor(d1);
		i1.seekTreatment();
		System.out.println("ENTER THE BILL AMOUNT OF THE PATIENT : ");
		double ba = in.nextDouble();
		bill b = new bill(p11, ba);
		b.print();
	}

	}

    
    
  

