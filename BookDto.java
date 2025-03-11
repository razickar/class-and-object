public class BookDto{

	static int bookcount ;
	
	private String bookname;
	private String ISBN;
	private String author;
	private int price;
	
	public void addBook(String bookname,String ISBN,String author,int price){
		
	this.bookname = bookname;	
	this.ISBN = ISBN;
	this.author = author;
	this.price = price;
	bookcount++;	
	}
	 
	public String getBookName(){
		return bookname;
	}
	public String Isbn(){
		return ISBN;
	}
	public String getAuthor(){
		return author;
	}
	public int getPrice(){
		return price;
	}
	
	
	public static void main(String[] args){
	
		BookDto harrypotter = new BookDto();
		harrypotter.addBook("harry potter 1","109-294-33","RAZICKAR",100);
		
		System.out.println(harrypotter.getBookName());
		
		BookDto harrypotter2 = new BookDto();
		harrypotter2.addBook("harry potter 2","109-24-33","RAZICKAR",1200);
		
		
		
		System.out.println("TOTAL BOOK COUNT - "+bookcount);
		
	
	}

}

