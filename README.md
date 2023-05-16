# Registro Devoluciones por EPS
## Descripción:

En la farmacéutica Audifarma S.A el asistente de glosas y devoluciones requiere para el manejo de la glosa institucional un software que permita por EPS registrar las facturas notificadas como glosas/devoluciones clasificadas por las causales ya establecidas (Autorización, facturación y soportes) identificando la cantidad y el valor de las facturas recibidas.
Condiciones:
-	La aplicación calculara el promedio del valor y cantidad por causal y por EPS.
-	Se establece la cantidad de datos almacenados al número de EPS’s que trabajan con la farmacéutica.
-	No se realiza validación de los datos ingresados.

## Historias de usuario:

![Historia1](https://github.com/maangelicat/ed2a1.github.io/assets/128763241/22827cfa-0f83-4acf-86ea-863d54f287fc)
![Historia2](https://github.com/maangelicat/ed2a1.github.io/assets/128763241/20c7a381-8143-478b-8c49-44fee5512136)

## Aproximación caso de uso:
![WhatsApp Image 2023-05-15 at 21 25 28](https://github.com/maangelicat/ed2a1.github.io/assets/128763241/69b1ca3d-e631-4efd-83ee-868c7ca8c178)

### Descripción caso de uso:

| **Caso de uso** | Registro Devoluciones por EPS |
|----------|----------|
| **Actores:**    |  Asistente de glosas y devoluciones  |
| **Propósito:**   |  Guardar por EPS la cantidad y el valor de las glosas y devoluciones notificadas, clasificadas por las causales ya establecidas por la farmacéutica para calcular el promedio de las glosas y devoluciones recibidas.    |


| **Curso normal de eventos** |
|----------|
| 1. El asistente de glosa ingresa el nombre de la EPS de la cual va a registrar las glosas y las devoluciones. |
| 2. Digita la causal que el sistema le solicite la información, primero la cantidad y posteriormente el valor de las glosas y devoluciones recibidas. |
|3.  El sistema calcula el promedio del valor recibido (∑(EPS1, EPS2, EPS3) / Total Causales) / Cantidad EPS’s |
|4.  El sistema calcula el promedio del valor recibido (∑(EPS1, EPS2, EPS3) / Total Causales) / Cantidad EPS’s |

## Diagrama de flujo:

![Diagrama de flujo_page-0001](https://github.com/maangelicat/ed2a1.github.io/assets/128763241/dd82f386-36e9-4788-803b-73edbf28c410)


## Pseudocodigo:

    Inicio
Caracter: nombre [50]
Entero: cantAut [50]
Real: valAut [50]
Entero: cantFac [50]
Real: valFac [50]
Entero: cantSop [50]
Real: valSop [50] Entero: numEPS
Caracter: nom
Entero: numEps, I, canta, cantf, cants
Real: vala, valf, vals
Real: promediocant, promedioval =0
Imprimir: ‘Digite el número de EPS’s a registrar: ’
Asignar: numEPS
Para i=0 hasta numEPS - 1, 1
Imprimir: ‘Digite la cantidad de facturas notificadas por autorización:’
Asignar: cana
Imprimir: ‘Digite la cantidad de facturas notificadas por facturacion:’
Asignar: canf
Imprimir: ‘Digite la cantidad de facturas notificadas por soportes:’
Asignar: cans
Imprimir: ‘Digite el valor de facturas notificadas por autorización:’
Asignar: vala
Imprimir: ‘Digite el valor de facturas notificadas por facturacion:’
Asignar: valf
Imprimir: ‘Digite el valor de facturas notificadas por soportes:’
Asignar: vals
nombre [i]=nom
cantAut [i]=canta
valAut [i]=vala
cantFac [i]=cantf
valFac [i]=valf
cantSop [i]=cants
finPara
Para i=0 hasta numEPS -1, 1
promediocant=promediocan((cantAut[i]+cantFac[i]+cantSop[i])/3)/numEPS
finPara
Imprimir: ‘El promedio es:’ + promediocant
Para i=0 hasta numEPS -1, 1
promedioval=promedioval((valAut[i]+valFac[i]+valSop[i])/3)/numEPS
finPara
Imprimir: ‘El promedio es:’ + promedioval
Fin'

