package ie.atu.productv5;

public class TV extends Product{

    private String size;
    private String manufacture;

    public TV() {
        super();
        size = "";
        manufacture = "";
        count++;
    }

    public void setSize(String Size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    @Override
    public String toString() {
        return super.toString() + "  " + size;
    }
}
