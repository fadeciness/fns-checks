package ru.fadeciness.fnschecks.entity.ver2;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "receipts")
public class ReceiptEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "purchase_date")
    private LocalDateTime dateTime;

    @Column(name = "operation_type")
    private Long operationType;

    @Column(name = "total_sum")
    private Long totalSum;

    @Column(name = "fiscal_document_number")
    private Long fiscalDocumentNumber;

    @Column(name = "fiscal_drive_number")
    private String fiscalDriveNumber;

    @Column(name = "fiscal_sign")
    private Long fiscalSign;

    @OneToMany
    private List<ItemEntity> items;

}
