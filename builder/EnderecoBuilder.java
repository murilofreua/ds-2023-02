public class EnderecoBuilder implements Builder {
    private Endereco endereco;

    public EnderecoBuilder() { this.reset(); }

    public void reset() { this.endereco = new Endereco(); }

    public void setRua(String rua) { endereco.rua = rua; }

    public void setSetor(String setor) { endereco.setor = setor; }

    public void setCep(String cep) { endereco.cep = cep; }

    public void setNumero(int numero) { endereco.numero = numero; }

    public void setCidade(String cidade) { endereco.cidade = cidade; }

    public void setEstado(String estado) { endereco.estado = estado; }

    public void setBloco(String bloco) { endereco.bloco = bloco; }

    public void setQuadra(String quadra) { endereco.quadra = quadra; }

    public Endereco getEndereco() {
        Endereco produto = this.endereco;
        this.reset();
        return produto;
    }
}
