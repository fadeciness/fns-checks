package ru.fadeciness.fnschecks.dto.check.ver2;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("Предмет расчета")
public class ItemDto {

    @ApiModelProperty("Цена за единицу предмета расчета с учетом скидок и наценок")
    private Long price;

    @ApiModelProperty("Количество предмета расчета")
    private Long quantity;

    @ApiModelProperty("Ставка НДС")
    private Long nds;

    @ApiModelProperty("Стоимость предмета расчета с учетом скидок и наценок")
    private Long sum;

    @ApiModelProperty("Наименование предмета расчета")
    private String name;

    @ApiModelProperty("Признак способа расчета")
    private Long paymentType;

    @ApiModelProperty("ИНН поставщика")
    private String providerInn;

    @ApiModelProperty("Признак предмета расчета")
    private Long productType;

    @ApiModelProperty("Признак агента по предмету расчета")
    private Long paymentAgentByProductType;

    @ApiModelProperty("Единица измерения предмета расчета")
    private String unit;

    @ApiModelProperty("Код страны происхождения товара")
    private String originCountryCode;

    @ApiModelProperty("Номер таможенной декларации")
    private String customEntryNum;

    @ApiModelProperty("Размер НДС за единицу предмета расчета")
    private Long unitNds;

    @ApiModelProperty("Акциз")
    private Long exciseDuty;

    @ApiModelProperty("Сумма НДС за предмет расчета")
    private Long ndsSum;

    @ApiModelProperty("Дополнительный реквизит предмета расчета")
    private String propertiesItem;

    @ApiModelProperty("Код товара")
    private String productCode;

    private PaymentAgentDataDto paymentAgentData;

    private ProviderDataDto providerData;

}
