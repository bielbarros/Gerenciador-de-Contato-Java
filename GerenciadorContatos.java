import java.util.ArrayList;

class GerenciadorContatos {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(String nome, String telefone) {
        contatos.add(new Contato(nome, telefone));
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public void removerContato(String nome) {
        contatos.removeIf(contato -> contato.getNome().equalsIgnoreCase(nome));
    }
}