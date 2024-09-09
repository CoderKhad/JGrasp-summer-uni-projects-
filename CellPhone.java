
public class CellPhone 
{
    private String manufact;
    private String model;
    private double retailPrice;

    // Constructor
    public CellPhone(String manufact, String model, double retailPrice) 
    {
        this.manufact = manufact;
        this.model = model;
        this.retailPrice = retailPrice;
    }

    // Setter methods
    public void setManufact(String manufact) 
    {
        this.manufact = manufact;
    }

    public void setModel(String model) 
    {
        this.model = model;
    }

    public void setRetailPrice(double retailPrice) 
    {
        this.retailPrice = retailPrice;
    }

    // Getter methods
    public String getManufact() 
    {
        return manufact;
    }

    public String getModel() 
    {
        return model;
    }

    public double getRetailPrice() 
    {
        return retailPrice;
    }
}