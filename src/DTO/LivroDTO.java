package DTO;

public class LivroDTO {

    private int id_livro, qnt_disponivel;
    private String autor, isbn, titulo;

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public int getQnt_disponivel() {
        return qnt_disponivel;
    }

    public void setQnt_disponivel(int qnt_disponivel) {
        this.qnt_disponivel = qnt_disponivel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
