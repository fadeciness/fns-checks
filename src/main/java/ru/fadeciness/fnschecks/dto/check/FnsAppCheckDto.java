package ru.fadeciness.fnschecks.dto.check;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Timestamp;

@Data
@ApiModel("Чек выгруженный из приложения 'Проверка чека'")
public class FnsAppCheckDto {

    private TicketDto ticket;
    private Timestamp createdAt;
    private Timestamp timeLastAccess;

}
