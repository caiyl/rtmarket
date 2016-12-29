package cn.sunline.rtmarket.service;

import cn.sunline.rtmarket.entity.RtBussEventEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * Created by caiyl on 2016/12/28.
 */
public interface BussEventService {
    void save(RtBussEventEntity rtBussEventEntity);

    Page<RtBussEventEntity> findForPage(PageRequest pageRequest);
}
