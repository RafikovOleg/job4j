package ru.job4j.calculator;

/**
* Класс Calculator решение задачи 3.1 простейший калькулятор.
* @ author Oleg Rafikov.
* @ since 22.06.2018.
*/

public class Calculator {
    private double result;
/**
* Метод сложения.
* @param double.
* @return double.
*/
    public void add(double first, double second) {
        this.result = first+second;
    }
	
/**
* Метод вычетание.
* @param double.
* @return double.
*/
	public void subtract(double first, double second) {
		this.result=first-second;
	}
	
/**
* Метод деления.
* @param double.
* @return double.
*/
	
	public void div(double first, double second) {
		this.result=first/second;
	}
	
/**
* Метод умножение.
* @param double.
* @return double.
*/
	
	public void multiple(double first, double second) {
		this.result=first*second;
	}
	
/**
* Метод getResult.
* @param double.
* @return result.
*/
	
	 public double getResult() {
        return this.result;
    }
	
	
}