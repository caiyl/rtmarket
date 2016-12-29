package cn.sunline.rtmarket.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by caiyl on 2016/12/28.
 */
@Entity
@Table(name = "rt_point", schema = "remarket", catalog = "")
public class RtPointEntity {
    private String id;
    private String pointName;
    private String pointCode;
    private String fromTab;
    private String fromCol;
    private String pointType;
    private String pointDataType;
    private String state;
    private String operator;
    private Timestamp operateTime;
    private String modifyOperator;
    private Timestamp modifyTime;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "point_name")
    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    @Basic
    @Column(name = "point_code")
    public String getPointCode() {
        return pointCode;
    }

    public void setPointCode(String pointCode) {
        this.pointCode = pointCode;
    }

    @Basic
    @Column(name = "from_tab")
    public String getFromTab() {
        return fromTab;
    }

    public void setFromTab(String fromTab) {
        this.fromTab = fromTab;
    }

    @Basic
    @Column(name = "from_col")
    public String getFromCol() {
        return fromCol;
    }

    public void setFromCol(String fromCol) {
        this.fromCol = fromCol;
    }

    @Basic
    @Column(name = "point_type")
    public String getPointType() {
        return pointType;
    }

    public void setPointType(String pointType) {
        this.pointType = pointType;
    }

    @Basic
    @Column(name = "point_data_type")
    public String getPointDataType() {
        return pointDataType;
    }

    public void setPointDataType(String pointDataType) {
        this.pointDataType = pointDataType;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RtPointEntity that = (RtPointEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (pointName != null ? !pointName.equals(that.pointName) : that.pointName != null) return false;
        if (pointCode != null ? !pointCode.equals(that.pointCode) : that.pointCode != null) return false;
        if (fromTab != null ? !fromTab.equals(that.fromTab) : that.fromTab != null) return false;
        if (fromCol != null ? !fromCol.equals(that.fromCol) : that.fromCol != null) return false;
        if (pointType != null ? !pointType.equals(that.pointType) : that.pointType != null) return false;
        if (pointDataType != null ? !pointDataType.equals(that.pointDataType) : that.pointDataType != null)
            return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (operateTime != null ? !operateTime.equals(that.operateTime) : that.operateTime != null) return false;
        if (modifyOperator != null ? !modifyOperator.equals(that.modifyOperator) : that.modifyOperator != null)
            return false;
        if (modifyTime != null ? !modifyTime.equals(that.modifyTime) : that.modifyTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (pointName != null ? pointName.hashCode() : 0);
        result = 31 * result + (pointCode != null ? pointCode.hashCode() : 0);
        result = 31 * result + (fromTab != null ? fromTab.hashCode() : 0);
        result = 31 * result + (fromCol != null ? fromCol.hashCode() : 0);
        result = 31 * result + (pointType != null ? pointType.hashCode() : 0);
        result = 31 * result + (pointDataType != null ? pointDataType.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (operateTime != null ? operateTime.hashCode() : 0);
        result = 31 * result + (modifyOperator != null ? modifyOperator.hashCode() : 0);
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        return result;
    }
}
