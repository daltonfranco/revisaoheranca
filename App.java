public class App{

    public static void main(String[] args){

        Empregado empregado = new Empregado();

        empregado.setNome("Josué, o Brabo");
        empregado.setEndereco("Avenida Paula Noku Santos");
        empregado.setTelefone("121212121212");
        empregado.setSalario(4000.00);


        Empregado empregado2 = new Empregado();

        empregado2.setNome("Dalton");
        empregado2.setEndereco("Tupa");
        empregado2.setTelefone("14998268042");
        empregado2.setSalario(0);


        System.out.println(empregado2.getNome());
        System.out.println(empregado2.getEndereco());
        System.out.println(empregado2.getTelefone());
        System.out.println(empregado2.getSalario() + " Reais");

    }

}