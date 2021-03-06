
package info.denisjtorresg.wsproxy.bcn;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2013-06-21T09:33:00.796-06:00
 * Generated source version: 2.7.5
 * 
 */
public final class TipoCambioBCNSoap_TipoCambioBCNSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://servicios.bcn.gob.ni/", "Tipo_Cambio_BCN");

    private TipoCambioBCNSoap_TipoCambioBCNSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = TipoCambioBCN.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        TipoCambioBCN ss = new TipoCambioBCN(wsdlURL, SERVICE_NAME);
        TipoCambioBCNSoap port = ss.getTipoCambioBCNSoap();  
        
        {
        System.out.println("Invoking recuperaTCMes...");
        int _recuperaTCMes_ano = 0;
        int _recuperaTCMes_mes = 0;
        info.denisjtorresg.wsproxy.bcn.RecuperaTCMesResponse.RecuperaTCMesResult _recuperaTCMes__return = port.recuperaTCMes(_recuperaTCMes_ano, _recuperaTCMes_mes);
        System.out.println("recuperaTCMes.result=" + _recuperaTCMes__return);


        }
        {
        System.out.println("Invoking recuperaTCDia...");
        int _recuperaTCDia_ano = 0;
        int _recuperaTCDia_mes = 0;
        int _recuperaTCDia_dia = 0;
        double _recuperaTCDia__return = port.recuperaTCDia(_recuperaTCDia_ano, _recuperaTCDia_mes, _recuperaTCDia_dia);
        System.out.println("recuperaTCDia.result=" + _recuperaTCDia__return);


        }

        System.exit(0);
    }

}
