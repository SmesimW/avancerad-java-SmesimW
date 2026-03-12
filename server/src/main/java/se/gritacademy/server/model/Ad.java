package se.gritacademy.server.model;

public class Ad {
    private Long id;
    private String subject;
    private String sellerName;
    private String sellerContact;
    private String description;
    private int price;

    public Ad() {
    }

    public Ad(Long id, String subject, String sellerName, String sellerContact, String description, int price) {
        this.id = id;
        this subject = subject;
        this.sellerName = sellerName;
        this.sellerContact = sellerContact;
        this.description = description;
        this.price = price;
    }


    //Getters och setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject (String subject) {
        this.subject = subject;
    }

    public String getSellerName() {
        return sellerName;
    }
    public void setSellerNameetSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerContact() {
        return sellerContact;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
