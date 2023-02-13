package ie.atu.productv5;

import ie.atu.productv5.Book;
import ie.atu.productv5.Product;
import ie.atu.productv5.Software;
import ie.atu.productv5.Music;
import ie.atu.productv5.TV;

public class ProductDB {
    public static ie.atu.productv5.Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;


        if (productCode.equalsIgnoreCase("java")) {
            ie.atu.productv5.Book myBook = new ie.atu.productv5.Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            ie.atu.productv5.Book myBook = new ie.atu.productv5.Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            ie.atu.productv5.Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            ie.atu.productv5.Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            ie.atu.productv5.Software mySoftware = new ie.atu.productv5.Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            ie.atu.productv5.Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }

        if (productCode.equalsIgnoreCase("pink")) {
            ie.atu.productv5.Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("wish you were here by pin Floyd");
            myMusic.setPrice(8.00);
            myMusic.setArtist("Part of the columbia group");
            myMusic.setLabel("Columbia group");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("blue")) {
            ie.atu.productv5.Music myMusic = new ie.atu.productv5.Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("21 by polo g");
            myMusic.setPrice(8.00);
            myMusic.setArtist("Polo G");
            myMusic.setLabel("Columbia Records");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("red")) {
            ie.atu.productv5.Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("its plenty by burna boy");
            myMusic.setPrice(8.00);
            myMusic.setArtist("Burna boy");
            myMusic.setLabel("Atlantic Records");
            p = myMusic;
        }

        if (productCode.equalsIgnoreCase("kdl43")) {
            ie.atu.productv5.TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Sony bravia smart TV");
            myTV.setPrice(819.00);
            myTV.setSize("55");
            myTV.setManufacture("Sony");
            p = myTV;
        } else if (productCode.equalsIgnoreCase("ydu12")) {
            ie.atu.productv5.TV myTV = new ie.atu.productv5.TV();
            myTV.setCode(productCode);
            myTV.setDescription("Sony bravia XR");
            myTV.setPrice(900.00);
            myTV.setSize("55");
            myTV.setManufacture("Sony");
            p = myTV;
        } else if (productCode.equalsIgnoreCase("ubn89")) {
            ie.atu.productv5.TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Sony Bravia");
            myTV.setPrice(560.00);
            myTV.setSize("43");
            myTV.setManufacture("Sony");
            p = myTV;
        }
        return p;

    }
}
