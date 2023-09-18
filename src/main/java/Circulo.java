public class Circulo{
    float raio;
    double pi = 3.14159;

    public double getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }

    public double getArea(){
        double area = (float)(pi*(raio*raio));
        return area;
    }

    public float getCircunferencia(){
        float circ = (float)(2*pi*raio);
        return circ;
    }
    public Circulo(float raio){
        this.raio = raio;
    }

}