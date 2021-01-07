import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.antlr.v4.runtime.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class AnalizadorListener extends gFiboParserBaseListener {
  // Variables globales e inicializacion
  private String nombreFichero = "fibonacci";
  private String contenidoNodo = "";
  private boolean ultimo, nuevo = false;
  private BufferedWriter writer = null;

  @Override
  public void visitTerminal(TerminalNode node) {
    /*
     * Cada vez que visita un nodo terminal comprueba de que tipo es y en funcion a
     * eso lo pinta del color adecuado al escribirlo en el fichero HTML, se ha hecho
     * comparando strings con el objetivo de que sea mas legible
     */

    // COMENTARIOS
    if (contenidoNodo.equals("comentario")) {
      crearFichero("<span class=\"comentario\">" + node.getText());
      contenidoNodo = "";
    }  else if (contenidoNodo.equals("biblioteca")) {
      crearFichero("<span class=\"palabraReservada\">" + node.getText() + "</span>");
      contenidoNodo = "";
      // SIGNOS SEPARADORES Y TERMINADORES
    } else if (contenidoNodo.equals("separadorTerminador")) {
      crearFichero("<span class=\"signoSeparadorTerminador\">" + node.getText() + "</span>");
      contenidoNodo = "";
      // PALABRAS RESERVADAS
    } else if (contenidoNodo.equals("palabraReservada")) {
      crearFichero("<span class=\"palabraReservada\">" + node.getText());
      contenidoNodo = "";
    } else if (contenidoNodo.equals("palabraReservadaSalir")) {
      crearFichero(node.getText() + "</span>");
      contenidoNodo = "";
      // NOMBRES DE FUNCIONES
    } else if (contenidoNodo.equals("nombreFuncion")) {
      crearFichero("<span class=\"nombreFuncion\">" + node.getText() + "</span>");
      contenidoNodo = "";
      // TIPOS DE DATOS
    } else if (contenidoNodo.equals("tipoDatos")) {
      crearFichero("<span class=\"tipoDatos\">" + node.getText());
      contenidoNodo = "";
    } else if (contenidoNodo.equals("tipoDatosSalir")) {
      crearFichero(node.getText() + "</span>");
      contenidoNodo = "";
      // NUMEROS
    } else if (contenidoNodo.equals("numeros")) {
      crearFichero("<span class=\"numeros\">" + node.getText() + "</span>");
      contenidoNodo = "";
      // BEGIN Y END
    } else if (contenidoNodo.equals("beginEnd")) {
      crearFichero("<span class=\"beginEnd\">" + node.getText());
      contenidoNodo = "";
    } else if (contenidoNodo.equals("beginEndSalir")) {
      crearFichero(node.getText() + "</span>");
      contenidoNodo = "";
      // CADENAS
    } else if (contenidoNodo.equals("string")) {
      crearFichero("<span class=\"cadenas\">" + node.getText() + "</span>");
      contenidoNodo = "";
      // ASIGNACIONES
    } else if (contenidoNodo.equals("asignacion")) {
      crearFichero("<span class=\"asignaciones\">" + node.getText() + "</span>");
      contenidoNodo = "";
      // NOMBRES DE VARIABLES
    } else if (contenidoNodo.equals("nombreVariable")) {
      crearFichero("<span class=\"nombreVariable\">" + node.getText() + "</span>");
      contenidoNodo = "";
      // OPERADORES Y SIMBOLOS
    } else if (contenidoNodo.equals("parentesisOperador")) {
      crearFichero("<span class=\"parentesisOperadores\">" + node.getText() + "</span>");
      contenidoNodo = "";
    } else if (contenidoNodo.equals("oplogica")) {
      // En el caso de las operaciones logicas habia conflictos con los caracteres de
      // escape de HTML por lo que hay que hacer un trato especial de estos datos.
      if (node.getText().equals('<')) {
        crearFichero("<span class=\"parentesisOperadores\">" + "&lt;" + "</span>");
      } else if (node.getText().equals('>')) {
        crearFichero("<span class=\"parentesisOperadores\">" + "&gt;" + "</span>");
      } else {
        crearFichero("<span class=\"parentesisOperadores\">" + node.getText() + "</span>");
      }
      contenidoNodo = "";
    }
    // RESTO DE TEXTO
    else
      crearFichero(node.getText());
  }

  @Override
  public void enterCodigo(gFiboParser.CodigoContext ctx) {
    /*
     * Al ser el primer nodo en entrar en contacto escribe el principio del código 
     * HTML que esta debidamente formateado
     */
    crearFichero(
        "<html>\r\n    <head><title>Alvaro de las Heras</title>\r\n    \r\n        <style>\r\n            body{ \r\n                background:lightgray;\r\n            }\r\n\t\t\tpre {\r\n\t\t\t\tmargin: auto;\r\n\t\t\t\tborder-style: solid;\r\n\t\t\t\tborder-color: darkgrey;\r\n\t\t\t\tpadding: 15px;\r\n\t\t\t\tmin-width:100px;\r\n\t\t\t\tdisplay: inline-block\r\n\t\t\t}\r\n\t\t\t.asignaciones {\r\n\t\t\t\tcolor:yellow;\r\n\t\t\t\tfont-weight:bolder;\r\n\t\t\t}           .palabraReservada {\r\n                color:blue;\r\n                font-weight:bolder;\r\n            }\r\n            .comentario {\r\n                color:green;\r\n            }\r\n\t\t\t.nombreFuncion {\r\n\t\t\t\tcolor:white;\r\n                font-weight:bolder;\r\n\t\t\t}\r\n\t\t\t.nombreVariable {\r\n\t\t\t\tcolor:yellow;\r\n\t\t\t}\r\n\t\t\t.tipoDatos {\r\n\t\t\t\tcolor:red;\r\n\t\t\t}\r\n\t\t\t.signoSeparadorTerminador {\r\n\t\t\t\tcolor:blue;\r\n\t\t\t}\r\n\t\t\t.parentesisOperadores {\r\n\t\t\t    font-weight:bolder;\r\n\t\t\t}\r\n\t\t\t.beginEnd {\r\n\t\t\t\tcolor:orange;\r\n\t\t\t\tfont-weight:bolder;\r\n\t\t\t}\r\n\t\t\t.numeros {\r\n\t\t\t\tcolor:blue;\r\n\t\t\t}\r\n\t\t\t.cadenas {\r\n\t\t\t\tcolor:purple;\r\n\t\t\t\t font-style: italic;\r\n\t\t\t}\r\n        \r\n\t\t\t.asignaciones {\r\n\t\t\t\tcolor:yellow;\r\n\t\t\t\tfont-weight:bolder;\r\n\t\t\t}           \r\n\t\t\t.palabraReservada {\r\n                color:blue;\r\n                font-weight:bolder;\r\n            }\r\n            .comentario {\r\n                color:darkgreen;\r\n            }\r\n\t\t\t.nombreFuncion {\r\n\t\t\t\tcolor:white;\r\n                font-weight:bolder;\r\n\t\t\t}\r\n\t\t\t.nombreVariable {\r\n\t\t\t\tcolor:yellow;\r\n\t\t\t}\r\n\t\t\t.tipoDatos {\r\n\t\t\t\tcolor:red;\r\n\t\t\t}\r\n\t\t\t.signoSeparadorTerminador {\r\n\t\t\t\tcolor:blue;\r\n\t\t\t}\r\n\t\t\t.parentesisOperadores {\r\n\t\t\t    font-weight:bolder;\r\n\t\t\t}\r\n\t\t\t.beginEnd {\r\n\t\t\t\tcolor:orange;\r\n\t\t\t\tfont-weight:bolder;\r\n\t\t\t}\r\n\t\t\t.numeros {\r\n\t\t\t\tcolor:blue;\r\n\t\t\t}\r\n\t\t\t.cadenas {\r\n\t\t\t\tcolor:purple;\r\n\t\t\t\t font-style: italic;\r\n\t\t\t}\r\n        </style>\r\n    \r\n    \r\n    </head>\r\n    <body>\r\n        <h1>C&oacute;digo formateado del fichero dado</h1>\r\n        <code>\r\n            <pre>");
  }

  @Override
  public void exitCodigo(gFiboParser.CodigoContext ctx) {
    // Al ser el último nodo en salir cierra nuestro writer y acaba el codigo HTML
    ultimo = true;
    crearFichero("</pre>\r\n        </code>\r\n    </body>\r\n</html>");
  }

  // Funciones listener que indicaran en que tipo de texto se encuentran en
  // funcion al arbol
  @Override
  public void enterComentario(gFiboParser.ComentarioContext ctx) {
    contenidoNodo = "comentario";
  }

  @Override
  public void exitComentario(gFiboParser.ComentarioContext ctx) {
    crearFichero("</span>");
  }

  @Override
  public void enterReservadaInclude(gFiboParser.ReservadaIncludeContext ctx) {
    contenidoNodo = "biblioteca";
  }

  @Override
  public void enterTerminador(gFiboParser.TerminadorContext ctx) {
    contenidoNodo = "separadorTerminador";
  }

  public void enterDelimitador(gFiboParser.DelimitadorContext ctx) {
    contenidoNodo = "separadorTerminador";
  }

  @Override
  public void enterReservadaFuncion(gFiboParser.ReservadaFuncionContext ctx) {
    contenidoNodo = "palabraReservada";
  }

  public void exitReservadaFuncion(gFiboParser.ReservadaFuncionContext ctx) {
    contenidoNodo = "palabraReservadaSalir";
  }

  @Override
  public void enterComienzo(gFiboParser.ComienzoContext ctx) {
    contenidoNodo = "beginEnd";
  }

  @Override
  public void exitComienzo(gFiboParser.ComienzoContext ctx) {
    crearFichero("</span>");
  }

  @Override
  public void enterAcabar(gFiboParser.AcabarContext ctx) {
    contenidoNodo = "beginEnd";
  }

  public void exitAcabar(gFiboParser.AcabarContext ctx) {
    crearFichero("</span>");
  }

  @Override
  public void enterReservadaDevolver(gFiboParser.ReservadaDevolverContext ctx) {
    contenidoNodo = "palabraReservada";
  }

  @Override
  public void exitReservadaDevolver(gFiboParser.ReservadaDevolverContext ctx) {
    crearFichero("</span>");
  }

  @Override
  public void enterNombrefuncion(gFiboParser.NombrefuncionContext ctx) {
    contenidoNodo = "nombreFuncion";
  }

  @Override
  public void enterTipo(gFiboParser.TipoContext ctx) {
    contenidoNodo = "tipoDatos";
  }

  @Override
  public void exitTipo(gFiboParser.TipoContext ctx) {
    contenidoNodo = "tipoDatosSalir";
  }

  @Override
  public void enterNumero(gFiboParser.NumeroContext ctx) {
    contenidoNodo = "numeros";
  }

  @Override
  public void enterString(gFiboParser.StringContext ctx) {
    contenidoNodo = "string";
  }

  @Override
  public void enterAsignar(gFiboParser.AsignarContext ctx) {
    contenidoNodo = "asignacion";
  }

  @Override
  public void enterNombreVariable(gFiboParser.NombreVariableContext ctx) {
    contenidoNodo = "nombreVariable";
  }

  @Override
  public void enterParentesisIzq(gFiboParser.ParentesisIzqContext ctx) {
    contenidoNodo = "parentesisOperador";
  }

  @Override
  public void enterParentesisDer(gFiboParser.ParentesisDerContext ctx) {
    contenidoNodo = "parentesisOperador";
  }

  @Override
  public void enterOperacion(gFiboParser.OperacionContext ctx) {
    contenidoNodo = "parentesisOperador";
  }

  @Override
  public void enterOplogica(gFiboParser.OplogicaContext ctx) {
    contenidoNodo = "oplogica";
  }

  @Override
  public void enterReservadaBucle(gFiboParser.ReservadaBucleContext ctx) {
    contenidoNodo = "biblioteca";
  }
  /*
   * Funcion que se encarga de escribir los datos empleando un BufferedWriter
   * porque así requiere menos operaciones de lectura y escritura 
   */

  public void crearFichero(String textoNodo) {
    try {
      // Creamos un BufferedWriter que sobreescribe en el archivo solo una vez se crea
      if (!nuevo) {
        FileWriter fw = new FileWriter(nombreFichero + ".html", false);
        writer = new BufferedWriter(fw);
        nuevo = true;
      }
      // Escribimos el texto del nodo
      writer.write(textoNodo);
      // En caso de ser el último cerramos el canal
      if (ultimo) {
        writer.close();
      }

      // Capturamos las posibles excepciones en el funcionamiento
    } catch (IOException e) {
      // Enviamos a la salida de errores el error que podamos haber tenido
      e.printStackTrace(System.err);
    }
  }

  /*
   * Sirve para cambiar el nombre de nuestro fichero
   */
  public void setNombreFichero(String nombre) {
    nombreFichero = nombre;
  }
}