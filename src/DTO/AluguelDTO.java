package DTO;

import java.sql.Date;

public class AluguelDTO {
    
    private int id_aluguel, id_cliente, id_livro;
    private String nome_cliente, nome_livro, situacao;
    private Date data_aluguel, data_devolucao;
    private boolean devolvido;

    /**
     * @return the id_aluguel
     */
    public int getId_aluguel() {
        return id_aluguel;
    }

    /**
     * @param id_aluguel the id_aluguel to set
     */
    public void setId_aluguel(int id_aluguel) {
        this.id_aluguel = id_aluguel;
    }

    /**
     * @return the nome_cliente
     */
    public String getNome_cliente() {
        return nome_cliente;
    }

    /**
     * @param nome_cliente the nome_cliente to set
     */
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    /**
     * @return the nome_livro
     */
    public String getNome_livro() {
        return nome_livro;
    }

    /**
     * @param nome_livro the nome_livro to set
     */
    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    /**
     * @return the data_aluguel
     */
    public Date getData_aluguel() {
        return data_aluguel;
    }

    /**
     * @param data_aluguel the data_aluguel to set
     */
    public void setData_aluguel(Date data_aluguel) {
        this.data_aluguel = data_aluguel;
    }

    /**
     * @return the data_devolucao
     */
    public Date getData_devolucao() {
        return data_devolucao;
    }

    /**
     * @param data_devolucao the data_devolucao to set
     */
    public void setData_devolucao(Date data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    /**
     * @return the devolvido
     */
    public boolean isDevolvido() {
        return devolvido;
    }

    /**
     * @param devolvido the devolvido to set
     */
    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the id_livro
     */
    public int getId_livro() {
        return id_livro;
    }

    /**
     * @param id_livro the id_livro to set
     */
    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
