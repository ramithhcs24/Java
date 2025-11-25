import java.util.Scanner;
class Book {
    String name ;
    String author ; 
    int price ; 
    int num_pages ;

    Book(String na , String a , int p , int n ){
        this.name = na;
        this.author = a;
        this.price = p;
        this.num_pages = n;
    }

    String getname (){
        return this.name;
    }

    String getauthor (){
        return this.author;
    }

    int getprice (){
        return this.price;
    }

    int getpages (){
        return this.num_pages;
    }

    public String toString() {
        String name, author, price, numPages;
        name = "Book name: " + this.name + "\n";
        author = "Author name: " + this.author + "\n";
        price = "Price: " + this.price + "\n";
        numPages = "Number of pages: " + this.num_pages + "\n";
        return name + author + price + numPages;
    }

}

public class Bookinfo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String na , a ; 
        int x,p,n;
        System.out.println("Enter the number of books : ");
        x = sc.nextInt();
        sc.nextLine();
        Book[] b = new Book[x];
        for(int i=0 ; i< x ; i++){
            System.out.println("Enter the name of the book:");
            na = sc.nextLine();

            System.out.println("Enter the price of the book:");
             p = sc.nextInt();
             sc.nextLine();

            System.out.println("Enter the name of the author:");
             a = sc.nextLine();

            System.out.println("Enter the number of pages in the book:");
             n = sc.nextInt();
             sc.nextLine();

            b[i] = new Book(na, a, p, n);
        }

        for(int i =0 ; i<x ; i++){
            System.out.println("Details of book " + (i+1)  );
            System.out.println(b[i].toString());
            System.out.println("----------------------------------------");
        }

        
        
    }

}
