public class CarroAluguel {

    float valorPorKm;
    float DistanciaPercorrida;
    boolean disponivel;
    boolean sinistro;
    float debito;


    public CarroAluguel(float valorPorKm) {
        this.valorPorKm = valorPorKm;
        this.DistanciaPercorrida = 0;
        this.disponivel = true;
        this.sinistro = false;
        this.debito = 0;
    }

    public float getValorPorKm() {
        return valorPorKm;
    }

    public void setValorPorKm(float valorPorKm) {
        this.valorPorKm = valorPorKm;
    }


    public float getDistanciaPercorrida() {
        return DistanciaPercorrida;
    }

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        DistanciaPercorrida = distanciaPercorrida;
    }


    public boolean isDisponivel(){
        return disponivel;
    }

    public boolean hasSinistro(){
        return sinistro;
    }

    public void setSinistro(boolean sinistro) {
            this.sinistro = sinistro;
        }
    
    public float getDebito() {
        float debito = valorPorKm*DistanciaPercorrida;
        return debito;
    }

    public void setDebito(float debito) {
        this.debito = debito;
    }

    public void alugar() throws CarroIndisponivelException{
        if (!disponivel) {
            throw new CarroIndisponivelException();

        }
        disponivel= false;
    }

    public void devolver() throws CarroDisponivelException, CarroNaoPagoException {
        if (!disponivel) {
            throw new CarroDisponivelException();
            
        }
        if (debito != 0) {
            if (sinistro != false && (DistanciaPercorrida != 0)) {
                throw new CarroNaoPagoException();
   
            }
            
        }
        disponivel = true;

    }
}