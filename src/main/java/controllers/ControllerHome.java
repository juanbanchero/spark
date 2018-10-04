package controllers;

import pokemon.repositories.UsuarioRepositorio;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class ControllerHome {
	
	public static ModelAndView index(Request req, Response res) {
		return new ModelAndView( UsuarioRepositorio.get().findAny(), "index.hbs");
	}
}

 /*
  ANOTACIONES 
  Con render (esto siempre es en Spark) sabe transformar algo del dominio a Json -> No me sirve para esto, si para NOTITAS
  
  Por eso buscamos otro transformer que si nos sirva, no nos sirve Json pero si nos sirve formato String 
  para que viaje en el body. Este transfomer usa templates que tienen algunas cosas basicas como etiquetas 
  usuales como <html></html> y completa el template/plantilla con lo que yo le mando. En este caso, todo
  lo que esta despues del return.
  Existen muchas cosas para hacer templates que estan en la documentacion de Spark
  Los archivos estaticos tienen que ir en src/main/resources 
  No podes versionar carpetas en git si no tienen archivos 
  */
  