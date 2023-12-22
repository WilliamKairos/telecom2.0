package com.telecommunications.controller;

import com.telecommunications.service.EncodeService;
import com.telecommunications.service.IncomeService;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("output")
public class OutputController {

    private final EncodeService encodeService;

    private final IncomeService incomeService;

    public OutputController(EncodeService encodeService, IncomeService incomeService) {
        this.encodeService = encodeService;
        this.incomeService = incomeService;
    }

    public ResponseEntity<ByteArrayResource> exportTableAsTxt(Class<?> entityClass) {
        List<?> entities = encodeService.getAll(entityClass);

        // 将实体列表转换为文本内容
        StringBuilder txtContent = new StringBuilder();
        for (Object entity : entities) {
            txtContent.append(entity.toString()).append("\n");
        }

        // 设置文件名和内容类型
        String tableName = entityClass.getSimpleName();
        String filename = tableName + ".txt";
        MediaType mediaType = MediaType.TEXT_PLAIN;

        // 创建Resource对象，用于返回文件内容
        ByteArrayResource resource = new ByteArrayResource(txtContent.toString().getBytes());

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename)
                .contentType(mediaType)
                .body(resource);
    }

}
