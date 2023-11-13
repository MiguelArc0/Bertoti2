package Zoo;


class Animal {
    private String nome;
    private String especie;
    private int idade;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    // Métodos para alimentar e emitir som
    public void alimentar() {
        System.out.println("O " + nome + " está alimentado.");
    }

    public void emitirSom() {
        if (especie.equals("Cachorro")) {
            System.out.println("AuAu");
        } else if (especie.equals("Gato")) {
            System.out.println("Miauu");
        } else if (especie.equals("Vaca")) {
            System.out.println("Muuuuuuu");
        } else {
            System.out.println("O animal está emitindo seu som...");
        }
    }

}