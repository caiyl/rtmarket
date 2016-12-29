package cn.sunline.rtmarket.dao;

import cn.sunline.rtmarket.entity.RtBussEventEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

/**
 * Created by caiyl on 2016/12/28.
 */
public interface BussEventDao extends Repository<RtBussEventEntity,String> {
    public RtBussEventEntity save(RtBussEventEntity rtBussEventEntity);

    Page<RtBussEventEntity> findAll(Pageable pageable);
}
