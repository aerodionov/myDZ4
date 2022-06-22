public class Main {
    public static void main(String[] args) {
        //Домашнее задание "1.5 Массивы"
        //Задание 1
        int[] myArray1 = new int[3];
        myArray1[0] = 1;
        myArray1[1] = 2;
        myArray1[2] = 3;
        double[] myArray2 = {1.57, 7.654, 9.986};
        int [] myArray3 = {0, 1, 1, 2, 3, 5, 8, 13};

        //Задание 2
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        for (;i1<myArray1.length;i1++) {
            System.out.print(myArray1[i1]);
            if (myArray1.length > (1+i1)) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        for (;i2<myArray2.length;i2++) {
            System.out.print(myArray2[i2]);
            if (myArray2.length > (1+i2)) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        for (;i3<myArray3.length;i3++) {
            System.out.print(myArray3[i3]);
            if (myArray3.length > (1+i3)) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.println("");

        //Задание 3
        i1--;
        i2--;
        i3--;
        for (;i1>=0;i1--) {
            System.out.print(myArray1[i1]);
            if (0 <= i1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        for (;i2>=0;i2--) {
            System.out.print(myArray2[i2]);
            if (0 <= i2) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        for (;i3>=0;i3--) {
            System.out.print(myArray3[i3]);
            if (0 <= i3) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.println("");

        //Задание 4
        i1 = 0;
        for (;i1<myArray1.length;i1++) {
            if ((myArray1[i1]% 2) > 0) {
                myArray1[i1] = myArray1[i1] + 1;
            }

        }
        i1 = 0;
        for (;i1<myArray1.length;i1++) {
            System.out.print(myArray1[i1] + " ");
        }


    }
}