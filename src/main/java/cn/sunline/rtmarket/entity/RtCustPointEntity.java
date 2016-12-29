package cn.sunline.rtmarket.entity;

import javax.persistence.*;

/**
 * Created by caiyl on 2016/12/28.
 */
@Entity
@Table(name = "rt_cust_point", schema = "remarket", catalog = "")
public class RtCustPointEntity {
    private String id;
    private String custId;
    private String pointCode;
    private String pointValue;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cust_id")
    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
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
    @Column(name = "point_value")
    public String getPointValue() {
        return pointValue;
    }

    public void setPointValue(String pointValue) {
        this.pointValue = pointValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RtCustPointEntity that = (RtCustPointEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (custId != null ? !custId.equals(that.custId) : that.custId != null) return false;
        if (pointCode != null ? !pointCode.equals(that.pointCode) : that.pointCode != null) return false;
        if (pointValue != null ? !pointValue.equals(that.pointValue) : that.pointValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (custId != null ? custId.hashCode() : 0);
        result = 31 * result + (pointCode != null ? pointCode.hashCode() : 0);
        result = 31 * result + (pointValue != null ? pointValue.hashCode() : 0);
        return result;
    }
}
