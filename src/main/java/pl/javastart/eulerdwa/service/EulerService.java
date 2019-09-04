package pl.javastart.eulerdwa.service;

public class EulerService {

    public static void eulerTwo() {
        EulerService euler = new EulerService();
        int x = euler.calc(4000000);
        System.out.println(x);
    }

    public int calc(int max) {
        int firstFibbanaciValue = 1;
        int secondFibbanaciValue = 2;
        int addedValue = 3;
        int sum = 2;
        while (addedValue < max) {
            addedValue = firstFibbanaciValue + secondFibbanaciValue;
            firstFibbanaciValue = secondFibbanaciValue;
            secondFibbanaciValue = addedValue;
            if (addedValue % 2 == 0) {
                sum += addedValue;
            }
        }
        return sum;
    }
}
