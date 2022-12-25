public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int oneInt = 2000000000;
        byte twoByte = 100;
        short threeShort = 20000;
        long fourLong = 1000000000000000000L;
        float fiveFloat = 1.05f;
        double sixDouble = 1.0553652356321656458546455634;
        System.out.println("Значение переменной oneInt с типом int равно " + oneInt);
        System.out.println("Значение переменной twoByte с типом byte равно " + twoByte);
        System.out.println("Значение переменной threeShort с типом short равно " + threeShort);
        System.out.println("Значение переменной fourLong с типом long равно " + fourLong);
        System.out.println("Значение переменной fiveFloat с типом float равно " + fiveFloat);
        System.out.println("Значение переменной sixDouble с типом double равно " + sixDouble);

        System.out.println("Task2");
        float a = 27.12f;
        long b = 987678965549L;
        short c = 2786;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println("Много цифр: " + a + b + c + d + e + f + g );

        System.out.println("Task3");
        byte lP;
        lP = 23;
        byte aS;
        aS = 27;
        byte eA;
        eA = 30;
        short paper;
        paper = 480;
        int pupils;
        pupils = lP + aS + eA;
        int paperEach = (paper / pupils);
        System.out.println("На каждого ученика рассчитано " + paperEach + " листов бумаги");

        System.out.println("Task4");
        byte bottles = 16;
        int twentyMin;
        twentyMin = 20 / 2 * bottles;
        System.out.println("За 20 минут машина произвела " + twentyMin + " штук бутылок");
        int oneDay;
        oneDay = 24 * 60 / 2 * bottles;
        System.out.println("За сутки машина произвела " + oneDay + " штук бутылок");
        int threeDay;
        threeDay = 3 * 24 * 60 / 2 * bottles;
        System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок");
        int oneMonth;
        oneMonth = 30 * 24 * 60 / 2 * bottles;
        System.out.println("За 3 дня машина произвела " + oneMonth + " штук бутылок");
    }
}