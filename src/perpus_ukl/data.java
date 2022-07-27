package perpus_ukl;
public interface data {
    
    // terdapat Getter dan Setter merupakan dua method yang berfungsi untuk mengambil dan mengisi nilai pada suatu objek.
    public void setNama(String nama);
    
    public void setAlamat(String alamat);
    
    public void setTelepon(String telepon);
    
    // class abstract memiliki satu atau lebih metode dengan kata kunci abstrak. Metode abstrak hanya dideklarasikan tetapi tidak diimplementasikan.
    public abstract String getNama(int id); 
    
    public abstract String getAlamat(int id);
    
    public abstract String getTelepon(int id);
}

//polimorphisme: berbagai bentuk, salah satunya adalah class interface, karena class interface sudah pasti interface.
//kalau class abstract belum tentu interface
