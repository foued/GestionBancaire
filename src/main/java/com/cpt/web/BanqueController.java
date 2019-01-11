package com.cpt.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

import com.cpt.entities.Compte;
import com.cpt.metier.IBanqueMetier;

@Controller
public class BanqueController {
	
	@Autowired
	IBanqueMetier ib;
	
	
	@RequestMapping("/operations")
	public String index()
	{
		
		return "comptes";
	}
	@RequestMapping("/consulterCompte")
	public String consulter(Model model,String codeCompte)
	{
		try
		{
		Compte cp=ib.consulter(codeCompte);
		model.addAttribute("compte",cp);
		
		}
		catch (Exception e) {
			model.addAttribute("exception",e);
		}
		return "comptes";
	}
	

	
	
	
	
	

}
