Proceso calculadora
	Mostrar "Quina operaci� vol realitzar?"
	Mostrar "+: Sumar"
	Mostrar "-: Restar"
	Mostrar "*: Multiplicar"
	Mostrar "/: Dividir"
	Leer operacio
	Mostrar "Introdueixi el primer n�mero: "
	Leer op1
	Mostrar "Introdueixi el segundo n�mero: "
	Leer op2
	Si operacio = "+" Entonces
		resultat = op1 + op2
	Sino
		Si operacio = "-" Entonces
			resultat = op1 - op2
		Sino
			Si operacio = "*" Entonces
				resultat = op1 * op2
			Sino
				Si operacio = "/" Entonces
					resultat = op1 / op2
				FinSi
			FinSi
		FinSi
	FinSi
	Mostrar "La operaci� �s " resultat
FinProceso

	