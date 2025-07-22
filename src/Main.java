import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String arrowLeft  = "<--<<";
        String arrowRight = ">>-->";
        int lengthLeft  = arrowLeft.length();
        int lengthRight = arrowRight.length();
        Scanner scanner = new Scanner( System.in );
        System.out.printf( "Введите калиберду : " );
        String text = scanner.next();
        int index;
        int poz = 0;
        int countLeft  = 0;
        int countRight = 0;
                
        while ( true ) {
            index = text.indexOf( arrowLeft , poz );

            if ( index == -1 ) {
                break;
            } else {
                countLeft++;
                poz = index + lengthLeft;
            }
        }

        poz = 0;

        while ( true ) {
            index = text.indexOf( arrowRight , poz );

            if ( index == -1 ) {
                break;
            } else {
                countRight++;
                poz += index + lengthRight;
            }
        }

        System.out.println( arrowLeft + " : " + countLeft );
        System.out.println( arrowRight + " : " + countRight );

        scanner.close();
    }
}