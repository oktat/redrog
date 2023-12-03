package lan.zold.models;

public class Product {
    Integer id;
    public String name;
    String articleNumber;
    Double unitPrice;
    Integer piece;
    public Product(Integer id, String name, String articleNumber, Double unitPrice, Integer piece) {
        this.id = id;
        this.name = name;
        this.articleNumber = articleNumber;
        this.unitPrice = unitPrice;
        this.piece = piece;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getArticleNumber() {
        return articleNumber;
    }
    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }
    public Double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Integer getPiece() {
        return piece;
    }
    public void setPiece(Integer piece) {
        this.piece = piece;
    }
    
}
