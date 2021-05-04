package ru.fadeciness.fnschecks.dto.check.ver2;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("Дополнительный реквизит пользователя")
public class PropertiesDto {

    @ApiModelProperty("Наименование дополнительного реквизита пользователя")
    private String propertyName;

    @ApiModelProperty("Значение дополнительного реквизита пользователя")
    private String propertyValue;

}
