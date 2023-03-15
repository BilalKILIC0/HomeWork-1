package week.pkg2;

public class bubble_Sort_Performance_Test {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int bubble[] = dizi_olustur();

        System.out.println();
        System.out.println("Siralanmamis Dizi :");
        print_array(bubble);

        for (int i = 0; i < bubble.length; i++) {

            for (int j = 0; j < bubble.length - 1; j++) {

                if (bubble[j + 1] < bubble[j]) {

                    int temp = bubble[j + 1];
                    bubble[j + 1] = bubble[j];
                    bubble[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Siralanmis Dizi :");
        print_array(bubble);
        System.out.println();

        long elapsedTimeMillis = System.currentTimeMillis() - start;

        System.out.println();
        System.out.println("Bubble Sort Toplam " + elapsedTimeMillis + " Ms Surmustur.");
    }

    public static int[] dizi_olustur() {

        int array[] = new int[1000];

        for (int i = 0; i < 1000; i++) {

            array[i] = (int) (Math.random() * (50000 - 1) + 1);
        }

        return array;
    }

    public static void print_array(int array[]) {

        for (int i = 0; i < array.length; i++) {

            if ((i % 10 == 0) && i != 0) {

                System.out.println();
            }
            System.out.print(array[i] + " ");
        }
    }
}
