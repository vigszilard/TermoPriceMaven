public enum Glass {
    Float4 ("Float 4", 7.3),
    LowE4 ("LowE 4", 9.9),
    Solar4 ("Solar 4", 11.5),
    Float6 ("Float 6", 14.3),
    LowE6 ("LowE 6", 20.9),
    Solar6 ("Solar 6", 23.8),
    D331 ("3.3.1", 22.71),
    D331LowE ("3.3.1 LowE", 28.6),
    DeltaClar4 ("Delta Clar 4", 18.5),
    DeltaBronz4 ("Delta Bronz 4", 20.9),
    DeltaMat4 ("Delta Mat 4", 26.),
    CincillaClar4 ("Cincilla Clar 4", 17.6),
    CincillaBronz4 ("Cincilla Bronz 4", 19.3),
    Screen4 ("Screen  4", 13.1),
    Krizet4 ("Krizet 4", 14.3),
    Crepy4 ("Crepy 4", 18.4),
    CrepyBronz4 ("Crepy Bronz 4", 20.3),
    Crossfield4 ("Crossfield 4", 21.9),
    MaslinClar4 ("Maslin Clar (Bronz) 4", 25.6),
    HasirClar4 ("Hasir Clar (Bronz) 4", 31.1),
    SatinBronz4 ("Mat (Sat) Bronz 4", 24.7),
    Satin4 ("Mat (Satinat) 4", 21.4),
    ParsolBronz4 ("Parsol Bronz 4", 17.4),
    StopsolBronz4 ("Stopsol Bronz 4", 20.6),
    ScoartaClar4 ("Scoarta Clar 4", 19.4),
    ScoartaBronz4 ("Scoarta Bronz 4 ", 21.3),
    FlutesClar4 ("Flutes Clar 4", 19.3),
    FlutesMat4 ("Flutes Mat 4", 30.4),
    Oglinda4 ("Oglinda 4", 21.),
    D442 ("4.4.2", 39.58),
    D442LowE ("4.4.2 LowE", 43.18)
    ;

    private double price;
    private String name;

    Glass(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }
}
