package com.exo.beans;

public class operation {
	private String signeOperation;
	private Double valeur1;
	private Double valeur2;
	private String reponse;
	
	
 public operation() {
	 this.reponse="";
 }


public String getSigneOperation() {
	return signeOperation;
}


public void setSigneOperation(String signeOperation) {
	this.signeOperation = signeOperation;
}


public Double getValeur1() {
	return valeur1;
}


public void setValeur1(String valeur1) {
	try	{
		this.valeur1= (valeur1=="")?0: Double.parseDouble(valeur1);
	}catch(NumberFormatException e)	{
	 this.reponse="Probleme de conversion de la valeur en '"+valeur1+"' en numérique...";
	}
}


public Double getValeur2() {
	return valeur2;
}


public void setValeur2(String valeur2) {
	try	{
		this.valeur2= (valeur2=="")?0: Double.parseDouble(valeur2);
	}catch(NumberFormatException e)	{
	 this.reponse="Probleme de conversion de la valeur en '"+valeur2+"' en numérique...";
	}
}


public String getReponse() {
	if(this.reponse=="") {
		switch (this.signeOperation) {
		  case "add":
			  this.reponse="Résulat de l'opération " +this.valeur1+ " + " +this.valeur2 + " = "+  (this.valeur1+this.valeur2);
			  break;
		  case "sous":
			  this.reponse="Résulat de l'opération " +this.valeur1+ " - " +this.valeur2 + " = "+  (this.valeur1-this.valeur2);
			  break;
		  case "div":
			  this.reponse=(this.valeur2==0)? "Impossible de calculer : le dénominateur est égale a 0 " :   "Résulat de l'opération " +this.valeur1+ " / " +this.valeur2 + " = "+  (this.valeur1/this.valeur2);
			  break;
		  case "mult":
			  this.reponse="Résulat de l'opération " +this.valeur1+ " * " +this.valeur2 + " = "+  (this.valeur1*this.valeur2);
			   break;
		  default:
			   this.reponse= "Probleme avec le signe ";
			}
		
	}

	return this.reponse;
}


public void setReponse(String reponse) {
	this.reponse = reponse;
}
 
 

}
