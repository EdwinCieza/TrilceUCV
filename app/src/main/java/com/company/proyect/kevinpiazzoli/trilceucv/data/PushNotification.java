package com.company.proyect.kevinpiazzoli.trilceucv.data;

import java.util.UUID;

/**
 * Representación de una promoción en forma de push notification
 */
public class PushNotification {
    private String id;
    private String mTitle;
    private String mDescription;
    private String mExpiryDate;
    private float mDiscount;
/// prueba espere ok fgfgfgfgfg esp nada jajaja espere yo voy a actualizar algo ok bueno al menos funciona algo xD
    // no lo vi donde es?? espere primero es asi
    public PushNotification() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setExpiryDate(String expiryDate) {
        mExpiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return mExpiryDate;
    }

    public void setDiscount(float discountValue) {
        mDiscount = discountValue;
    }

    public float getDiscount() {
        return mDiscount;
    }
}
