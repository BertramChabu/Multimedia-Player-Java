import java.util.Date;

abstract class Product implements Item {
    private int serialNumber;
    private String manufacturer = Item.manufacturer;
    private Date manufacturedOn;
    private String name;
    private static int currentProductionNumber = 1;

    public Product(String name,String manufacturer) {
        this.name = name;
        this.serialNumber = currentProductionNumber++;
        this.manufacturedOn = new Date();
        this.manufacturer = manufacturer;
    }

    @Override
    public void setProductionNumber(int productionNumber) {
        // Implement if needed for specific requirements
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getManufactureDate() {
        return manufacturedOn;
    }

    @Override
    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer +
                "\nSerial Number: " + serialNumber +
                "\nDate: " + manufacturedOn +
                "\nName: " + name;
    }
}
