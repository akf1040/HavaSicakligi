import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sıcaklık giriniz");
        heat = scanner.nextInt();


        if (heat < 5) {
            System.out.println("Bugün havada kayak yapabilirsiniz");
        } else if (heat >= 5 && heat <= 15) {
            System.out.println("Bugün havada sinemaya gidebilirsiniz");
        } else if (heat > 15 && heat <= 25) {
            System.out.println("Bugün havada pikniğe gidebilirsiniz");
        } else {
            System.out.println("Bugün havada yüzmeye gidebilirsiniz");
        }
    }}