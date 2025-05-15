package br.com.fiap.winery;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;

public class ApplicationClient1 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("<http://localhost:8085/WineStockService?wsdl>");

        QName qName = new QName("<http://winery.fiap.com.br/>", "WineStockServiceImplementationService");
        Service serviceFactory = Service.create(url, qName);
    }
}
