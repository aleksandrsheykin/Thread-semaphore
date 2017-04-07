package com.company;

public class Main {
    private MySemaphore mySemaphore;
    static Kubator kubator;
    static Kvadrator kvadrator;
    static Prosator prosator;
    private static int[] arrA = new int[] {1,2,4,5};
    private static int[] arrB = new int[] {3,7,4};
    private static int[] arrC = new int[] {5,6,4,9,3,65};

    public static void main(String[] args) {
        for(int i:arrA)
            kubator = new Kubator(i);

        for(int i:arrB)
            kvadrator = new Kvadrator(i);

        for(int i:arrC)
            prosator = new Prosator(i);
    }
}
