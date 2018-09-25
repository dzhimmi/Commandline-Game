package basicCalc;

import java.util.Scanner;

class Calculator{
    private Scanner sc = new Scanner(System.in);
    public boolean exit = true;

    Calculator(){
        System.out.println("Please pick an operation with +,-,*,/ respectively, type a lowercase e to exit.");
    }

    public void run(){
        char operation = sc.next().charAt(0);
        switch(operation){
            case '+':
                add();
                break;
            case '-':
                sub();
                break;
            case '*':
                mul();
                break;
            case '/':
                div();
                break;
            case 'e':
                exit = false;
                break;
            default:
                System.out.println("You're a fucking moron!");
                break;
        }
    }

    private void add(){
        System.out.println("Pick two numbers to add together.");
        System.out.println(sc.nextDouble()+sc.nextDouble());
    }
    private void sub(){
        System.out.println("Pick two numbers to subtract from each other.");
        System.out.println(sc.nextDouble()-sc.nextDouble());
    }
    private void mul(){
        System.out.println("Pick two numbers to multiply.");
        System.out.println(sc.nextDouble()*sc.nextDouble());
    }
    private void div(){
        System.out.println("Pick a number to divide, then a number to divide the first by.");
        System.out.println(sc.nextDouble()/sc.nextDouble());
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        while(calc.exit){
            calc.run();
        }
    }
}