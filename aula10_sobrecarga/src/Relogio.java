public class Relogio {
    public int hora;
    public int minuto;
    public int segundo;
    // Construtor vazio
    public Relogio(){

    }

    //Tradiocional (inserido todos os atributos)
    public Relogio (int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    //apenas horas e minutos
    public Relogio (int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 0;
    }
    // apenas horas
    public Relogio (int hora){
        this.hora = hora;
        this.minuto = 0;
        this.segundo = 0;
    }

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

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
}
