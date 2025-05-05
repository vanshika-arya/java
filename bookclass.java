class book{
    String title;
    String author;
    double price;
 
    void applyDiscount(){
     price = price -(price * 0.10);
    }
 
    void dispaly(){
     System.out.println("Title = "+ title);
     System.out.println("Author = "+ author);
     System.out.println("Final price after discount "+ price);
    }
 }
 
 
 public class bookclass {
     public static void main(String[] args) {
         book b=new book();
         b.title="Space Mystries";
         b.author="Vanshika";
         b.price=249.5;
         b.applyDiscount();
         b.dispaly();
     }
    }
    

