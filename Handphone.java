public class Handphone extends Telepon implements Kamera, Radio{
    
    protected long nomer;

    public void cetaktelepon(){
        System.out.println("Sedang Menelpon");
    }

    public void ambilGambar(){
        System.out.println("Gambar Terambil.....");
    }

    public void setGelombang(String gel){
        System.out.println(gel);
    }

    public void setPixel(float pixel){
        System.out.println(pixel);
    }
    public void setNomor(long no){
        this.nomer=no;
        System.out.println(no);
    }
}