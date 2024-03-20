package school.sptech.projeto0aula01.resposta.json;

public class Heroi {

    private String nome, habilidade;
    private int forca, idade;
    private boolean vivo;

    // toda vez que criar um construtor cheio, crie um vazio para evitar problemas
    // o springboot ele nao vai conseguir criar o construtor cheio caso não exista o vazio

    public Heroi(){

    }

    public Heroi(String nome, String habilidade, int forca, int idade, boolean vivo) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.forca = forca;
        this.idade = idade;
        this.vivo = vivo;
    }

    public String getUsername() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }


    // campo virtual/calculado é utilizado para retornar valores que não são valores do objeto
    // descricao nao é um atributo
    // getDescricao retorna um atributo que NÃO existe, atributo de tempo de execução criado pelo backend
    public String getDescricao() {
        return forca > 5000 ? "É mais de 5 mil" : "Fraquinho";
    }


}
