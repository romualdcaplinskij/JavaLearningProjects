
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Book book1 = new Book("Author", "Title", 2);
        Book book2 = new Book("Author", "Title", 0.5);
        Book book3 = new Book("Author", "Title", 1);
        Book book4 = new Book("Author", "Title", 12);
        Book book5 = new Book("Author", "Title", 5);

        CD cd1 = new CD("Artist", "Title", 1984);
        CD cd2 = new CD("Artist", "Title", 1999);
        CD cd3 = new CD("Artist", "Title", 2000);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);

        Box newBox = new Box(5);
        newBox.add(book1);
        newBox.add(book2);
        newBox.add(book3);
        newBox.add(cd1);

        System.out.println(newBox);

        Box secondBox = new Box(10);

        secondBox.add(newBox);
        System.out.println(secondBox);

        secondBox.add(cd2);
        secondBox.add(cd3);
        System.out.println(secondBox);



    }

}
