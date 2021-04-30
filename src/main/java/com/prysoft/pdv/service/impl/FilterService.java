package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dto.FilterParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class FilterService<T> {
    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    private Class<T> getGenericClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    protected Page<T> getPage(String HQL, Integer page, Integer size, List<FilterParam> params) {
        Pageable pageable = PageRequest.of(page, size);
        String hqlTotalObjects = "SELECT COUNT(c) FROM " + getGenericClass().getSimpleName() + " c ";
        String hqlSelectTotalObjects = hqlTotalObjects + HQL;
        TypedQuery<Long> queryTotalObjects = entityManager.createQuery(hqlSelectTotalObjects, Long.class);
        if (params != null) {
            for (FilterParam param : params) {
                queryTotalObjects.setParameter(param.getName(), param.getObject());
            }
        }

        Long totalObjectsL = queryTotalObjects.getResultList().get(0);
        Integer totalObjects = totalObjectsL.intValue();

        // Get Real page
        String hqlSelectPage = "SELECT DISTINCT c FROM " + getGenericClass().getSimpleName() + " c " + HQL;

        int count = pageable.getPageSize();

        TypedQuery<T> query = entityManager.createQuery(hqlSelectPage, getGenericClass());
        if (params != null) {
            for (FilterParam param : params) {
                query.setParameter(param.getName(), param.getObject());
            }
        }
        query.setFirstResult(page * count);
        query.setMaxResults(count);

        return new PageImpl<T>(query.getResultList(), pageable, totalObjects);
    }
}
