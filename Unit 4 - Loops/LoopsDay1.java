public class LoopsDay1 {
    public static void main(String[] args) {
        print200To300();
        printEvensTo1000();
        sum1To10();
        // sumMutiplesOf7();
    }

    public static void print200To300() {
        int count1 = 200;
        while (count1 < 301) {
            System.out.println(count1);
            count1 = count1 + 1;
        }
    }

    public static void printEvensTo1000() {
        int count2 = 2;
        while (count2 < 1001) {
            System.out.println(count2);
            count2 = count2 + 2;
        }
    }

    public static void sum1To10() {
        int count3 = 1;
        int sum1;
        while (count3 < 11) {
            count3 = count3 + 1;
            sum1 = count3 + count3;
        }
        System.out.println(sum1);
    }
}
