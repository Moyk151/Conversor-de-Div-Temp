package ConDivfin;

import java.util.HashMap;
import java.util.Map;

class ConvertidorDeMonedaFac {
    private static Map<String, ConvertidorDeMoneda> converterMap = new HashMap<>();

    static {
        converterMap.put("USD", new USDCurrencyConverter());
        converterMap.put("EUR", new EURCurrencyConverter());
        converterMap.put("JPY", new JPYCurrencyConverter());
        converterMap.put("MXN", new MXNCurrencyConverter());
        converterMap.put("COP", new COPCurrencyConverter());
    }

    public static ConvertidorDeMoneda getConverter(String currency) {
        if (!converterMap.containsKey(currency)) {
            throw new IllegalArgumentException("Unsupported currency");
        }
        return converterMap.get(currency);
    }
}