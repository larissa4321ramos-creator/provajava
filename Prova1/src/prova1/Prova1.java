/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova1;

/**
 *
 * @author 1659859
 */
public class Prova1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       class Mecanico {
           String nome, cpf, especialidade, telefone;
           boolean temBox = false; 
           
           public Mecanico(String nome, String cpf, String especialidades, String telefone){
               this.nome = nome;
               this.cpf = cpf;
               this.especialidade = especialidade;
               this.telefone = telefone;
           }
       }
       class Servico {
           String nome, categoria:
           int tempo:
           double valor:
           
           public Servico(String nome, int tempo, double valor, String categoria){
               this.nome = nome:
               this.tempo = tempo;
               this.valor = valor;
               this.categoria = categoria; 
                    
           }
           
       }
       
       class OrdemServiço {
           int codigo;
           String cliente, modelo, placa, data, status = "aberta";
           Servico servico 
           Box boxAtribuido;
           
           public OrdemServico (int codigo, String cliente, String modelo, String placa, String data, Servico servico) {
               this.codigo = codigo;
               this.cliente = cliente;
               this.modelo = modelo;
               this.placa = placa; 
               this.data = data;
               this.servico = servico;
           }
           
           public void exibirDetalhes () {
               System.out.println("OS #" + codigo + " | Cliente: " + cliente + " | Veículo: " + modelo + " (" + placa + ")");
               System.out.println("Data: " + data + " | Status: " + status +" | Serviço: " + servico.nome + " (" + servico.categoria + ")");
               System.out.println("Box: " +(boxAtribuido != null ? boxAtribuido.numero : "Nenhum") +
                       " | Mecânico: " + (box.Atribuido != null && box.Atribuido.mecanico != null ? box.Atribuido.mecanico.nome : "Nenhum"));
           }
       }
       
       class Box {
           int numero, capacidade , totalFinalizadas = 0;
           String tipoServico, localizacao;
           Mecanico mecanico;
           List <OrdemServico> ordensAtivas = new ArrayList<>();
           
           publicBox(int numero, String tipoServico, int capacidade, String Localizacao) {
               this.numero = numero;
               this.tipoServico = tipoServico;
               this.capacidade = capacidade;
               this.localizacao = localizacao;
           }
       }
       
       public class Main {
           static List<Mecanico> mecanicos = new ArrayList<>();
           static List<box> boxes = new ArrayList<>();
           static List<OrdemServico> ordens = new ArrayList<>();
           static Scanner scanner = new Scanner(System.in);
           
           public static void main(String[] args) {
               mecanicos.add(new Mecanico("Glender", "111", "Suspensão", "   "));
               mecanicos.add(new Mecanico("Christiano", "222", "Motor", "   "));
               mecanicos.add(new Mecanico("Larissa", "333", "Elétrica", "   "));
               
               boxes.add(new Box(1, "Suspensão", 2, "Setor A"));
               boxes.add(new Box(2, "Motor", 1, "Setor B"));
               boxes.add(new Box(3, "Elétrica", 3, "Setor C"));
               
               int op;
               do {
                   System.out.println("\n--- MENU OFICINA ---");
                   System.out.println("1. Cadastrar Ordem de Serviço");
                   System.out.println("2. Associar Mecânico a um Box");
                   System.out.println("3. Atribuir Ordem a um Box");
                   System.out.println("4. Exibir Ordens de um Box");
                   System.out.println("5. Ordens Finalizadas por Box");
                   System.out.println("6. Buscar Ordens por Status");
                   System.out.println("7. Exibir Detalhes da Ordem");
                   System.out.println("0. Sair");
                   System.out.println("Opção: ");
                   op = scanner.nextInt();
                   scanner.nextLine();
                   
               }
           }
       }
    }
    
}
