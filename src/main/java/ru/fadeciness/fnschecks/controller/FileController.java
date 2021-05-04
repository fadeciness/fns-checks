package ru.fadeciness.fnschecks.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fadeciness.fnschecks.dto.check.FnsAppCheckDto;

import java.util.List;

@RestController
@RequestMapping("/api/v1/file")
@Slf4j
public class FileController {

    @PostMapping
    @ApiOperation("Загрузка файла с чеками")
    public ResponseEntity<Object> upload(@RequestBody List<FnsAppCheckDto> checks) {
        for (FnsAppCheckDto check : checks) {
            log.info(check.toString());
        }
        return ResponseEntity.ok().build();
    }

}
