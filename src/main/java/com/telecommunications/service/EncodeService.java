package com.telecommunications.service;

import java.util.List;

public interface EncodeService {


    <T> int addEncode(T encode);

    <T> int deleteEncode(T encode);

    <T> int updateEncode(T encode);

    <T> List<T> getAll(Class<T> entityType);

}
