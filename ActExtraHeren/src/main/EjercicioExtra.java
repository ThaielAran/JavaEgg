package main;

/*Se necesita una app para un hospital que debe manejar y llevar el control
de personas que viven cerca de las instalaciones.
El hospital, primero que nada, debe registrar familias;
Cada familia tiene los siguientes datos:
Dirección
IDE
N° de lote
Barrio
Localidad

Cada familia, tiene al menos 1 integrante, de cada integrante familiar se 
deben registrar los siguientes datos:
Numero de orden (Cada integrante tiene un numero de orden)
Apellido
Nombre
Fecha de nacimiento
DNI
Sexo
Vinculo (Si es Madre, Padre, Hijo/a, Abuelo/a).

Cada integrante, puede tener o no, una relación con alguna de las siguientes 
clases (usar la relación que corresponda)
- Clase Problema de salud (donde se debe guardar información si la persona tiene alguna enfermad. Los datos
para esta clase son los siguientes: N° de orden del integrante, IDE de familia, HTA (verdadero o falso, si tiene
hipertension), DBT (verdadero o falso si tiene diabetes)).
- Clase Abordaje Nutricional (donde se registra la informacion si la persona tiene algun tratamiento por algun
problema de salud relacionado con la nutricion. Los datos que debe guardar esta clase son: N° de orden del
integrante familiar, edad, peso, Eutrofico (verdadero o falso de si tiene un peso normal), BajoPeso (verdadero o
falso si tiene menor peso al debido), SobrePeso (verdadero o falso de si tiene un peso por encima),

Cada familia tiene además, una relacion 1 a 1 con la clase InformacionVivienda, en donde se deben guardar los
siguientes datos:
N° de dormitorios
Tipo de Paredes (pueden ser alguna de estas opciones: Material, madera, Lata, otros)
Tipo de piso (pueden ser alguna de estas opciones: Mosaico, cemento, tierra, otros)
Iluminación (verdadero o falso de si tiene o no tiene iluminacion electrica)

Cada familia se divide en dos tipos, familias con factores de riesgo y familias sin factores de riesgo.
Si una familia tiene factores de riesgo, se debe agregar la siguiente información:
- Factores (Se puede seleccionar de 1 a 13 factores de riesgo) (el factor es una lista numérica. Puede ser
cualquier numero del 1 al 13, varios números del 1 al 13, como por ejemplo 2 y 5)
- Mediante una función mostrar cual es la cantidad de factores que tiene la familia.
Si una familia NO tiene factores de riesgo, se debe agregar lo siguiente;
- Mejora (es un boolean que debe guardar si la familia contiene o no contiene alguna mejora en su hogar.)
Cada Integrante puede ser, Niño, Joven, Adulto, AdultoMayor
El niño simplemente guardará la información básica de una persona. Se consideran niños hasta 14 años.
El joven, debe guardar información básica de una persona y además de lo que estudia, si practica deporte, y si es
que tiene algun tipo de trabajo. Se consideran estudiantes de 15 años en adelante hasta los 18.
El Adulto debe guardar información básica de una persona y además acerca de si estudia o no, si realiza deporte,
si es que tiene algun empleo formal, y de si tiene obra social.
El AdultoMayor debe guardar info básica de una persona. y si es que tiene la jubilación.

El programa debe tener además una clase que guarde un resumen de todas las familias e integrantes, y
mediante sus funciones especificas.
Los datos mas importantes son:
Cantidad de personas
Sexo
Edad (Separar segun el siguiente orden, menores a un año, de un año, 2-5 años, 6 años, 7 a 10, 11 a 20, 21 a
30, 31 a 60, +65años.)
Resumen de problemas de salud (cuantas personas hay, y que es lo que tienen)
Resumen de abordaje nutricional (cuantas personas hay, y que es lo que tienen)

El programa debe permitir realizar un CRUD de las opciones más importantes. SERVICIO DE FAMILIA
Realizar un MENU con lo que sea más relevante para este sistema.
Nota: Agregar o modificar funciones para que se realice correctamente lo que se pide.
*/

public class EjercicioExtra {

}
