
import java.util.Scanner;

class RecursiveNumber{

    int num = 0;
    Scanner scan = new Scanner(System.in);

    public void getNumber(){
        System.out.print("Lutfen Sayi giriniz: ");
        num = scan.nextInt();
        if(num > 0){
            num -=5;
        }else{
            num +=5;
        }
        System.out.println(num);
        getNumber();

    }


    public static void main(String[] args) {
        RecursiveNumber r = new RecursiveNumber();
        r.getNumber();
    }

}