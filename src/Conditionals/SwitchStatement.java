package Conditionals;

public class SwitchStatement {

    public static void main(String[] args) {
        int month = 14;

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            // all 12 months
            default:
                System.out.println("Invalid Input");
                break;
        }

        /*
        if (month==1) {
            print (Jan)
        }
        else if (month==2) {
            print (Feb)
        }
         */
    }
}
