package myfirstpackage;
public class MySecondClass {
    private int num1;
    private int num2;
    public MySecondClass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void set_val1(int num) {
        num1 = num;
    }
    public void set_val2(int num) {
        num2 = num;
    }
    public int sum() {
        return num1 + num2;
    }
}