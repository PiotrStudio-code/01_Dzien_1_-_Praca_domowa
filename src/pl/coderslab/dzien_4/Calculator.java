package pl.coderslab.dzien_4;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    List<String> history;

    public Calculator() {
        this.history = new ArrayList<>();
    }

    int add(int num1, int num2)
    {
        int result = num1 + num2;
        this.history.add("added " + num1 + " to " + num2 + " got " + result);
        return result;
    }

    int multiply(int num1, int num2)
    {
        int result = num1 * num2;
        this.history.add("multiplied " + num1 + " to " + num2 + " got " + result);
        return result;
    }

    int substract(int num1, int num2)
    {
        int result = num1 - num2;
        this.history.add("substracted " + num1 + " to " + num2 + " got " + result);
        return result;
    }

    int divide(int num1, int num2)
    {
        int result = num1 / num2;
        this.history.add("divided " + num1 + " to " + num2 + " got " + result);
        return result;
    }

    void printOperations()
    {
        for(int i = 0; i<history.size();i++)
        {
            System.out.println(history.get(i));
        }
    }

    void clearOperations()
    {
        this.history.clear();
        System.out.println("History cleared!");
    }



}
