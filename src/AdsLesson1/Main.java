package AdsLesson1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


//        1. Прочитать в книге "Грокаем алгоритмы" или в предложенных материалах про алгоритмы и О-большое.

//        2. Определить сложность следующих алгоритмов:
//        -. Поиск элемента массива с известным индексом - O(1) - одно действие
//        -. Дублирование одномерного массива через foreach - O(n) - число по действию элементов массива
//        -. Удаление элемента массива с известным индексом без сдвига O(1) - одно действие
//        -. Удаление элемента массива с неизвестным индексом без сдвига 0(n) или  O(logN) - в зависимости от алгоритма поиска
//        -. Удаление элемента массива с неизвестным индексом со сдвига О(n)


//        3. Определить сложность следующих алгоритмов.Сколько произойдет итераций?
//
//
//      a)
//
        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) { // O(n)
            for (int j = 1; j < n; j *= 2) { // O(logN)
                arrayList.add(i * j); //общая сложность О(n logn)
            }
        }
//
//
////    b)
//
        int n1 = 10000;
        List<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < n; i += 2) { // O(n)
            for (int j = i; j < n; j++) { //O(n)
                arrayList.add(i * j); // Общая сложность O(n^2)
            }
        }


////    с)
//
        int n2 = 10000;
        List<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrayList.add(i * j);
                n--;// итоговая сложность О(n)
            }
        }
    }
}


//    d)


//        public static BigInteger factorial(BigInteger.valueOf(10000))
//
//        public static BigInteger (BigInteger n){
//            if (n.equals(BigInteger.ONE)) {
//                return n;
//            }
//            return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
//        } // итоговая сложность O(n)

//        e)

//        fib(BigInteger.valueOf(50));
//
//        public static BigInteger fib (BigInteger n) {
//            if (n.equals(BigInteger.ONE)) {
//                return BigInteger.ZERO;
//            }
//            if (n.equals(BigInteger.TWO)) {
//                return BigInteger.ONE;
//            }
//            return fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(BigInteger.TWO)));
// итоговая сложность O(2^n);


