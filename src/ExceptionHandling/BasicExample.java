package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicExample {

    public static void main(String[] args) throws DivisionException {
        Scanner sc = new Scanner(System.in);

        try {
            int dividend = sc.nextInt();
            int divisor = sc.nextInt();
            int quotient = dividend/divisor;
            System.out.println(quotient);
        }
        catch (ArithmeticException ex) {
            System.out.println("Arithmetic Error : "+ex.getMessage());
            throw new DivisionException("Divisor can not be zero");
        }
        catch (InputMismatchException ex) {
            System.out.println("Input Mismatch Error");
            throw new DivisionException("Inputs must be integers");
        }
        catch (Exception ex) {
            System.out.println("Unknown Exception : "+ex.getMessage());
        }
        finally {
            System.out.println("Ending the division");
        }
    }
}
