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
        return this.minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public RelogioDigital(){
        this.hora = 12;
        this.minuto = 20;
    }

    public void tick(){
        this.minuto += 1;

        if(this.minuto>59){
            this.hora++;
            this.minuto = 0;

        }if(this.hora>23){
            this.hora = 0;
        }
        
    }

}