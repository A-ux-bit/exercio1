import java.util.Scanner;

public class TelaPrestadorServico extends TelaJuridica{
    private String descricaoservico;

    protected String getDescricaoservico() {
        return descricaoservico;
    }


    protected void desenhaTelaPrestadorServico(){
    this.desenhatelajuridica();
    Scanner inputPrestadorServico = new Scanner(System.in);
    System.out.print("Descrição do serviço:");
    this.descricaoservico = inputPrestadorServico.nextLine();
   
}
    public String toString(){
        String report;

        report = "id:" + getCampoid() + "\n" +
                  "nome:" + getCampoNome() + "\n" + 
                  "CNPJ:" + getCnpj() + "\n" +
                  "Descrição do serviço" + getDescricaoservico() + "\n";
                  return report;
    }
}
