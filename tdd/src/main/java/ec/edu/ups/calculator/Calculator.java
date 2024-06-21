package ec.edu.ups.calculator;

public class Calculator {

    private  int ans;

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }


    public int multiplication(int a, int b) {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a*b;
    }



    public int division(int a, int b) {
        return a/b;
    }


    public int subtraction(int a, int b) {
        return a-b;
    }

    public int addition(int a, int b) {
        return a+b;
    }









}
