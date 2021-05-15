public class Atletici extends CentroSport
{

	public Atletici(String pNome, String pCognome, int pNumeroTessera, String pTipoIntervento, int pAnnoInizioAttivita)
	{
		super(pNome, pCognome, pNumeroTessera);
		tipoIntervento = pTipoIntervento;
		annoInizioAttivita = pAnnoInizioAttivita;
	}
	
	private String tipoIntervento;
	private int annoInizioAttivita;
	
	public void massaggi (String tipoIntervento, int annoInizioAttivita)
	{
		if(tipoIntervento=="massaggio"&&annoInizioAttivita<=2018)
		{
			System.out.println("nome:"+getNome());
			System.out.println("cognome:"+getCognome());
		}
	}
	
	public String getTipoIntervento() 
	{
		return tipoIntervento;
	}
	
	public int getAnnoInizioAttivita() 
	{
		return annoInizioAttivita;
	}
	
	public void setTipoIntervento(String tipoIntervento)
	{
		this.tipoIntervento = tipoIntervento;
	}

	public void setAnnoInizioAttivita(int annoInizioAttivita)
	{
		this.annoInizioAttivita = annoInizioAttivita;
	}

	

}
