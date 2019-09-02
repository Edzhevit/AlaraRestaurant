package alararestaurant.domain.dtos.json;

import java.math.BigDecimal;

public class ItemImportDto {

    private String name;
    private BigDecimal price;
    private String category;

    public ItemImportDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
