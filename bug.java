public class bug {
    String kodeBarang;
    String jenisBarang;
    String namaBarang;
    int stokBarang;

    public bug (String kodeBarang, String jenisBarang, String namaBarang, Integer stokBarang ){
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;

    }
    public String getkodeBarang(){
        return kodeBarang;

    }
    public String getjenisBarang(){
        return jenisBarang;

    }
    public String getnamaBarang(){
        return namaBarang;

    }
    public Integer getstokBarang(){
        return stokBarang;

    }
    @Override
    public String toString(){
        return kodeBarang + " " + jenisBarang + " " + namaBarang + " " + stokBarang;

    }
    
    }
