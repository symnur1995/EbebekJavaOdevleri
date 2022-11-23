import java.util.Scanner;
public class Asal {



        int num1 = 0;

        public void getNum(){
            Scanner scan = new Scanner(System.in);
            System.out.print("Asalligini kontrol etmek istediginiz sayiyi giriniz: \n ");
            num1 = scan.nextInt();

            if(getAsalSayi(num1,num1 - 1) == 1){
                System.out.print(num1 + " sayisi asal sayidir");
            }else{
                System.out.print(num1 + " sayisi asal sayi Degildir");
            }
        }

        int getAsalSayi(int num1, int num2){
            if(num1 % num2 == 0){
                return num2;
            }else{
                return getAsalSayi(num1, num2-1);
            }
        }



        public static void main(String[] args) {
            Asal r = new Asal();
            r.getNum();

        }
    }

