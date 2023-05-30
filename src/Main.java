public class Main {
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa [2];
        Livro [] l = new Livro[3];

        p[0] = new Pessoa("Leandro", 40, "M");
        p[1] = new Pessoa("Thayane", 37, "F");

        l[0] = new Livro("Aprendendo Java", "Jose Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo",500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candida", 800, p[0]);


        l[0].fechar();
        l[0].folhear(18);
        l[0].voltarPag();

        l[1].abrir();
        l[1].folhear(400);
        l[1].avancarPag();

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());

    }
}