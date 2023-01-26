import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;

        Scanner dersNotu = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = dersNotu.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = dersNotu.nextInt();

        System.out.print("Türkçe notunuz :");
        turkce = dersNotu.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = dersNotu.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = dersNotu.nextInt();

        double average =(mat + fizik + turkce + kimya + muzik) / 5;

        if (average < 55){
            System.out.println("Sınıfı geçemediniz..!");
        }else{
            System.out.println("Sınıfı geçtiniz, tebrikler..");
        }
        System.out.println("Seneye görüşmek dileğiyle..");
    }
}