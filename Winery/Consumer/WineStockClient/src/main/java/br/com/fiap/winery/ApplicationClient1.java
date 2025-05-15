package br.com.fiap.winery;

import java.net.URL; // Importação necessária
// Outros imports virão...

public class ApplicationClient1 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("<http://localhost:8085/WineStockService?wsdl>");
        // ...
    }
}
