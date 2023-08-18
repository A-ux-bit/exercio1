public class PessoaJuridica extends Pessoa {
    private String cnpj;

    protected String getCnpj() {
        return cnpj;
    }

    protected void setCnpj(String cnps) {
        this.cnpj = cnps;
    }
    
}
