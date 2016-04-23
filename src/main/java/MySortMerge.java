/**
 * Created by user on 23.04.2016.
 */

    import java.io.File;
    import java.io.FileNotFoundException;
    import java.util.Scanner;

    public class MySortMerge {

        private static int[] aux;//вспомогательный массив для слияний
        public static long kol = 0;

        public static void sort(int [] a) {
            aux = new int [a.length];
            sort(a, 0, a.length - 1);
        }

        private static void sort(int [] a, int lo, int hi) {
            kol++;
            if (hi <= lo) {
                return;
            }
            int mid = lo + (hi - lo) / 2;
            sort(a, lo, mid);//сортировка левой половины
            sort(a, mid + 1, hi);//сортировка правой половины
            merge(a, lo, mid, hi);//слияние результатов
        }

        public static void merge(int[] a, int lo, int mid, int hi) {
            int i = lo, j = mid + 1;
            for (int k = 0; k <= hi; k++) {//копирование a[lo..hi] в aux[lo..hi]
                aux[k] = a[k];
                kol++;
            }

            for (int k = lo; k <= hi; k++) {//слияние назад в a[lo.. hi]
                kol++;
                if (i > mid) {
                    a[k] = aux[j++];
                } else if (j > hi) {
                    a[k] = aux[i++];
                } else if (aux[j]<(aux[i]) ) {
                    a[k] = aux[j++];
                } else {
                    a[k] = aux[i++];
                }
            }
        }

        public static void main(String... args) throws FileNotFoundException {

            int[] p = new int [16];
           System.out.println("Неостортированный массив");
            for (int i = 0; i < 16; i++) {
                p[i] = (int)(50*Math.random());
                System.out.print(p[i]+" ,");

            }

            sort(p);
           System.out.println();
            System.out.println("Отсортированный массив");

            for (int i = 0; i < 16; i++) {
                System.out.print(p[i]+" ,");

            }

        }
    }

