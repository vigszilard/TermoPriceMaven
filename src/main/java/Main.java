import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {

        Spacer spacer = Spacer.AL16; //bagheta pentru termopan
        Spacer spacer1 = Spacer.AL16; //bagheta 1 pentru tripan
        Spacer spacer2 = Spacer.AL16; //bagheta 2 pentru tripan

        long startTime = new Timestamp(new Date().getTime()).getTime();
        Termo.priceForDouble(Glass.Float4, Glass.Float4, spacer);
        Termo.priceForDouble(Glass.Float4, Glass.LowE4, spacer);
        Termo.priceForDouble(Glass.Float4, Glass.Solar4, spacer);
        Termo.priceForDouble(Glass.Float4, Glass.Float6, spacer);
        Termo.priceForDouble(Glass.Float4, Glass.Solar6, spacer);
        Termo.priceForDouble(Glass.Float4, Glass.LowE6, spacer);
        Termo.priceForDouble(Glass.Float4, Glass.D331, spacer);
        Termo.priceForDouble(Glass.Float4, Glass.D331LowE, spacer);

        Termo.priceForDouble(Glass.LowE4, Glass.Float6, spacer);
        Termo.priceForDouble(Glass.LowE4, Glass.D331, spacer);

        Termo.priceForDouble(Glass.DeltaClar4, Glass.Float4, spacer);
        Termo.priceForDouble(Glass.DeltaClar4, Glass.LowE4, spacer);
        Termo.priceForDouble(Glass.DeltaClar4, Glass.Solar4, spacer);
        Termo.priceForDouble(Glass.DeltaClar4, Glass.Float6, spacer);
        Termo.priceForDouble(Glass.DeltaClar4, Glass.Solar6, spacer);
        Termo.priceForDouble(Glass.DeltaClar4, Glass.LowE6, spacer);
        Termo.priceForDouble(Glass.DeltaClar4, Glass.D331, spacer);
        Termo.priceForDouble(Glass.DeltaClar4, Glass.D331LowE, spacer);

        Termo.priceForDouble(Glass.DeltaBronz4, Glass.Float4, spacer);
        Termo.priceForDouble(Glass.DeltaBronz4, Glass.LowE4, spacer);
        Termo.priceForDouble(Glass.DeltaBronz4, Glass.Solar4, spacer);
        Termo.priceForDouble(Glass.DeltaBronz4, Glass.Float6, spacer);
        Termo.priceForDouble(Glass.DeltaBronz4, Glass.Solar6, spacer);
        Termo.priceForDouble(Glass.DeltaBronz4, Glass.LowE6, spacer);
        Termo.priceForDouble(Glass.DeltaBronz4, Glass.D331, spacer);
        Termo.priceForDouble(Glass.DeltaBronz4, Glass.D331LowE, spacer);

        Termo.priceForDouble(Glass.DeltaMat4, Glass.Float4, spacer);
        Termo.priceForDouble(Glass.DeltaMat4, Glass.LowE4, spacer);
        Termo.priceForDouble(Glass.DeltaMat4, Glass.Solar4, spacer);
        Termo.priceForDouble(Glass.DeltaMat4, Glass.Float6, spacer);
        Termo.priceForDouble(Glass.DeltaMat4, Glass.Solar6, spacer);
        Termo.priceForDouble(Glass.DeltaMat4, Glass.LowE6, spacer);
        Termo.priceForDouble(Glass.DeltaMat4, Glass.D331, spacer);
        Termo.priceForDouble(Glass.DeltaMat4, Glass.D331LowE, spacer);

        Termo.priceForDouble(Glass.CincillaClar4, Glass.Float4, spacer);
        Termo.priceForDouble(Glass.CincillaClar4, Glass.LowE4, spacer);
        Termo.priceForDouble(Glass.CincillaClar4, Glass.Solar4, spacer);
        Termo.priceForDouble(Glass.CincillaClar4, Glass.Float6, spacer);
        Termo.priceForDouble(Glass.CincillaClar4, Glass.Solar6, spacer);
        Termo.priceForDouble(Glass.CincillaClar4, Glass.LowE6, spacer);
        Termo.priceForDouble(Glass.CincillaClar4, Glass.D331, spacer);
        Termo.priceForDouble(Glass.CincillaClar4, Glass.D331LowE, spacer);

        Termo.priceForDouble(Glass.CincillaBronz4, Glass.Float4, spacer);
        Termo.priceForDouble(Glass.CincillaBronz4, Glass.LowE4, spacer);
        Termo.priceForDouble(Glass.CincillaBronz4, Glass.Solar4, spacer);
        Termo.priceForDouble(Glass.CincillaBronz4, Glass.Float6, spacer);
        Termo.priceForDouble(Glass.CincillaBronz4, Glass.Solar6, spacer);
        Termo.priceForDouble(Glass.CincillaBronz4, Glass.LowE6, spacer);
        Termo.priceForDouble(Glass.CincillaBronz4, Glass.D331, spacer);
        Termo.priceForDouble(Glass.CincillaBronz4, Glass.D331LowE, spacer);

        Termo.priceForDouble(Glass.Screen4, Glass.Float4, spacer);
        Termo.priceForDouble(Glass.Screen4, Glass.LowE4, spacer);
        Termo.priceForDouble(Glass.Screen4, Glass.Solar4, spacer);
        Termo.priceForDouble(Glass.Screen4, Glass.Float6, spacer);
        Termo.priceForDouble(Glass.Screen4, Glass.Solar6, spacer);
        Termo.priceForDouble(Glass.Screen4, Glass.LowE6, spacer);
        Termo.priceForDouble(Glass.Screen4, Glass.D331, spacer);
        Termo.priceForDouble(Glass.Screen4, Glass.D331LowE, spacer);

        Termo.priceForDouble(Glass.Krizet4, Glass.Float4, spacer);
        Termo.priceForDouble(Glass.Krizet4, Glass.LowE4, spacer);
        Termo.priceForDouble(Glass.Krizet4, Glass.Solar4, spacer);
        Termo.priceForDouble(Glass.Krizet4, Glass.Float6, spacer);
        Termo.priceForDouble(Glass.Krizet4, Glass.Solar6, spacer);
        Termo.priceForDouble(Glass.Krizet4, Glass.LowE6, spacer);
        Termo.priceForDouble(Glass.Krizet4, Glass.D331, spacer);
        Termo.priceForDouble(Glass.Krizet4, Glass.D331LowE, spacer);

        Termo.priceForDouble(Glass.Crepy4, Glass.Float4, spacer);
        Termo.priceForDouble(Glass.Crepy4, Glass.LowE4, spacer);
        Termo.priceForDouble(Glass.Crepy4, Glass.Solar4, spacer);
        Termo.priceForDouble(Glass.Crepy4, Glass.Float6, spacer);
        Termo.priceForDouble(Glass.Crepy4, Glass.Solar6, spacer);
        Termo.priceForDouble(Glass.Crepy4, Glass.LowE6, spacer);
        Termo.priceForDouble(Glass.Crepy4, Glass.D331, spacer);
        Termo.priceForDouble(Glass.Crepy4, Glass.D331LowE, spacer);

        Termo.priceForDouble(Glass.CrepyBronz4, Glass.Float4, spacer);
        Termo.priceForDouble(Glass.CrepyBronz4, Glass.LowE4, spacer);
        Termo.priceForDouble(Glass.CrepyBronz4, Glass.Solar4, spacer);
        Termo.priceForDouble(Glass.CrepyBronz4, Glass.Float6, spacer);
        Termo.priceForDouble(Glass.CrepyBronz4, Glass.Solar6, spacer);
        Termo.priceForDouble(Glass.CrepyBronz4, Glass.LowE6, spacer);
        Termo.priceForDouble(Glass.CrepyBronz4, Glass.D331, spacer);
        Termo.priceForDouble(Glass.CrepyBronz4, Glass.D331LowE, spacer);

        Termo.priceForDouble(Glass.Crossfield4, Glass.Float4, spacer);
        Termo.priceForDouble(Glass.Crossfield4, Glass.LowE4, spacer);
        Termo.priceForDouble(Glass.Crossfield4, Glass.Solar4, spacer);
        Termo.priceForDouble(Glass.Crossfield4, Glass.Float6, spacer);
        Termo.priceForDouble(Glass.Crossfield4, Glass.Solar6, spacer);
        Termo.priceForDouble(Glass.Crossfield4, Glass.LowE6, spacer);
        Termo.priceForDouble(Glass.Crossfield4, Glass.D331, spacer);
        Termo.priceForDouble(Glass.Crossfield4, Glass.D331LowE, spacer);

        Termo.priceForDouble(Glass.MaslinClar4, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.MaslinClar4, Glass.LowE4 , spacer);
        Termo.priceForDouble(Glass.MaslinClar4, Glass.Solar4 , spacer);
        Termo.priceForDouble(Glass.MaslinClar4, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.MaslinClar4, Glass.Solar6 , spacer);
        Termo.priceForDouble(Glass.MaslinClar4, Glass.LowE6 , spacer);
        Termo.priceForDouble(Glass.MaslinClar4, Glass.D331 , spacer);
        Termo.priceForDouble(Glass.MaslinClar4, Glass.D331LowE , spacer);

        Termo.priceForDouble(Glass.HasirClar4, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.HasirClar4, Glass.LowE4 , spacer);
        Termo.priceForDouble(Glass.HasirClar4, Glass.Solar4 , spacer);
        Termo.priceForDouble(Glass.HasirClar4, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.HasirClar4, Glass.Solar6 , spacer);
        Termo.priceForDouble(Glass.HasirClar4, Glass.LowE6 , spacer);
        Termo.priceForDouble(Glass.HasirClar4, Glass.D331 , spacer);
        Termo.priceForDouble(Glass.HasirClar4, Glass.D331LowE , spacer);

        Termo.priceForDouble(Glass.SatinBronz4, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.SatinBronz4, Glass.LowE4 , spacer);
        Termo.priceForDouble(Glass.SatinBronz4, Glass.Solar4 , spacer);
        Termo.priceForDouble(Glass.SatinBronz4, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.SatinBronz4, Glass.Solar6 , spacer);
        Termo.priceForDouble(Glass.SatinBronz4, Glass.LowE6 , spacer);
        Termo.priceForDouble(Glass.SatinBronz4, Glass.D331 , spacer);
        Termo.priceForDouble(Glass.SatinBronz4, Glass.D331LowE , spacer);

        Termo.priceForDouble(Glass.Satin4, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.Satin4, Glass.LowE4 , spacer);
        Termo.priceForDouble(Glass.Satin4, Glass.Solar4 , spacer);
        Termo.priceForDouble(Glass.Satin4, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.Satin4, Glass.Solar6 , spacer);
        Termo.priceForDouble(Glass.Satin4, Glass.LowE6 , spacer);
        Termo.priceForDouble(Glass.Satin4, Glass.D331 , spacer);
        Termo.priceForDouble(Glass.Satin4, Glass.D331LowE , spacer);

        Termo.priceForDouble(Glass.ParsolBronz4, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.ParsolBronz4, Glass.LowE4 , spacer);
        Termo.priceForDouble(Glass.ParsolBronz4, Glass.Solar4 , spacer);
        Termo.priceForDouble(Glass.ParsolBronz4, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.ParsolBronz4, Glass.Solar6 , spacer);
        Termo.priceForDouble(Glass.ParsolBronz4, Glass.LowE6 , spacer);
        Termo.priceForDouble(Glass.ParsolBronz4, Glass.D331 , spacer);
        Termo.priceForDouble(Glass.ParsolBronz4, Glass.D331LowE , spacer);

        Termo.priceForDouble(Glass.StopsolBronz4, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.StopsolBronz4, Glass.LowE4 , spacer);
        Termo.priceForDouble(Glass.StopsolBronz4, Glass.Solar4 , spacer);
        Termo.priceForDouble(Glass.StopsolBronz4, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.StopsolBronz4, Glass.Solar6 , spacer);
        Termo.priceForDouble(Glass.StopsolBronz4, Glass.LowE6 , spacer);
        Termo.priceForDouble(Glass.StopsolBronz4, Glass.D331 , spacer);
        Termo.priceForDouble(Glass.StopsolBronz4, Glass.D331LowE , spacer);

        Termo.priceForDouble(Glass.ScoartaClar4, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.ScoartaClar4, Glass.LowE4 , spacer);
        Termo.priceForDouble(Glass.ScoartaClar4, Glass.Solar4 , spacer);
        Termo.priceForDouble(Glass.ScoartaClar4, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.ScoartaClar4, Glass.Solar6 , spacer);
        Termo.priceForDouble(Glass.ScoartaClar4, Glass.LowE6 , spacer);
        Termo.priceForDouble(Glass.ScoartaClar4, Glass.D331 , spacer);
        Termo.priceForDouble(Glass.ScoartaClar4, Glass.D331LowE , spacer);

        Termo.priceForDouble(Glass.ScoartaBronz4, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.ScoartaBronz4, Glass.LowE4 , spacer);
        Termo.priceForDouble(Glass.ScoartaBronz4, Glass.Solar4 , spacer);
        Termo.priceForDouble(Glass.ScoartaBronz4, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.ScoartaBronz4, Glass.Solar6 , spacer);
        Termo.priceForDouble(Glass.ScoartaBronz4, Glass.LowE6 , spacer);
        Termo.priceForDouble(Glass.ScoartaBronz4, Glass.D331 , spacer);
        Termo.priceForDouble(Glass.ScoartaBronz4, Glass.D331LowE , spacer);

        Termo.priceForDouble(Glass.FlutesClar4, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.FlutesClar4, Glass.LowE4 , spacer);
        Termo.priceForDouble(Glass.FlutesClar4, Glass.Solar4 , spacer);
        Termo.priceForDouble(Glass.FlutesClar4, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.FlutesClar4, Glass.Solar6 , spacer);
        Termo.priceForDouble(Glass.FlutesClar4, Glass.LowE6 , spacer);
        Termo.priceForDouble(Glass.FlutesClar4, Glass.D331 , spacer);
        Termo.priceForDouble(Glass.FlutesClar4, Glass.D331LowE , spacer);

        Termo.priceForDouble(Glass.FlutesMat4, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.FlutesMat4, Glass.LowE4 , spacer);
        Termo.priceForDouble(Glass.FlutesMat4, Glass.Solar4 , spacer);
        Termo.priceForDouble(Glass.FlutesMat4, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.FlutesMat4, Glass.Solar6 , spacer);
        Termo.priceForDouble(Glass.FlutesMat4, Glass.LowE6 , spacer);
        Termo.priceForDouble(Glass.FlutesMat4, Glass.D331 , spacer);
        Termo.priceForDouble(Glass.FlutesMat4, Glass.D331LowE , spacer);

        Termo.priceForDouble(Glass.Oglinda4, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.Oglinda4, Glass.LowE4 , spacer);
        Termo.priceForDouble(Glass.Oglinda4, Glass.Solar4 , spacer);
        Termo.priceForDouble(Glass.Oglinda4, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.Oglinda4, Glass.Solar6 , spacer);
        Termo.priceForDouble(Glass.Oglinda4, Glass.LowE6 , spacer);
        Termo.priceForDouble(Glass.Oglinda4, Glass.D331 , spacer);
        Termo.priceForDouble(Glass.Oglinda4, Glass.D331LowE , spacer);

        Termo.priceForDouble(Glass.Float6, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.Float6, Glass.LowE4 , spacer);
        Termo.priceForDouble(Glass.Float6, Glass.Solar4 , spacer);
        Termo.priceForDouble(Glass.Float6, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.Float6, Glass.Solar6 , spacer);
        Termo.priceForDouble(Glass.Float6, Glass.LowE6 , spacer);
        Termo.priceForDouble(Glass.Float6, Glass.D331 , spacer);
        Termo.priceForDouble(Glass.Float6, Glass.D331LowE , spacer);

        Termo.priceForDouble(Glass.LowE6, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.LowE6, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.LowE6, Glass.D331 , spacer);

        Termo.priceForDouble(Glass.D331, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.D331, Glass.LowE4 , spacer);
        Termo.priceForDouble(Glass.D331, Glass.Solar4 , spacer);
        Termo.priceForDouble(Glass.D331, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.D331, Glass.Solar6 , spacer);
        Termo.priceForDouble(Glass.D331, Glass.LowE6 , spacer);
        Termo.priceForDouble(Glass.D331, Glass.D331 , spacer);
        Termo.priceForDouble(Glass.D331, Glass.D331LowE , spacer);

        Termo.priceForDouble(Glass.D331LowE, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.D331LowE, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.D331LowE, Glass.D331 , spacer);

        Termo.priceForDouble(Glass.D442, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.D442, Glass.LowE4 , spacer);
        Termo.priceForDouble(Glass.D442, Glass.Solar4 , spacer);
        Termo.priceForDouble(Glass.D442, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.D442, Glass.Solar6 , spacer);
        Termo.priceForDouble(Glass.D442, Glass.LowE6 , spacer);
        Termo.priceForDouble(Glass.D442, Glass.D331 , spacer);
        Termo.priceForDouble(Glass.D442, Glass.D331LowE , spacer);

        Termo.priceForDouble(Glass.D442LowE, Glass.Float4 , spacer);
        Termo.priceForDouble(Glass.D442LowE, Glass.Float6 , spacer);
        Termo.priceForDouble(Glass.D442LowE, Glass.D331 , spacer);




        Termo.priceForTriple(Glass.Float4, Glass.Float4, Glass.Float4, spacer1, spacer2);
        Termo.priceForTriple(Glass.Float4, Glass.Float4, Glass.Solar4, spacer1, spacer2);
        Termo.priceForTriple(Glass.Float4, Glass.Float4, Glass.Float6, spacer1, spacer2);
        Termo.priceForTriple(Glass.Float4, Glass.Float4, Glass.LowE6, spacer1, spacer2);
        Termo.priceForTriple(Glass.Float4, Glass.Float4, Glass.Solar6, spacer1, spacer2);
        Termo.priceForTriple(Glass.Float4, Glass.Float4, Glass.D331, spacer1, spacer2);
        Termo.priceForTriple(Glass.Float4, Glass.Float4, Glass.D331LowE, spacer1, spacer2);

        Termo.priceForTriple(Glass.Float4, Glass.LowE4, Glass.Float4, spacer1, spacer2);
        Termo.priceForTriple(Glass.Float4, Glass.LowE4, Glass.LowE4, spacer1, spacer2);
        Termo.priceForTriple(Glass.Float4, Glass.LowE4, Glass.Solar4, spacer1, spacer2);
        Termo.priceForTriple(Glass.Float4, Glass.LowE4, Glass.Float6, spacer1, spacer2);
        Termo.priceForTriple(Glass.Float4, Glass.LowE4, Glass.LowE6, spacer1, spacer2);
        Termo.priceForTriple(Glass.Float4, Glass.LowE4, Glass.Solar6, spacer1, spacer2);
        Termo.priceForTriple(Glass.Float4, Glass.LowE4, Glass.D331, spacer1, spacer2);
        Termo.priceForTriple(Glass.Float4, Glass.LowE4, Glass.D331LowE, spacer1, spacer2);


        long finishTime = new Timestamp(new Date().getTime()).getTime();
        System.out.println(finishTime-startTime);
    }
}
