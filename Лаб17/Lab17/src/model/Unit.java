package model;

import DocSettings.Enums.UnitSocket;
import DocSettings.Enums.UnitType;

public class Unit {
    String name, origin;
    int price;
    UnitType type;
    int energyConsumption;
    boolean coolerExist;
    UnitSocket socket;
    boolean isCritical;

    public Unit(String name, String origin, int price, UnitType type, int energyConsumption,
        boolean coolerExist, UnitSocket socket, boolean isCritical) {
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.type = type;
        this.energyConsumption = energyConsumption;
        this.coolerExist = coolerExist;
        this.socket = socket;
        this.isCritical = isCritical;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public UnitType getType() {
        return type;
    }
    public void setType(UnitType type) {
        this.type = type;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }
    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public boolean isCoolerExist() {
        return coolerExist;
    }
    public void setCoolerExist(boolean coolerExist) {
        this.coolerExist = coolerExist;
    }

    public UnitSocket getSocket() {
        return socket;
    }
    public void setSocket(UnitSocket socket) {
        this.socket = socket;
    }

    public boolean isCritical() {
        return isCritical;
    }
    public void setCritical(boolean critical) {
        isCritical = critical;
    }

    @Override
    public String toString() {
        return "Unit{" +
            "name='" + name + '\'' +
            ", origin='" + origin + '\'' +
            ", price=" + price +
            ", type=" + type +
            ", energyConsumption=" + energyConsumption +
            ", coolerExist=" + coolerExist +
            ", socket=" + socket +
            ", isCritical=" + isCritical +
            '}' + "\n";
    }
}
