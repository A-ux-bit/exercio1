public class Principal {

    public static void main(String[] args){
        Equipamento equipamento = new Equipamento();
        Equipamento equipamento2 = new Equipamento();
        Telacadastro telacadastro = new Telacadastro();
        
        telacadastro.desenhatelacadastro();
       
        equipamento.setId(telacadastro.getId());
        equipamento.setNome(telacadastro.getNome());
        equipamento.setModelo(telacadastro.getModelo());
        equipamento.setFornecedor(telacadastro.getFornecedor());
        equipamento.setDataaquisicao(telacadastro.getDataAquisicao());
        equipamento.setAtivo(telacadastro.getAtivo());

        System.out.println(equipamento.toString());


       
     
    }
    
}
