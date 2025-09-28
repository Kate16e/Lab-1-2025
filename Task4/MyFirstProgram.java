class MyFirstClass {
    static void main(String[] s) {
        MySecondClass o = new MySecondClass(1, 2);
	int i, j;
        for (i = 1; i <= 8; i++)  {
            for(j = 1; j <= 8; j++) {
                o.set_val1(i);
                o.set_val2(j);
                System.out.print(o.sum());
                System.out.print(" ");
            }
            System.out.println();
    	
        }
    }
    
}

class MySecondClass {
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