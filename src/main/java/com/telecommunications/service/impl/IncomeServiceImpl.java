package com.telecommunications.service.impl;

import com.telecommunications.mapper.income.*;
import com.telecommunications.pojo.income.*;
import com.telecommunications.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IncomeServiceImpl implements IncomeService {
    private final BillingIncomeMapper billingIncomeMapper;
    private final CardSalesIncomeMapper cardSalesIncomeMapper;
    private final IntercompanySettlementIncomeMapper intercompanySettlementIncomeMapper;
    private final NotificationIncomeMapper notificationIncomeMapper;
    private final PrepaidConversionIncomeMapper prepaidConversionIncomeMapper;


    @Autowired
    public IncomeServiceImpl(BillingIncomeMapper billingIncomeMapper, CardSalesIncomeMapper cardSalesIncomeMapper, IntercompanySettlementIncomeMapper intercompanySettlementIncomeMapper, NotificationIncomeMapper notificationIncomeMapper, PrepaidConversionIncomeMapper prepaidConversionIncomeMapper) {
        this.billingIncomeMapper = billingIncomeMapper;
        this.cardSalesIncomeMapper = cardSalesIncomeMapper;
        this.intercompanySettlementIncomeMapper = intercompanySettlementIncomeMapper;
        this.notificationIncomeMapper = notificationIncomeMapper;
        this.prepaidConversionIncomeMapper = prepaidConversionIncomeMapper;
    }


    @Override
    public <T> int addIncome(T income) {

        if (income instanceof BillingIncome) {
            return billingIncomeMapper.add((BillingIncome) income);
        } else if (income instanceof CardSalesIncome) {
            return cardSalesIncomeMapper.add((CardSalesIncome) income);
        } else if (income instanceof IntercompanySettlementIncome) {
            return intercompanySettlementIncomeMapper.add((IntercompanySettlementIncome) income);
        } else if (income instanceof NotificationIncome) {
            return notificationIncomeMapper.add((NotificationIncome) income);
        } else if (income instanceof PrepaidConversionIncome) {
            return prepaidConversionIncomeMapper.add((PrepaidConversionIncome) income);
        }

        return -1;
    }

    @Override
    public <T> int deleteIncome(T income) {

        if (income instanceof BillingIncome) {
            return billingIncomeMapper.delete(((BillingIncome) income).getId());
        } else if (income instanceof CardSalesIncome) {
            return cardSalesIncomeMapper.delete(((CardSalesIncome) income).getId());
        } else if (income instanceof IntercompanySettlementIncome) {
            return intercompanySettlementIncomeMapper.delete(((IntercompanySettlementIncome) income).getId());
        } else if (income instanceof NotificationIncome) {
            return notificationIncomeMapper.delete(((NotificationIncome) income).getId());
        } else if (income instanceof PrepaidConversionIncome) {
            return prepaidConversionIncomeMapper.delete(((PrepaidConversionIncome) income).getId());
        }
        return -1;
    }

    @Override
    public <T> int updateIncome(T income) {

        if (income instanceof BillingIncome) {
            return billingIncomeMapper.update((BillingIncome) income);
        } else if (income instanceof CardSalesIncome) {
            return cardSalesIncomeMapper.update((CardSalesIncome) income);
        } else if (income instanceof IntercompanySettlementIncome) {
            return intercompanySettlementIncomeMapper.update((IntercompanySettlementIncome) income);
        } else if (income instanceof NotificationIncome) {
            return notificationIncomeMapper.update((NotificationIncome) income);
        } else if (income instanceof PrepaidConversionIncome) {
            return prepaidConversionIncomeMapper.update((PrepaidConversionIncome) income);
        }
        return -1;
    }

    @Override
    public <T> int updateAuditStatus(T income) {

        if (income instanceof BillingIncome) {
            return billingIncomeMapper.updateAuditStatus((BillingIncome) income);
        } else if (income instanceof CardSalesIncome) {
            return cardSalesIncomeMapper.updateAuditStatus((CardSalesIncome) income);
        } else if (income instanceof IntercompanySettlementIncome) {
            return intercompanySettlementIncomeMapper.updateAuditStatus((IntercompanySettlementIncome) income);
        } else if (income instanceof NotificationIncome) {
            return notificationIncomeMapper.updateAuditStatus((NotificationIncome) income);
        } else if (income instanceof PrepaidConversionIncome) {
            return prepaidConversionIncomeMapper.updateAuditStatus((PrepaidConversionIncome) income);
        }
        return -1;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> int addBatch(List<T> incomeList, Class<T> entityType) {
        int result = 0;
        if (entityType == BillingIncome.class) {
            for (T item : incomeList) {
                result += billingIncomeMapper.add((BillingIncome) item);
            }
            return result;
        } else if (entityType == CardSalesIncome.class) {
            for (T item : incomeList) {
                result += cardSalesIncomeMapper.add((CardSalesIncome) item);
            }
            return result;
        } else if (entityType == IntercompanySettlementIncome.class) {
            for (T item : incomeList) {
                result += intercompanySettlementIncomeMapper.add((IntercompanySettlementIncome) item);
            }
            return result;
        } else if (entityType == NotificationIncome.class) {
            for (T item : incomeList) {
                result += notificationIncomeMapper.add((NotificationIncome) item);
            }
            return result;
        } else if (entityType == PrepaidConversionIncome.class) {
            for (T item : incomeList) {
                result += prepaidConversionIncomeMapper.add((PrepaidConversionIncome) item);
            }
            return result;
        }
        return -1;
    }


    @Override
    @SuppressWarnings("unchecked")
    public <T> List<T> getAll(Class<T> entityType) {
        List<T> result = new ArrayList<>();
        if (entityType == BillingIncome.class) {
            result = (List<T>) billingIncomeMapper.getAll();
        } else if (entityType == CardSalesIncome.class) {
            result = (List<T>) cardSalesIncomeMapper.getAll();
        } else if (entityType == IntercompanySettlementIncome.class) {
            result = (List<T>) intercompanySettlementIncomeMapper.getAll();
        } else if (entityType == NotificationIncome.class) {
            result = (List<T>) notificationIncomeMapper.getAll();
        } else if (entityType == PrepaidConversionIncome.class) {
            result = (List<T>) prepaidConversionIncomeMapper.getAll();
        }
        return result;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> List<T> findByCity(String name, Class<T> entityType) {
        List<T> result = new ArrayList<>();
        if (entityType == BillingIncome.class) {
            result = (List<T>) billingIncomeMapper.findByCity(name);
        } else if (entityType == CardSalesIncome.class) {
            result = (List<T>) cardSalesIncomeMapper.findByCity(name);
        } else if (entityType == IntercompanySettlementIncome.class) {
            result = (List<T>) intercompanySettlementIncomeMapper.findByCity(name);
        } else if (entityType == NotificationIncome.class) {
            result = (List<T>) notificationIncomeMapper.findByCity(name);
        } else if (entityType == PrepaidConversionIncome.class) {
            result = (List<T>) prepaidConversionIncomeMapper.findByCity(name);
        }
        return result;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> List<T> findByProduct(String name, Class<T> entityType) {
        List<T> result = new ArrayList<>();
        if (entityType == BillingIncome.class) {
            result = (List<T>) billingIncomeMapper.findByProduct(name);
        } else if (entityType == CardSalesIncome.class) {
            result = (List<T>) cardSalesIncomeMapper.findByProduct(name);
        } else if (entityType == IntercompanySettlementIncome.class) {
            result = (List<T>) intercompanySettlementIncomeMapper.findByProduct(name);
        } else if (entityType == NotificationIncome.class) {
            result = (List<T>) notificationIncomeMapper.findByProduct(name);
        } else if (entityType == PrepaidConversionIncome.class) {
            result = (List<T>) prepaidConversionIncomeMapper.findByProduct(name);
        }
        return result;
    }
}
