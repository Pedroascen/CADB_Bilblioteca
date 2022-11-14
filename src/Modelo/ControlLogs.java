package Modelo;

import org.apache.log4j.Logger;

public class ControlLogs {
        /**
     * @param args the command line arguments
     */
    static final Logger log = Logger.getLogger(ControlLogs.class);
    public void errores() {
        // TODO code application logic here      
      log.info("Mensaje con Info");
      log.fatal("Mensaje con Fatal");
      log.warn("Mensaje con Warn");
      log.error("Mensaje con Error");
      log.debug("Mensaje con Debug");    
    } 
}
