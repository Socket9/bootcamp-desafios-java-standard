package ar.com.educacionit.bootcamp.entities;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"date",
"states",
"positive",
"negative",
"pending",
"hospitalizedCurrently",
"hospitalizedCumulative",
"inIcuCurrently",
"inIcuCumulative",
"onVentilatorCurrently",
"onVentilatorCumulative",
"dateChecked",
"death",
"hospitalized",
"totalTestResults",
"lastModified",
"recovered",
"total",
"posNeg",
"deathIncrease",
"hospitalizedIncrease",
"negativeIncrease",
"positiveIncrease",
"totalTestResultsIncrease",
"hash"
})
@Generated("jsonschema2pojo")
public class CovidDate extends Entity{

@JsonProperty("date")
private Integer date;
@JsonProperty("states")
private Integer states;
@JsonProperty("positive")
private Integer positive;
@JsonProperty("negative")
private Integer negative;
@JsonProperty("pending")
private Integer pending;
@JsonProperty("hospitalizedCurrently")
private Integer hospitalizedCurrently;
@JsonProperty("hospitalizedCumulative")
private Integer hospitalizedCumulative;
@JsonProperty("inIcuCurrently")
private Integer inIcuCurrently;
@JsonProperty("inIcuCumulative")
private Integer inIcuCumulative;
@JsonProperty("onVentilatorCurrently")
private Integer onVentilatorCurrently;
@JsonProperty("onVentilatorCumulative")
private Integer onVentilatorCumulative;
@JsonProperty("dateChecked")
private String dateChecked;
@JsonProperty("death")
private Integer death;
@JsonProperty("hospitalized")
private Integer hospitalized;
@JsonProperty("totalTestResults")
private Integer totalTestResults;
@JsonProperty("lastModified")
private String lastModified;
@JsonProperty("recovered")
private Object recovered;
@JsonProperty("total")
private Integer total;
@JsonProperty("posNeg")
private Integer posNeg;
@JsonProperty("deathIncrease")
private Integer deathIncrease;
@JsonProperty("hospitalizedIncrease")
private Integer hospitalizedIncrease;
@JsonProperty("negativeIncrease")
private Integer negativeIncrease;
@JsonProperty("positiveIncrease")
private Integer positiveIncrease;
@JsonProperty("totalTestResultsIncrease")
private Integer totalTestResultsIncrease;
@JsonProperty("hash")
private String hash;

/**
* No args constructor for use in serialization
*
*/
public CovidDate() {
}

/**
*
* @param date
* @param death
* @param totalTestResultsIncrease
* @param pending
* @param hospitalizedCurrently
* @param hospitalizedIncrease
* @param states
* @param onVentilatorCumulative
* @param hospitalized
* @param negative
* @param total
* @param hospitalizedCumulative
* @param inIcuCumulative
* @param negativeIncrease
* @param positiveIncrease
* @param deathIncrease
* @param totalTestResults
* @param inIcuCurrently
* @param dateChecked
* @param onVentilatorCurrently
* @param positive
* @param posNeg
* @param recovered
* @param lastModified
* @param hash
*/
public CovidDate(Integer date, Integer states, Integer positive, Integer negative, Integer pending, Integer hospitalizedCurrently, Integer hospitalizedCumulative, Integer inIcuCurrently, Integer inIcuCumulative, Integer onVentilatorCurrently, Integer onVentilatorCumulative, String dateChecked, Integer death, Integer hospitalized, Integer totalTestResults, String lastModified, Object recovered, Integer total, Integer posNeg, Integer deathIncrease, Integer hospitalizedIncrease, Integer negativeIncrease, Integer positiveIncrease, Integer totalTestResultsIncrease, String hash) {
super();
this.date = date;
this.states = states;
this.positive = positive;
this.negative = negative;
this.pending = pending;
this.hospitalizedCurrently = hospitalizedCurrently;
this.hospitalizedCumulative = hospitalizedCumulative;
this.inIcuCurrently = inIcuCurrently;
this.inIcuCumulative = inIcuCumulative;
this.onVentilatorCurrently = onVentilatorCurrently;
this.onVentilatorCumulative = onVentilatorCumulative;
this.dateChecked = dateChecked;
this.death = death;
this.hospitalized = hospitalized;
this.totalTestResults = totalTestResults;
this.lastModified = lastModified;
this.recovered = recovered;
this.total = total;
this.posNeg = posNeg;
this.deathIncrease = deathIncrease;
this.hospitalizedIncrease = hospitalizedIncrease;
this.negativeIncrease = negativeIncrease;
this.positiveIncrease = positiveIncrease;
this.totalTestResultsIncrease = totalTestResultsIncrease;
this.hash = hash;
}

@JsonProperty("date")
public Integer getDate() {
return date;
}

@JsonProperty("date")
public void setDate(Integer date) {
this.date = date;
}

@JsonProperty("states")
public Integer getStates() {
return states;
}

@JsonProperty("states")
public void setStates(Integer states) {
this.states = states;
}

@JsonProperty("positive")
public Integer getPositive() {
return positive;
}

@JsonProperty("positive")
public void setPositive(Integer positive) {
this.positive = positive;
}

@JsonProperty("negative")
public Integer getNegative() {
return negative;
}

@JsonProperty("negative")
public void setNegative(Integer negative) {
this.negative = negative;
}

@JsonProperty("pending")
public Integer getPending() {
return pending;
}

@JsonProperty("pending")
public void setPending(Integer pending) {
this.pending = pending;
}

@JsonProperty("hospitalizedCurrently")
public Integer getHospitalizedCurrently() {
return hospitalizedCurrently;
}

@JsonProperty("hospitalizedCurrently")
public void setHospitalizedCurrently(Integer hospitalizedCurrently) {
this.hospitalizedCurrently = hospitalizedCurrently;
}

@JsonProperty("hospitalizedCumulative")
public Integer getHospitalizedCumulative() {
return hospitalizedCumulative;
}

@JsonProperty("hospitalizedCumulative")
public void setHospitalizedCumulative(Integer hospitalizedCumulative) {
this.hospitalizedCumulative = hospitalizedCumulative;
}

@JsonProperty("inIcuCurrently")
public Integer getInIcuCurrently() {
return inIcuCurrently;
}

@JsonProperty("inIcuCurrently")
public void setInIcuCurrently(Integer inIcuCurrently) {
this.inIcuCurrently = inIcuCurrently;
}

@JsonProperty("inIcuCumulative")
public Integer getInIcuCumulative() {
return inIcuCumulative;
}

@JsonProperty("inIcuCumulative")
public void setInIcuCumulative(Integer inIcuCumulative) {
this.inIcuCumulative = inIcuCumulative;
}

@JsonProperty("onVentilatorCurrently")
public Integer getOnVentilatorCurrently() {
return onVentilatorCurrently;
}

@JsonProperty("onVentilatorCurrently")
public void setOnVentilatorCurrently(Integer onVentilatorCurrently) {
this.onVentilatorCurrently = onVentilatorCurrently;
}

@JsonProperty("onVentilatorCumulative")
public Integer getOnVentilatorCumulative() {
return onVentilatorCumulative;
}

@JsonProperty("onVentilatorCumulative")
public void setOnVentilatorCumulative(Integer onVentilatorCumulative) {
this.onVentilatorCumulative = onVentilatorCumulative;
}

@JsonProperty("dateChecked")
public String getDateChecked() {
return dateChecked;
}

@JsonProperty("dateChecked")
public void setDateChecked(String dateChecked) {
this.dateChecked = dateChecked;
}

@JsonProperty("death")
public Integer getDeath() {
return death;
}

@JsonProperty("death")
public void setDeath(Integer death) {
this.death = death;
}

@JsonProperty("hospitalized")
public Integer getHospitalized() {
return hospitalized;
}

@JsonProperty("hospitalized")
public void setHospitalized(Integer hospitalized) {
this.hospitalized = hospitalized;
}

@JsonProperty("totalTestResults")
public Integer getTotalTestResults() {
return totalTestResults;
}

@JsonProperty("totalTestResults")
public void setTotalTestResults(Integer totalTestResults) {
this.totalTestResults = totalTestResults;
}

@JsonProperty("lastModified")
public String getLastModified() {
return lastModified;
}

@JsonProperty("lastModified")
public void setLastModified(String lastModified) {
this.lastModified = lastModified;
}

@JsonProperty("recovered")
public Object getRecovered() {
return recovered;
}

@JsonProperty("recovered")
public void setRecovered(Object recovered) {
this.recovered = recovered;
}

@JsonProperty("total")
public Integer getTotal() {
return total;
}

@JsonProperty("total")
public void setTotal(Integer total) {
this.total = total;
}

@JsonProperty("posNeg")
public Integer getPosNeg() {
return posNeg;
}

@JsonProperty("posNeg")
public void setPosNeg(Integer posNeg) {
this.posNeg = posNeg;
}

@JsonProperty("deathIncrease")
public Integer getDeathIncrease() {
return deathIncrease;
}

@JsonProperty("deathIncrease")
public void setDeathIncrease(Integer deathIncrease) {
this.deathIncrease = deathIncrease;
}

@JsonProperty("hospitalizedIncrease")
public Integer getHospitalizedIncrease() {
return hospitalizedIncrease;
}

@JsonProperty("hospitalizedIncrease")
public void setHospitalizedIncrease(Integer hospitalizedIncrease) {
this.hospitalizedIncrease = hospitalizedIncrease;
}

@JsonProperty("negativeIncrease")
public Integer getNegativeIncrease() {
return negativeIncrease;
}

@JsonProperty("negativeIncrease")
public void setNegativeIncrease(Integer negativeIncrease) {
this.negativeIncrease = negativeIncrease;
}

@JsonProperty("positiveIncrease")
public Integer getPositiveIncrease() {
return positiveIncrease;
}

@JsonProperty("positiveIncrease")
public void setPositiveIncrease(Integer positiveIncrease) {
this.positiveIncrease = positiveIncrease;
}

@JsonProperty("totalTestResultsIncrease")
public Integer getTotalTestResultsIncrease() {
return totalTestResultsIncrease;
}

@JsonProperty("totalTestResultsIncrease")
public void setTotalTestResultsIncrease(Integer totalTestResultsIncrease) {
this.totalTestResultsIncrease = totalTestResultsIncrease;
}

@JsonProperty("hash")
public String getHash() {
return hash;
}

@JsonProperty("hash")
public void setHash(String hash) {
this.hash = hash;
}

}