<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Calculette</title>
    </head>
    <body>
    <p> ${ !empty resultat ? resultat.getReponse() : '' }</p>
    <form method="post" action="calcul">
        <input type="text" name="val1" id="val1"/> 
        <select id="signe" name="signe">
		  <option value="add">+</option>
		  <option value="sous">-</option>
		  <option value="div">/</option>
		  <option value="mult">*</option>
		</select> 
		<input type="text" name="val2" id="val2">
		=

		<input type="submit"/>
	</form>
	
	
	
	
	
	
	
    </body>
</html>