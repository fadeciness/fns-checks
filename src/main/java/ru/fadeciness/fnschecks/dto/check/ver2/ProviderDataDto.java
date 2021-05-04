package ru.fadeciness.fnschecks.dto.check.ver2;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel("Данные поставщика")
public class ProviderDataDto {

    @ApiModelProperty("Телефон поставщика")
    private List<String> providerPhone;

    @ApiModelProperty("Наименование поставщика")
    private String providerName;

}
