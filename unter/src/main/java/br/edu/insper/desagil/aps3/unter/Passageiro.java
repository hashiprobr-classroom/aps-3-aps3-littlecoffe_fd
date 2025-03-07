package br.edu.insper.desagil.aps3.unter;

public class Passageiro extends Usuario{
    public Passageiro(String cpf, String nome){
        super(cpf, nome);
    }
    @Override
    public avalia(Corrida corrida, int nota){
        if (nota < 1) {
            nota = 1;
        } else if (nota > 5) {
            nota = 5;
        }
        corrida.avaliaMotorista(nota);
    }
}
