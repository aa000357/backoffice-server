package com.happytuk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "excel_items_type")
public class ExcelItemsType {

    @Id
    @Column(name="item_type_id")
    private Integer itemTypeId;

    @Column(name="item_name")
    private String itemName;

    @Column(name="item_rank")
    private Boolean itemRank;

    @Column(name = "items_class_id")
    private Boolean itemsClassId;

    @Column(name = "unlock_level")
    private Boolean unlockLevel;

    @Column(name = "cost_item_id")
    private Integer costItemId;

    @Column(name = "cost_item_value")
    private Integer costItemValue;


    public Integer getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(Integer itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Boolean getItemRank() {
        return itemRank;
    }

    public void setItemRank(Boolean itemRank) {
        this.itemRank = itemRank;
    }

    public Boolean getItemsClassId() {
        return itemsClassId;
    }

    public void setItemsClassId(Boolean itemsClassId) {
        this.itemsClassId = itemsClassId;
    }

    public Boolean getUnlockLevel() {
        return unlockLevel;
    }

    public void setUnlockLevel(Boolean unlockLevel) {
        this.unlockLevel = unlockLevel;
    }

    public Integer getCostItemId() {
        return costItemId;
    }

    public void setCostItemId(Integer costItemId) {
        this.costItemId = costItemId;
    }

    public Integer getCostItemValue() {
        return costItemValue;
    }

    public void setCostItemValue(Integer costItemValue) {
        this.costItemValue = costItemValue;
    }

    @Override
    public String toString() {
        return "ExcelsItemClass{" +
                "itemTypeId=" + itemTypeId +
                ", itemName='" + itemName + '\'' +
                ", itemRank=" + itemRank +
                ", itemsClassId=" + itemsClassId +
                ", unlockLevel=" + unlockLevel +
                ", costItemId=" + costItemId +
                ", costItemValue=" + costItemValue +
                '}';
    }
}
