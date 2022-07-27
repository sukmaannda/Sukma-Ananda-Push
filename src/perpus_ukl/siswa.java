package perpus_ukl;
import java.util.ArrayList;
public class siswa implements data{
    //tujuan implementas untuk menuliskan/mendefinisikan kembali method dengan nama dan isi yang sama
    
    //encapsulasi
    //pembungkusan data atau penyembunyian data-data privat dari suatu obyek sehingga tidak dapat diakses dari obyek lain. 
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    public siswa() {
        namaSiswa.add("Salma");
        alamat.add("Surabaya");
        telepon.add("087643527509");
        status.add(true);
        
        namaSiswa.add("Zalfa");
        alamat.add("Bandung");
        telepon.add("088545342169");
        status.add(true);
        
        namaSiswa.add("Rasya");
        alamat.add("Blitar");
        telepon.add("086538064721");
        status.add(true);
    }
    @Override
    public void setNama(String nama) {
        this.namaSiswa.add(nama);
    }
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    public void setStatus(Boolean status, int index) {
        this.status.set(index, status);
    }
    @Override
    public String getNama(int id) {
        return this.namaSiswa.get(id);
    }
    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }
    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    public boolean getStatus(int id) {
        return status.get(id);
    }
}

