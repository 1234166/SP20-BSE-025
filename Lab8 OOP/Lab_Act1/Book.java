public class Book extends Publication{
    int pageNumber;   
    public Book(int a, String b,int pageNumber) {
        super(a, b);        
        this.pageNumber=pageNumber;    
    }

    public void display() {
        System.out.println("Book detail \nTitle ="+title+" \n price = "+price+" \n page no "+pageNumber);   
    }
    public int getPageNo() {
        return pageNumber;   
    }

    public void setPageNo(int pageNo) {
        this.pageNumber = pageNumber;    
    }
}