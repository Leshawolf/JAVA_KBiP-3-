package zad2;

public class Worker  {
    private String fullName;
    private String post;
    private double oklad;

    public Worker(String fullName, String post, double oklad) throws OkladException {
        if(oklad < 0)
            throw new OkladException("Oklad < 0");
        this.fullName = fullName;
        this.post = post;
        this.oklad = oklad;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getOklad() {
        return oklad;
    }

    public void setOklad(double oklad) {
        this.oklad = oklad;
    }

    public double checkSalary(int days) throws PremiyaException {
        return oklad*days;
    }

    @Override
    public String toString() {
        return "Имя: " + fullName + " Должность: " + " Оклад: "+ oklad;
    }
}
