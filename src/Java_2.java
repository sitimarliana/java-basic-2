import java.util.Scanner;

public class Java_2 {
    public static void main(String[] args) {
        int  nilai;
        char capaian;

        Scanner scane = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        nilai = scane.nextInt();

        if (nilai >= 80)
        {
            capaian = 'A';
        }
        else if (nilai >= 61)
        {
            capaian = 'B';
        }
        else if (nilai >= 41)
        {
            capaian = 'C';
        }
        else if (nilai >= 21)
        {
            capaian = 'D';
        }
        else
        {
            capaian = 'F';
        }

        System.out.println("Nilai kamu : " + capaian);
    }
}