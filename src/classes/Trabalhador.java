package classes;

import enums.NivelTrabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private NivelTrabalhador nivel;
    private double salarioBase;
    private List<TempoContrato> contratos = new ArrayList<>();

    private Departamento departamento;

    public Trabalhador(){

    }

    public Trabalhador(String nome, NivelTrabalhador nivel, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<TempoContrato> getContratos() {
        return contratos;
    }

    @Override
    public String toString() {
        return "Trabalhadores {\n " +
                "Nome: '" + nome + '\'' +
                ", Nivel: " + nivel +
                ", salarioBase: " + salarioBase +
                '}';
    }

    public void adicionarContrato(TempoContrato contrato){
        contratos.add(contrato);
    }

    public void removerContrato(TempoContrato contrato){
        contratos.remove(contrato);
    }
    public Double renda(int mes, int ano){ //METODO PARA CALCULAR A RENDA DO TRABALHADOR BASEADO NO TEMPO DE TRABALHO (MES E ANO).
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for(TempoContrato tempo : contratos){
            cal.setTime(tempo.getData());
            int tempo_mes = 1 + cal.get(Calendar.MONTH); //SOMAR COM +1, POIS O CALENDAR.MONTH INICIA O MES DE JANEIRO EM 0.
            int tempo_ano = cal.get(Calendar.YEAR);
            if(ano == tempo_ano && mes == tempo_mes){
                soma += tempo.valorTotal(); //CHAMA O METODO DA CLASSE TEMPODECONTRATO QUE RETORNARÁ O VALOR POR HORA VEZES O TEMPO DE TRABALHO.
            }
        }
        return soma;
    }
}
