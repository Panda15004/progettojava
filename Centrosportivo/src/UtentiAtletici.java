public class UtentiAtletici extends Utenti
{

	public UtentiAtletici(String pNome, String pCognome, int pNumeroTessera, String pDataIscrizione,int pDurataAbbonamento, int pGareEffettuate) 
	{
		super(pNome, pCognome, pNumeroTessera, pDataIscrizione, pDurataAbbonamento);
		gareEffettuate = pGareEffettuate;
	}
	
	private int gareEffettuate;
	
	public int getGareEffettuate() 
	{
		return gareEffettuate;
	}
	
	public void setGareEffettuate(int gareEffettuate) 
	{
		this.gareEffettuate = gareEffettuate;
	}
	
}
