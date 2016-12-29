package cn.sunline.rtmarket.entity;

import javax.persistence.*;

/**
 * Created by caiyl on 2016/12/28.
 */
@Entity
@Table(name = "rt_rule_point_list", schema = "remarket", catalog = "")
public class RtRulePointListEntity {
    private String id;
    private String ruleId;
    private String point;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "rule_id")
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    @Basic
    @Column(name = "point")
    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RtRulePointListEntity that = (RtRulePointListEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ruleId != null ? !ruleId.equals(that.ruleId) : that.ruleId != null) return false;
        if (point != null ? !point.equals(that.point) : that.point != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ruleId != null ? ruleId.hashCode() : 0);
        result = 31 * result + (point != null ? point.hashCode() : 0);
        return result;
    }
}
