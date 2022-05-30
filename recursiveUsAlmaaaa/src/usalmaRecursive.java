import java.util.Scanner;

public class usalmaRecursive {
    static int sonuc = 1;
    static int temp (int taban, int us){
        if (taban == 0)
            return 1;
        temp(taban-1,us);
        sonuc *= us;
        return sonuc;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int exp, base;

        System.out.print("İlk değeri girin: ");
        base = scan.nextInt();

        System.out.print("İkinci değeri girin: ");
        int taban = scan.nextInt();

        System.out.println("Sonuç : "+temp(taban,base));
    }
}