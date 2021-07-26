package main.java.Ucf.assignments.App;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Item {
    private final SimpleStringProperty name = new SimpleStringProperty("");
    private final SimpleStringProperty serial = new SimpleStringProperty("");
    private final SimpleDoubleProperty price = new SimpleDoubleProperty(0);

    public Item(String name, String serial, double price) {
        setName(name);
        setSerial(serial);
        setPrice(price);
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setSerial(String serial) {
        this.serial.set(serial);
    }

    public void setPrice(double price) {
        this.price.set(price);
    }

    public String getName() {
        return name.get();
    }

    public String getSerial() {
        return serial.get();
    }

    public double getPrice() {
        return price.get();
    }
}