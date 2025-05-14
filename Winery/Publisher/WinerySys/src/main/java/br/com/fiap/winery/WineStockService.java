package br.com.fiap.winery;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;
import jakarta.jws.WebParam;

@WebService
@SOAPBinding(style = Style.DOCUMENT) // Anotação adicionada
public interface WineStockService {


    @WebMethod // Anotação adicionada
    String getMenu();

    @WebMethod // Anotação adicionada
    String placeOrder(String name, int quantity);
}