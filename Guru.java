public class Guru {
    // variabel
    int nip;
    private String nama;
    private String mapel;
    private String status;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMapel() {
        return this.mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Constructor Parameter
    public Guru (int i, String n, String k, String p){
        nip = i;
        nama = n;
        mapel = k;
        status = p;
}
        public void print() {
            System.out.println("NIP: "+nip);
            System.out.println("Nama: "+nama);
            System.out.println("Mapel: "+mapel);
            System.out.println("Status: "+status);

        }
}
