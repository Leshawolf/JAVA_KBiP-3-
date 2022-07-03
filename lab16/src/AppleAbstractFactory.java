public class AppleAbstractFactory implements IAbstractFactory {
    @Override
    public ITablet getTablet() {
        return new AppleTablet();
    }

    @Override
    public Iphone getPhone() {
        return new ApplePhone();
    }

    @Override
    public IComputer getComputer() {
        return new AppleComputer();
    }
}
