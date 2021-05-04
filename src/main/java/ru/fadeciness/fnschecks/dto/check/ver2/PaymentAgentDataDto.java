package ru.fadeciness.fnschecks.dto.check.ver2;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel("Данные агента")
public class PaymentAgentDataDto {

    @ApiModelProperty("Телефон оператора перевода")
    private List<String> transferOperatorPhone;

    @ApiModelProperty("Операция платежного агента")
    private String paymentAgentOperation;

    @ApiModelProperty("Телефон платежного агента")
    private List<String> paymentAgentPhone;

    @ApiModelProperty("Телефон оператора по приему платежей")
    private List<String> paymentOperatorPhone;

    @ApiModelProperty("Наименование оператора перевода")
    private String transferOperatorName;

    @ApiModelProperty("Адрес оператора перевода")
    private String transferOperatorAddress;

    @ApiModelProperty("ИНН оператора перевода")
    private String transferOperatorInn;

}
