public class Insegnanti extends CentroSport
{
	public Insegnanti(String pNome, String pCognome, int pNumeroTessera, String pSport, String pQualifica, String pQurataContratto)
	{
		super(pNome, pCognome, pNumeroTessera);
		sport = pSport;
		qualifica = pQualifica;
		durataContratto = pQurataContratto;
		
	}
	
	private String sport;
	private String qualifica;
	private String durataContratto;
	
	
	public void stampa()
	{
	  System.out.println("nome:"+getNome());
	  System.out.print(" cognome:"+getCognome());
	  System.out.print(" cognome:"+getSport());
	  System.out.println(" ");
	}
	
	
	public String getSport() 
	{
		return sport;
	}
	
	public String getDurataContratto() 
	{
		return durataContratto;
	}	
	
	public String getQualifica() 
	{
		return qualifica;
	}
	
	public void setSport(String sport) 
	{
		this.sport = sport;
	}
	
	public void setDurataContratto(String durataContratto) 
	{
		this.durataContratto = durataContratto;
	}

	public void setQualifica(String qualifica) 
	{
		this.qualifica = qualifica;
	}

}
