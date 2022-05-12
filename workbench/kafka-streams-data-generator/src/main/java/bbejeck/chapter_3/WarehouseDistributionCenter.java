package bbejeck.chapter_3;
import bbejeck.model.BeerPurchase;
import bbejeck.model.ClickEvent;
import bbejeck.model.Currency;
import bbejeck.model.PublicTradedCompany;
import bbejeck.model.Purchase;
import bbejeck.model.StockTransaction;
import com.github.javafaker.ChuckNorris;
import com.github.javafaker.Faker;
import com.github.javafaker.Finance;
import com.github.javafaker.Name;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.io.FileWriter;
import java.io.*;
import java.util.stream.Collectors;
import java.util.*;
import java.lang.*;
import java.util.logging.*;




public class WarehouseDistributionCenter 
{
	
    private String zip;  
    private String city;
    private String state;
	private String latitude;
	private String longitude;
	private String facility_id;
	private String distrCenter_id;
	private String warehouse_id;
	private int totalPurchases;
	private int totalPurchasesReturned;
	private int totalPurchasesDeliveryDelayed;

    public WarehouseDistributionCenter(String zip, String city, String state, 
										String latitude, String longitude, String facility_id, 
										String distrCenter_id, String warehouse_id,
										int totalPurchases,
										int totalPurchasesReturned,
										int totalPurchasesDeliveryDelayed) {
        this.zip = zip;
        this.city = city;
        this.state = state;
		this.latitude = latitude;
        this.longitude = longitude;
        this.facility_id = facility_id;
		this.distrCenter_id = distrCenter_id;
        this.warehouse_id = warehouse_id;
		this.totalPurchases=0;
		this.totalPurchasesReturned=0;
		this.totalPurchasesDeliveryDelayed=0;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
	
	public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
	
	public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getFacilityId() {
        return facility_id;
    }

    public void setFacilityId(String facility_id) {
        this.facility_id = facility_id;
    }
	
	public String getDistrCenterId() {
        return distrCenter_id;
    }

    public void setDistrCenterId(String distrCenter_id) {
        this.distrCenter_id = distrCenter_id;
    }

    public String getWarehouseId() {
        return warehouse_id;
    }

    public void setWarehouseId(String warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public int getTotalPurchases() {
        return totalPurchases;
    }

    public void setTotalPurchases(int totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    public int getTotalPurchasesReturned() {
        return totalPurchasesReturned;
    }

    public void setTotalPurchasesReturned(int totalPurchasesReturned) {
        this.totalPurchasesReturned = totalPurchasesReturned;
    }

    public int getTotalPurchasesDeliveryDelayed() {
        return totalPurchasesDeliveryDelayed;
    }

    public void setTotalPurchasesDeliveryDelayed(int totalPurchasesDeliveryDelayed) {
        this.totalPurchasesDeliveryDelayed = totalPurchasesDeliveryDelayed;
    }


	

    @Override
    public String toString() {
        return "WarehouseDistributionCenter{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", facility_id='" + facility_id + '\'' +
				", distrCenter_id='" + distrCenter_id + '\'' +
                ", warehouse_id='" + warehouse_id + '\'' +
                '}';
    }
}
