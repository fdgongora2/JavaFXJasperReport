# JavaFXJasperReport
JasperReports example with JavaFX

Ejemplo en el que se explica la forma de incluir informes en una aplicación JavaFX implementados mediante JasperReport. Los contenedores con la BBDD para que funcione el programa se encuentra disponible en un fichero docker-compose en https://github.com/fdgongora2/Docker_BBDD_Maria_Adminer

**Informes que incluyen subinformes**

En esta situación debemos:

1. Definir un parámetro en el informe principal del tipo "net.sf.jasperreports.engine.JasperReport". Podemos seleccionarlo pinchando en el botón "..." del editor de informes.

![TipoParametro](https://user-images.githubusercontent.com/26864987/142838333-de365516-ee4f-443f-8515-00c1ffa08352.png)

2. Modificar la expresión del subinforme para que sea el parámetro creado.

![Expression](https://user-images.githubusercontent.com/26864987/142838583-dfe0ed0a-54b2-4abe-a162-17b75be3c0bf.png)

3. En el código, además de lo que hacemos con un informe normal, debemos compilar el informe y pasarlo como valor del parámetro.

:printer:
