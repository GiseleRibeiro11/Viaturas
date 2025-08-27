 package pkg0816;

import java.util.ArrayList;

public class Dados {
    private ArrayList<Viaturas> listaViaturas;

    public Dados() {
        listaViaturas = new ArrayList<>();
    }
    // Adicionar viatura sem repetir a matrícula 
    public boolean adicionarViatura(Viaturas v) {
        for (Viaturas viatura : listaViaturas) {
            if (viatura.getMatricula().equalsIgnoreCase(v.getMatricula())){
                return false; // Já existe matrícula igual
            }
        }
        listaViaturas.add(v);
        return true;
    }
    // Remover viatura pela matrícula
    public boolean removerViatura(String matricula){
        for (Viaturas viatura : listaViaturas) {
            if (viatura.getMatricula().equalsIgnoreCase(matricula)){
                listaViaturas.remove(viatura);
                return true;
            }
        }
        return false; 
    }

    // Mostrar todas as viaturas
   public String mostrarTodas() {
    String resultado = "";
    for (Viaturas v : listaViaturas) {
        resultado = resultado + v.toString() + "\n";
    }
    return resultado;
} 

    // Mostrar viaturas por marca
    public String mostrarPorMarca(String marca) {
        String resultado = "";
        for (Viaturas v : listaViaturas) {
            if (v.getMarca().equalsIgnoreCase(marca)) {
                resultado = resultado + v.toString() + "\n";
            }
        }
        return resultado;
    }

    // Mostrar todas com total do preço
    public String mostrarComTotalPreco() {
        String resultado = "";
        float total = 0;
        for (Viaturas v : listaViaturas) {
            resultado = resultado + v.toString() + "\n";
            total += v.getPreco();
        }
        resultado = resultado + "\nTotal Preço: " + total;
        return resultado;
    }
}

