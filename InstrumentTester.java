


public class InstrumentTester {
    public static void main(String[] args) {
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 150.9);
        Instrument a = new Instrument();
        a.alatmusik = "Guitar";
        a.harga = 101.5;
        a.print();
        b.print();
        c.print();
        
        // Paling MAHAL
        if (b.getHarga() > c.getHarga() && c.getHarga() > a.getHarga()) {
            System.out.println("Piano adalah alat musik paling mahal");
        }else if(a.getHarga() < c.getHarga() && c.getHarga() > b.getHarga()) {
            System.out.println("Violin adalah alat musik paling mahal");
        }else {
            System.out.println("Guitar adalah alat musik paling mahal");
        }

        // PALING MURAH
        if (b.getHarga() < c.getHarga() && c.getHarga() < a.getHarga()) {
            System.out.println("Piano adalah alat musik paling murah");
        }else if(a.getHarga() > c.getHarga() && c.getHarga() < b.getHarga()) {
            System.out.println("Violin adalah alat musik paling murah");
        }else {
            System.out.println("Guitar adalah alat musik paling murah");
        }
    }
}
