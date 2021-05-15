public class CentroSport 
{

	private String nome;
	private String cognome;
	private int numeroTessera;
	
	
	

	
	public CentroSport (String pNome,String pCognome, int pNumeroTessera)
	{
		nome = pNome;
		cognome = pCognome;
		numeroTessera = pNumeroTessera;
	}
	
	public void elenco ()
	{				
		System.out.println("nome:"+getNome());
		System.out.print(" cognome:"+getCognome());
		System.out.print(" numero tessera:"+getNumeroTessera());
		System.out.println(" ");
	}
	
	
	
	public String getNome() 
	{
		return nome;
	}
	
	public int getNumeroTessera() 
	{
		return numeroTessera;
	}
	
	public String getCognome() 
	{
		return cognome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public void setNumeroTessera(int numeroTessera) 
	{
		this.numeroTessera = numeroTessera;
	}

	public void setCognome(String cognome) 
	{
		this.cognome = cognome;
	}

}
