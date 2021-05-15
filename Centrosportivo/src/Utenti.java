public class Utenti extends CentroSport
{

	public Utenti(String pNome, String pCognome, int pNumeroTessera, String pDataIscrizione, int pDurataAbbonamento ) 
	{
		super(pNome, pCognome, pNumeroTessera);
		dataIscrizione = pDataIscrizione;
		durataAbbonamento = pDurataAbbonamento;
	}
	
	private String dataIscrizione;
	private int durataAbbonamento;
	
 
	
	
	public String getDataIscrizione() 
	{
		return dataIscrizione;
	}
	
	public int getDurataAbbonamento() 
	{
		return durataAbbonamento;
	}
	
	public void setDataIscrizione(String dataIscrizione) 
	{
		this.dataIscrizione = dataIscrizione;
	}
	
	public void setDurataAbbonamento(int durataAbbonamento) 
	{
		this.durataAbbonamento = durataAbbonamento;
	}
	

}
