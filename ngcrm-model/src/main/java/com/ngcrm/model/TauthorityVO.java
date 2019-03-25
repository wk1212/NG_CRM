package com.ngcrm.model;

import java.util.List;

public class TauthorityVO extends Tauthority {


    //子菜单
    private List<TauthorityVO> childs;

    @Override
    public String toString() {
        return "TauthorityVO{" +
                "childs=" + childs +
                '}';
    }

    public List<TauthorityVO> getChilds() {
        return childs;
    }

    public void setChilds(List<TauthorityVO> childs) {
        this.childs = childs;
    }

    public TauthorityVO() {

    }
}
