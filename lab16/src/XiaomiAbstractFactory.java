public class XiaomiAbstractFactory implements IAbstractFactory {
    @Override
    public ITablet getTablet() {
        return new XiaomiTablet();
    }

    @Override
    public Iphone getPhone() {
        return new XiaomiPhone();
    }

    @Override
    public IComputer getComputer() {
        return new XiaomiComputer();
    }
}
