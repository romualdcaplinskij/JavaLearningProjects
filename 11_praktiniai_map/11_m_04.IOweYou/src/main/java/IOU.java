import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> hashMap = new HashMap<>();
    public IOU() {
    }

    public void setSum(String toWhom, double amount){
        //saves the amount owed and the person owed to the IOU
        hashMap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        //returns the amount owed to the person whose name is given as parameter. If person cannot be found, returns 0.
        for (String k: hashMap.keySet()) {
            if(k.contains(toWhom)) return hashMap.get(toWhom);
        }
        return 0;
    }


}
