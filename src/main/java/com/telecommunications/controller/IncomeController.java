package com.telecommunications.controller;

import com.telecommunications.pojo.income.*;
import com.telecommunications.service.IncomeService;
import com.telecommunications.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/income")
public class IncomeController {
    private final IncomeService incomeService;

    @Autowired
    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    @PostMapping("/data_entry/add/billing")
    public ResponseEntity<Result> DataEntryAddBilling(@RequestBody BillingIncome billingIncome){
        int flag = incomeService.addIncome(billingIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "加入失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "加入成功", billingIncome), HttpStatus.OK);
        }
    };

    @PostMapping("/data_entry/add/card_sales")
    public ResponseEntity<Result> DataEntryAddCardSales(@RequestBody CardSalesIncome cardSalesIncome){
        int flag = incomeService.addIncome(cardSalesIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "加入失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "加入成功", cardSalesIncome), HttpStatus.OK);
        }
    };

    @PostMapping("/data_entry/add/intercompany")
    public ResponseEntity<Result> DataEntryAddIntercompany(@RequestBody IntercompanySettlementIncome intercompanySettlementIncome){
        int flag = incomeService.addIncome(intercompanySettlementIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "加入失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "加入成功", intercompanySettlementIncome), HttpStatus.OK);
        }
    };

    @PostMapping("/data_entry/add/notification")
    public ResponseEntity<Result> DataEntryAddNotification(@RequestBody NotificationIncome notificationIncome){
        int flag = incomeService.addIncome(notificationIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "加入失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "加入成功", notificationIncome), HttpStatus.OK);
        }
    };

    @PostMapping("/data_entry/add/prepaid_conversion")
    public ResponseEntity<Result> DataEntryAddPrepaidConversion(@RequestBody PrepaidConversionIncome prepaidConversionIncome){
        int flag = incomeService.addIncome(prepaidConversionIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "加入失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "加入成功", prepaidConversionIncome), HttpStatus.OK);
        }
    };


    @PostMapping("/data_entry/addBatch/billing")
    public ResponseEntity<Result> DataEntryAddBatchBilling(@RequestBody List<BillingIncome> billingIncomeList){
        System.out.println(billingIncomeList);
        int flag = incomeService.addBatch(billingIncomeList, BillingIncome.class);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "加入失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "加入成功", billingIncomeList), HttpStatus.OK);
        }
    };

    @DeleteMapping("/data_entry/delete/billing")
    public ResponseEntity<Result> DataEntryDeleteBilling(@RequestBody BillingIncome billingIncome){
        int flag = incomeService.deleteIncome(billingIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "删除失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "删除成功", billingIncome), HttpStatus.OK);
        }
    };

    @DeleteMapping("/data_entry/delete/card_sales")
    public ResponseEntity<Result> DataEntryDeleteCardSales(@RequestBody CardSalesIncome cardSalesIncome){
        int flag = incomeService.deleteIncome(cardSalesIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "删除失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "删除成功", cardSalesIncome), HttpStatus.OK);
        }
    };

    @DeleteMapping("/data_entry/delete/intercompany")
    public ResponseEntity<Result> DataEntryDeleteIntercompany(@RequestBody IntercompanySettlementIncome intercompanySettlementIncome){
        int flag = incomeService.deleteIncome(intercompanySettlementIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "删除失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "删除成功", intercompanySettlementIncome), HttpStatus.OK);
        }
    };

    @DeleteMapping("/data_entry/delete/notification")
    public ResponseEntity<Result> DataEntryDeleteNotification(@RequestBody NotificationIncome notificationIncome){
        int flag = incomeService.deleteIncome(notificationIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "删除失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "删除成功", notificationIncome), HttpStatus.OK);
        }
    };

    @DeleteMapping("/data_entry/delete/prepaid_conversion")
    public ResponseEntity<Result> DataEntryDeletePrepaidConversion(@RequestBody PrepaidConversionIncome prepaidConversionIncome){
        int flag = incomeService.deleteIncome(prepaidConversionIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "删除失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "删除成功", prepaidConversionIncome), HttpStatus.OK);
        }
    };


    @PutMapping("/data_entry/update/billing")
    public ResponseEntity<Result> DataEntryUpdateBilling(@RequestBody BillingIncome billingIncome){
        System.out.println(billingIncome);
        billingIncome.setAuditStatus("Pending");
        System.out.println(billingIncome);
        int flag = incomeService.updateIncome(billingIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "更新失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "更新成功", billingIncome), HttpStatus.OK);
        }
    };
    @PutMapping("/data_entry/update/card_sales")
    public ResponseEntity<Result> DataEntryUpdateCardSales(@RequestBody CardSalesIncome cardSalesIncome){
        int flag = incomeService.updateIncome(cardSalesIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "更新失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "更新成功", cardSalesIncome), HttpStatus.OK);
        }
    };
    @PutMapping("/data_entry/update/intercompany")
    public ResponseEntity<Result> DataEntryUpdateIntercompany(@RequestBody IntercompanySettlementIncome intercompanySettlementIncome){
        int flag = incomeService.updateIncome(intercompanySettlementIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "更新失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "更新成功", intercompanySettlementIncome), HttpStatus.OK);
        }
    };
    @PutMapping("/data_entry/update/notification")
    public ResponseEntity<Result> DataEntryUpdateNotification(@RequestBody NotificationIncome notificationIncome){
        int flag = incomeService.updateIncome(notificationIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "更新失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "更新成功", notificationIncome), HttpStatus.OK);
        }
    };
    @PutMapping("/data_entry/update/prepaid_conversion")
    public ResponseEntity<Result> DataEntryUpdatePrepaidConversion(@RequestBody PrepaidConversionIncome prepaidConversionIncome){
        int flag = incomeService.updateIncome(prepaidConversionIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "更新失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "更新成功", prepaidConversionIncome), HttpStatus.OK);
        }
    };

    @GetMapping("/get_all")
    public ResponseEntity<Result> getAll(@RequestParam String entityType){
        Class<?> entityClass = getClassForEntityType(entityType);
        if (entityClass != null){
            List<?> data = incomeService.getAll(entityClass);
            if (data == null) {
                return new ResponseEntity<>(new Result(401, "未查询到相关信息", null), HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(new Result(200, "更新成功",data ), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(new Result(400, "参数错误", null ), HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping("/find/by_city")
    public ResponseEntity<Result> findByCity(@RequestParam String entityType, @RequestParam String name){
        System.out.println(entityType);
        System.out.println(name);
        Class<?> entityClass = getClassForEntityType(entityType);
        if (entityClass != null){
            List<?> data = incomeService.findByCity(name, entityClass);
            if (data == null) {
                return new ResponseEntity<>(new Result(401, "未查询到相关信息", null), HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(new Result(200, "更新成功",data ), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(new Result(400, "参数错误", null ), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/find/by_product")
    public ResponseEntity<Result> findByProduct(@RequestParam String entityType, @RequestParam String name){
        System.out.println(entityType);
        System.out.println(name);
        Class<?> entityClass = getClassForEntityType(entityType);
        if (entityClass != null){
            List<?> data = incomeService.findByProduct(name, entityClass);
            if (data == null) {
                return new ResponseEntity<>(new Result(401, "未查询到相关信息", null), HttpStatus.NOT_FOUND);
            }
            System.out.println("success");
            System.out.println(data);
            return new ResponseEntity<>(new Result(200, "更新成功",data ), HttpStatus.OK);
        }else {
            System.out.println("bad_request");
            return new ResponseEntity<>(new Result(400, "参数错误", null ), HttpStatus.BAD_REQUEST);
        }
    }

    // 辅助方法，根据字符串实体类型返回对应的 Class 对象
//    private Class<?> getClassForEntityType(String entityType) {
//        return switch (entityType) {
//            case "BillingIncome" -> BillingIncome.class;
//            case "CardSalesIncome" -> CardSalesIncome.class;
//            case "IntercompanySettlementIncome" -> IntercompanySettlementIncome.class;
//            case "NotificationIncome" -> NotificationIncome.class;
//            case "PrepaidConversionIncome" -> PrepaidConversionIncome.class;
//            default -> null;
//        };
//    }

    private Class<?> getClassForEntityType(String entityType) {
        Class<?> entityClass = null;

        switch (entityType) {
            case "BillingIncome":
                entityClass = BillingIncome.class;
                break;
            case "CardSalesIncome":
                entityClass = CardSalesIncome.class;
                break;
            case "IntercompanySettlementIncome":
                entityClass = IntercompanySettlementIncome.class;
                break;
            case "NotificationIncome":
                entityClass = NotificationIncome.class;
                break;
            case "PrepaidConversionIncome":
                entityClass = PrepaidConversionIncome.class;
                break;
            default:
                break;
        }

        return entityClass;
    }


    @PutMapping("/update_audit/billing")
    public ResponseEntity<Result> DataEntryUpdateAuditBilling(@RequestBody BillingIncome billingIncome){
        int flag = incomeService.updateAuditStatus(billingIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "更新失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "更新成功", billingIncome), HttpStatus.OK);
        }
    };
    @PutMapping("/update_audit/card_sales")
    public ResponseEntity<Result> DataEntryUpdateAuditCardSales(@RequestBody CardSalesIncome cardSalesIncome){
        int flag = incomeService.updateAuditStatus(cardSalesIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "更新失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "更新成功", cardSalesIncome), HttpStatus.OK);
        }
    };
    @PutMapping("/update_audit/intercompany")
    public ResponseEntity<Result> DataEntryUpdateAuditIntercompany(@RequestBody IntercompanySettlementIncome intercompanySettlementIncome){
        int flag = incomeService.updateAuditStatus(intercompanySettlementIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "更新失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "更新成功", intercompanySettlementIncome), HttpStatus.OK);
        }
    };
    @PutMapping("/update_audit/notification")
    public ResponseEntity<Result> DataEntryUpdateAuditNotification(@RequestBody NotificationIncome notificationIncome){
        int flag = incomeService.updateAuditStatus(notificationIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "更新失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "更新成功", notificationIncome), HttpStatus.OK);
        }
    };
    @PutMapping("/update_audit/prepaid_conversion")
    public ResponseEntity<Result> DataEntryUpdateAuditPrepaidConversion(@RequestBody PrepaidConversionIncome prepaidConversionIncome){
        int flag = incomeService.updateAuditStatus(prepaidConversionIncome);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "更新失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "更新成功", prepaidConversionIncome), HttpStatus.OK);
        }
    };


}
