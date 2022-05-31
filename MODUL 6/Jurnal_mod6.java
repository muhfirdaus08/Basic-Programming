
import java.util.Scanner;

class user {
    public String nama;
    public int umur, indexTeman;
    public int[] teman = new int[5];

    user(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        indexTeman = 0;
    }

}

public class Jurnal_mod6 {

    static user[] users = new user[10];
    boolean isLogin = false; // ngecek apakah sudah login atau belum
    static int activeUser; // menandai user yang sedang login
    static int regist = 0;
    static Scanner sc = new Scanner(System.in);

    static void menuUtama() {
        int pilihan;
        System.out.println("\nPilih salah satu : ");
        System.out.println("1. Login");
        System.out.println("2. Buat Akun\n3. Data semua akun\n4. Data pertemanan\n5. Data saran pertemanan\n6. Exit");
        System.out.println("Pilihan : ");
        pilihan = sc.nextInt();

        switch (pilihan) {

            case 1:
                login();
                break;
            case 2:
                daftar();
                break;
            case 3:
                printUser();
                break;
            case 4:
                friendList();
                break;
            case 5:
                suggestedFriend();
                break;
            default:
                return;
        }
    }

    static void menuHome(int index) {
        int pilihan;
        System.out.println("\nSELAMAT DATANG " + users[index].nama);
        System.out.println("=====================");

        System.out.println("1. Tambahkan teman");
        System.out.println("2. Lihat teman");
        System.out.println("3. Lihat saran pertemanan");
        System.out.println("4. Menu utama");
        System.out.println("Pilihan : ");
        pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                addFriend();
                break;
            case 2:
                friendList(activeUser);
                break;
            case 3:
                suggestedFriend(activeUser);
                break;
            default:
                menuUtama();
        }
    }

    static void login() {
        String nama;
        System.out.println("Masukkan nama akun : ");
        nama = sc.next();

        // cek login

        for (int i = 0; i < 10; i++) {
            if (users[i].nama.equalsIgnoreCase(nama)) {
                activeUser = i;
                menuHome(i);
            }
        }
    }

    static void daftar() {
        String nama;
        int umur;
        System.out.println("Masukkan nama : ");
        nama = sc.next();
        System.out.println("Masukkan umur : ");
        umur = sc.nextInt();

        users[regist] = new user(nama, umur);
        regist++;

        menuUtama();
    }

    static void addFriend() {
        String nama;
        System.out.println("Masukkan nama teman : ");
        nama = sc.next();

        // System.out.println("nama yang ingin ditambah : " + nama);
        int indexTambah = findIndex(nama);
        // System.out.println("index yang ingin ditambah : " + indexTeman);
        // saling berteman
        users[activeUser].teman[users[activeUser].indexTeman] = indexTambah;
        users[activeUser].indexTeman++;

        users[indexTambah].teman[users[indexTambah].indexTeman] = activeUser;
        users[indexTambah].indexTeman++;

        menuHome(activeUser);

    }

    static void printUser() {

        System.out.println("\tDATA SEMUA AKUN");
        System.out.println("\t===============");

        for (int i = 0; i < regist; i++) {
            System.out.println("Nama : " + users[i].nama + " Umur : " + users[i].umur);
        }

        menuUtama();

    }

    static void friendList() {

        System.out.println("\nDATA FRIENDLIST SEMUA AKUN");
        System.out.println("===================================");

        for (int i = 0; i < regist; i++) {
            System.out.print("\n" + (i + 1) + ". " + users[i].nama + " : ");
            for (int j = 0; j < users[i].indexTeman; j++) {
                int indexTeman = users[i].teman[j];
                System.out.print(users[indexTeman].nama + " ");
            }
        }

        menuUtama();

    }

    static void friendList(int index) {

        if (users[index].indexTeman > 0) {
            System.out.println("TEMAN DARI AKUN " + users[index].nama);
            for (int i = 0; i < users[index].indexTeman; i++) {
                int indexTeman = users[index].teman[i];
                System.out.println((i + 1) + ". " + users[indexTeman].nama + " ");
            }
        } else {
            System.out.println("Belum ada teman");
        }

        menuHome(index);

    }

    static void suggestedFriend() {

        System.out.println("\nSARAN PERTEMANAN UNTUK SEMUA AKUN");
        System.out.print("=====================================");

        boolean[] teman = new boolean[10]; // menandai user mana saja yg sudah menjadi saran agar tidak jadi saran 2
                                           // kali

        for (int x = 0; x < regist; x++) {
            System.out.print("\n" + users[x].nama + " : ");

            // menandai semua jadi false untuk pertama
            for (int i = 0; i < 10; i++) {
                teman[i] = false;
            }

            for (int i = 0; i < users[x].indexTeman; i++) {
                int indexUser = users[x].teman[i];

                for (int j = 0; j < users[indexUser].indexTeman; j++) {
                    int temannyaTeman = users[indexUser].teman[j];

                    // ngecek apakah temannya teman udh jadi teman kita atau blm dan temannya teman
                    // itu nama kita sendiri
                    // atau ndak
                    if (!isFriend(x, temannyaTeman) && x != temannyaTeman) {
                        teman[temannyaTeman] = true;
                    }
                }
            }

            // print saran-saran teman
            for (int i = 0; i < 10; i++) {
                if (teman[i]) {
                    System.out.print(users[i].nama + " ");
                }
            }
        }

        menuUtama();

    }

    static void suggestedFriend(int index) {

        System.out.println("Saran pertemanan untuk akun " + users[index].nama + " : ");

        // menandai user mana saja yg sudah menjadi saran agar tidak jadi saran 2 kali
        boolean[] teman = new boolean[10];

        // menandai semua jadi false untuk pertama
        for (int i = 0; i < 10; i++) {
            teman[i] = false;
        }

        for (int i = 0; i < users[index].indexTeman; i++) {
            int indexUser = users[index].teman[i];

            for (int j = 0; j < users[indexUser].indexTeman; j++) {
                int temannyaTeman = users[indexUser].teman[j];

                // ngecek apakah temannya teman udh jadi teman kita atau blm dan temannya teman
                // itu nama kita sendiri
                // atau ndak
                if (!isFriend(index, temannyaTeman) && index != temannyaTeman) {
                    teman[temannyaTeman] = true;
                }
            }
        }

        // print saran-saran teman
        for (int i = 0; i < 10; i++) {
            if (teman[i]) {
                System.out.println(users[i].nama + " ");
            }
        }

        menuHome(index);

    }

    static int findIndex(String nama) {
        for (int i = 0; i < regist; i++) {
            if (users[i].nama.equalsIgnoreCase(nama)) {
                return i;
            }
        }

        return -1;

    }

    static boolean isFriend(int index, int indexTeman) {
        for (int i = 0; i < users[index].indexTeman; i++) {
            if (users[index].teman[i] == indexTeman)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        // biar ndk lelah buat akun untuk percobaan
        users[0] = new user("rizqi", 20);
        users[1] = new user("adit", 20);
        users[2] = new user("ajem", 20);
        users[3] = new user("rifqi", 20);
        users[4] = new user("dika", 20);
        regist = 5;

        menuUtama();

    }

}
