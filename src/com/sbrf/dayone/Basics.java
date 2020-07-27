package com.sbrf.dayone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.DoubleStream;

public class Basics {
    public static void main(String[] args) {
        P20 test = new P20();
        test.solve();
    }
}

class P1 {
    public void solve() {
        System.out.println("Hello, World!");
    }

}

class P2 {
    public void solve() {
        int a, b;
        try (Scanner in = new Scanner(System.in)) {
            a = in.nextInt();
            b = in.nextInt();
            System.out.println(a + "/" + b + " = " + (a / b) + " и " + (a % b) + " в остатке.");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

}

class P3 {
    public void solve(boolean weekday, boolean vacation) {
        System.out.println(!weekday || vacation);
    }
}

class P4 {
    private String str;
    private StringBuilder sb;

    public void solve() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String templ;
            str = in.readLine();
            templ = str.substring(0, str.length() / 2);
            if (str.length() % 2 != 0) {
                sb = new StringBuilder(str.substring(str.length() / 2 + 1)).reverse();
            } else {
                sb = new StringBuilder(str.substring(str.length() / 2)).reverse();
            }
            System.out.println(templ.equals(sb.toString()));
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

class P5 {
    private final Scanner in = new Scanner(System.in);

    public void solve() {
        String num = in.nextLine();
        long sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Long.parseLong(String.valueOf(num.charAt(i)));
        }
        System.out.println(sum);
    }
}

class P6 {
    private final Scanner in = new Scanner(System.in);
    private final double DECREASE = 0.17d;


    public void solve() {
        double force = in.nextDouble();
        System.out.printf("%.3f", force * DECREASE);

    }

}

class P7 {
    private final Scanner in = new Scanner(System.in);

    public void solve() {
        long num = in.nextLong();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

class P8 {
    private final Scanner in = new Scanner(System.in);

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void solve() {
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }
}

class P9 {
    private final int FROM = 2;
    private final int TO = 100;

    public void solve() {
        for (int i = FROM; i != TO; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class P10 {
    private final Scanner in = new Scanner(System.in);
    private int[] fib;

    public void solve() {
        int count = in.nextInt();
        fib = new int[count];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 0; i < count; i++) {
            if (i == 0 || i == 1) {
                System.out.print(fib[i] + " ");
                continue;
            }
            fib[i] = fib[i - 2] + fib[i - 1];
            System.out.print(fib[i] + " ");
        }
    }
}

class P11 {
    private final Scanner in = new Scanner(System.in);

    public void solve() {
        int a = in.nextInt();
        int b = in.nextInt();
        b -= a;
        int result = (int) (Math.random() * ++b) + a;
        System.out.println(result);
    }
}

class P12 {
    private StringTokenizer st;

    public void solve() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            st = new StringTokenizer(in.readLine(), " ");
            StringBuilder sb = new StringBuilder();
            sb.append(st.nextElement());
            int pos = Integer.parseInt(String.valueOf(st.nextElement()));
            sb.deleteCharAt(pos);
            System.out.println(sb);
        } catch (IOException | StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

class P13 {
    private final Scanner in = new Scanner(System.in);
    private final Random random = new Random();
    private double[] arr;
    private int action = 0;
    private int size;
    private final int BOUND = 100;


    private void fillArray(int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = Math.ceil(random.nextDouble() * BOUND);
        }
    }

    private void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private void incElement() {
        System.out.println("Введите индекс элемента для увеличения: ");
        try {
            int index = in.nextInt();
            arr[index] = Math.ceil(arr[index] * 1.10d);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Недопустимое значение индекса");
        }

    }

    private void showMenu() {
        System.out.println("Выберите цифру действия: \n" +
                "1.Вывести массив\n" +
                "2.Увеличить элемент массива на 10%\n" +
                "3.Выход");
    }

    public void solve() {
        System.out.print("Введите размер массива: ");
        size = in.nextInt();
        arr = new double[size];
        fillArray(size);
        showMenu();
        while (true) {
            action = in.nextInt();
            switch (action) {
                case 1:
                    printArray();
                    showMenu();
                    break;
                case 2:
                    incElement();
                    showMenu();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверно указано действие");
            }
        }
    }
}


class P14 {
    private final Scanner in = new Scanner(System.in);
    private final int a = 65;
    private int z = 90;


    public void solve() {
        z -= a;
        int result = (int) (Math.random() * ++z) + a;
        char userChoise;
        int userChoiseInt;
        while (true) {
            userChoise = in.next().charAt(0);
            userChoiseInt = userChoise;
            if (userChoiseInt > result) {
                System.out.println("You're too high");
            } else if (userChoiseInt < result) {
                System.out.println("You're too low");
            } else {
                System.out.println("RIGHT");
                break;
            }
        }

    }
}

class P15 {
    private final Scanner in = new Scanner(System.in);

    public void solve() {
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double disk = Math.pow(b, 2) - 4 * a * c;
        if (disk < 0) {
            System.out.println("Корней нет");
        } else {
            double x1 = (-b + Math.sqrt(disk)) / (2 * a);
            double x2 = (-b - Math.sqrt(disk)) / (2 * a);
            System.out.println("Уравнение " + a + "x² + " + b + "x + " + c);
            System.out.printf("Имеет корни: %.3f \t %.3f", x1, x2);
        }
    }
}

class P16 {
    private final int FROM = 2;
    private final int TO = 50_000;

    public void solve() {
        int count = 0;
        for (int i = FROM; i < TO; i++) {
            if (String.valueOf(i).indexOf('2') != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}

class P17 {
    private final int ROWS = 6;
    private final int COLUMNS = 7;


    public void solve() {
        int[][] arr = new int[ROWS][COLUMNS];
        System.out.println("source array:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < ROWS; i++) {
            int[] tempArr = arr[i];
            int[] reversedArr = Arrays.stream(tempArr)
                    .boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
            arr[i] = reversedArr;
        }

        System.out.println("reversed array:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

class P18 {
    private final Scanner in = new Scanner(System.in);

    public void solve() {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if ((a >= b + c) || (b >= a + c) || (c >= a + b)) {
            System.out.print("Треугольник невозможен");
        } else if ((Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) || (Math.pow(b, 2) == Math.pow(c, 2) + Math.pow(a, 2)) || (Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2))) {
            System.out.printf("Треугольник со сторонами: %d, %d, %d - Прямоугольный", a, b, c);
        } else if ((Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) || (Math.pow(b, 2) > Math.pow(a, 2) + Math.pow(c, 2)) || (Math.pow(c, 2) > Math.pow(a, 2) + Math.pow(b, 2))) {
            System.out.printf("Треугольник со сторонами: %d, %d, %d - Тупоугольный", a, b, c);
        } else if ((Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) || (Math.pow(b, 2) < Math.pow(a, 2) + Math.pow(c, 2)) || (Math.pow(c, 2) < Math.pow(a, 2) + Math.pow(b, 2))) {
            System.out.printf("Треугольник со сторонами: %d, %d, %d - Остроугольный", a, b, c);
        }
    }
}

class P19 {
    private final Scanner in = new Scanner(System.in);
    private final String[] RIM = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C"};
    private final int[] AR = {1, 4, 5, 9, 10, 40, 50, 90, 100};

    public void solve() {
        int number = in.nextInt();
        StringBuilder answer = new StringBuilder();
        for (int i = 8; i >= 0; i--) {
            while (number >= AR[i]) {
                number -= AR[i];
                answer.append(RIM[i]);
            }
        }
        System.out.println(answer);
    }
}

class P20 {

    class Record {
        private final String surName;
        private final double middlePoint;

        public Record(String surName, double middlePoint) {
            this.surName = surName;
            this.middlePoint = middlePoint;
        }

        @Override
        public String toString() {
            return surName + ", средний балл: " + middlePoint;
        }
    }


    public void solve() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int count = Integer.parseInt(in.readLine());
            Record[] records = new Record[count];
            for (int i = 0; i < count; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine(), " ");
                String name = String.valueOf(st.nextElement());
                double[] points = new double[st.countTokens()];
                int counter = 0;
                while (st.hasMoreElements()) {
                    String temp = String.valueOf(st.nextElement());
                    points[counter] = Integer.parseInt(temp);
                    counter++;
                }
                int sum = 0;
//                for (int e : points) {
//                    sum += e;
//                }
                records[i] = new Record(name, DoubleStream.of(points).average().getAsDouble());
            }

            Arrays.sort(records, (o1, o2) -> {
                if (o1.middlePoint > o2.middlePoint) return -1;
                if (o1.middlePoint < o2.middlePoint) return 1;
                return 0;
            });
            for (int i = 0; i < count; i++) {
                System.out.println(records[i]);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}