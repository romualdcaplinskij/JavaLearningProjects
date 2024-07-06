public class Whistle {

    private String sound;

    public Whistle(String whistleSound){
        sound = whistleSound;
    }

    public String getSound(){
        return sound;
    }

    public void sound(){
        System.out.println(getSound());
    }

}
