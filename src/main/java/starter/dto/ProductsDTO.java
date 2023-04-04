package starter.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class ProductsDTO {

    @JsonProperty("provider")
    private String provider;

    @JsonProperty("title")
    private String title;

    @JsonProperty("url")
    private String url;

    @JsonProperty("brand")
    private String brand;

    @JsonProperty("price")
    private int price;

    @JsonProperty("unit")
    private String unit;

    @JsonProperty("isPromo")
    private boolean isPromo;

    @JsonProperty("promoDetails")
    private String promoDetails;

    @JsonProperty("image")
    private String image;
}