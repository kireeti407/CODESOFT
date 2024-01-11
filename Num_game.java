import java.util.Random;
import  java.util.Scanner;
class Num_Game{
    public static void main(String args[]){
        int src=0,ch=0;
        int round=1;
        System.out.println("____________________________________WELLCOME TO NUMBER GAMING________________________________\n\n");
        System.out.println("-------------------------instruction----------------\n");   
        System.out.println("==>Each round have 10 chances.guess the number in 10 chances");
        Scanner inp = new Scanner(System.in) ;
        Random rand= new Random();
        int guess=rand.nextInt(100-0-1);
        while (true) {
            if (ch<10){
                    System.out.print("\nyou have "+ (10-ch)+ " chances. Enter the your guess number:");
                    int i= inp.nextInt();
                    if (i==guess){
                        System.out.println("\ncongrats your guess number is correct");
                        guess=rand.nextInt(100-0-1);
                        src+=1;
                    }
                    else if (i<guess){
                        System.out.println("\nto low_______________");
                    }
                    else{
                        System.out.println("\nto High______________");
                    }
                    ch+=1;
            }
            else{
                System.err.println("\nNumber is "+guess);
                System.out.print("\nplay agian enter \"1\" Quit enter \"0\":");
                int opp=inp.nextInt();
                if (opp==0){
                    break;
                }
                guess=rand.nextInt(100-0-1);
                round+=1;
                ch=0;
            }
        }
        System.out.println("\nyou played "+round+" rounds .Your score is :"+src+"\n");
        System.err.println("____________________________________________GOOD BYE____________________________________________");
    }
}