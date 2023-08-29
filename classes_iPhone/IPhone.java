package classes_iPhone;

public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
	
	private long id;
	private Page paginaExemplo;
	private Contato contatoExemplo;
	private Musica musicaExemplo;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Page getPaginaExemplo() {
		return paginaExemplo;
	}
	public void setPaginaExemplo(Page paginaExemplo) {
		this.paginaExemplo = paginaExemplo;
	}
	public Contato getContatoExemplo() {
		return contatoExemplo;
	}
	public void setContatoExemplo(Contato contatoExemplo) {
		this.contatoExemplo = contatoExemplo;
	}
	public Musica getMusicaExemplo() {
		return musicaExemplo;
	}
	public void setMusicaExemplo(Musica musicaExemplo) {
		this.musicaExemplo = musicaExemplo;
	}
	
	public void adicionarMusica(Musica music) {
		System.out.println("Música "+ music.getNome()+" adicionada!");
	}
	public void removerMusica(Musica music) {
		System.out.println("Música "+ music.getNome()+" removida!");
	}
	public void adicionarContato(Contato contact) {
		System.out.println(contact.getNome()+" adicionado aos contatos!");
	}
	public void removerContao(Contato contact) {
		System.out.println(contact.getNome()+" removido dos contatos!");
	}
	
	public void exibirPagina(Page pagina){
		System.out.println("Página " + pagina.getLink() + " sendo exibida! ");
		setPaginaExemplo(pagina);
	}
	public void abrirNovaAba() {
		System.out.println("Nova aba aberta! ");
	}
	public void atualizarPagina() {
		System.out.println("Página "+ getPaginaExemplo().getLink() +" atualizada! ");
	}
	public void ligar(Contato contact) {
		System.out.println("Ligando para "+contact.getNome()+"! " );
	}
	public void atender(Contato contact) {
		System.out.println("Ligação em andamento com "+contact.getNome()+"! ");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Mostrando correio de voz! ");
	}
	public void selecionarMusica(Musica music) {
		System.out.println("Música "+ music.getNome()+" selecionada! ");
		setMusicaExemplo(music);
	}
	public void tocar() {
		System.out.println("Tocando música "+ getMusicaExemplo().getNome()+"! ");
	}
	public void pausar() {
		System.out.println("Música "+ getMusicaExemplo().getNome()+" pausada! ");
	}
	
	
	
	
	
	
	
}
