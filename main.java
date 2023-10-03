public class main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos", "Carlos@gmail.com", 123456789);
        Notificacao notificacaoEmail = new NotPorEmail();
        Notificacao notificacaoSms = new NotPorSms();
        Notificacao notificacaoPush = new NotPorPush();
        GerenciarNotificacoes gerenciador = new GerenciarNotificacoes();

        gerenciador.adicionarUsuario(usuario);
        gerenciador.registrarPreferencia(usuario, notificacaoEmail);

        Usuario usuario2 = new Usuario("Pedro", "pedro@gmail.com", 493432493);
        gerenciador.adicionarUsuario(usuario2);
        gerenciador.registrarPreferencia(usuario2, notificacaoSms);

        Usuario usuario3 = new Usuario("Roberta", "Roberta@gmail.com", 989707959);
        gerenciador.adicionarUsuario(usuario3);
        gerenciador.registrarPreferencia(usuario3, notificacaoPush);

        gerenciador.enviarNotificacao(usuario, "Esta é uma mensagem de teste! " + "Nome: " + usuario.getNome() + ", " + "Email: " + usuario.getEmail());
        gerenciador.enviarNotificacao(usuario2, "Testando! " + "Telefone: " + usuario2.getNumeroTelefone() + ", " + "Nome: " + usuario2.getNome());
        gerenciador.enviarNotificacao(usuario3, "Testando! " + "Nome: " + usuario3.getNome());
    }
}
