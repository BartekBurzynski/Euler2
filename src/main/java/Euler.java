public class Euler {public static void main(String[] args) {
    Euler euler = new Euler();
    int x =   euler.calc(4000000);
    System.out.println(x);
}
    int calc( int max){
        int a = 1;
        int b = 2;
        int c = 3;
        int sum = 2;
        while (c < max){
            c = a +b;
            a = b;
            b = c;
            if (c %2 == 0){
                sum += c;
            }
        }
        return sum;
    }
}
