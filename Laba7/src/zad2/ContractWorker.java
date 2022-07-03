package zad2;

public class ContractWorker extends Worker{
    public ContractWorker(String fullName, String post, double oklad) throws OkladException {
        super(fullName, post, oklad);
    }

    @Override
    public double checkSalary(int days) throws PremiyaException {
        if(days < 1 && days>30)
            throw new IllegalArgumentException("Days > 1");
        return super.checkSalary(days)/0.1 ;
    }
}
