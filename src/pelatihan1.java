import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class pelatihan1 {
    public static void main(String[] args) {
        ArrayList<String> Karyawan = new ArrayList<>();
        Karyawan.add("shahid setiawan");
        Karyawan.add("fanan");

        String mode, newKaryawan, namaKaryawan, ubahKaryawan, hapusKaryawan;
        boolean b = false;

        Scanner keyboard = new Scanner(System.in);

        while (!b){
            System.out.println("### Pendataan Karyawan PT. Ebdesk Teknologi ###");
            System.out.print("Mode: ");
            mode = keyboard.nextLine().toLowerCase(Locale.ROOT);


            switch (mode) {
                case "baca":
                    System.out.println(Karyawan);
                    break;
                case "simpan":
                    System.out.print("Masukan Nama Karyawan Baru: ");
                    newKaryawan = keyboard.nextLine();
                    Karyawan.add(newKaryawan);
                    System.out.println(Karyawan);
                    break;
                case "ubah":
                    System.out.print("Masukan Nama Karyawan : ");
                    namaKaryawan = keyboard.nextLine();
                    int index = Karyawan.indexOf(namaKaryawan);
                    if (index<0){
                        System.out.print("Nama Karyawan Salah!!! \n");
                    }
                    else {
                        System.out.print("Masukan Nama Karyawan Yang di Ubah: ");
                        ubahKaryawan = keyboard.nextLine();
                        Karyawan.set(index,ubahKaryawan);
                        System.out.println(Karyawan);
                    }

                    break;
                case "hapus":
                    System.out.print("Masukan Nama Karyawan Yang di Hapus: ");
                    hapusKaryawan = keyboard.nextLine();
                    int index2 = Karyawan.indexOf(hapusKaryawan);
                    if (index2<0){
                        System.out.print("Nama Karyawan Salah!!! \n");
                    }
                    else {
                        Karyawan.remove(hapusKaryawan);
                        System.out.println(Karyawan);
                    }
                    break;
                case "keluar":
                    b = true;
                    break;
                default:
                    b = true;
                    break;
            }
        }

        System.exit(0);

    }
}

