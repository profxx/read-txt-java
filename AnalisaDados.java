import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnalisaDados {

	public static void main (String[] args){ 
		
		// Variables
		String path = "C:\\Users\\acpim\\OneDrive\\Área de Trabalho\\olimpiadas.txt"; // Path to the file
		List<Estatisticas> est = new ArrayList<Estatisticas>();		
		// More gold medals - Countries
		List<String> paisesOuro = new ArrayList<String>();
		String paisMaisOuros = new String();
		List<String> listaPaisesMaisOuros = new ArrayList<>();
		// More medals - countries
		List<String> paisesMedalhas = new ArrayList<>();
		String paisMaisMedals = new String();
		List<String> listaPaisesMaisMedalhas = new ArrayList<>();
		// More gold medals - athletes
		List<String> atletasOuro = new ArrayList<>();
		String atletaMaisOuros = new String();
		// More medals - athletes
		List<String> atletasMedal = new ArrayList<>();
		String atletaMaisMedals = new String();
		List<Atleta> listaAtletasMaisMedals = new ArrayList<>();
		// Total time Athletes
		List<Atleta> atl = new ArrayList<>();
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){ // Try reading the txt file
			
			String line = br.readLine();	// Instance the variable line
			Estatisticas esporte = new Estatisticas(); // Instance the sport and gender on the first line
			esporte.setEsporte(line);		// Set the esporte
			line = br.readLine();			// Read the first line and mode to the second
			
			while (line != null) {			// Check and loop to each line
				
				String[] lido = line.split(";"); // Add the line splited by ';' to an array
				
				String modalidade = lido[0];	// Instance the array into variables once as it's ordered
				String ganhouOuro = lido[1];	// Instance the array into variables once as it's ordered
				String paisOuro = lido[2];		// Instance the array into variables once as it's ordered
				String tempoOuro = lido[3];		// Instance the array into variables once as it's ordered
				String ganhouPrata = lido[4];	// Instance the array into variables once as it's ordered
				String paisPrata = lido[5];		// Instance the array into variables once as it's ordered
				String tempoPrata = lido[6];	// Instance the array into variables once as it's ordered
				String ganhouBronze = lido[7];	// Instance the array into variables once as it's ordered
				String paisBronze = lido[8];	// Instance the array into variables once as it's ordered
				String tempoBronze = lido[9];	// Instance the array into variables once as it's ordered	
				
				Estatisticas stats = new Estatisticas(modalidade, ganhouOuro, paisOuro, tempoOuro,
						ganhouPrata, paisPrata, tempoPrata, ganhouBronze, paisBronze,
						tempoBronze); 			// Instance the object Estatisticas stats into est
				
				est.add(stats);		// Instance the object Estatisticas stats into est
				
				// List with countries in gold 
				paisesOuro.add(paisOuro);
				
				// List with countries in medals
				paisesMedalhas.add(paisOuro);
				paisesMedalhas.add(paisPrata);
				paisesMedalhas.add(paisBronze);
				
				// List with athletes in gold 
				atletasOuro.add(ganhouOuro);
				
				//List with athletes in medals
				if (modalidade.contains("4x")) { // Treat names with "/"
					String[] ouro = ganhouOuro.split("/");
					String[] prata = ganhouPrata.split("/");
					String[] bronze = ganhouBronze.split("/");
					for (String i : ouro) {
						atletasMedal.add(i);
					}
					for (String i : prata) {
						atletasMedal.add(i);
					}
					for (String i: bronze) {
						atletasMedal.add(i);
					}
				}else {
					atletasMedal.add(ganhouOuro);
					atletasMedal.add(ganhouPrata);
					atletasMedal.add(ganhouBronze);
				}
				
				// Go to the next line to reloop until there's one left.
				line = br.readLine();	
			}//while
//----------------------------------------------------------------//
			// Country with the biggest number of gold medals
			int cont = 0; // Define a counter
			for (String p : paisesOuro) { // Loop for 
				int frequencia = Collections.frequency(paisesOuro, p);
				if (frequencia > cont) {
					cont = frequencia;
					paisMaisOuros = p;
				}//if
			}//for
			listaPaisesMaisOuros.add(paisMaisOuros);
			System.out.println("País(es) com mais ouros:");
			for (String p : paisesOuro) {		// Check for countries with same number of gold medals
				int novafrequencia = Collections.frequency(paisesOuro, p);
				if ((novafrequencia >= cont) && (!listaPaisesMaisOuros.contains(p))) {
					listaPaisesMaisOuros.add(p);
				}//if
			}//for
			for (String i : listaPaisesMaisOuros) {
				System.out.println(i);
			}//for
//----------------------------------------------------------------//
			// Country with the biggest number of medals
			int contMed = 0;
			for (String p : paisesMedalhas) {
				int numMedals = Collections.frequency(paisesMedalhas, p);
				if (numMedals > contMed) {
					contMed = numMedals;
					paisMaisMedals = p;
				}//if
			}//for
			listaPaisesMaisMedalhas.add(paisMaisMedals);
			System.out.println("\nPaís(es) com mais medalhas:");
			for (String p : paisesMedalhas) {  // Check for countries with same number of medals
				int numMedals = Collections.frequency(paisesMedalhas, p);
				if (numMedals == contMed && !paisesMedalhas.contains(p)) {
					listaPaisesMaisMedalhas.add(p);
				}//if
			}//for
			for (String i : listaPaisesMaisMedalhas) {
				System.out.println(i);
			}//for
//----------------------------------------------------------------//
			// Athlete with the biggest number of gold medals
			int contAth = 0; 				// Define a counter
			for (String p : atletasOuro) { 	// Loop for 
				int afrequencia = Collections.frequency(atletasOuro, p);
				if (afrequencia > contAth) {
					contAth = afrequencia;
					atletaMaisOuros = p;
				}//if
			}//for
			System.out.println("\nAtleta(s) com mais ouros:\n"+atletaMaisOuros);
//----------------------------------------------------------------//
			// Athlete with the biggest number of medals
			int contAth1 = 0; // Define a counter
			int medals = 0;
			for (String p : atletasMedal) { 	// Loop for each athlete in atletasMedal
				int afrequencia1 = Collections.frequency(atletasMedal, p); // Number the frequency of each to a variable
				if (afrequencia1 > contAth1) {
					contAth1 = afrequencia1;
					atletaMaisMedals = p;
					medals = afrequencia1;
				}//if
			}//for
			Atleta atMeds = new Atleta();
			atMeds.setTotMedals(medals);
			atMeds.setAtleta(atletaMaisMedals);
			listaAtletasMaisMedals.add(atMeds);
			atletasMedal.remove(atletaMaisMedals);
			System.out.println("\nAtleta(s) com mais medalhas:");

			for (String p : atletasMedal) {		// Check for athletes with same number of medals
				int atletafrequencia1 = Collections.frequency(atletasMedal, p);
				if (atletafrequencia1 == medals) {
					Atleta mesmoNumero = new Atleta();
					mesmoNumero.setAtleta(p);
					mesmoNumero.setTotMedals(atletafrequencia1);
					if (listaAtletasMaisMedals.contains(mesmoNumero)) {
						// Don't add repeated elements: DIDN'T WORK
					}else {
						listaAtletasMaisMedals.add(mesmoNumero);
					}
				}//if
			}//for

			// Print
			for (Atleta j : listaAtletasMaisMedals) {
				System.out.println(j.getAtleta() + " com " + j.getTotMedals() + " medalhas.");
			}//for

//----------------------------------------------------------------//
			//Treating the time format numbers
			for (Estatisticas i : est) {
				String aMod = i.getModalidade();
				String a = i.getGanhouOuro();
				String at = i.getTempoOuro();
				
				if (at.contains(":")) {	//Treating numbers with minutes
					String[] atsplit = at.split(":");
					Integer minAt = Integer.parseInt(atsplit[0]);
					float secAt = Float.parseFloat(atsplit[1]);
					float secMili = secAt * 1000;
					int secMili2 = (int) (secMili);
					int miliAt = minAt * 60;
					int totalAt = (miliAt + secMili2) * 1000;
					Atleta ganhador = new Atleta(a, totalAt);
					if (aMod.contains("4x")) {	// Set the correct percentage to each runner in case of 4 runners
						totalAt = totalAt/4;
					}//if
					if (!atl.contains(ganhador)) {
						atl.add(ganhador);
					}//if
					else {
						int novotempo = totalAt + ganhador.getTempo();
						ganhador.setTempo(novotempo);
					}//else
				}else {		// Treat the numbers with only seconds
					float secAt = Float.parseFloat(at);
					float secMili = secAt * 1000;
					int secMili2 = (int) (secMili);
					int totalAt = (secMili2) * 1000;
					if (aMod.contains("4x")) {	// Set the correct percentage to each runner in case of 4 runners
						totalAt = totalAt/4;
					}//if
					Atleta ganhador = new Atleta(a, totalAt);
					if (!atl.contains(ganhador)) {
						atl.add(ganhador);
					}//if
					else {
						int novotempo = totalAt + ganhador.getTempo();
						ganhador.setTempo(novotempo);
					}//else
				}//else
			}//for
			Atleta atMaisTempo = new Atleta();
			int maisTempo = 0;
			for (Atleta i : atl) { // Search the ArrayList for the longest time athletes
				if (i.getTempo() > maisTempo) {
					atMaisTempo = i;
				}//if
			}//for
			System.out.println("\nAtleta que gastou mais tempo competindo:\n"+atMaisTempo.toString());
			
		}catch(IOException e) { // Treating the error with general I/OException
			System.out.println("Erro: " + e.getMessage());
		}	
	}
}



