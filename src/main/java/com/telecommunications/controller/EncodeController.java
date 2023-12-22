package com.telecommunications.controller;

import com.telecommunications.pojo.encode.*;
import com.telecommunications.service.EncodeService;
import com.telecommunications.utils.Result;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/encode")
public class EncodeController {

    private final EncodeService encodeService;

    public EncodeController(EncodeService encodeService) {
        this.encodeService = encodeService;
    }

    @PostMapping("/add/billing")
    public ResponseEntity<Result> addBilling(@RequestBody BillingType billingType){
        return handleEncodeOperation(billingType, HttpMethod.POST);
    }

    @DeleteMapping("/delete/billing")
    public ResponseEntity<Result> deleteBilling(@RequestBody BillingType billingType){
        return handleEncodeOperation(billingType, HttpMethod.DELETE);
    }

    @PutMapping("/update/billing")
    public ResponseEntity<Result> updateBilling(@RequestBody BillingType billingType){
        return handleEncodeOperation(billingType, HttpMethod.PUT);
    }

    // SettlementType Controller
    @PostMapping("/add/settlement_type")
    public ResponseEntity<Result> addSettlementType(@RequestBody SettlementType settlementType) {
        return handleEncodeOperation(settlementType, HttpMethod.POST);
    }

    @DeleteMapping("/delete/settlement_type")
    public ResponseEntity<Result> deleteSettlementType(@RequestBody SettlementType settlementType) {
        return handleEncodeOperation(settlementType, HttpMethod.DELETE);
    }

    @PutMapping("/update/settlement_type")
    public ResponseEntity<Result> updateSettlementType(@RequestBody SettlementType settlementType) {
        return handleEncodeOperation(settlementType, HttpMethod.PUT);
    }

    // SettlementOperator Controller
    @PostMapping("/add/settlement_operator")
    public ResponseEntity<Result> addSettlementOperator(@RequestBody SettlementOperator settlementOperator) {
        return handleEncodeOperation(settlementOperator, HttpMethod.POST);
    }

    @DeleteMapping("/delete/settlement_operator")
    public ResponseEntity<Result> deleteSettlementOperator(@RequestBody SettlementOperator settlementOperator) {
        return handleEncodeOperation(settlementOperator, HttpMethod.DELETE);
    }

    @PutMapping("/update/settlement_operator")
    public ResponseEntity<Result> updateSettlementOperator(@RequestBody SettlementOperator settlementOperator) {
        return handleEncodeOperation(settlementOperator, HttpMethod.PUT);
    }

    // ReceiptPurpose Controller
    @PostMapping("/add/receipt_purpose")
    public ResponseEntity<Result> addReceiptPurpose(@RequestBody ReceiptPurpose receiptPurpose) {
        return handleEncodeOperation(receiptPurpose, HttpMethod.POST);
    }

    @DeleteMapping("/delete/receipt_purpose")
    public ResponseEntity<Result> deleteReceiptPurpose(@RequestBody ReceiptPurpose receiptPurpose) {
        return handleEncodeOperation(receiptPurpose, HttpMethod.DELETE);
    }

    @PutMapping("/update/receipt_purpose")
    public ResponseEntity<Result> updateReceiptPurpose(@RequestBody ReceiptPurpose receiptPurpose) {
        return handleEncodeOperation(receiptPurpose, HttpMethod.PUT);
    }

    // ProductNotificationRelationship Controller
    @PostMapping("/add/product_notification_relationship")
    public ResponseEntity<Result> addProductNotificationRelationship(@RequestBody ProductNotificationRelationship productNotificationRelationship) {
        return handleEncodeOperation(productNotificationRelationship, HttpMethod.POST);
    }

    @DeleteMapping("/delete/product_notification_relationship")
    public ResponseEntity<Result> deleteProductNotificationRelationship(@RequestBody ProductNotificationRelationship productNotificationRelationship) {
        return handleEncodeOperation(productNotificationRelationship, HttpMethod.DELETE);
    }

    @PutMapping("/update/product_notification_relationship")
    public ResponseEntity<Result> updateProductNotificationRelationship(@RequestBody ProductNotificationRelationship productNotificationRelationship) {
        return handleEncodeOperation(productNotificationRelationship, HttpMethod.PUT);
    }

    // ProductBillingRelationship Controller
    @PostMapping("/add/product_billing_relationship")
    public ResponseEntity<Result> addProductBillingRelationship(@RequestBody ProductBillingRelationship productBillingRelationship) {
        return handleEncodeOperation(productBillingRelationship, HttpMethod.POST);
    }

    @DeleteMapping("/delete/product_billing_relationship")
    public ResponseEntity<Result> deleteProductBillingRelationship(@RequestBody ProductBillingRelationship productBillingRelationship) {
        return handleEncodeOperation(productBillingRelationship, HttpMethod.DELETE);
    }

    @PutMapping("/update/product_billing_relationship")
    public ResponseEntity<Result> updateProductBillingRelationship(@RequestBody ProductBillingRelationship productBillingRelationship) {
        return handleEncodeOperation(productBillingRelationship, HttpMethod.PUT);
    }

    // ProductNotificationType Controller
    @PostMapping("/add/notification_Type")
    public ResponseEntity<Result> addProductNotificationType(@RequestBody NotificationType NotificationType) {
        return handleEncodeOperation(NotificationType, HttpMethod.POST);
    }

    @DeleteMapping("/delete/notification_Type")
    public ResponseEntity<Result> deleteProductNotificationType(@RequestBody NotificationType NotificationType) {
        return handleEncodeOperation(NotificationType, HttpMethod.DELETE);
    }

    @PutMapping("/update/notification_Type")
    public ResponseEntity<Result> updateProductNotificationType(@RequestBody NotificationType NotificationType) {
        return handleEncodeOperation(NotificationType, HttpMethod.PUT);
    }

    // City Controller
    @PostMapping("/add/city")
    public ResponseEntity<Result> addCity(@RequestBody City city) {
        return handleEncodeOperation(city, HttpMethod.POST);
    }

    @DeleteMapping("/delete/city")
    public ResponseEntity<Result> deleteCity(@RequestBody City city) {
        return handleEncodeOperation(city, HttpMethod.DELETE);
    }

    @PutMapping("/update/city")
    public ResponseEntity<Result> updateCity(@RequestBody City city) {
        return handleEncodeOperation(city, HttpMethod.PUT);
    }

    // Product Controller
    @PostMapping("/add/product")
    public ResponseEntity<Result> addProduct(@RequestBody Product product) {
        return handleEncodeOperation(product, HttpMethod.POST);
    }

    @DeleteMapping("/delete/product")
    public ResponseEntity<Result> deleteProduct(@RequestBody Product product) {
        return handleEncodeOperation(product, HttpMethod.DELETE);
    }

    @PutMapping("/update/product")
    public ResponseEntity<Result> updateProduct(@RequestBody Product product) {
        return handleEncodeOperation(product, HttpMethod.PUT);
    }

    // CancellationType Controller
    @PostMapping("/add/cancellation_type")
    public ResponseEntity<Result> addCancellationType(@RequestBody CancellationType cancellationType) {
        return handleEncodeOperation(cancellationType, HttpMethod.POST);
    }

    @DeleteMapping("/delete/cancellation_type")
    public ResponseEntity<Result> deleteCancellationType(@RequestBody CancellationType cancellationType) {
        return handleEncodeOperation(cancellationType, HttpMethod.DELETE);
    }

    @PutMapping("/update/cancellation_type")
    public ResponseEntity<Result> updateCancellationType(@RequestBody CancellationType cancellationType) {
        return handleEncodeOperation(cancellationType, HttpMethod.PUT);
    }


    @GetMapping("/get_all")
    public ResponseEntity<Result> getAll(@RequestParam String entityType){
        Class<?> entityClass = getClassForEntityType(entityType);
        if (entityClass != null){
            List<?> data = encodeService.getAll(entityClass);
            System.out.println(data);
            if (data == null) {
                return new ResponseEntity<>(new Result(401, "未查询到相关信息", null), HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(new Result(200, "更新成功",data ), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(new Result(400, "参数错误", null ), HttpStatus.BAD_REQUEST);
        }
    }

    // 通用方法用于添加、删除和更新
    private ResponseEntity<Result> handleEncodeOperation(Object encode, HttpMethod httpMethod) {
        int flag = -1;
        if (httpMethod == HttpMethod.POST) {
            flag = encodeService.addEncode(encode);
        } else if (httpMethod == HttpMethod.DELETE) {
            flag = encodeService.deleteEncode(encode);
        } else if (httpMethod == HttpMethod.PUT) {
            flag = encodeService.updateEncode(encode);
        }

        if (flag == -1) {
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        } else if (flag == 0) {
            return new ResponseEntity<>(new Result(401, httpMethod == HttpMethod.POST ? "加入失败" :
                    httpMethod == HttpMethod.DELETE ? "删除失败" : "更新失败", "请重新检查数据"), HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(new Result(200, httpMethod == HttpMethod.POST ? "加入成功" :
                    httpMethod == HttpMethod.DELETE ? "删除成功" : "更新成功", encode), HttpStatus.OK);
        }
    }


//    // 辅助方法，根据字符串实体类型返回对应的 Class 对象
//    private Class<?> getClassForEntityType(String entityType) {
//        return switch (entityType) {
//            case "BillingType" -> BillingType.class;
//            case "CancellationType" -> CancellationType.class;
//            case "City" -> City.class;
//            case "Product" -> Product.class;
//            case "NotificationType" -> NotificationType.class;
//            case "ReceiptPurpose" -> ReceiptPurpose.class;
//            case "SettlementOperator" -> SettlementOperator.class;
//            case "SettlementType" -> SettlementType.class;
//            default -> null;
//        };
//    }

    private Class<?> getClassForEntityType(String entityType) {
        Class<?> entityClass = null;

        switch (entityType) {
            case "BillingType":
                entityClass = BillingType.class;
                break;
            case "CancellationType":
                entityClass = CancellationType.class;
                break;
            case "City":
                entityClass = City.class;
                break;
            case "Product":
                entityClass = Product.class;
                break;
            case "NotificationType":
                entityClass = NotificationType.class;
                break;
            case "ReceiptPurpose":
                entityClass = ReceiptPurpose.class;
                break;
            case "SettlementOperator":
                entityClass = SettlementOperator.class;
                break;
            case "SettlementType":
                entityClass = SettlementType.class;
                break;
        }

        return entityClass;
    }

}
