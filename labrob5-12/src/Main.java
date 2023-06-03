public class Main {
    public static void main(String[] args) {
        //Task1
        int[] mine = new int[50];
        int num = 1;
        for (int i = 0; i < 50; i++) {
            mine[i] = num;
            num += 2;
        }

        for (int i = 0; i < 50; i++) {
            System.out.println(mine[i]);
        }
        //Task2


        //Task3
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        int arr3[] = new int[5];
        for (int i=0; i<5; i++) {
            arr1[i] = (int) (Math.random() * 5);
            arr2[i]= (int) (Math.random() * 5);
            arr3[i] = (int) (Math.random() * 5);
        }
        System.out.println("Перший масив:");
        for (int i=0; i<5; i++){
            System.out.println(arr1[i] + "");
        }
        System.out.println("Другий масив:");
        for (int i=0; i<5; i++){
            System.out.println(arr2[i] + "");
        }
        System.out.println("Третій масив:");
        for (int i=0; i<5; i++){
            System.out.println(arr3[i] + "");
        }
        double aver1=0;
        double aver2=0;
        double aver3=0;
        for (int i=0; i<5; i++){
            aver1+=arr1[i];
            aver2+=arr2[i];
            aver3+=arr3[i];
        }
        aver1/=5;
        aver2/=5;
        aver3/=5;
        if (aver1 > aver2 && aver1 > aver3) {
            System.out.println("Середнє арифметичне значення масиву 1 є більшим");
        } else if (aver2 > aver1 && aver2 > aver3) {
            System.out.println("Середнє арифметичне значення масиву 2 є більшим");
        } else if (aver3 > aver1 && aver3 > aver2) {
            System.out.println("Середнє арифметичне значення масиву 3 є більшим");
        } else {
            System.out.println("Середні арифметичні значення масивів є рівними");
        }

        //Task4
        int array1[] = new int[10];
        int array2[] = new int[10];
        System.out.println("Перший масив:");
        for (int i=0; i< array1.length; i++){
            array1[i] = (int) (Math.random()*10);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("Другий масив:");
        for (int i=0; i< array2.length; i++){
            array2[i] = (int) (Math.random()*10);
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        int array3[] = new int[10];
        System.out.println("Третій масив:");
        for (int i=0; i< array3.length; i++){
            array3[i] = array1[i]+array2[i];
            System.out.print( array3[i] + " ");
        }
        //Task5
        int array[] = new int[15];
        System.out.println("Ваш масив:");
        for (int i=0; i< array.length; i++){
            array[i] = (int) (Math.random()*10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Масив парних чисел, утворений із даного масиву:");
        int counter = 0;
        for (int i=0; i< array.length; i++){
            if (array[i]%2 == 0) {
                System.out.print(array[i] + " ");
                counter += 1;
            }
        }
        System.out.println();
        System.out.println("У цьому масиві" +" " + counter +" "+"парних чисел");

        //Task6

    }
}
