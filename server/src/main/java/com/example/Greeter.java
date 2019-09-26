/*dd javadoc comment
*package contenedor de paquetes.
package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /*dd javadoc comment
  *@param String alguien.
  *@return String cadena.
  */ 
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
