package pkg0816;

import javax.swing.JOptionPane;


public class TestarViaturas {
    public static void main(String[] args) {
        Dados D=new Dados();
        int escolha= 0;
        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Adicionar Viatura\n" +
                "2 - Remover Viatura\n" +
                "3 - Mostrar Todas\n" +
                "4 - Mostrar por Marca\n" +
                "5 - Mostrar com Total Preço\n" +
                "0 - Sair"));

            switch(escolha){
            case 1->{
                    String marca = JOptionPane.showInputDialog("Marca:");
                    String modelo = JOptionPane.showInputDialog("Modelo:");
                    String matricula = JOptionPane.showInputDialog("Matrícula:");
                    String combustivel = JOptionPane.showInputDialog("Combustível:");
                    int kms = Integer.parseInt(JOptionPane.showInputDialog("Km Atuais:"));
                    float preco = Float.parseFloat(JOptionPane.showInputDialog("Preço:"));

                    Viaturas v = new Viaturas(marca, modelo, matricula, combustivel, kms, preco);
                    if (D.adicionarViatura(v)) {
                        JOptionPane.showMessageDialog(null, "Viatura adicionada com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Matrícula já existente!");
                    }
                }
                case 2->{
                    String matRemover = JOptionPane.showInputDialog("Matrícula para remover:");
                    if (D.removerViatura(matRemover)) {
                        JOptionPane.showMessageDialog(null, "Viatura removida com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Viatura não encontrada!");
                    }
                }
                case 3->{
                    JOptionPane.showMessageDialog(null, D.mostrarTodas());
                }
                case 4->{
                    String marcaFiltro = JOptionPane.showInputDialog("Marca para filtrar:");
                    JOptionPane.showMessageDialog(null, D.mostrarPorMarca(marcaFiltro));
                }
                case 5->{
                    JOptionPane.showMessageDialog(null, D.mostrarComTotalPreco());
                }
                case 0->{
                    JOptionPane.showMessageDialog(null, "Programa finalizado!");
                }
                default->{
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                }
            }   
        }while (escolha != 0);     
    }

}
