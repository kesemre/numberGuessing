import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();
        int number = random.nextInt(100);
        int right = 0;
        int [] wrongGuess = new int [5];
        System.out.println(number);
        while (right<5){
            System.out.print("lütfen "+(1+right)+". tahminizi yazınız");
            int Guess = scanner.nextInt();
            if(Guess >0 && Guess<100){
            if (number==Guess){
                System.out.println("Sayıyı Doğru Tahmin Ettiniz Tebrikler :D");
                System.out.println("Önceki tahminleriz:" + Arrays.toString(wrongGuess));
                System.out.println("Kalan can hakkınız:" + (5-right));
                break;
            } else if (right==4) {
                System.out.println("Bütün canlarınız bitti kaybettiniz :C");
                System.out.println("Belirlenen sayı :" +number);
                wrongGuess[right] = Guess;
                System.out.println("Sizin girdiğiz sayılar:" + Arrays.toString(wrongGuess));
                right++;
            } else if (right<4)
                {
                if (Guess<number){
                    System.out.println("Girdiğiz sayı Belirlenen sayıdan küçük.");
                }
                else {
                    System.out.println("Girdiğiniz Sayı Belirlenen sayıdan Büyük.");
                }
                wrongGuess[right] = Guess;
                right++;
                System.out.println("kalan canınız:" +(5-right));

            }
            }
            else{
                System.out.println("Lütfen 0 ile 100 arası bir sayı giriniz");

            }

        }


    }
}