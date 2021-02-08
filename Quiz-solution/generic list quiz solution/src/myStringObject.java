public class myStringObject implements Comparable<myStringObject> {
    private String value;
    public myStringObject(String str){
        this.value = str;
    }
    @Override
    public int compareTo(myStringObject o){
        return this.value.compareTo(o.value);
    }
    @Override
    public String toString(){
        return value;
    }
}
