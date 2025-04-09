
SubAlgoritmo BubbleSort(array, tope)
	definir i,j,temp como entero;
	Para i<-0 Hasta tope-1 Con Paso 1 Hacer
		Para j<-0 Hasta tope-2 Con Paso 1 Hacer
			si array[j]>array[j+1] Entonces
				temp<-array[j];
				array[j]<-array[j+1];
				array[j+1]<-temp;
			FinSi
		FinPara
	FinPara
FinSubAlgoritmo

SubProceso LlenarArreglo(array, tope)
	Definir i, j, rand Como Entero;
	Definir repetido Como Logico;
	Para i <- 0 Hasta tope-1 Hacer
		Repetir
			repetido <- Falso;
			rand <- azar(200);
			si i > 0 Entonces
				j <- 0;
				Repetir
					repetido <- array[j] = rand;
					j <- j + 1;
				Hasta Que repetido o j = i;
			FinSi
		Hasta Que (no repetido);
		array[i] <- rand;
	FinPara
FinSubProceso

SubProceso pos <- BusquedaBinaria(array, consulta, tope)
	Definir bajo, alto, central, pos como entero;
	bajo <- 0; 
	alto <- tope - 1;
	central <- trunc((bajo+alto)/2);
	Mientras bajo < alto y array[central] <> consulta Hacer
		si consulta < array[central] Entonces
			alto <- central - 1;
		SiNo
			bajo <- central + 1;
		FinSi
		central <- trunc((bajo+alto)/2);
	FinMientras
	si consulta = array[central] Entonces
		pos <- central;
	SiNo
		pos <- -1;
	FinSi
FinSubProceso

SubProceso MostrarArreglo(array, tope)
	Definir i Como Entero; 
	Escribir "[",Sin Saltar;
	Para i <- 0 Hasta tope-1 Hacer
		Escribir array[i], Sin Saltar;
		si i < tope-1 Entonces
			Escribir ",", Sin Saltar;
		FinSi
	FinPara
	Escribir "]";
FinSubProceso

Proceso Main
	Definir nums, num, i, tope Como Entero;
	Dimensionar nums[50];
	tope <- 50;
	
	// fase 1 llenar arrglo
	Limpiar Pantalla;
	Escribir "[ ALGORITMO DE ORDENAMIENTO Y BUSQUEDA ]";
	Escribir "- Generando arreglo", Sin Saltar;
	Para i<-0 Hasta 2 Hacer
		Escribir ".", Sin Saltar;
		Esperar 500 Milisegundos;
	FinPara
	
	LlenarArreglo(nums, tope);
	
	//fase 2 ordenar arreglo
	Limpiar Pantalla;
	Escribir "[ ALGORITMO DE ORDENAMIENTO Y BUSQUEDA ]";
	Escribir "+ Arreglo completado ", Sin Saltar;
	MostrarArreglo(nums, tope);
	Esperar 500 Milisegundos;
	Escribir "- Organizando arreglo", Sin Saltar;
	Para i<-0 Hasta 2 Hacer
		Escribir ".", Sin Saltar;
		Esperar 500 Milisegundos;
	FinPara
	
	// fase 3 solicitar valor
	Limpiar Pantalla;
	Escribir "[ ALGORITMO DE ORDENAMIENTO Y BUSQUEDA ]";
	Escribir "+ Arreglo completado ", Sin Saltar;
	MostrarArreglo(nums,tope);
	Escribir "+ Arreglo organizado ", Sin Saltar;
	BubbleSort(nums, tope);
	MostrarArreglo( nums, tope);
	Esperar 500 Milisegundos;
	Escribir "";
	Escribir "- Digite el valor que desea consultar ", Sin Saltar;
	Leer num;
	Escribir "";
	si BusquedaBinaria(nums, num, tope) >= 0 Entonces
		Escribir "+ El valor buscado esta en la posicion : ", BusquedaBinaria(nums, num, tope);
	SiNo
		Escribir "+ No se encontro el valor";
	FinSi
	
	
FinProceso
