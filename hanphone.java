public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;

    
    public void setDataHP(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp; 
        this.tahun_pembuatan = tahun_pembuatan;
    }

    
    public String getJenisHP() {
        return this.jenis_hp; 
    }

   
    public String getTahunPembuatan() {
        return String.valueOf(this.tahun_pembuatan); 
    }

    public static void main(String args[]) {
        HandPhone hp = new HandPhone();
        hp.setDataHP("Samsung", 2023); 
        System.out.println(hp.getJenisHP());
        System.out.println(hp.getTahunPembuatan()); 
    }
}
