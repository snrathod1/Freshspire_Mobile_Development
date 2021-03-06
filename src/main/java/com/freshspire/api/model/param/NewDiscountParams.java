package com.freshspire.api.model.param;

/**
 * Parameters for a new discount to be added to the DB layer.
 */
public class NewDiscountParams {

    private int storeId;

    private int productId;

    private float originalPrice;

    private float discountedPrice;

    private long expirationDate;

    private int chainId;

    private String unit;

    private int quantity;

    public NewDiscountParams(int storeId, int productId, float originalPrice, float discountedPrice,
                             long expirationDate, int chainId, String unit, int quantity) {
        this.storeId = storeId;
        this.productId = productId;
        this.originalPrice = originalPrice;
        this.discountedPrice = discountedPrice;
        this.expirationDate = expirationDate;
        this.chainId = chainId;
        this.unit = unit;
        this.quantity = quantity;
    }

    public int getChainId() {
        return chainId;
    }

    public void setChainId(int chainId) {
        this.chainId = chainId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(float originalPrice) {
        this.originalPrice = originalPrice;
    }

    public float getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(float discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public long getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(long expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
