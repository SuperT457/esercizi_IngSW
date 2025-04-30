public class Main {
    public static void main(String[] args) {
        int x=1, y=1;
        char operator;
        if(args.length != 3){
            System.out.println("Usage: java Main <num1> <operator> <num2>");
            return;
        }
        
        operator = args[1].charAt(0);
        
        if(operator != '+' && operator != '-' && operator != 'x' && operator != '/'){
            System.out.println("Invalid operator. Use +, -, x, or /.");
            System.exit(1);
        }

        

        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            System.exit(2);
        }

        switch (operator) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case 'x':
                System.out.println(x * y);
                break;
            case '/':
                if (y == 0) {
                    System.out.println("Division by zero is not allowed.");
                    System.exit(3);
                } else {
                    System.out.println(x / y);
                }
                break;
            default:
                System.out.println("Bruh");
        }
    }
}
