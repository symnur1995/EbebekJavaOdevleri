import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {


        int sum= 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mukemmel sayi olup olmadigini merak ettiginiz bir sayi giriniz");
        int num = scan.nextInt();

        //sayinin carpanlarinin eklenmesi icin dizi olusturulmasi

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                list.add(i);
            }
        }

        //carpanlarin toplanmasi
        for(int item : list){
            sum += item;
        }

        if (sum == num) {
            System.out.print(num + " Sayisi bir mukemmel sayidir");
        } else {
            System.out.print(num + " Sayisi bir mukemmel sayi DEGILDIR");
        }


    }
}
