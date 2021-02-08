public class testGenericList {
    public static void main(String[] args) throws Exception {
        myIntObject[] intArr = {new myIntObject(3), new myIntObject(9), new myIntObject(6), new myIntObject(1), new myIntObject(2)};
        genericList<myIntObject> myList = new genericList<myIntObject>(intArr);
        System.out.println(myList);
        myList.sortGenericList();
        System.out.println(myList);

        myStringObject[] strArr = {new myStringObject("def"), new myStringObject("dba"), new myStringObject("abb"), new myStringObject("bce"), new myStringObject("abc")};
        genericList<myStringObject> myStringObjectList = new genericList<myStringObject>(strArr);
        System.out.println(myStringObjectList);
        myStringObjectList.sortGenericList();
        System.out.println(myStringObjectList);

        Integer[] integerArray = {5,10,3,15,1};
        genericList<Integer> myIntegerList = new genericList<Integer>(integerArray);
        System.out.println(myIntegerList);
        myIntegerList.sortGenericList();
        System.out.println(myIntegerList);

        String[] stringArr = {"abc", "def", "bbd", "aab", "cda"};
        genericList<String> myStringList = new genericList<String>(stringArr);
        System.out.println(myStringList);
        myStringList.sortGenericList();
        System.out.println(myStringList);
    }
}
