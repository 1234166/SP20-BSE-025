public class Publication{

    int price;    
    String title;
    public Publication(int a, String b) {
        this.price = a;       
        this.title = b;   
    }

    public int getPrice() {
        return price;   
    }

    public void setPrice(int a) {
        this.price = a;    
    }

    public String getTitle() {
        return title;    
    }

    public void setTitle(String b) {
        this.title = b;   
    }
}
