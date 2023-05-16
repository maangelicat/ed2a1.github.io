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

### Aproximación caso de uso:
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

