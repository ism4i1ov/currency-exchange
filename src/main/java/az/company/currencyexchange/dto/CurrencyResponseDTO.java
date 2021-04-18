package az.company.currencyexchange.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyResponseDTO {
    private String result;
    private String documentation;
    @JsonProperty("terms_of_use")
    private String termsOfUse;
    @JsonProperty("time_last_update_unix")
    private Integer timeLastUnix;
    @JsonProperty("time_last_update_utc")
    private String timeLastUtc;
    @JsonProperty("time_next_update_unix")
    private Integer timeNextUnix;
    @JsonProperty("time_next_update_utc")
    private String timeNextUtc;
    @JsonProperty("base_code")
    private String baseCode;
    @JsonProperty("target_code")
    private String targetCode;
    @JsonProperty("conversion_rate")
    private BigDecimal conversionRate;
    @JsonProperty("conversion_result")
    private BigDecimal conversionResult;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getTermsOfUse() {
        return termsOfUse;
    }

    public void setTermsOfUse(String termsOfUse) {
        this.termsOfUse = termsOfUse;
    }

    public Integer getTimeLastUnix() {
        return timeLastUnix;
    }

    public void setTimeLastUnix(Integer timeLastUnix) {
        this.timeLastUnix = timeLastUnix;
    }

    public String getTimeLastUtc() {
        return timeLastUtc;
    }

    public void setTimeLastUtc(String timeLastUtc) {
        this.timeLastUtc = timeLastUtc;
    }

    public Integer getTimeNextUnix() {
        return timeNextUnix;
    }

    public void setTimeNextUnix(Integer timeNextUnix) {
        this.timeNextUnix = timeNextUnix;
    }

    public String getTimeNextUtc() {
        return timeNextUtc;
    }

    public void setTimeNextUtc(String timeNextUtc) {
        this.timeNextUtc = timeNextUtc;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

    public BigDecimal getConversionResult() {
        return conversionResult;
    }

    public void setConversionResult(BigDecimal conversionResult) {
        this.conversionResult = conversionResult;
    }
}
