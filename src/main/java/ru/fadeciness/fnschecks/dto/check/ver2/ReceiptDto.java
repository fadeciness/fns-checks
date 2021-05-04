package ru.fadeciness.fnschecks.dto.check.ver2;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
@ApiModel("Кассовый чек")
public class ReceiptDto {

    private Long code;

    @ApiModelProperty(value = "Номер версии ФФД")
    private Long fiscalDocumentFormatVer;

    @ApiModelProperty(value = "Номер чека за смену")
    private Long requestNumber;

    @ApiModelProperty(value = "Дата, время совершения покупки")
    private Timestamp dateTime;

    @ApiModelProperty(value = "Номер смены")
    private Long shiftNumber;

    @ApiModelProperty(value = "Признак расчета")
    private Long operationType;

    @ApiModelProperty(value = "Применяемая система налогообложения")
    private Long appliedTaxationType;

    @ApiModelProperty(value = "Регистрационный номер ККТ")
    private String kktRegId;

    @ApiModelProperty(value = "Сумма расчета, указанного в чеке (БСО)")
    private Long totalSum;

    @ApiModelProperty(value = "Сумма по чеку (БСО) наличными")
    private Long cashTotalSum;

    @ApiModelProperty(value = "Сумма по чеку (БСО) безналичными")
    private Long ecashTotalSum;

    @ApiModelProperty(value = "Сумма по чеку (БСО) предоплатой (зачетом аванса и (или) предыдущих платежей)")
    private Long prepaidSum;

    @ApiModelProperty(value = "Сумма по чеку (БСО) постоплатой (в кредит)")
    private Long creditSum;

    @ApiModelProperty(value = "Сумма по чеку (БСО) встречным предоставлением")
    private Long provisionSum;

    @ApiModelProperty(value = "Номер ФД")
    private Long fiscalDocumentNumber;

    @ApiModelProperty(value = "Номер ФН")
    private String fiscalDriveNumber;

    @ApiModelProperty(value = "Фискальный признак документа")
    private Long fiscalSign;

    @ApiModelProperty(value = "Фискальный признак сообщения для оператора фискальных данных")
    private Long messageFiscalSign;

    @ApiModelProperty(value = "Бинарное представление документа")
    private String rawData;

    private List<ItemDto> items;

    @ApiModelProperty(value = "Наименование пользователя")
    private String user;

    @ApiModelProperty(value = "ИНН пользователя")
    private String userInn;

    @ApiModelProperty(value = "Покупатель (клиент)")
    private String buyer;

    @ApiModelProperty(value = "ИНН покупателя (клиента)")
    private String buyerInn;

    @ApiModelProperty(value = "ИНН кассира")
    private String operatorInn;

    @ApiModelProperty(value = "Признак ККТ для расчетов только в Интернет")
    private Long internetSign;

    @ApiModelProperty(value = "Адрес электронной почты отправителя чека")
    private String sellerAddress;

    @ApiModelProperty(value = "Телефон или электронный адрес покупателя")
    private String buyerPhoneOrAddress;

    @ApiModelProperty(value = "Признак агента")
    private Long paymentAgentType;

    @ApiModelProperty(value = "Телефон оператора перевода")
    private List<String> transferOperatorPhone;

    @ApiModelProperty(value = "Операция платежного агента")
    private String paymentAgentOperation;

    @ApiModelProperty(value = "Телефон платежного агента")
    private List<String> paymentAgentPhone;

    @ApiModelProperty(value = "Телефон оператора по приему платежей")
    private List<String> paymentOperatorPhone;

    @ApiModelProperty(value = "Наименование оператора перевода")
    private String transferOperatorName;

    @ApiModelProperty(value = "Адрес оператора перевода")
    private String transferOperatorAddress;

    @ApiModelProperty(value = "ИНН оператора перевода")
    private String transferOperatorInn;

    @ApiModelProperty(value = "Телефон поставщика")
    private List<String> providerPhone;

    @ApiModelProperty(value = "Адрес сайта ФНС")
    private String fnsUrl;

    @ApiModelProperty(value = "Дополнительный реквизит чека (БСО)")
    private String propertiesData;

    @ApiModelProperty(value = "Номер автомата")
    private String machineNumber;

    @ApiModelProperty(value = "Адрес расчетов")
    private String retailPlaceAddress;

    @ApiModelProperty(value = "Место расчетов")
    private String retailPlace;

    @ApiModelProperty(value = "Кассир")
    private String operator;

    @ApiModelProperty(value = "Сумма НДС чека по ставке 20%")
    private Long nds18;

    @ApiModelProperty(value = "Сумма НДС чека по ставке 10%")
    private Long nds10;

    @ApiModelProperty(value = "Сумма расчета по чеку с НДС по ставке 0%")
    private Long nds0;

    @ApiModelProperty(value = "Сумма расчета по чеку без НДС")
    private Long ndsNo;

    @ApiModelProperty(value = "Сумма НДС чека по расч. ставке 20/120")
    private Long nds18118;

    @ApiModelProperty(value = "Сумма НДС чека по расч. ставке 10/110")
    private Long nds10110;

    private PropertiesDto properties;

}