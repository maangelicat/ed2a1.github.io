# Registro Devoluciones por EPS
## Descripción:

En la farmacéutica Audifarma S.A el asistente de glosas y devoluciones requiere para el manejo de la glosa institucional un software que permita por EPS registrar las facturas notificadas como glosas/devoluciones clasificadas por las causales ya establecidas (Autorización, facturación y soportes) identificando la cantidad y el valor de las facturas recibidas.
Condiciones:
-	La aplicación calculara el promedio del valor y cantidad por causal y por EPS.
-	Se establece la cantidad de datos almacenados al número de EPS’s que trabajan con la farmacéutica.
-	No se realiza validación de los datos ingresados.

## Historias de usuario:

### Aproximación caso de uso:

### Descripción caso de uso:

| **Caso de uso** | Registro Devoluciones por EPS |
|----------|----------|
| **Actores:**    |  Asistente de glosas y devoluciones  |
| **Propósito:**   |  Guardar por EPS la cantidad y el valor de las glosas y devoluciones notificadas, clasificadas por las causales ya establecidas por la farmacéutica para calcular el promedio de las glosas y devoluciones recibidas.    |


| **Curso normal de eventos** |
|----------|
| 1. El asistente de glosa ingresa el nombre de la EPS de la cual va a registrar las glosas y las devoluciones. |
| 2. Digita la causal que el sistema le solicite la información, primero la cantidad y posteriormente el valor de las glosas y devoluciones recibidas. |
|3.  El sistema calcula el promedio del valor y de la cantidad recibida (∑(EPS1, EPS2, EPS3) / Total Causales) / Cantidad EPS’s |



