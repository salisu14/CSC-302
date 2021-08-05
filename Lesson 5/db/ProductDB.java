package db;

import business.Book;
import business.Product;
import business.Software;

public class ProductDB {

    public static Product getProduct(String productCode) {
        //database simulation

        Product p = null;

        if (productCode.equalsIgnoreCase("java")
                || productCode.equalsIgnoreCase("jsp")
                || productCode.equalsIgnoreCase("mysql")) {
            Book b = new Book();
            if (productCode.equalsIgnoreCase("java")) {
                b.setCode(productCode);
                b.setDescription("Java Programming for Novice");
                b.setPrice(57.50);
                b.setAuthor("Joel Hoe");
            } else if (productCode.equalsIgnoreCase("jsp")) {
                b.setCode(productCode);
                b.setDescription("Beginning Java Servlets and JSP");
                b.setPrice(57.50);
                b.setAuthor("Mike Shu");
            } else if (productCode.equalsIgnoreCase("mysql")) {
                b.setCode(productCode);
                b.setDescription("MySQL Indepth");
                b.setPrice(54.50);
                b.setAuthor("Nessus P.");
            }
            p = b; // set Product object equal to the Book object
        } else if (productCode.equalsIgnoreCase("netbeans")) {
            Software s = new Software();
            s.setCode("netbeans");
            s.setDescription("NetBeans");
            s.setPrice(0.00);
            s.setVersion("8.02");
            p = s; // set Product object equal to the Software object
        }
        return p;
    }
}
