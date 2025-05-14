package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint; // Importação necessária

public class Loader {
    public static void main(String[] args) {
        WineStockServiceImplementation wineStockImpl = new WineStockServiceImplementation();
        String url = "http://localhost:8085/WineStockService";

        System.out.println("Publicando WineStockService em: " + url);
        Endpoint.publish(url, wineStockImpl); // Publica o serviço

        System.out.println("Serviço WineStockService publicado com sucesso!");
        System.out.println("WSDL disponível em: " + url + "?wsdl");
    }
}