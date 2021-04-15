package com.a01.talent.po;

import com.a01.talent.vo.Employee;

import java.util.List;

public class PageVO {
    private long total;
    private Integer pagenum;
    private List<?> list;

    public PageVO() {
    }

    public PageVO(long total, Integer pagenum, List<?> list) {
        this.total = total;
        this.pagenum = pagenum;
        this.list = list;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Integer getPagenum() {
        return pagenum;
    }

    public void setPagenum(Integer pagenum) {
        this.pagenum = pagenum;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}
