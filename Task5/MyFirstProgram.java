import myfirstpackage.*;
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

