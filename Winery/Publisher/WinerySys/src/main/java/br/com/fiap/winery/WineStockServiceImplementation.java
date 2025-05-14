package br.com.fiap.winery;

import jakarta.jws.WebService; // Importação necessária

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {
    // ... (corpo da classe com os métodos implementados)
    @Override
    public String getMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("--- Menu de Vinhos ---\n");
        menu.append("Tintos:\n");
        menu.append("  - Cabernet Sauvignon Reserva (Uva: Cabernet Sauvignon)\n");
        menu.append("  - Merlot Clássico (Uva: Merlot)\n");
        menu.append("  - Pinot Noir Elegance (Uva: Pinot Noir)\n");
        menu.append("Brancos:\n");
        menu.append("  - Sauvignon Blanc Frescor (Uva: Sauvignon Blanc)\n");
        menu.append("  - Chardonnay Barricado (Uva: Chardonnay)\n");
        menu.append("Rosés:\n");
        menu.append("  - Rosé de Provence (Uva: Grenache, Cinsault)\n");
        return menu.toString();
    }

    @Override
    public String placeOrder(String name, int quantity) {
        System.out.println("Pedido recebido: " + quantity + "x " + name);
        return "Pedido confirmado para " + quantity + "x " + name + "!";
    }
}