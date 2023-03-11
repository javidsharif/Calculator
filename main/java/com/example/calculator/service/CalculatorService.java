package com.example.calculator.service;

import com.example.calculator.model.OperationModel;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
public int add(OperationModel model) {
    return model.getA() + model.getB();
}

public int subtract(OperationModel model) {
    return model.getA() - model.getB();
}

public int multiply(OperationModel model) {
    return model.getA() * model.getB();
}

public double divide(OperationModel model) {
    if(model.getA() == 0) return 0;
    if(model.getB() == 0) return 0;

    return model.getA() / model.getB();
}

public int factorial(OperationModel model) {
    return factorial(model.getC());
}

private int factorial(int n) {
    int res = 1;
    for (int i = 1; i <= n; i++) {
        res *= i;
    }

    return res;
}

public int fibonacci(OperationModel model) {
    return fibonacci(model.getC());
}

private int fibonacci(int n) {
if(n <= 1) {
    return n;
}else {
   return fibonacci(n -1 ) + fibonacci(n - 2);
}

}

public double sqrt(OperationModel model) {
    return Math.sqrt(model.getC());
}

public OperationModel clearSimple(OperationModel model) {
    model.setA(0);
    model.setB(0);
    return model;
}

    public OperationModel clearAdvanced(OperationModel model){
        model.setC(0);
        return model;
    }


    public int power(OperationModel model) {
    return model.getC() * model.getC();
    }
}
