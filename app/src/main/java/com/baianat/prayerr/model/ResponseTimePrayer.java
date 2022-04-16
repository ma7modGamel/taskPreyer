package com.baianat.prayerr.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;





public class ResponseTimePrayer implements Serializable
{

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("results")
    @Expose
    private Results results;
    private final static long serialVersionUID = -4503919656873456924L;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

public class Date implements Serializable
{

    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("gregorian")
    @Expose
    private String gregorian;
    @SerializedName("hijri")
    @Expose
    private String hijri;
    private final static long serialVersionUID = 8111116930213935918L;

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getGregorian() {
        return gregorian;
    }

    public void setGregorian(String gregorian) {
        this.gregorian = gregorian;
    }

    public String getHijri() {
        return hijri;
    }

    public void setHijri(String hijri) {
        this.hijri = hijri;
    }

}

public class Datetime implements Serializable
{

    @SerializedName("times")
    @Expose
    private Times times;
    @SerializedName("date")
    @Expose
    private Date date;
    private final static long serialVersionUID = 7553188698401697970L;

    public Times getTimes() {
        return times;
    }

    public void setTimes(Times times) {
        this.times = times;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}

public class Location implements Serializable
{

    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("elevation")
    @Expose
    private Double elevation;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("local_offset")
    @Expose
    private Double localOffset;
    private final static long serialVersionUID = -5322045759438860903L;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getElevation() {
        return elevation;
    }

    public void setElevation(Double elevation) {
        this.elevation = elevation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Double getLocalOffset() {
        return localOffset;
    }

    public void setLocalOffset(Double localOffset) {
        this.localOffset = localOffset;
    }

}



public class Results implements Serializable
{

    @SerializedName("datetime")
    @Expose
    private List<Datetime> datetime = null;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("settings")
    @Expose
    private Settings settings;
    private final static long serialVersionUID = -8468088460101327305L;

    public List<Datetime> getDatetime() {
        return datetime;
    }

    public void setDatetime(List<Datetime> datetime) {
        this.datetime = datetime;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

}

public class Settings implements Serializable
{

    @SerializedName("timeformat")
    @Expose
    private String timeformat;
    @SerializedName("school")
    @Expose
    private String school;
    @SerializedName("juristic")
    @Expose
    private String juristic;
    @SerializedName("highlat")
    @Expose
    private String highlat;
    @SerializedName("fajr_angle")
    @Expose
    private Double fajrAngle;
    @SerializedName("isha_angle")
    @Expose
    private Double ishaAngle;
    private final static long serialVersionUID = -3406361689508358009L;

    public String getTimeformat() {
        return timeformat;
    }

    public void setTimeformat(String timeformat) {
        this.timeformat = timeformat;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getJuristic() {
        return juristic;
    }

    public void setJuristic(String juristic) {
        this.juristic = juristic;
    }

    public String getHighlat() {
        return highlat;
    }

    public void setHighlat(String highlat) {
        this.highlat = highlat;
    }

    public Double getFajrAngle() {
        return fajrAngle;
    }

    public void setFajrAngle(Double fajrAngle) {
        this.fajrAngle = fajrAngle;
    }

    public Double getIshaAngle() {
        return ishaAngle;
    }

    public void setIshaAngle(Double ishaAngle) {
        this.ishaAngle = ishaAngle;
    }

}

public class Times implements Serializable {

    @SerializedName("Imsak")
    @Expose
    private String imsak;
    @SerializedName("Sunrise")
    @Expose
    private String sunrise;
    @SerializedName("Fajr")
    @Expose
    private String fajr;
    @SerializedName("Dhuhr")
    @Expose
    private String dhuhr;
    @SerializedName("Asr")
    @Expose
    private String asr;
    @SerializedName("Sunset")
    @Expose
    private String sunset;
    @SerializedName("Maghrib")
    @Expose
    private String maghrib;
    @SerializedName("Isha")
    @Expose
    private String isha;
    @SerializedName("Midnight")
    @Expose
    private String midnight;
    private final static long serialVersionUID = 1448364548294877417L;

    public String getImsak() {
        return imsak;
    }

    public void setImsak(String imsak) {
        this.imsak = imsak;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getFajr() {
        return fajr;
    }

    public void setFajr(String fajr) {
        this.fajr = fajr;
    }

    public String getDhuhr() {
        return dhuhr;
    }

    public void setDhuhr(String dhuhr) {
        this.dhuhr = dhuhr;
    }

    public String getAsr() {
        return asr;
    }

    public void setAsr(String asr) {
        this.asr = asr;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getMaghrib() {
        return maghrib;
    }

    public void setMaghrib(String maghrib) {
        this.maghrib = maghrib;
    }

    public String getIsha() {
        return isha;
    }

    public void setIsha(String isha) {
        this.isha = isha;
    }

    public String getMidnight() {
        return midnight;
    }

    public void setMidnight(String midnight) {
        this.midnight = midnight;
    }
}
}
