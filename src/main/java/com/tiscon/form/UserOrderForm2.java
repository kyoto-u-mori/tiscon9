package com.tiscon.form;

import com.tiscon.validator.Numeric;

import javax.validation.constraints.NotBlank;

/**
 * 顧客が入力する見積もり情報を保持するクラス。
 *
 * @author Oikawa Yumi
 */
public class UserOrderForm2 {

    @Numeric
    @NotBlank
    private String box;

    public String setBox() {
        return box;
    }

    public void getBox(String box) {
        this.box = box;
    }

}