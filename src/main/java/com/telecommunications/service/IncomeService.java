package com.telecommunications.service;

import java.util.List;

public interface IncomeService {

    <T> int addIncome(T income);

    <T> int deleteIncome(T income);

    <T> int updateIncome(T income);

    <T> int updateAuditStatus(T income);

    <T> int addBatch(List<T> incomeList, Class<T> entityType);

    <T> List<T> getAll(Class<T> entityType);

    <T> List<T> findByCity(String name, Class<T> entityType);

    <T> List<T> findByProduct(String name, Class<T> entityType);



}
