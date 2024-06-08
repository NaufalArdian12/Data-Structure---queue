import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan kapasitas queue: ");
        int n = sc.nextInt();

        Queue<Integer> Q = new ArrayDeque<>(n);

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukan data baru: ");
                    int datamasuk = sc.nextInt();
                    Q.offer(datamasuk);
                    break;
                case 2:
                    Integer dataKeluar = Q.poll();
                    if (dataKeluar != null) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    } else {
                        System.out.println("Queue sudah kosong");
                    }
                    break;
                case 3:
                    System.out.println(Q);
                    break;
                case 4:
                    System.out.println("Elemen terdepan: " + Q.peek());
                    break;
                case 5:
                    Q.clear();
                    System.out.println("Queue berhasil dikosongkan");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
        
        sc.close();
    }

    public static void menu() {
        System.out.println("Masukan operasi yang diinginkan");
        System.out.println("1. Queue");
        System.out.println("2. Dequeue");
        System.out.println("3. print");
        System.out.println("4. peek");
        System.out.println("5. clear");
        System.out.println("---------------------------------");
    }
}