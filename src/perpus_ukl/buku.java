package perpus_ukl;
import java.util.ArrayList;
public class buku {
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    buku() {
        this.namaBuku.add("Buku Pengetahuan");
        this.stok.add(12);
        this.harga.add(12000);
        
        this.namaBuku.add("Novel Remaja");
        this.stok.add(10);
        this.harga.add(10000);
        
        this.namaBuku.add("Dongeng Anak");
        this.stok.add(9);
        this.harga.add(9000);
    }
    public void setNamaBuku(String namaBuku) {
        this.namaBuku.add(namaBuku);
    }
    public int getIndexBuku(String namaBuku) {
        return this.namaBuku.indexOf(namaBuku);
    }
    public void setStok(int stok, int idBuku) {
        this.stok.set(idBuku, stok);
    }
    public void setHarga(int harga) {
        this.harga.add(harga);
    }
    public String getNamaBuku(int id) {
        return this.namaBuku.get(id);
    }
    public Integer getHarga(int id) {
        return this.harga.get(id);
    }
    public Integer getStok(int id) {
        return stok.get(id);
    }
}
