package edu.ib;

import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.Function;

public class Main {
    public static void main(String[] args) {
        //Demo update
        Function at= new Function("f(x)=x*x");
        Expression e1= new Expression("f(2)",at);
        System.out.println(e1.calculate());
    }

}
