# DiskThreads
Tarea de Hilos

Pistas con 10, 8 y 7 sectores. 
Se hacen 10 peticiones diferentes. De esas peticiones se van a comprobar todas las que están en el primer sector o en uno próximo.
No importa el orden que sea, se van a hacer todas las que son read sobre el primer sector. No importa donde estén las peticiones, las que sean del sector son las que se van a ejecutar(se aplica prioridad).
 Siempre se harán peticiones tanto read como write y read duran más tiempo. Darle delay al cambiar de un sector a otro. Todos los métodos read se pueden ejecutar simltáneamente, siempre y cuando estén en el mismo sector. 

Como read y y write son… 
