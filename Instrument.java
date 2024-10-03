public class Instrument {
    String alatmusik;
    double harga;

    public String getAlatmusik() {
        return this.alatmusik;
    }

    public void setAlatmusik(String alatmusik) {
        this.alatmusik = alatmusik;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }


    // Constructor Parameter
    public Instrument(String i, double n) {
        alatmusik = i;
        harga = n;
    }
    // constructor default
    public Instrument(){
       alatmusik = "";
       harga = 0;
    }


    public void print() {
        System.out.println("Nama Alat Musik : " + alatmusik);
        System.out.println("Harga : " + harga);


    }
    

}
