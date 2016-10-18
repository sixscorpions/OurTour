package com.versatilemobitech.ourtour.models;

/**
 * Created by mydu on 16-Oct-16.
 */

public class VehiclePricing {
    private String vehicle_id;
    private String ac_price;
    private String non_ac_price;
    private String airport_drop_pick;
    private String driver_bhatta;
    private String driver_name;
    private String mobile_number;

    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getAc_price() {
        return ac_price;
    }

    public void setAc_price(String ac_price) {
        this.ac_price = ac_price;
    }

    public String getNon_ac_price() {
        return non_ac_price;
    }

    public void setNon_ac_price(String non_ac_price) {
        this.non_ac_price = non_ac_price;
    }

    public String getAirport_drop_pick() {
        return airport_drop_pick;
    }

    public void setAirport_drop_pick(String airport_drop_pick) {
        this.airport_drop_pick = airport_drop_pick;
    }

    public String getDriver_bhatta() {
        return driver_bhatta;
    }

    public void setDriver_bhatta(String driver_bhatta) {
        this.driver_bhatta = driver_bhatta;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }
}