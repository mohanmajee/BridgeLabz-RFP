package Day4.Employeewage;

public class Uc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_FULL_TIME = 1;
	      int EMP_RATE_PER_HOUR = 20;
	        int empHrs = 0;
		int totalWage = 0;
	        double empcheck= Math.floor(Math.random() *10) % 2;
	        if (empcheck == IS_FULL_TIME)
	            empHrs = 8;
	        totalWage = empHrs * EMP_RATE_PER_HOUR;
	        System.out.println("Emp WAge: " + totalWage);

	}

}
