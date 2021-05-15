import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{

		String nome;
		String cognome;
		String tintervent = null;
		int annoinizio = 0;
		int numeroTessera;
		int j;
		int q = 0;
		int z = 0;

		
		
		
		Scanner in = new Scanner(System.in);
		
		CentroSport CS[] =null;
		Atletici[] A = new Atletici[10];
		Insegnanti[] I = new Insegnanti[20];
		Utenti[] U = new Utenti[30];

		int scelta = 0;
		boolean uscita = false;
		do 
		{
			System.out.println("1. Aggiungi persone \n2. Visualizza persone \n3. Aggiungi Atletico \n4. Visualizza Atletici massaggio \n5. Uscita");
			scelta = in.nextInt();
			
			switch (scelta) 
			{
			case 1: 
			{

				System.out.println("Quante persone vuoi aggiungere:");
				j = in.nextInt();
				
				CS = new CentroSport[j];

				for (int i = 0; i < j; i++) 
				{
					System.out.println("Nome:");
					nome = in.next();
					System.out.println("Cognome:");
					cognome = in.next();
					System.out.println("Numero tessera");
					numeroTessera = in.nextInt();
					CS[i] = new CentroSport(nome, cognome, numeroTessera);
				}

			}
		    break;

			case 2: 
			{		
				for (int i = 0; i < CS.length; i++) 
				{
					CS[i].elenco();
				}
			}
			break;
           
			case 3: 
			{
				System.out.println("Quanti atletici vuoi aggiungere:");
				j = in.nextInt();
				
				A = new Atletici[j];

				for (int i = 0; i < j; i++) 
				{
					System.out.println("Nome:");
					nome = in.next();
					System.out.println("Cognome:");
					cognome = in.next();
					System.out.println("Numero tessera");
					numeroTessera = in.nextInt();
					System.out.println("Tipo intervento:");
					tintervent = in.next();
					System.out.println("Anno inizio attività:");
					annoinizio = in.nextInt();
					A[i] = new Atletici(nome, cognome, numeroTessera, tintervent, annoinizio);
					
				}

			}
				break;

			case 4: 
			{
				for (int i = 0; i < A.length; i++) 
				{
				 A[i].massaggi(tintervent, annoinizio);
				}
			}

			case 5: 
			{
				uscita = true;

			}
				break;

			}
		} while (uscita == false);

		System.exit(0);
	}
}
