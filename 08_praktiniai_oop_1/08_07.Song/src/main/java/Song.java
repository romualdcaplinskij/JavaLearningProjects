public class Song {
    private String song;
    private int length;

    public Song(String name, int length){
        song = name;
        this.length = length;
    }

    public String name(){
        return song;
    }

    public int length(){
        return length;
    }

}
