package Zoo;
import java.util.ArrayList;
import java.util.List;
class Zoo {
    private String nome;
    private String localizacao;
    private String horarioFuncionamento;
    private List<Animal> animais = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Zoo(String nome, String localizacao, String horarioFuncionamento) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.horarioFuncionamento = horarioFuncionamento;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    // Métodos para adicionar/remover animais e funcionários
    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }
    public void removerAnimal(Animal animal) {
        animais.remove(animal);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public static void main(String[] args) {
        Animal an1 = new Animal("totó","Vaca",15);
        an1.emitirSom();

        Zoo zoo1 = new Zoo("Zoológico Central", "Rua ABC, 123", "09:00 - 18:00");

        Animal animal1 = new Animal("Totó", "Cachorro", 5);
        Animal animal2 = new Animal("Whiskers", "Gato", 3);
        Animal animal3 = new Animal("Bessie", "Vaca", 8);

        zoo1.adicionarAnimal(animal1);
        zoo1.adicionarAnimal(animal2);
        zoo1.adicionarAnimal(animal3);

        Funcionario funcionario1 = new Funcionario("João", "Guarda", 2000.0);
        Funcionario funcionario2 = new Funcionario("Maria", "Veterinário", 2500.0);

        zoo1.adicionarFuncionario(funcionario1);
        zoo1.adicionarFuncionario(funcionario2);

        animal1.emitirSom();
        animal2.alimentar();

        System.out.println("Lista de Animais no Zoológico:");

        for (Animal animal : zoo1.getAnimais()) {
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Espécie: " + animal.getEspecie());
            System.out.println("Idade: " + animal.getIdade());
            System.out.println("-----------");
        }
    }
}
