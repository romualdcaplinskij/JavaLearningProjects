import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> history = new ArrayList<>();

    public ChangeHistory(){

    }

    public void add(double status){
        this.history.add(status);

    }

    public double maxValue(){
        return Collections.max(this.history);
    }

    public double minValue(){
        return Collections.min(this.history);
    }

    public double average(){
        double sum = 0.0;
        for (int i = 0; i < this.history.size(); i++) {
            sum += i;
        }
        return  sum / this.history.size();
    }

    public void clear(){
        this.history.clear();
    }

    @Override
    public String toString() {
        return  history.toString();
    }
}