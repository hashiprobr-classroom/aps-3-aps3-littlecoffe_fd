package br.edu.insper.desagil.aps3.unter;

public class Corrida {
    private Passageiro passageiro;
    private Motorista motorista;
    private int notaP;
    private int notaM;

    public Corrida(Passageiro passageiro){
        this.passageiro = passageiro;
        this.motorista = null;
        this.notaP = 0;
        this.notaM = 0;
    }



    public Passageiro getPassageiro() {
        return passageiro;
    }
    public Motorista getMotorista(){
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Integer getNotaP(){
        return notaP;
    }

    public Integer getNotaM(){
        return notaM;
    }

    private int arrumaNota(int nota){
        int resultado = nota;
        if (nota < 1){
            resultado = 1;
        }
        else if (nota > 5){
            resultado = 5;
        }
        return resultado;
    }

    public void avaliaPassageiro(int nota){
        this.notaP = arrumaNota(nota);
    }
    public void avaliaMotorista(int nota){
        this.notaM = arrumaNota(nota);
    }
}
