package entities.esercizio3;

public class ContoOnline extends  ContoCorrente{
    private  double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxP){
        super(titolare, saldo);
        this.maxPrelievo= maxP;
    }

    public void stampaSaldo(){
        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti + " - Max movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    public  void preleva(double x){
        if(x <= maxPrelievo){
        super.preleva(x);
        }
    }
}
