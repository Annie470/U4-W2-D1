package entities.esercizio3;

import exceptions.BancaException;

public class ContoOnline extends  ContoCorrente{
    private  double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxP){
        super(titolare, saldo);
        this.maxPrelievo= maxP;
    }

    public void stampaSaldo(){
        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti + " - Max movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    public  void preleva(double x) throws BancaException {
//        if(x <= maxPrelievo){
        if(x > maxPrelievo) {
            throw new BancaException("Il prelievo non è disponibile");
        }
        super.preleva(x);
        }
    }

