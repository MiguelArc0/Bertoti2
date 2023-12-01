package Zoo;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class Teste {

    @Test
    public void testarEquals() {
        Animal an = new Animal("Cario", "Caio", 15);
        Animal an2 = new Animal("Cario", "Caio", 15);

        Assert.assertEquals(1, 2);
    }

    @Test
    public void testAdicionarAnimal() {
        Zoo zoo = new Zoo("Meu Zoológico", "Local", "Horário");
        Animal animal = new Animal("Totó", "Cachorro", 5);
        Animal animal2 = new Animal("Gertrude", "Galinha", 51);
        Animal animal3 = new Animal("Popó", "Galo", 21);

        zoo.adicionarAnimal(animal);
        zoo.adicionarAnimal(animal2);
        zoo.adicionarAnimal(animal3);

        Assert.assertTrue(zoo.getAnimais().contains(animal));
        Assert.assertTrue(zoo.getAnimais().contains(animal2));
        Assert.assertTrue(zoo.getAnimais().contains(animal3));
    }

    @Test
    public void testRemoverAnimal() {
        Zoo zoo = new Zoo("Meu Zoológico", "Local", "Horário");
        Animal animal = new Animal("Totó", "Cachorro", 5);

        zoo.adicionarAnimal(animal);
        zoo.removerAnimal(animal);

        Assert.assertFalse(zoo.getAnimais().contains(animal));
    }

    @Test
    public void testAdicionarFuncionario() {
        Zoo zoo = new Zoo("Meu Zoológico", "Local", "Horário");
        Funcionario funcionario = new Funcionario("João", "Guarda", 3200.0);
        Funcionario funcionario1 = new Funcionario("José", "Zelador", 3500.0);
        Funcionario funcionario2 = new Funcionario("Gabriel", "Cuidador de Animais", 2500.0);

        zoo.adicionarFuncionario(funcionario);
        zoo.adicionarFuncionario(funcionario1);
        zoo.adicionarFuncionario(funcionario2);

        Assert.assertTrue(zoo.getFuncionarios().contains(funcionario));
        Assert.assertTrue(zoo.getFuncionarios().contains(funcionario1));
        Assert.assertTrue(zoo.getFuncionarios().contains(funcionario2));
    }
    @Test
    public void testRemoverFuncionario() {
        Zoo zoo = new Zoo("Meu Zoológico", "Local", "Horário");
        Funcionario funcionario = new Funcionario("João", "Guarda", 2000.0);
        Funcionario funcionario1 = new Funcionario("José", "Zelador", 3500.0);
        Funcionario funcionario2 = new Funcionario("Gabriel", "Cuidador de Animais", 2500.0);

        zoo.adicionarFuncionario(funcionario);
        zoo.removerFuncionario(funcionario1);

        Assert.assertFalse(zoo.getFuncionarios().contains(funcionario1));
    }

    @Test
    public void testarCaracteristicasDoAnimal() {
        String nomeEsperado = "Totó";
        String especieEsperada = "Cachorro";
        int idadeEsperada = 5;

        Animal animal = new Animal(nomeEsperado, especieEsperada, idadeEsperada);

        Assert.assertEquals(nomeEsperado, animal.getNome());
        Assert.assertEquals(especieEsperada, animal.getEspecie());
        Assert.assertEquals(idadeEsperada, animal.getIdade());
    }
    @Test
    public void testSetNomeAnimal(){
        Animal an1 = new Animal("Dereck","Cachorro",1);


        an1.setNome("Furacao");

        assertEquals("Furacao",an1.getNome());
    }
    @Test
    public void testSetEspecieAnimal(){
        Animal an1 = new Animal("Dereck","Cachorro",1);


        an1.setEspecie("Lagarto");

        assertEquals("Lagarto",an1.getEspecie());
    }
    @Test
    public void testSetIdadeAnimal() {
        Animal an1 = new Animal("Dereck", "Cachorro", 1);

        an1.setIdade(3);

        assertEquals(3, an1.getIdade());
    }

    @Test
    public void testNomeEspecieAnimal() {
        Animal an1 = new Animal("Dereck", "Cachorro", 1);

        an1.setNome("Furacao");
        an1.setEspecie("Lagarto");

        assertEquals("Furacao", an1.getNome());
        assertEquals("Lagarto", an1.getEspecie());
    }

    @Test
    public void testNomeIdadeAnimal() {
        Animal an1 = new Animal("Dereck", "Cachorro", 1);

        an1.setNome("Furacao");
        an1.setIdade(3);

        assertEquals("Furacao", an1.getNome());
        assertEquals(3, an1.getIdade());
    }

    @Test
    public void testIdadeNomeAnimal() {
        Animal an1 = new Animal("Dereck", "Cachorro", 1);

        an1.setIdade(3);
        an1.setNome("Furacao");

        assertEquals(3, an1.getIdade());
        assertEquals("Furacao", an1.getNome());
    }
    @Test
    public void testverificarAnimal() {
        Animal an1 = new Animal("Dereck", "Cachorro", 1);

        an1.setIdade(3);
        an1.setNome("Furacao");
        an1.setEspecie("Gorila");

        assertEquals(3, an1.getIdade());
        assertEquals("Furacao", an1.getNome());
        assertEquals("Gorila", an1.getEspecie());
    }
    //TESTES FUNCIONÁRIO

    @Test
    public void testSetNomeFuncionario() {
        Funcionario func1 = new Funcionario("João", "Guarda", 2000.0);
        Funcionario func2 = new Funcionario("Jefferson", "GuardaCivil", 4000.0);

        func1.setNome("Maria");

        assertEquals("Maria", func1.getNome());

        func1.setNome("José");

        assertEquals("Maria", func1.getNome());
    }
    @Test
    public void testSetCargoFuncionario() {
        Funcionario func1 = new Funcionario("João", "Guarda", 2000.0);

        func1.setCargo("Veterinário");

        assertEquals("Veterinário", func1.getCargo());
    }
    @Test
    public void testSetSalarioFuncionario() {
        Funcionario func1 = new Funcionario("João", "Guarda", 2000.0);

        func1.setSalario(2500.0);

        assertEquals(2500.0, func1.getSalario(), 0.01);
    }

    @Test
    public void testNomeCargoFuncionario() {
        Funcionario func1 = new Funcionario("João", "Guarda", 2000.0);

        func1.setNome("Maria");
        func1.setCargo("Veterinário");

        assertEquals("Maria", func1.getNome());
        assertEquals("Veterinário", func1.getCargo());
    }

    @Test
    public void testNomeSalarioFuncionario() {
        Funcionario func1 = new Funcionario("João", "Guarda", 2000.0);

        func1.setNome("Maria");
        func1.setSalario(2500.0);

        assertEquals("Maria", func1.getNome());
        assertEquals(2500.0, func1.getSalario(), 0.01);
    }

    @Test
    public void testCargoSalarioFuncionario() {
        Funcionario func1 = new Funcionario("João", "Guarda", 2000.0);

        func1.setCargo("Veterinário");
        func1.setSalario(2500.0);
        func1.setNome("José");

        assertEquals("Veterinário", func1.getCargo());
        assertEquals(2500.022, func1.getSalario(), 0.01);
    }
    @Test
    public void testVerificarFuncionario() {
        Funcionario func1 = new Funcionario("João", "Guarda", 2000.0);

        func1.setCargo("Veterinário");
        func1.setSalario(2500.0);
        func1.setNome("José");

        assertEquals("Veterinário", func1.getCargo());
        assertEquals(2500.022, func1.getSalario(), 0.01);
        assertEquals("José", func1.getNome());
    }
}
