package pl.walczakt.voucherstore.sales;

public interface Inventory {
    boolean isAvailable(String productId);
}
