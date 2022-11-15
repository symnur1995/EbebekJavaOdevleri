import java.util.Scanner;

public class MinMaxDegerBulma {
    public static void main(String[] args) {
        //Gerekli degiskenlerin tanimlanmasi

                int num;
                int max = 0;
                int min = 0;
                int countOfNumbers;
    //Sayi adetinin kullaniciya girdirilmesi

                System.out.print("Lutfen gireceginiz sayi adetini yaziniz");
                Scanner scan = new Scanner(System.in);
                countOfNumbers = scan.nextInt();

    //for dongusu icerisinde sayilarin aldirilmasi

                for (int i = 1; i <= countOfNumbers; i++) {
                    System.out.print(i + ".sayiyi giriniz: ");
                    num = scan.nextInt();

    //ilk dongu adiminda, mininum ve maksimum girilen sayiya esitlenmelidir
                    if (i == 1) {
                        min = num;
                        max = num;
                    }

    //minimumdan kucuk bir sayi girilirse minimumu, maksimumdan buyuk bir sayi girilirse maksimumu guncelliyor

                    if (num > max) {
                        max = num;
                    }
                    if (num < min) {
                        min = num;
                    }

                }

                System.out.println("En buyuk sayi : " + max);
                System.out.println("En kucuk sayi : " + min);
            }
        }

