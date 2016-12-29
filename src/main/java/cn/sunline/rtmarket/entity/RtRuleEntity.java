package cn.sunline.rtmarket.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by caiyl on 2016/12/28.
 */
@Entity
@Table(name = "rt_rule", schema = "remarket", catalog = "")
public class RtRuleEntity {
    private String id;
    private String ruleName;
    private String ruleCode;
    private String eventDisplay;
    private String validateFlag;
    private String operator;
    private Timestamp operateTime;
    private String modifyOperator;
    private Timestamp modifyTime;
    private String remakr;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "rule_name")
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    @Basic
    @Column(name = "rule_code")
    public String getRuleCode() {
        return ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    @Basic
    @Column(name = "event_display")
    public String getEventDisplay() {
        return eventDisplay;
    }

    public void setEventDisplay(String eventDisplay) {
        this.eventDisplay = eventDisplay;
    }

    @Basic
    @Column(name = "validate_flag")
    public String getValidateFlag() {
        return validateFlag;
    }

    public void setValidateFlag(String validateFlag) {
        this.validateFlag = validateFlag;
    }

    @Basic
    @Column(name = "operator")
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Basic
    @Column(name = "operate_time")
    public Timestamp getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Timestamp operateTime) {
        this.operateTime = operateTime;
    }

    @Basic
    @Column(name = "modify_operator")
    public String getModifyOperator() {
        return modifyOperator;
    }

    public void setModifyOperator(String modifyOperator) {
        this.modifyOperator = modifyOperator;
    }

    @Basic
    @Column(name = "modify_time")
    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Basic
    @Column(name = "remakr")
    public String getRemakr() {
        return remakr;
    }

    public void setRemakr(String remakr) {
        this.remakr = remakr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RtRuleEntity that = (RtRuleEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ruleName != null ? !ruleName.equals(that.ruleName) : that.ruleName != null) return false;
        if (ruleCode != null ? !ruleCode.equals(that.ruleCode) : that.ruleCode != null) return false;
        if (eventDisplay != null ? !eventDisplay.equals(that.eventDisplay) : that.eventDisplay != null) return false;
        if (validateFlag != null ? !validateFlag.equals(that.validateFlag) : that.validateFlag != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (operateTime != null ? !operateTime.equals(that.operateTime) : that.operateTime != null) return false;
        if (modifyOperator != null ? !modifyOperator.equals(that.modifyOperator) : that.modifyOperator != null)
            return false;
        if (modifyTime != null ? !modifyTime.equals(that.modifyTime) : that.modifyTime != null) return false;
        if (remakr != null ? !remakr.equals(that.remakr) : that.remakr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ruleName != null ? ruleName.hashCode() : 0);
        result = 31 * result + (ruleCode != null ? ruleCode.hashCode() : 0);
        result = 31 * result + (eventDisplay != null ? eventDisplay.hashCode() : 0);
        result = 31 * result + (validateFlag != null ? validateFlag.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (operateTime != null ? operateTime.hashCode() : 0);
        result = 31 * result + (modifyOperator != null ? modifyOperator.hashCode() : 0);
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        result = 31 * result + (remakr != null ? remakr.hashCode() : 0);
        return result;
    }
}
