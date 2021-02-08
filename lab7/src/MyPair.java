public class MyPair<T, U> {

    public final T _1stArg;
    public final U _2ndArg;

    public MyPair(T _1stArg, U _2ndArg) {
        this._1stArg = _1stArg;
        this._2ndArg = _2ndArg;
    }
    // a.In a new source file, write a program that includes this declaration 
    // and also a class with an empty Main method. Compile it to check that 
    // the program is well-formed.

    @Override
    public String toString() {
        return "(" + _1stArg + ", " + _2ndArg + ")";
    }

    public MyPair<U, T> swap() {
        return new MyPair<>(_2ndArg, _1stArg);
    }

    public static void main(String args[]) {

        //b
        MyPair<String, Integer> p1 = new MyPair<>("Anders", 13);

        //c
        MyPair<String, Double> p2 = new MyPair<>("Phoenix", 39.7);

        //d. Can not assign p1 = p2

        //e
        MyPair<String, Integer>[] grades = new MyPair[5];
        for (int i = 0; i < 5; i++) {
            grades[i] = new MyPair<>(String.valueOf((char) (i + 65)), i);
        }

        //f
        for (MyPair grade : grades) {
            System.out.println(grade);
        }

        //g
        MyPair<MyPair<Integer, Integer>, String> appointment
                = new MyPair<>(new MyPair<>(2, 5), "TEST");
        System.out.println(appointment._1stArg._2ndArg);

        //h
        MyPair pSwap = p1.swap();
        System.out.println(pSwap);

    }

}
