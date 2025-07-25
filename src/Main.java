import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int MAX_LEN_LINE = 106;
        String arrowLeft  = "<--<<";  // если шаблон изменится, обратить внимание на строку 37 (метка l1)
        String arrowRight = ">>-->";  // если шаблон изменится, обратить внимание на строку 49 (метка l2)
        int lengthLeft  = arrowLeft.length();
        int lengthRight = arrowRight.length();
        Scanner scanner = new Scanner( System.in );

        System.out.printf( "Введите строку с стрелочками : " );
        String text = scanner.nextLine();

        if ( text.length() > MAX_LEN_LINE ) {
            System.out.println( "Введена слишком длинная строка, оставляем первые " + MAX_LEN_LINE + " символов" );
            text = text.substring( 0 , MAX_LEN_LINE );
            System.out.println( "Осталось от строки: " + text );
        }

        String str;
        int index;
        int lenText;
        int poz = 0;
        int countLeft = 0;
        int countRight = 0;
        int i;

        /* Считаем стрелки влево  */
        lenText = text.length() - lengthLeft + 1;

        for ( i = 0 ; i < lenText ; i++ ) {
            str = text.substring( i , i + lengthLeft );

            if ( str.equals( arrowLeft ) ) {
                countLeft++;
l1:             i += 3; // если шаблон стрелки поменяется, то эту строку удалить или число скорректировать
            }
        }

        /* Считаем стрелки вправо  */
        lenText = text.length() - lengthRight + 1;

        for ( i = 0 ; i < lenText ; i++ ) {
            str = text.substring( i , i + lengthRight );

            if ( str.equals( arrowRight ) ) {
                countRight++;
l2:             i += 3; // если шаблон стрелки поменяется, то эту строку удалить или число скорректировать
            }
        }

        System.out.println( arrowLeft + " : " + countLeft + " и " + arrowRight + " : " + countRight);

        scanner.close();
    }
}
