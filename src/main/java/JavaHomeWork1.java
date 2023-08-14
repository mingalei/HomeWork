public class JavaHomeWork1 {
    public static void main(String[] args) {
        int a = 5;
        int b = -3;
        int c = Integer.MAX_VALUE;
        double d = 0.345;
        System.out.println("a = "+(a));
        System.out.println("b = "+(b));
        System.out.println("c = "+(c));
        System.out.println("c = "+(d));
        System.out.println("Операции с числами типа int:");
        System.out.println("a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a / b = "+(a/b));
        System.out.println("a * b = "+(a*b));
        System.out.println("a % b = "+(a%b));

        System.out.println("Переполнение числа c:" + (c+1));

        if (a > b)
        {
            System.out.println("a > b");
        }
        if (a > 0 && b < 1)
        {
            System.out.println("Логическое выражение явялется верным");
        }
        else
        {
            System.out.println("Торт ложь!");
        }
        System.out.println("Операции с числом типа double:");
        System.out.println("a + d = "+(a+d));
        System.out.println("a - d = "+(a-d));
        System.out.println("a / d = "+(a/d));
        System.out.println("a * d = "+(a*d));
        System.out.println("a % d = "+(a%d));
    }
}
