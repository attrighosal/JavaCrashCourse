package Polymorphism;

public class Source {

    public static void main(String[] args) {

        Adder adder = new Adder();
        int sumAB = adder.add(5,4);
        System.out.println(sumAB);

        int sumABC = adder.add(5,4, 3);
        System.out.println(sumABC);

        float fSumAB = adder.add(4.5f, 5.6f);
        System.out.println(fSumAB);
    }
}
