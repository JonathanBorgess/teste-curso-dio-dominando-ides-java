package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato ();
		livro livro = new livro();
		
		System.out.println(gato); 
		System.out.println(livro);
		
			}
}	

class Livros {
	private String nome;
	private String npage;
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the npage
	 */
	public String getNpage() {
		return npage;
	}
	/**
	 * @param npage the npage to set
	 */
	public void setNpage(String npage) {
		this.npage = npage;
	}}

