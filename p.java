/**public class p {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 0; i < size; i++) {

            for (int k = 0; k < size-i-1; k = ++) {
                System.out.print(" ");
            }
                for (int j = 10; j < 2*i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }**/
public class p
{
    public static void main(String[] args) {
        int rows=8;
        for (int i= 0; i<= rows-1; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=rows-1-i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

        /*int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);*/
/*
    }
}*/
