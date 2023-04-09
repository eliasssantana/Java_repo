public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // ArithmeticOperator.operator();
       
        // System.out.println(String.format("%d", ArithmeticOperator.add(1,6)));
        // System.out.println(ArithmeticOperator.sub(5,3));
        // System.out.println(ArithmeticOperator.multiply(2,3));
        // System.out.println(ArithmeticOperator.divide(10,3));

        Calculator cal = new Calculator();
        int result = cal.add(4,2);
        System.out.println(result);

        result = cal.sub(4,2);
        System.out.println(result);

        result = cal.multiply(4,2);
        System.out.println(result);

        result = cal.divide(4,2);
        System.out.println(result);

        result = cal.divide(4,2);

        result = cal.multiply(4,2);

        TypeConversion tc = new TypeConversion();
        String result1 = tc.concatStrings(null, null);
        System.out.println(result1);

        int total = Integer.parseInt(result1);

        System.out.println(total);

        System.out.println(result1.getClass().getSimpleName());
        System.out.println(((Object)total).getClass().getSimpleName());
    }

}
