import java.util.Scanner;

public class RecursivePower {



        int base = 0;
        int power = 0;

        public void getNumbers(){
            Scanner scan = new Scanner(System.in);
            System.out.print("Lutfen sayi taban sayiyi giriniz: \n ");
            base = scan.nextInt();
            System.out.print("Lutfen sayi ussunu giriniz: \n ");
            power = scan.nextInt();

            System.out.print("Sonuc: \n ");
            System.out.println(getPower(base,power));
            System.out.print("\n ");
            getNumbers();
        }

        public int getPower(int base, int power){
            if(power != 0){
                return (base * getPower(base,power - 1));
            }else{
                return 1;
            }
        }



    public static void main(String[] args) {
        RecursivePower r = new RecursivePower();
        r.getNumbers();

    }
}
