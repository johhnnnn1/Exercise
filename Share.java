package exercise;
public abstract class Share extends Company
{
     private double value;
     private String company;
     public abstract double computeSum(); 
   public Share( double value, String company)
   {
    super(company); 
     this.value=value;
     
   }
   public double getValue() {
    return value;
}

public void setName(double value) {
    this.value = value;
}

  


}
