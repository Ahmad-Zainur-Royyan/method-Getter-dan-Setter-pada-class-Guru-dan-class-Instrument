import java.util.Scanner;

public class GuruTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = input.nextLine();
        System.out.println("Mapel : ");
        String mapel = input.nextLine();
        System.out.println("Status : ");
        String status = input.nextLine();
        System.out.println("NIP : ");
        int nip = input.nextInt();
        input.close();

        Guru royyan = new Guru(nip, nama, mapel, status);
        royyan.print();

        // constructor parameter
        Guru buVava = new Guru(1234,"Bu Vava", "Matematika","Aktif");
        Guru buVivi = new Guru(4321,"Bu Vivi", "Bahasa Indonesa","Aktif");
        Guru buVuvu = new Guru(3131,"Bu Vuvu", "Bahasa Jawa","Tidak Aktif");
        Guru buVeve = new Guru(4323,"Bu Veve", "Bahasa Inggris","Aktif");
        Guru buVovo = new Guru(2133,"Bu Vovo", "IPAS","Aktif");

        buVava.print();
        buVivi.print();
        buVuvu.print();
        buVeve.print();
        buVovo.print();
    }
}
