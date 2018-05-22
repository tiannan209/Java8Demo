public class LambdaDemo {

    public static void lambdaExpTest(){

        MathOperation addition = (int a, int b) -> (a + b);

        MathOperation subtraction  = (a, b) -> a - b;

        MathOperation multiplication = (a, b) -> {return a * b;};

        MathOperation division = (int a, int b) -> a/b;

        System.out.println("10 + 5 = " + addition.operation(10, 5));
        System.out.println("10 - 5 = " + subtraction.operation(10, 5));
        System.out.println("10 x 5 = " + multiplication.operation(10, 5));
        System.out.println("10 / 5 = " + division.operation(10, 5));

        // without parenthesis
        GreetingService greetingService1 = message -> System.out.println("Hello without parenthesis: " + message);
        greetingService1.greet("Tian Nan");

        // with parenthesis
        GreetingService greetingService2 = (message) -> System.out.println("Hello with parenthesis: " + message);
        greetingService2.greet("Tony Li");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface  GreetingService {
        void greet(String message);
    }
}
