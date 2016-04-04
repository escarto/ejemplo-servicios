#include <string.h>     
#include <fcntl.h>      
#include <stdlib.h>     
main ( int argc, char* argv[] )
{

   const char* cadena = "Hola, profe ya se subir al git";
   int fichero = open ("Tarea_fichero", O_CREAT|O_WRONLY,0644);
   if (fichero==-1)
   {
        perror("Error al abrir fichero:");
        exit(1);
   }
   write(fichero, cadena, strlen(cadena));
   close(fichero);
   return 0;

}
