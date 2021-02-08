import java.util.ArrayList;
import java.util.Collections;
public class genericList<T extends Comparable<T>> {
    private ArrayList<T> genList;
    public genericList(){
        genList = new ArrayList<T>();
    }
    public genericList(T[] array){
        this();
        for(T e: array){
            genList.add(e);
        }
    }
    public void addElement(T e){
        genList.add(e);
    }
    public void sortGenericList(){
        Collections.sort(this.genList);
    }
    @Override
    public String toString(){
        String result = "";
        for(T e: genList){
            result += e.toString();
        }
        return result;
    }
}
