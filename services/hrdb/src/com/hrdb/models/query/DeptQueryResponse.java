/*\/**
 * Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 * This software is the confidential and proprietary information of wavemaker-com * You shall not disclose such Confidential Information and shall use it only in accordance
 * with the terms of the source code license agreement you entered into with wavemaker.com *\/*/
package com.hrdb.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class DeptQueryResponse implements Serializable {


    @ColumnAlias("DEPT_ID")
    private BigInteger deptId;

    @ColumnAlias("NAME")
    private String name;

    @ColumnAlias("BUDGET")
    private BigInteger budget;

    @ColumnAlias("Q1")
    private BigInteger q1;

    @ColumnAlias("Q2")
    private BigInteger q2;

    @ColumnAlias("Q3")
    private BigInteger q3;

    @ColumnAlias("Q4")
    private BigInteger q4;

    @ColumnAlias("DEPT_CODE")
    private String deptCode;

    @ColumnAlias("LOCATION")
    private String location;

    @ColumnAlias("TENANT_ID")
    private BigInteger tenantId;

    public BigInteger getDeptId() {
        return this.deptId;
    }

    public void setDeptId(BigInteger deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getBudget() {
        return this.budget;
    }

    public void setBudget(BigInteger budget) {
        this.budget = budget;
    }

    public BigInteger getQ1() {
        return this.q1;
    }

    public void setQ1(BigInteger q1) {
        this.q1 = q1;
    }

    public BigInteger getQ2() {
        return this.q2;
    }

    public void setQ2(BigInteger q2) {
        this.q2 = q2;
    }

    public BigInteger getQ3() {
        return this.q3;
    }

    public void setQ3(BigInteger q3) {
        this.q3 = q3;
    }

    public BigInteger getQ4() {
        return this.q4;
    }

    public void setQ4(BigInteger q4) {
        this.q4 = q4;
    }

    public String getDeptCode() {
        return this.deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigInteger getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(BigInteger tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeptQueryResponse)) return false;
        final DeptQueryResponse deptQueryResponse = (DeptQueryResponse) o;
        return Objects.equals(getDeptId(), deptQueryResponse.getDeptId()) &&
                Objects.equals(getName(), deptQueryResponse.getName()) &&
                Objects.equals(getBudget(), deptQueryResponse.getBudget()) &&
                Objects.equals(getQ1(), deptQueryResponse.getQ1()) &&
                Objects.equals(getQ2(), deptQueryResponse.getQ2()) &&
                Objects.equals(getQ3(), deptQueryResponse.getQ3()) &&
                Objects.equals(getQ4(), deptQueryResponse.getQ4()) &&
                Objects.equals(getDeptCode(), deptQueryResponse.getDeptCode()) &&
                Objects.equals(getLocation(), deptQueryResponse.getLocation()) &&
                Objects.equals(getTenantId(), deptQueryResponse.getTenantId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeptId(),
                getName(),
                getBudget(),
                getQ1(),
                getQ2(),
                getQ3(),
                getQ4(),
                getDeptCode(),
                getLocation(),
                getTenantId());
    }
}
