package ie.atu.productv5;

import java.text.NumberFormat;

public class Software extends Product {
    private String version;
    private String code;
    private String description;
    private double price;
    protected static int count = 0;

    public Software() {
        super();
        version = "";
        description = "";
        code = "";
        price = 0.0;
        count++;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String toString() {
        return description + " by " + version;
    }

    public static int getCount() {
        return count;
    }

}
