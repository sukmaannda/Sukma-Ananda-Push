package perpus_ukl;
import java.util.ArrayList;
public class petugas implements data { 
//implements termasuk polimorphisme (mewariskan)
//memanggil fungsi dari class lain
//Polimorphisme statis menggunakan method overloading, sedangkan polimorfisme dinamis menggunakan method overriding.
    
//inheritance adalah pewarisan dari super class ke subclass. bisa menggunakan extends maupun implements.
    
//POLIMORPHISME artinya berbagai bentuk, salah satunya berbentuk abstract. abstract juga terdiri dari beberapa class salah satunya class interface.
//class interface sudah pasti bersifat abstract, namun class abstract belum tentu interface
     public petugas() {
 
        //this untuk menyatakan variabel yang dimaksud adalah variabel yang ada di dalam class.
        //untuk memanggil variabel 
        this.nama.add("Adinda");
        this.alamat.add("Palembang");
        this.telepon.add("085307298842");
        
        this.nama.add("Alvaro");
        this.alamat.add("Yogyakarta");
        this.telepon.add("085396425231");
    }
     
     //ENCAPSULASI adalah penyembunyian data class private yang konsepnya hanya bisa diakses oleh class itu sendiri
     //pembungkusan data atau penyembunyian data-data privat dari suatu obyek sehingga tidak dapat diakses dari obyek lain.
     //kecuali jika ingin bisa diakses di kelas lain menggunakan setter dan getter
     
     //di dalam encapsulasi terdapat 4 modifier. Private, public, protected dan default
     //Private hanya bisa diakses di class itu sendiri
     //public bisa diakses di seluruh class
     //protected bisa diakses di class, package, dan subclass
     //default tidak bisa/tanpa modifier
     
      private ArrayList<String> nama = new ArrayList<String>();
      private ArrayList<String> alamat = new ArrayList<String>();
      private ArrayList<String> telepon = new ArrayList<String>();
      
      
    //Overload memiliki nama method yang sama namun berbeda parameter. 
    //Override memiliki nama yang sama dan parameter yang sama namun menjalankan perintah dan fungsi yang berbeda.
    //Override tugas utamanya untuk mengimplementasikan dari kelas interface. jika tidak ada implements, tidak ada override.
    @Override
    public void setNama(String nama) {
        this.nama.add(nama);
    }
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    @Override
    public String getNama(int id) {
        return nama.get(id);
    }
    @Override
    public String getAlamat(int id) {
        return alamat.get(id);
    }
    @Override
    public String getTelepon(int id) {
        return telepon.get(id);
    }
}
//setter untuk menambah atau mengubah data
//getter untuk mendapatkan data
