package br.com.fiap.winery;

public class WineStockServiceImplementation implements WineStockService {

    @Override // Boa prática, indica que estamos sobrescrevendo um método da interface
    public String getMenu() {
        // Simples lista de vinhos como String
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

    // Método placeOrder ainda precisa ser implementado
}