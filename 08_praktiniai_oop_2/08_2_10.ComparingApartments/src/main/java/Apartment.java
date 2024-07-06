
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if (squares > compared.squares) return true;
        return false;
    }

    public int priceDifference(Apartment compared){
        return Math.abs(princePerSquare*squares - compared.princePerSquare*compared.squares);
    }

    public boolean moreExpensiveThan(Apartment compared){
        if(squares*princePerSquare > compared.squares*compared.princePerSquare) return true;
        return false;
    }

}
