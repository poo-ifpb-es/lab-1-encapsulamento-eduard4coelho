public class RelogioDigital{
    int hora;
    int minuto;

    public int getHora() {
        return hora;
    }
   
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public RelogioDigital(int hora, int minuto) {
        this.hora = 12;
        this.hora = 20;
    }

    public void tick(){
        if (minuto>59){
            hora+=1;

        }else if(minuto<59){
            minuto+=1;

        }else if(hora<23){
            hora = 0;
        }
        
    }

}