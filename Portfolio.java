package exercise;

public class Portfolio extends Share {
   
    private int noShares;
    public Portfolio(double value, Company company, int noShares) {
        super(value, company);
        this.noShares=noShares;
        
    }
    public int getNoShares() {
        return noShares;
    }
    
    public void setNoShares(int noShares) {
        this.noShares = noShares;}

    public void addShare(Share s){
            noShares.add(s);
        }
        
    @Override 
    public double computeSum()  
    {
        double score=0;
        for(Share s: noShares)
        {
            score+=s.computeSum();
        }
    }   
    
}
