package zad2;

public class StateWorker extends Worker{
    private double award;

    public StateWorker(String fullName, String post, double oklad, double award) throws OkladException {
        super(fullName, post, oklad);
        this.award = award;
    }

    public double getAward() {
        return award;
    }

    public void setAward(double award) {
        this.award = award;
    }

    @Override
    public double checkSalary(int days) throws PremiyaException {
        if(getAward() < 0)
            throw new PremiyaException("Premiy < 0");
        if(days < 1 || days>30)
            throw new IllegalArgumentException("Days must be > 1");
        return getOklad()*days+award;
    }
}
