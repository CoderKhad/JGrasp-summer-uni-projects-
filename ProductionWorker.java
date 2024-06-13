//ProductionWorker

   public class ProductionWorker extends Employee 
   {
	   private int shift;
	   private double hourlyPayRate;

   // Constructor
	public ProductionWorker(String name, int number, String hireDate, int shift, double hourlyPayRate) 
   {
		super(name, number, hireDate);
		this.shift = shift;
		this.hourlyPayRate = hourlyPayRate;
	}

	// Accessor and mutator methods
	public int getShift() 
   {
		return shift;
	}

	public void setShift(int shift) 
   {
		this.shift = shift;
	}

	public double getHourlyPayRate() 
   {
		return hourlyPayRate;
	}

	public void setHourlyPayRate(double hourlyPayRate) 
   {
		this.hourlyPayRate = hourlyPayRate;
	}
}
