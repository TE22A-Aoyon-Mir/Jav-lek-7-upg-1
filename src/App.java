import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner t = new Scanner(System.in);

        int svar = 0;
        int poäng = 0;
        System.out.println("Fråga 1: 1+1 ");
        svar = t.nextInt();
        if(svar==2)
        {
            poäng++; System.out.println("Rätt svar");
        }
        else
        {
            System.out.println("Fel svar");
        }
        
        System.out.println("Fråga 2: 2+2 ");
        svar = t.nextInt();
        if(svar==4)
        {
            poäng++; System.out.println("Rätt svar");
        }
        else
        {
            System.out.println("Fel svar");
        }

        System.out.println("Fråga 3: 3+3 ");
        svar = t.nextInt();
        if(svar==6)
        {
            poäng++; System.out.println("Rätt svar");
        }
        else
        {
            System.out.println("Fel svar");
        }

        System.out.println("Fråga 4: 4+4 ");
        svar = t.nextInt();
        if(svar==8)
        {
            poäng++; System.out.println("Rätt svar");
        }
        else
        {
            System.out.println("Fel svar");
        }

        System.out.println("Fråga 5: 5+5 ");
        svar = t.nextInt();
        if(svar==10)
        {
            poäng++; System.out.println("Rätt svar");
        }
        else
        {
            System.out.println("Fel svar");
        }
        System.out.println("Du fick "+poäng+" utav 5");
    }
}
