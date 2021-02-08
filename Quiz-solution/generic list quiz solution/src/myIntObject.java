public class myIntObject implements Comparable<myIntObject> {
    private int value;
    public myIntObject(int x){
        this.value = x;
    }
    @Override
    public int compareTo(myIntObject o){
        return this.value - ((myIntObject) o).value;
    }
    @Override
    public String toString(){
        return Integer.toString(value);
    }
}
