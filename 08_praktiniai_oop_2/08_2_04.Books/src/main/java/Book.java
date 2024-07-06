public class Book {

    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year){
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    private int getPages(){
        return pages;
    }

    private int getYear(){
        return year;
    }

    public String toString(){
        return String.format("%s, %d pages, %d", title, pages, year);
    }
}
