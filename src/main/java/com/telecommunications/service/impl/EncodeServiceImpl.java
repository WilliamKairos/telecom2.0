package com.telecommunications.service.impl;

import com.telecommunications.mapper.encode.*;
import com.telecommunications.pojo.encode.*;
import com.telecommunications.service.EncodeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EncodeServiceImpl implements EncodeService {

    private final BillingTypeMapper billingTypeMapper;
    private final CancellationTypeMapper cancellationTypeMapper;
    private final CityMapper cityMapper;
    private final NotificationTypeMapper notificationTypeMapper;
    private final ProductMapper productMapper;
    private final ProductBillingRelationshipMapper productBillingRelationshipMapper;
    private final ProductNotificationRelationshipMapper productNotificationRelationshipMapper;
    private final ReceiptPurposeMapper receiptPurposeMapper;
    private final SettlementOperatorMapper settlementOperatorMapper;
    private final SettlementTypeMapper settlementTypeMapper;

    public EncodeServiceImpl(BillingTypeMapper billingTypeMapper, CancellationTypeMapper cancellationTypeMapper
            , CityMapper cityMapper, NotificationTypeMapper notificationTypeMapper, ProductMapper productMapper
            , ProductBillingRelationshipMapper productBillingRelationshipMapper
            , ProductNotificationRelationshipMapper productNotificationRelationshipMapper
            , ReceiptPurposeMapper receiptPurposeMapper, SettlementOperatorMapper settlementOperatorMapper
            , SettlementTypeMapper settlementTypeMapper) {
        this.billingTypeMapper = billingTypeMapper;
        this.cancellationTypeMapper = cancellationTypeMapper;
        this.cityMapper = cityMapper;
        this.notificationTypeMapper = notificationTypeMapper;
        this.productMapper = productMapper;
        this.productBillingRelationshipMapper = productBillingRelationshipMapper;
        this.productNotificationRelationshipMapper = productNotificationRelationshipMapper;
        this.receiptPurposeMapper = receiptPurposeMapper;
        this.settlementOperatorMapper = settlementOperatorMapper;
        this.settlementTypeMapper = settlementTypeMapper;
    }


    @Override
    public <T> int addEncode(T encode) {

        if (encode instanceof BillingType) {
            return billingTypeMapper.add((BillingType) encode);
        } else if (encode instanceof CancellationType) {
            return cancellationTypeMapper.add((CancellationType) encode);
        } else if (encode instanceof City) {
            return cityMapper.add((City) encode);
        } else if (encode instanceof NotificationType) {
            return notificationTypeMapper.add((NotificationType) encode);
        } else if (encode instanceof Product) {
            return productMapper.add((Product) encode);
        } else if (encode instanceof ProductBillingRelationship) {
            return productBillingRelationshipMapper.add((ProductBillingRelationship) encode);
        } else if (encode instanceof ProductNotificationRelationship) {
            return productNotificationRelationshipMapper.add((ProductNotificationRelationship) encode);
        } else if (encode instanceof ReceiptPurpose) {
            return receiptPurposeMapper.add((ReceiptPurpose) encode);
        } else if (encode instanceof SettlementOperator) {
            return settlementOperatorMapper.add((SettlementOperator) encode);
        } else if (encode instanceof SettlementType) {
            return settlementTypeMapper.add((SettlementType) encode);
        }
        return -1;
    }

    @Override
    public <T> int deleteEncode(T encode) {
        if (encode instanceof BillingType) {
            return billingTypeMapper.delete(((BillingType) encode).getBillingCode());
        } else if (encode instanceof CancellationType) {
            return cancellationTypeMapper.delete(((CancellationType) encode).getCancellationCode());
        } else if (encode instanceof City) {
            return cityMapper.delete(((City) encode).getCityCode());
        } else if (encode instanceof NotificationType) {
            return notificationTypeMapper.delete(((NotificationType) encode).getNotificationIncomeCode());
        } else if (encode instanceof Product) {
            return productMapper.delete(((Product) encode).getProductCode());
        } else if (encode instanceof ProductBillingRelationship) {
            return productBillingRelationshipMapper.delete(((ProductBillingRelationship) encode).getSerialNumber());
        } else if (encode instanceof ProductNotificationRelationship) {
            return productNotificationRelationshipMapper.delete(((ProductNotificationRelationship) encode).getSerialNumber());
        } else if (encode instanceof ReceiptPurpose) {
            return receiptPurposeMapper.delete(((ReceiptPurpose) encode).getReceiptCode());
        } else if (encode instanceof SettlementOperator) {
            return settlementOperatorMapper.delete(((SettlementOperator) encode).getOperatorCode());
        } else if (encode instanceof SettlementType) {
            return settlementTypeMapper.delete(((SettlementType) encode).getSettlementCode());
        }
        return -1;
    }
    

    @Override
    public <T> int updateEncode(T encode) {
        if (encode instanceof BillingType) {
            return billingTypeMapper.update((BillingType) encode);
        } else if (encode instanceof CancellationType) {
            return cancellationTypeMapper.update((CancellationType) encode);
        } else if (encode instanceof City) {
            return cityMapper.update((City) encode);
        } else if (encode instanceof NotificationType) {
            return notificationTypeMapper.update((NotificationType) encode);
        } else if (encode instanceof Product) {
            return productMapper.update((Product) encode);
        } else if (encode instanceof ProductBillingRelationship) {
            return productBillingRelationshipMapper.update((ProductBillingRelationship) encode);
        } else if (encode instanceof ProductNotificationRelationship) {
            return productNotificationRelationshipMapper.update((ProductNotificationRelationship) encode);
        } else if (encode instanceof ReceiptPurpose) {
            return receiptPurposeMapper.update((ReceiptPurpose) encode);
        } else if (encode instanceof SettlementOperator) {
            return settlementOperatorMapper.update((SettlementOperator) encode);
        } else if (encode instanceof SettlementType) {
            return settlementTypeMapper.update((SettlementType) encode);
        }
        return -1;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> List<T> getAll(Class<T> entityType) {
        List<T> result = new ArrayList<>();
        if (entityType == BillingType.class) {
            result = (List<T>) billingTypeMapper.getAll();
        } else if (entityType == CancellationType.class) {
            result = (List<T>) cancellationTypeMapper.getAll();
        } else if (entityType == City.class) {
            result = (List<T>) cityMapper.getAll();
        }  else if (entityType == Product.class) {
            result = (List<T>) productMapper.getAll();
        } else if (entityType == NotificationType.class) {
            result = (List<T>) notificationTypeMapper.getAll();
        } else if (entityType == ProductBillingRelationship.class) {
            result = (List<T>) productBillingRelationshipMapper.getAll();
        }else if (entityType == ProductNotificationRelationship.class) {
            result = (List<T>) productNotificationRelationshipMapper.getAll();
        }else if (entityType == ReceiptPurpose.class) {
            result = (List<T>) receiptPurposeMapper.getAll();
        }else if (entityType == SettlementOperator.class) {
            result = (List<T>) settlementOperatorMapper.getAll();
        }else if (entityType == SettlementType.class) {
            result = (List<T>) settlementTypeMapper.getAll();
        }
        return result;
    }
}
