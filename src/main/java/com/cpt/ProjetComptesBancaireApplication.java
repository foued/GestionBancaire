package com.cpt;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cpt.dao.ClienRepository;
import com.cpt.dao.CompteRepository;
import com.cpt.dao.OperationRepository;
import com.cpt.entities.Client;
import com.cpt.entities.Compte;
import com.cpt.entities.CompteCourant;
import com.cpt.entities.CompteEpargne;
import com.cpt.entities.Operation;
import com.cpt.entities.Retrait;
import com.cpt.entities.Versement;
import com.cpt.metier.ClientMetier;
import com.cpt.metier.CompteMetier;


@SpringBootApplication
public class ProjetComptesBancaireApplication implements CommandLineRunner {
	
	@Autowired
	private CompteRepository cp;
	@Autowired
	private ClienRepository cr; 
	@Autowired
	private OperationRepository or;
	

	public static void main(String[] args)
	{
		
		SpringApplication.run(ProjetComptesBancaireApplication.class, args);
	}
//		ClientMetier clientmetier=ctx.getBean(ClientMetier.class);
//		
//		clientmetier.AddClient(new Client("Kamil"));
//		clientmetier.AddClient(new Client("Delphine"));
//		clientmetier.AddClient(new Client("Amine"));
//		clientmetier.AddClient(new Client("Samir"));
//		System.out.println("******************ListDesClients*************************");
//		List<Client> clts=clientmetier.ListClient();
//		
//		for(Client c:clts)
//		{
//			System.out.println(c.getNom());
//		}
//		System.out.println("******************ListDesClientsParMotCles*************************");
//		
//		List<Client>cltsmc =clientmetier.ListClientParMotCle("%a%");
//	
//	for(Client c:cltsmc)
//	{
//		System.out.println(c.getNom());
//	}
////	System.out.println("******************Comptes*************************");
////	
////	
////	CompteMetier compteMetier=ctx.getBean(CompteMetier.class);
////	compteMetier.ajouterCompte(new CompteCourant("1", new Date(),9000, new Client(1L), 200));
////	compteMetier.ajouterCompte(new CompteCourant("2", new Date(),15000, new Client(2L), 800));
////	compteMetier.ajouterCompte(new CompteCourant("1", new Date(),10000, new Client(1L), 100));
////	compteMetier.ajouterCompte(new CompteEpargne("3", new Date(),55000, new Client(2L), 0.05));
////	
//}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Client c1=cr.save(new Client("Sandra"));
		Client c2=cr.save(new Client("Amir"));
		Client c3=cr.save(new Client("Emir"));
		Client c4=cr.save(new Client("Faker"));
		Client c5=cr.save(new Client("Claude"));
		Client c6=cr.save(new Client("Olivier"));
		Client c7=cr.save(new Client("Benjamin"));
		
		Compte compte1=cp.save(new CompteCourant("c1dd452", new Date(), 1000, c1, 1000));
		Compte compte2=cp.save(new CompteEpargne("c2512ff", new Date(), 250000, c2, 2.5));
		or.save(new Versement(new Date(), 10000,compte1));
		or.save(new Versement(new Date(), 10000,compte2));
		or.save(new Retrait(new Date(), 100, compte2));
		
		
		
	}	

	}
		



