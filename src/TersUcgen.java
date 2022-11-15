import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        int num = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cizilecek ucgen yuksekligini giriniz");
         num = scan.nextInt();

        int countOfStar = 2*num-1;
        int countOfBlank = 0;

        for(int i = 0; i < num; i++){
            System.out.println("");
            for(int j = 0; j < countOfBlank; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < countOfStar; j++){
                System.out.print("*");
            }


            countOfBlank = countOfBlank + 1;
            countOfStar = countOfStar - 2;
        }
    }


}

