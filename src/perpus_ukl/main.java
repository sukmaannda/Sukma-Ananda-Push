package perpus_ukl;
public class main {
    public static void main(String[] args) {
        buku self1 = new buku();
        System.out.println();
        proses pinjaman = new proses();
        siswa sekolah = new siswa();
        pinjaman.prosesPinjam(sekolah, self1, pinjaman);
    } 
}