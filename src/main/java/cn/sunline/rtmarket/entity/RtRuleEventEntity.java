package cn.sunline.rtmarket.entity;

import javax.persistence.*;

/**
 * Created by caiyl on 2016/12/28.
 */
@Entity
@Table(name = "rt_rule_event", schema = "remarket", catalog = "")
public class RtRuleEventEntity {
    private String id;
    private String ruleId;
    private String eventId;

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
    @Column(name = "event_id")
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RtRuleEventEntity that = (RtRuleEventEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ruleId != null ? !ruleId.equals(that.ruleId) : that.ruleId != null) return false;
        if (eventId != null ? !eventId.equals(that.eventId) : that.eventId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ruleId != null ? ruleId.hashCode() : 0);
        result = 31 * result + (eventId != null ? eventId.hashCode() : 0);
        return result;
    }
}
