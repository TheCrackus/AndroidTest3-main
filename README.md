#Android Test Project

## Requerimientos
- Consumir la siguiente API publica: https://rickandmortyapi.com/

- 1.- Mediate Get obtener los Personajes https://rickandmortyapi.com/api/character
- 2.- Mostrar dentro de un fragmento la lista de los personajes
- 3.- cada Item debe de contener: Imagen, Nombre del Personaje,Especie y Tipo
  
- Puedes encontrar dentro de la clase ApiClient una ayuda para ahorrar tiempo
- Puedes consultar la documentación en el siguiente enlace: https://rickandmortyapi.com/documentation

## Funcionalidad
- Se requiere mostrar una lista con los datos obtenidos de la API (primer path)
- Navegar a una segunda pantalla al presionar en un item
- Se requiere mostrar una segunda pantalla con los detalles del item (segundo path) seleccionado previamente
- Navegar hacia atrás desde la segunda pantalla

## Aspectos a evaluar:
- Hacer uso de buenas prácticas
- Hacer uso de alguna arquitectura
- Hacer uso de patrones de diseño
- Uso de herramientas declaradas en las dependencias
- Uso de tecnologías Legacy(XML)

## Extras
Encontraras clases creadas previamente para ayudarte a ahorra un poco de tiempo

MainActivity.kt -> Puedes usarla para crear tu/s pantallas

CharacterResponse -> Data class que contiene una lista que se obtiene como respuesta del primer path

Result -> contiene los datos de cada item de la lista

ApiClient -> Cliente para llamada a servicio, contiene los paths

Sientete libre de agregar dependencias si lo consideras





