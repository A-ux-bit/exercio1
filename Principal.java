public class Principal{

    public static void main(String[] args){
        computador comp1 = new computador();
        Telacadastrocomputador telacomp1 = new Telacadastrocomputador();
        
        telacomp1.desenhaTelacadastroComputador();
        comp1.setId(telacomp1.getId());
        comp1.setNome(telacomp1.getNome());
        comp1.setModelo(telacomp1.getModelo());
        comp1.setFornecedor(telacomp1.getFornecedor());
        comp1.setDataaquisicao(telacomp1.getDataAquisicao());
        comp1.setAtivo(telacomp1.getAtivo());
        comp1.setCpu(telacomp1.getCpu());
        comp1.setRam(telacomp1.getRam());
        comp1.setSoftware(telacomp1.getSoftware());


        System.out.println(comp1.toString());
     
    }
    
}
