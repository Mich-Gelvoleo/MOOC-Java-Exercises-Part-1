public class Main {
    public static void main(String[] args) {
        // test your program here
        Book cheese = new Book("Cheese", "REX Bookstore", 2010);
        Book cheeseLovers = new Book("Cheese Lovers", "Simon Bookstore", 2011);
        Book nhl = new Book("NHL Winners", "REX Bookstore", 2015);
        Book ak = new Book("Arknights", "Mihoyo", 2011);
        
        Library lib = new Library();
        
        System.out.println(cheese.title());
        System.out.println(cheese.publisher());
        System.out.println(cheese.year());
        
        System.out.println(cheese);
        
        lib.addBook(cheese);
        lib.addBook(cheeseLovers);
        lib.addBook(nhl);
        lib.addBook(ak);
        
        lib.printBooks();
        
        System.out.println("---");
        for(Book book : lib.searchByTitle("cheese   ")){
            System.out.println(book);
        }
        
        System.out.println("---");
        for(Book book : lib.searchByPublisher("rex")){
            System.out.println(book);
        }
        
        System.out.println("---");
        for(Book book : lib.searchByYear(2011)){
            System.out.println(book);
        }
        
        
    }
}
