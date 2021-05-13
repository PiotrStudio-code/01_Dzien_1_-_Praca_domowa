package pl.coderslab.dzien_4;

import pl.coderslab.dzien_3.Person;

public class Main01 {

    public static void main(String[] args) {
        Calculator kalk = new Calculator();
        kalk.add(4,6);
        kalk.multiply(5,8);
        kalk.substract(6,9);
        kalk.divide(5,19);
        kalk.printOperations();
        kalk.clearOperations();
    }

}


